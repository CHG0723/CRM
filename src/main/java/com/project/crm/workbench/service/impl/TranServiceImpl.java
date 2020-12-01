package com.project.crm.workbench.service.impl;

import com.project.crm.base.constants.CrmExceptionEnum;
import com.project.crm.base.exception.CrmException;
import com.project.crm.base.util.DateTimeUtil;
import com.project.crm.base.util.UUIDUtil;
import com.project.crm.settings.bean.User;
import com.project.crm.settings.mapper.UserMapper;
import com.project.crm.workbench.bean.*;
import com.project.crm.workbench.mapper.*;
import com.project.crm.workbench.service.TranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.*;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.workbench.service.impl
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/26 19:28
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Service
public class TranServiceImpl implements TranService {
    @Autowired
    private ClueMapper clueMapper;
    @Autowired
    private ClueRemarkMapper clueRemarkMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ActivityMapper activityMapper;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private ClueActivityRelationMapper clueActivityRelationMapper;
    @Autowired
    private ContactsMapper contactsMapper;
    @Autowired
    private CustomerRemarkMapper customerRemarkMapper;

    @Autowired
    private ContactsRemarkMapper contactsRemarkMapper;

    @Autowired
    private ContactsActivityRelationMapper contactsActivityRelationMapper;

    @Autowired
    private TransactionMapper transactionMapper;

    @Autowired
    private TransactionHistoryMapper transactionHistoryMapper;

    @Autowired
    private TransactionRemarkMapper transactionRemarkMapper;




    @Override
    public List<Map<String, String>> queryAllTran(TranQueryVo queryVo) {
        return transactionMapper.queryAllTran(queryVo);
    }

    @Override
    public Transaction queryTranDetailById(String id, Map<String,String> stage2PossibilityMap) {
        Transaction transaction = transactionMapper.selectByPrimaryKey(id);
        //查询所有者
        User user = userMapper.selectByPrimaryKey(transaction.getOwner());
        transaction.setOwner(user.getName());
        //查询客户信息
        Customer customer = customerMapper.selectByPrimaryKey(transaction.getCustomerId());
        transaction.setCustomerId(customer.getName());

        //查询活动信息
        Activity activity = activityMapper.selectByPrimaryKey(transaction.getActivityId());
        transaction.setActivityId(activity.getName());

        //查询当前交易的可能性
        String stage = transaction.getStage();

        String possibility = stage2PossibilityMap.get(stage);
        List<String> possibilities = new ArrayList<>();
        possibilities.add(possibility);
        transaction.setPossibility(possibilities);

        //查询联系人信息
        Contacts contacts = contactsMapper.selectByPrimaryKey(transaction.getContactsId());
        transaction.setContactsId(contacts.getFullname());


        //查询交易的备注信息
        Example example = new Example(TransactionRemark.class);
        example.createCriteria().andEqualTo("tranId",transaction.getId());
        List<TransactionRemark> transactionRemarks = transactionRemarkMapper.selectByExample(example);
        transaction.setTransactionRemarks(transactionRemarks);

        //查询交易历史信息
        example = new Example(TransactionHistory.class);
        example.createCriteria().andEqualTo("tranId",transaction.getId());
        List<TransactionHistory> transactionHistories = transactionHistoryMapper.selectByExample(example);
        transaction.setTransactionHistories(transactionHistories);

        return transaction;
    }

    @Override
    public List<String> queryCustomerName(String customerName) {
        Example example = new Example(Customer.class);
        example.createCriteria().andLike("name","%" + customerName + "%");
        List<Customer> customers = customerMapper.selectByExample(example);

        //专门存储客户名称
        List<String> customerNames = new ArrayList<>();
        for (Customer customer : customers) {
            customerNames.add(customer.getName());
        }
        return customerNames;
    }

    //保存交易,新建交易历史
    @Override
    public void saveTransaction(Transaction transaction,String company) {

        //保存交易
        transaction.setId(UUIDUtil.getUUID());
        transaction.setCreateTime(DateTimeUtil.getSysTime());

        //取出transaction中的customerId,如果为0,则需要创建新客户
        if (transaction.getCustomerId().equals("0")){
            //创建新客户
            Customer customer = new Customer();
            customer.setId(UUIDUtil.getUUID());
            customer.setName(company);
            customer.setOwner(transaction.getOwner());
            customer.setNextContactTime(transaction.getNextContactTime());
            customer.setCreateBy(transaction.getCreateBy());
            customer.setContactSummary(transaction.getContactSummary());
            customer.setCreateTime(DateTimeUtil.getSysTime());
            customer.setDescription(transaction.getDescription());
            int count = customerMapper.insertSelective(customer);
            if (count ==0){
                throw new CrmException(CrmExceptionEnum.CUSTOMER_SAVE);
            }
            //插入客户成功,将客户的主键放在交易对象中
            transaction.setCustomerId(customer.getId());
        }
        int count = transactionMapper.insertSelective(transaction);
        if (count ==0){
            throw new CrmException(CrmExceptionEnum.TRANSACTION_SAVE);
        }

        //新建交易历史
        TransactionHistory transactionHistory = new TransactionHistory();
        transactionHistory.setId(UUIDUtil.getUUID());
        transactionHistory.setTranId(transaction.getId());
        transactionHistory.setStage(transaction.getStage());
        transactionHistory.setMoney(transaction.getMoney());
        transactionHistory.setExpectedDate(transaction.getExpectedDate());
        transactionHistory.setCreateTime(DateTimeUtil.getSysTime());
        transactionHistory.setCreateBy(transaction.getCreateBy());
        count = transactionHistoryMapper.insertSelective(transactionHistory);
        if (count ==0){
            throw new CrmException(CrmExceptionEnum.TRANSACTION_HISTORY_SAVE);
        }
    }


    @Override
    public String queryCustomerByName(String name) {
        //根据客户名称查询客户是否存在,不存在新建(提交交易时新建)
        Example example = new Example(Customer.class);
        example.createCriteria().andEqualTo("name",name);
        List<Customer> customers = customerMapper.selectByExample(example);


        if (customers.size() ==0){
            return "0";
        }
        return customers.get(0).getId();
    }

    //返回交易阶段图标,同时支持交易详情点击交易图标，改变交易阶段的状态
    @Override
    public List<Map<String, ? extends Object>> stageList(String name,Integer location,String tranId,Map<String,String> map) {
        Transaction transaction = null;
        //将map转换成List集合:因为后面需要进行阶段的索引判断
        Set<Map.Entry<String, String>> entries = map.entrySet();
        List<Map.Entry<String,String>> stageList = new ArrayList<>(entries);
        TransactionHistory transactionHistory = null;
        if(location == null){//从交易列表页面跳转到交易详情
            //查询交易的阶段
            transaction = transactionMapper.selectByPrimaryKey(tranId);
        }else{//用户点击交易阶段图标改变交易阶段
            //修改交易表中交易阶段
            //用户点击的阶段
            String clickStage = stageList.get(location).getKey();

            Transaction tran = new Transaction();
            tran.setEditBy(name);
            tran.setEditTime(DateTimeUtil.getSysTime());
            tran.setId(tranId);
            tran.setStage(clickStage);
            int count = transactionMapper.updateByPrimaryKeySelective(tran);
            if(count == 0){
                throw new CrmException(CrmExceptionEnum.TRANSACTION_STAGE_UPDATE);
            }
            //查询更改后的阶段
            transaction = transactionMapper.selectByPrimaryKey(tranId);
            //给当前交易添加交易历史
            transactionHistory = new TransactionHistory();
            transactionHistory.setId(UUIDUtil.getUUID());
            transactionHistory.setCreateBy(transaction.getEditBy());
            transactionHistory.setCreateTime(transaction.getEditTime());
            transactionHistory.setExpectedDate(transaction.getExpectedDate());
            transactionHistory.setMoney(transaction.getMoney());
            transactionHistory.setStage(transaction.getStage());
            transactionHistory.setTranId(transaction.getId());

            count = transactionHistoryMapper.insertSelective(transactionHistory);

            if(count == 0){
                throw new CrmException(CrmExceptionEnum.TRANSACTION_HISTORY_SAVE);
            }
        }

        //当前交易的阶段
        String currentStage = transaction.getStage();
        //获取当前交易的可能性
        String currentPossibility = map.get(currentStage);

        //创建一个返回所有阶段的集合 ? extends Object:泛型上线   ? super String:泛型下线
        List<Map<String,? extends Object>> stages = new ArrayList<>();


        int pointer = 0 ;
        //找到所有阶段当中为0的第一个黑x的坐标
        for(int i = 0 ; i < stageList.size(); i++){
            String possibility = stageList.get(i).getValue();
            if("0".equals(possibility)){
                pointer = i;
                break;
            }
        }

        //交易失败了 前7个肯定是黑圈 后2个是x ,一个是黑x一个是红x，但是顺序不知道
        if("0".equals(currentPossibility)){

            //需要遍历所有阶段的可能性
            for(int i = 0; i < stageList.size(); i++){
                //创建一个map，用于存储交易失败的所有阶段
                Map<String,Object> failTranMap = new HashMap<>();
                String stage = stageList.get(i).getKey();
                String possibility = stageList.get(i).getValue();
                //只能意味着能确定后两个x
                if("0".equals(possibility)){
                    if(currentStage.equals(stage)){
                        //确定红x 后面哪个是红x，得根据当前交易的所在阶段来确定 如果在第八阶段，红x在第一个
                        //如果在第九阶段,红x在第二个
                        System.out.println("红x");
                        failTranMap.put("text",stage );
                        failTranMap.put("index",i+"");
                        failTranMap.put("type","红叉");
                        failTranMap.put("possibility",possibility);
                    }else{
                        //黑x
                        System.out.println("黑x");
                        failTranMap.put("text",stage );
                        failTranMap.put("index",i+"");
                        failTranMap.put("type","黑叉");
                        failTranMap.put("possibility",possibility);
                    }
                }else {//前7个黑圈
                    System.out.println("黑圈");
                    failTranMap.put("text",stage );
                    failTranMap.put("index",i+"");
                    failTranMap.put("type","黑圈");
                    failTranMap.put("possibility",possibility);
                }
                stages.add(failTranMap);
            }
        }else{
            //交易进行中或者交易成功
            //判断当前交易阶段的索引位置
            //取出当前交易的阶段，遍历所有阶段
            int index = 0;
            for(int i = 0; i < stageList.size(); i++){
                String stage = stageList.get(i).getKey();
                if(currentStage.equals(stage)){
                    //锚点索引位置
                    index = i;
                    break;
                }
            }

            for(int i = 0; i < stageList.size(); i++){
                Map<String,Object> successTranMap = new HashMap<>();
                String stage = stageList.get(i).getKey();
                String possibility = stageList.get(i).getValue();
                if(i < index){
                    //绿圈
                    System.out.println("绿圈");
                    successTranMap.put("text",stage );
                    successTranMap.put("index",i+"");
                    successTranMap.put("type","绿圈");
                    successTranMap.put("possibility",possibility);
                }else if(i == index){
                    //锚点
                    System.out.println("锚点");
                    successTranMap.put("text",stage );
                    successTranMap.put("index",i+"");
                    successTranMap.put("type","锚点");
                    successTranMap.put("possibility",possibility);
                }else if(index < i && i < pointer){
                    //黑圈
                    System.out.println("黑圈");
                    successTranMap.put("text",stage );
                    successTranMap.put("index",i+"");
                    successTranMap.put("type","黑圈");
                    successTranMap.put("possibility",possibility);
                }else{
                    //黑x
                    System.out.println("黑x");
                    successTranMap.put("text",stage );
                    successTranMap.put("index",i+"");
                    successTranMap.put("type","黑叉");
                    successTranMap.put("possibility",possibility);
                }
                stages.add(successTranMap);
            }

        }

        /*//查询当前交易的所有交易历史记录
        Example example = new Example(TransactionHistory.class);
        example.createCriteria().andEqualTo("tranId",tranId);
        List<TransactionHistory> transactionHistories = transactionHistoryMapper.selectByExample(example);

        Map<String,List<TransactionHistory>> transactionHistoriesMap = new HashMap<>();
        transactionHistoriesMap.put("transactionHistory",transactionHistories);*/
        Map<String,TransactionHistory> transactionHistoryMap = new HashMap<>();
        if(transactionHistory != null){
            transactionHistoryMap.put("transactionHistory",transactionHistory);
        }
        stages.add(transactionHistoryMap);
        return stages;
    }




    @Override
    public TransactionEchartsResultVo queryTransactionEcharts() {
         List<Map<String, String>> stringListMap = transactionMapper.queryTransactionEcharts();
        Map<String,List<Map<String,String>>> map = new HashMap<>();
        //图表中的series的data数据
        map.put("transactions",stringListMap);
        //图表中的legend的data数据
        List<String> names = new ArrayList<>();
        for (Map<String,String> m:stringListMap) {
            String name = m.get("name");
            names.add(name);
        }
        TransactionEchartsResultVo transactionEchartsResultVo = new TransactionEchartsResultVo();
        transactionEchartsResultVo.setDataMap(map);
        transactionEchartsResultVo.setDataList(names);
         return transactionEchartsResultVo;
    }


}

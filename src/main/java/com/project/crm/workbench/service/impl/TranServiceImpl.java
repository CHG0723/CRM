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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

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


}

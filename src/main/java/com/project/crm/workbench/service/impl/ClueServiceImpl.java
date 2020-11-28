package com.project.crm.workbench.service.impl;

import com.project.crm.base.constants.CrmExceptionEnum;
import com.project.crm.base.exception.CrmException;
import com.project.crm.base.util.DateTimeUtil;
import com.project.crm.base.util.UUIDUtil;
import com.project.crm.settings.bean.User;
import com.project.crm.settings.mapper.UserMapper;
import com.project.crm.workbench.bean.*;
import com.project.crm.workbench.mapper.*;
import com.project.crm.workbench.service.ClueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.workbench.service.impl
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/22 11:52
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Service("/clueService")

public class ClueServiceImpl implements ClueService {

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
    public List<Map<String, String>> queryAllClue(ClueQueryVo queryVo) {

        return clueMapper.queryAllClue(queryVo);
    }


    @Override
    public Clue queryClueDetailById(String id) {
        //查询线索
        Clue clue = clueMapper.selectByPrimaryKey(id);

        //根据clue中的owner查询对用的用户
        User user = userMapper.selectByPrimaryKey(clue.getOwner());

        //将用户的姓名设置到owner
        clue.setOwner(user.getName());

        //查询线索下对应的备注信息
        Example example = new Example(ClueRemark.class);
        example.createCriteria().andEqualTo("clueId",clue.getId());
        List<ClueRemark> clueRemarks = clueRemarkMapper.selectByExample(example);

        //查询线索对应的活动信息
        //思路,先查询关联中间表,得到对应市场活动的id集合,再根据集合中的id号查询对应市场活动的想信息
        ClueActivityRelation clueActivityRelation = new ClueActivityRelation();
        clueActivityRelation.setClueId(clue.getId());
        List<ClueActivityRelation> clueActivityRelations = clueActivityRelationMapper.select(clueActivityRelation);

        List<Activity> activities = new ArrayList<>();
        for (ClueActivityRelation activityRelation : clueActivityRelations) {
            //取出每个对应的activityId,查询市场活动表对应的数据
            Activity activity = activityMapper.selectByPrimaryKey(activityRelation.getActivityId());
            activities.add(activity);
        }
        //把查询出来的市场活动集合对象设置到clue中
        clue.setActivities(activities);

        clue.setClueRemarks(clueRemarks);

        return clue;
    }




    @Override
    public void saveClue(Clue clue) {
        clue.setId(UUIDUtil.getUUID());
        clue.setCreateTime(DateTimeUtil.getSysTime());

        int count = clueMapper.insertSelective(clue);
        if (count ==0){
            throw new CrmException(CrmExceptionEnum.CLUE_SAVE);
        }
    }



    @Override
    public void updateClueRemark(ClueRemark clueRemark) {
        clueRemark.setEditTime(DateTimeUtil.getSysTime());
        clueRemark.setEditFlag("1");
        int count  = clueRemarkMapper.updateByPrimaryKeySelective(clueRemark);
        if (count == 0){
            throw new CrmException(CrmExceptionEnum.CLUE_REMARK_UPDATE);
        }
    }

    @Override
    public void saveClueRemark(ClueRemark clueRemark) {
        clueRemark.setEditFlag("0");
        clueRemark.setId(UUIDUtil.getUUID());
        clueRemark.setCreateTime(DateTimeUtil.getSysTime());
        int count = clueRemarkMapper.insertSelective(clueRemark);
        if (count == 0){
            throw new CrmException(CrmExceptionEnum.CLUE_REMARK_SAVE);
        }
    }

    @Override
    public void deleteClueRemark(String id) {
        int count =   clueRemarkMapper.deleteByPrimaryKey(id);
        if (count == 0){
            throw new CrmException(CrmExceptionEnum.CLUE_REMARK_DELETE);
        }
    }

    @Override
    public Clue queryClueById(String id) {
        return clueMapper.selectByPrimaryKey(id);
    }



    @Override
    public void updateClue(Clue clue) {
        clue.setEditTime(DateTimeUtil.getSysTime());
        int count =  clueMapper.updateByPrimaryKeySelective(clue);
        if (count == 0){
            throw new CrmException(CrmExceptionEnum.CLUE_UPADATE);
        }
    }

    //解除线索和市场活动的关联
    @Override
    public void deleteBind(ClueActivityRelation clueActivityRelation) {

        int count =  clueActivityRelationMapper.delete(clueActivityRelation);
        if(count == 0){
            throw new CrmException(CrmExceptionEnum.CLUE_ACTIVITY_UNBIND);
        }
    }
    //解除多个线索和市场活动的关联
    @Override
    public void deleteManyBind(String clueId, String activityIds) {
        String[] aids = activityIds.split(",");

        for (String aid : aids) {
            ClueActivityRelation clueActivityRelation = new ClueActivityRelation();
            clueActivityRelation.setClueId(clueId);
            clueActivityRelation.setActivityId(aid);
            int count = clueActivityRelationMapper.delete(clueActivityRelation);
            if(count == 0){
                throw new CrmException(CrmExceptionEnum.CLUE_ACTIVITY_UNBIND);
            }
        }

    }

    @Override
    public List<Activity> queryActivityExculdeNow(String clueId, String activityName) {

        //先查询出该线索下的关联的市场活动的id号
        ClueActivityRelation clueActivityRelation = new ClueActivityRelation();
        clueActivityRelation.setClueId(clueId);
        List<ClueActivityRelation> clueActivityRelations = clueActivityRelationMapper.select(clueActivityRelation);
        //因为tkMapper中的andNotIn支持多个id号查询,没必须进行遍历单个查询
        //将clueActivityRelations集合中每个ClueActivityRelation中的activityId号取出来放入集合中
        List<String> activityIds = new ArrayList<>();
        for (ClueActivityRelation activityRelation : clueActivityRelations) {
            activityIds.add(activityRelation.getActivityId());
        }

            Example example = new Example(Activity.class);
        //因为用户可能输入活动名称,也可能不输入活动名称
        if (activityName !=null && activityName !=""){
            example.createCriteria().andLike("name","%" + activityName + "%")
                    .andNotIn("id",activityIds);
        }else {
            example.createCriteria()
                    .andNotIn("id",activityIds);

        }
        List<Activity> activities = activityMapper.selectByExample(example);
        //查询用户表,将用户姓名放置到activity的owner中
        for (Activity activity : activities) {
           User user =  userMapper.selectByPrimaryKey(activity.getOwner());
            activity.setOwner(user.getName());
        }
        return activities;
    }

    //保存线索和市场活动的关联
    @Override
    public void saveBind(String clueId, String activityIds) {
        String[] aids = activityIds.split(",");
        for (String aid : aids) {
            ClueActivityRelation clueActivityRelation = new ClueActivityRelation();
            clueActivityRelation.setId(UUIDUtil.getUUID());
            clueActivityRelation.setClueId(clueId);
            clueActivityRelation.setActivityId(aid);
            int count = clueActivityRelationMapper.insertSelective(clueActivityRelation);
            if (count ==0){
                throw new CrmException(CrmExceptionEnum.CLUE_ACTIVITY_BIND);
            }
        }
    }

    //线索个市场活动关联成功后
    @Override
    public List<Activity> queryClueActivity(String clueId) {
        ClueActivityRelation clueActivityRelation = new ClueActivityRelation();
        clueActivityRelation.setClueId(clueId);
        List<ClueActivityRelation> clueActivityRelations =
                clueActivityRelationMapper.select(clueActivityRelation);
        List<Activity> activities = new ArrayList<>();
        //查询所有对应的市场活动的id号
        for (ClueActivityRelation activityRelation : clueActivityRelations) {
            Activity activity = activityMapper.selectByPrimaryKey(activityRelation.getActivityId());

            User user =  userMapper.selectByPrimaryKey(activity.getOwner());
            activity.setOwner(user.getName());
            activities.add(activity);
        }
        return activities;
    }

    @Override
    public void convert(Transaction transaction,String id,String username,String isCreateTransaction) {
        //1、根据线索的主键查询线索的信息(线索包含自身的信息，包含客户的信息，包含联系人信息)
        Clue clue = clueMapper.selectByPrimaryKey(id);

        //先将线索中的客户信息取出来保存在客户表中，当该客户不存在的时候，新建客户(按公司名称精准查询)
        /**
         * 1、先取出clue中company进行判断客户是否存在
         */
        Example example = new Example(Customer.class);
        example.createCriteria().andEqualTo("name",clue.getCompany());
        List<Customer> customers = customerMapper.selectByExample(example);

        //将线索中的客户信息取出来保存在客户表中
        Customer customer = null;
        if(customers.size() == 0){
            //客户不存在，创建一个新客户
            customer = new Customer();
            //从线索中取出客户信息
            customer.setId(UUIDUtil.getUUID());
            customer.setAddress(clue.getAddress());
            customer.setContactSummary(clue.getContactSummary());
            //谁点击了转换按钮，谁就是创建人
            customer.setCreateBy(username);
            customer.setCreateTime(DateTimeUtil.getSysTime());
            customer.setName(clue.getCompany());
            customer.setNextContactTime(clue.getNextContactTime());
            customer.setPhone(clue.getPhone());
            customer.setWebsite(clue.getWebsite());

            customer.setOwner(clue.getOwner());
            //保存客户信息
            int result = customerMapper.insertSelective(customer);
            if(result == 0){
                throw new CrmException(CrmExceptionEnum.CLUE_CONVERT);
            }
        }else{
            customer = customers.get(0);
        }

        //将线索中的联系人信息提取出来保存在联系人表中
        Contacts contacts = new Contacts();
        contacts.setId(UUIDUtil.getUUID());
        contacts.setAppellation(clue.getAppellation());
        contacts.setCreateBy(username);
        contacts.setCreateTime(DateTimeUtil.getSysTime());
        contacts.setCustomerId(customer.getId());
        contacts.setEmail(clue.getEmail());
        contacts.setFullname(clue.getFullname());
        contacts.setJob(clue.getJob());
        contacts.setMphone(clue.getMphone());
        contacts.setOwner(clue.getOwner());
        contacts.setNextContactTime(clue.getNextContactTime());
        contacts.setSource(clue.getSource());

        int count = contactsMapper.insertSelective(contacts);
        if(count == 0){
            throw new CrmException(CrmExceptionEnum.CLUE_CONVERT);
        }

        //线索中的备注信息取出来保存在客户备注和联系人备注中
        //根据线索id查询当前线索的所有备注
        example = new Example(ClueRemark.class);
        example.createCriteria().andEqualTo("clueId",clue.getId());
        List<ClueRemark> clueRemarks = clueRemarkMapper.selectByExample(example);

        for (ClueRemark clueRemark : clueRemarks) {
            //客户备注信息
            CustomerRemark customerRemark = new CustomerRemark();
            customerRemark.setId(UUIDUtil.getUUID());
            customerRemark.setNoteContent(clueRemark.getNoteContent());
            customerRemark.setCreateBy(username);
            customerRemark.setCreateTime(clueRemark.getCreateTime());
            customerRemark.setCustomerId(customer.getId());
            count = customerRemarkMapper.insertSelective(customerRemark);
            if(count == 0){
                throw new CrmException(CrmExceptionEnum.CLUE_CONVERT);
            }

            //联系人备注信息
            ContactsRemark contactsRemark = new ContactsRemark();
            contactsRemark.setId(UUIDUtil.getUUID());
            contactsRemark.setNoteContent(clueRemark.getNoteContent());
            contactsRemark.setCreateBy(username);
            contactsRemark.setCreateTime(clueRemark.getCreateTime());
            contactsRemark.setContactsId(contacts.getId());
            count = contactsRemarkMapper.insertSelective(contactsRemark);
            if(count == 0){
                throw new CrmException(CrmExceptionEnum.CLUE_CONVERT);
            }
        }

        //将"线索和市场活动的关系"转换到"联系人和市场活动的关系中"
        //先将当前线索对应的市场活动的id号查询出来
        example = new Example(ClueActivityRelation.class);
        example.createCriteria().andEqualTo("clueId",clue.getId());
        List<ClueActivityRelation> clueActivityRelations = clueActivityRelationMapper.selectByExample(example);

        for (ClueActivityRelation clueActivityRelation : clueActivityRelations) {
            ContactsActivityRelation contactsActivityRelation = new ContactsActivityRelation();
            contactsActivityRelation.setId(UUIDUtil.getUUID());
            contactsActivityRelation.setContactsId(contacts.getId());
            contactsActivityRelation.setActivityId(clueActivityRelation.getActivityId());
            count = contactsActivityRelationMapper.insertSelective(contactsActivityRelation);
            if(count == 0){
                throw new CrmException(CrmExceptionEnum.CLUE_CONVERT);
            }
        }

        /**
         * 如果转换过程中发生了交易，创建一条新的交易，交易信息不全，后面可以通过修改交易来完善交易信息
         */
        if("1".equals(isCreateTransaction)){
            //发生了交易
            transaction.setId(UUIDUtil.getUUID());
            transaction.setCustomerId(customer.getId());
            transaction.setContactsId(contacts.getId());
            transaction.setCreateBy(username);
            transaction.setCreateTime(clue.getCreateTime());
            transaction.setOwner(clue.getOwner());
            transaction.setSource(clue.getSource());
            count =transactionMapper.insertSelective(transaction);
            if(count == 0){
                throw new CrmException(CrmExceptionEnum.CLUE_CONVERT);
            }
            //创建该条交易对应的交易历史以及备注   交易-->交易历史 1-n
            //交易历史
            TransactionHistory transactionHistory = new TransactionHistory();
            transactionHistory.setId(UUIDUtil.getUUID());
            transactionHistory.setCreateBy(username);
            transactionHistory.setCreateTime(transaction.getCreateTime());
            transactionHistory.setExpectedDate(transaction.getExpectedDate());
            transactionHistory.setMoney(transaction.getMoney());
            transactionHistory.setStage(transaction.getStage());
            transactionHistory.setTranId(transaction.getId());
            count = transactionHistoryMapper.insertSelective(transactionHistory);
            if(count == 0){
                throw new CrmException(CrmExceptionEnum.CLUE_CONVERT);
            }
            //交易备注
            TransactionRemark transactionRemark = new TransactionRemark();
            transactionRemark.setId(UUIDUtil.getUUID());
            transactionRemark.setCreateBy(transaction.getCreateBy());
            transactionRemark.setCreateTime(transaction.getCreateTime());
            transactionRemark.setTranId(transaction.getId());
            transactionRemark.setEditFlag("0");
            count = transactionRemarkMapper.insertSelective(transactionRemark);
            if(count == 0){
                throw new CrmException(CrmExceptionEnum.CLUE_CONVERT);
            }
        }

        //删除线索的备注信息
        example = new Example(ClueRemark.class);
        example.createCriteria().andEqualTo("clueId",clue.getId());
        count = clueRemarkMapper.deleteByExample(example);
        if(count == 0){
            throw new CrmException(CrmExceptionEnum.CLUE_CONVERT);
        }
        //删除线索和市场活动的关联关系
        example = new Example(ClueActivityRelation.class);
        example.createCriteria().andEqualTo("clueId",clue.getId());
        count = clueActivityRelationMapper.deleteByExample(example);
        if(count == 0){
            throw new CrmException(CrmExceptionEnum.CLUE_CONVERT);
        }

        //删除线索
        count = clueMapper.deleteByPrimaryKey(clue.getId());
        if(count == 0){
            throw new CrmException(CrmExceptionEnum.CLUE_CONVERT);
        }
    }

    //线索转换发生交易查询当前线索下的所有活动
    @Override
    public List<Activity> queryActivityIncludeNow(String clueId, String activityName) {
        //先查询线索和市场活动关系表,当前线索对应市场活动的外键
        //先查询出该线索下的关联的市场活动的id号
        ClueActivityRelation clueActivityRelation = new ClueActivityRelation();
        clueActivityRelation.setClueId(clueId);
        List<ClueActivityRelation> clueActivityRelations = clueActivityRelationMapper.select(clueActivityRelation);
        //因为tkMapper中的andNotIn支持多个id号查询,没必须进行遍历单个查询
        //将clueActivityRelations集合中每个ClueActivityRelation中的activityId号取出来放入集合中
        List<String> activityIds = new ArrayList<>();
        for (ClueActivityRelation activityRelation : clueActivityRelations) {
            activityIds.add(activityRelation.getActivityId());
        }

        //查询集合中的所有市场活动弄
        Example example = new Example(Activity.class);
        Example.Criteria criteria = example.createCriteria();
        if (activityName !=null && activityName !=null){
            //有查询条件
            criteria.andLike("name","%" + activityName + "%")
            .andIn("id",activityIds);
        }else{
            //查询条件为空,查询所有
            criteria.andIn("id",activityIds);
        }


        List<Activity> activities = activityMapper.selectByExample(example);
        for (Activity activity : activities) {
            User user =  userMapper.selectByPrimaryKey(activity.getOwner());
            activity.setOwner(user.getName());
        }
        return activities;
    }
}

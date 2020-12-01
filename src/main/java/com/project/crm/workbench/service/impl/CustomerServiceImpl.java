package com.project.crm.workbench.service.impl;

import com.project.crm.base.constants.CrmExceptionEnum;
import com.project.crm.base.exception.CrmException;
import com.project.crm.base.util.DateTimeUtil;
import com.project.crm.base.util.UUIDUtil;
import com.project.crm.workbench.bean.Customer;
import com.project.crm.workbench.bean.CustomerQueryVo;
import com.project.crm.workbench.mapper.CustomerMapper;
import com.project.crm.workbench.mapper.CustomerRemarkMapper;
import com.project.crm.workbench.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.workbench.service.impl
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/29 15:18
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Map<String, String>> queryAllCustomer(CustomerQueryVo queryVo) {
        return customerMapper.queryAllCustomer(queryVo);
    }

    @Override
    public Customer queryActivityById(String id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveCustomer(Customer customer) {
        //UUID主键
        customer.setId(UUIDUtil.getUUID());

        //创建时间
        customer.setCreateTime(DateTimeUtil.getSysTime());
        //更新时间
        customer.setEditTime(DateTimeUtil.getSysTime());

        //insertSelective:空值不参与插入
        int count = customerMapper.insertSelective(customer);
        //更新失败
        if (count ==0){
            throw new CrmException(CrmExceptionEnum.CUSTOMER_SAVE);
        }
    }



}

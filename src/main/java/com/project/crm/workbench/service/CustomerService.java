package com.project.crm.workbench.service;

import com.project.crm.workbench.bean.ActivityQueryVo;
import com.project.crm.workbench.bean.Customer;
import com.project.crm.workbench.bean.CustomerQueryVo;

import java.util.List;
import java.util.Map;

public interface CustomerService {
    List<Map<String, String>> queryAllCustomer(CustomerQueryVo queryVo);

    Customer queryActivityById(String id);

    void saveCustomer(Customer customer);

}

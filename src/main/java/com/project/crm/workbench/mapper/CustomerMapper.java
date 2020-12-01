package com.project.crm.workbench.mapper;

import com.project.crm.workbench.bean.Customer;
import com.project.crm.workbench.bean.CustomerQueryVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface CustomerMapper extends Mapper<Customer> {
    List<Map<String, String>> queryAllCustomer(CustomerQueryVo queryVo);
}

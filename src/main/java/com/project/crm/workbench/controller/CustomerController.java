package com.project.crm.workbench.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.crm.base.bean.PaginationVo;
import com.project.crm.base.bean.ResultVo;
import com.project.crm.base.constants.CrmConstants;
import com.project.crm.base.exception.CrmException;
import com.project.crm.settings.bean.User;
import com.project.crm.workbench.bean.Activity;
import com.project.crm.workbench.bean.ActivityQueryVo;
import com.project.crm.workbench.bean.Customer;
import com.project.crm.workbench.bean.CustomerQueryVo;
import com.project.crm.workbench.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.workbench.controller
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/29 15:17
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/workbench/customer/queryAllCustomer")
    @ResponseBody
    public PaginationVo queryAllCustomer(CustomerQueryVo queryVo,@RequestParam(defaultValue = "1",required = false) int page
            , @RequestParam(defaultValue = "2",required = false) int pageSize
             ){
        //开启分页功能
        PageHelper.startPage(page, pageSize);
        List<Map<String,String>> customers = customerService.queryAllCustomer(queryVo);

        PageInfo<Map<String,String>> pageInfo = new PageInfo<>(customers);
        //把前台分页插件所需要的数据都封装到paginationVo
        PaginationVo paginationVo = new PaginationVo(pageInfo);
        return paginationVo;
    }


    @RequestMapping("/workbench/customer/queryCustomerDetailById")
    @ResponseBody
    public Customer queryCustomerDetailById(String id){
        Customer customer = customerService.queryActivityById(id);
        return customer;
    }


    //创建市场活动
    @RequestMapping("/workbench/customer/saveCustomer")
    @ResponseBody
    public ResultVo saveCustomer(Customer customer, HttpSession session){
        //获取登录用户
        User user = (User) session.getAttribute(CrmConstants.LOGIN_USER);
        //创建者
        customer.setCreateBy(user.getName());
        //编辑者
        customer.setEditBy(user.getName());
        ResultVo resultVo = new ResultVo();
        try{
            customerService.saveCustomer(customer);
            resultVo.setSuccess(true);
            resultVo.setMess("添加成功");
        }catch (CrmException e){
            resultVo.setSuccess(false);
            //将异常信息添加到resultVo
            resultVo.setMess(e.getMessage());
        }
        return resultVo;
    }

}

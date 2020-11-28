package com.project.crm.workbench.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.crm.base.bean.PaginationVo;
import com.project.crm.base.constants.CrmConstants;
import com.project.crm.settings.bean.User;
import com.project.crm.workbench.bean.*;
import com.project.crm.workbench.service.TranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.workbench.controller
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/26 19:27
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Controller
public class TranController {
    @Autowired
    private TranService tranService;

    @RequestMapping("/workbench/transaction/queryAllTran")
    @ResponseBody
    public PaginationVo queryAllTran(@RequestParam(
            defaultValue = "1",required = false) int page
            , @RequestParam(defaultValue = "2",required = false) int pageSize
            , TranQueryVo queryVo){

        //开启分页功能
        PageHelper.startPage(page, pageSize);
        List<Map<String,String>> trans = tranService.queryAllTran(queryVo);

        PageInfo<Map<String,String>> pageInfo = new PageInfo<>(trans);
        //把前台分页插件所需要的数据都封装到paginationVo
        PaginationVo paginationVo = new PaginationVo(pageInfo);
        return paginationVo;
    }


    //根据主键查询市场活动
    @RequestMapping("/workbench/transaction/queryTranDetailById")
    public String queryTranDetailById(String id, Model model,HttpSession session){
        Map<String,String> map = (Map<String, String>)
                session.getServletContext().getAttribute("stage2PossibilityMap");
        Transaction transaction = tranService.queryTranDetailById(id,map);
        model.addAttribute("transaction",transaction);
        return "forward:/toView/transaction/detail";
    }



    //只能给前端返回字符串(1,2,3,4)
    @RequestMapping("/workbench/transaction/queryCustomerName")
    @ResponseBody
    public List<String> queryCustomerName(String customerName){
        return tranService.queryCustomerName(customerName);
    }


    //选中阶段，向后台发送异步请求查询阶段对应的可能性
    @RequestMapping("/workbench/transaction/queryPossibilityByStage")
    @ResponseBody
    public String queryPossibilityByStage(String stage, HttpSession session){
        Map<String,String> stage2PossibilityMap =
                (Map<String, String>) session.getServletContext().getAttribute("stage2PossibilityMap");
        return stage2PossibilityMap.get(stage);
    }


    //保存交易
    @RequestMapping("/workbench/transaction/saveTransaction")
    public String saveTransaction(Transaction transaction,HttpSession session,String company){
        User user = (User) session.getAttribute(CrmConstants.LOGIN_USER);
        transaction.setCreateBy(user.getName());
        tranService.saveTransaction(transaction,company);
        return "/transaction/index";
    }


    //异步查询客户的主键
    @RequestMapping("/workbench/transaction/queryCustomerByName")
    @ResponseBody
    public String queryCustomerByName(String name){
        String customerId = tranService.queryCustomerByName(name);
        return customerId;
    }

    //从交易列表页面点击具体交易,查询出对应列表信息,跳转到交易详情页


}

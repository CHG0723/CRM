package com.project.crm.workbench.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.crm.base.bean.PaginationVo;
import com.project.crm.base.bean.ResultVo;
import com.project.crm.base.constants.CrmConstants;
import com.project.crm.base.exception.CrmException;
import com.project.crm.settings.bean.User;
import com.project.crm.settings.service.UserService;
import com.project.crm.workbench.bean.Activity;
import com.project.crm.workbench.bean.ActivityQueryVo;
import com.project.crm.workbench.bean.ActivityRemark;
import com.project.crm.workbench.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
 * @CreateDate: 2020/11/17 20:49
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Controller
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @Autowired
    private UserService userService;


    @RequestMapping("/workbench/activity/queryAllActivity")
    @ResponseBody
    public PaginationVo queryAllActivity(@RequestParam(
            defaultValue = "1",required = false) int page
    , @RequestParam(defaultValue = "2",required = false) int pageSize
    , ActivityQueryVo queryVo){

        //开启分页功能
        PageHelper.startPage(page, pageSize);
        List<Map<String,String>> activities = activityService.queryAllActivity(queryVo);

        PageInfo<Map<String,String>> pageInfo = new PageInfo<>(activities);
        //把前台分页插件所需要的数据都封装到paginationVo
        PaginationVo paginationVo = new PaginationVo(pageInfo);
        return paginationVo;
    }


    //异步查询所有用户
    @RequestMapping("/workbench/activity/queryAllUsers")
    @ResponseBody
    public List<User> queryAllUsers(){
        return  userService.queryAllUsers();
    }

    //保存市场活动
    @RequestMapping("/workbench/activity/saveActivity")
    @ResponseBody
    public ResultVo saveActivity(Activity activity, HttpSession session){
        //获取登录用户
        User user = (User) session.getAttribute(CrmConstants.LOGIN_USER);
       //创建者
        activity.setCreateBy(user.getName());
        //编辑者
        activity.setEditBy(user.getName());
        ResultVo resultVo = new ResultVo();
     try{
         activityService.saveActivity(activity);
         resultVo.setSuccess(true);
         resultVo.setMess("添加成功");
     }catch (CrmException e){
         resultVo.setSuccess(false);
         //将异常信息添加到resultVo
         resultVo.setMess(e.getMessage());
   }
        return resultVo;
    }


    //根据主键查询市场活动
    @RequestMapping("/workbench/activity/queryActivityById")
    @ResponseBody
    public Activity queryActivityById(String id){
        Activity activity = activityService.queryActivityById(id);
        return activity;
    }


    //异步更新市场活动
    @RequestMapping("/workbench/activity/updateActivity")
    @ResponseBody
    public ResultVo updateActivity(Activity activity,HttpSession session){
        //获取当前登录用户
        User user = (User) session.getAttribute(CrmConstants.LOGIN_USER);
        activity.setEditBy(user.getName());

        ResultVo resultVo = new ResultVo();
        try{
            activityService.updateActivity(activity);
            resultVo.setSuccess(true);
            resultVo.setMess("更新成功");
        }catch (CrmException e){
            resultVo.setSuccess(false);
            //将异常信息添加到resultVo
            resultVo.setMess(e.getMessage());
        }
        return resultVo;
    }


    //根据主键删除市场活动
    @RequestMapping("/workbench/activity/deleteActivity")
    @ResponseBody
    public ResultVo deleteActivity(String id){

        ResultVo resultVo = new ResultVo();
        try{
            activityService.deleteActivity(id);
            resultVo.setSuccess(true);
            resultVo.setMess("删除成功");
        }catch (CrmException e){
            resultVo.setSuccess(false);
            //将异常信息添加到resultVo
            resultVo.setMess(e.getMessage());
        }
        return resultVo;
    }


    //根据主键删除市场活动
    @RequestMapping("/workbench/activity/deleteActivityByDetail")
    @ResponseBody
    public String deleteActivityByDetail(String id){
        try {
            activityService.deleteActivity(id);
        }catch (CrmException e){
            e.printStackTrace();
        }
        return "redirect:/toView/activity/index";
    }




    //根据主键查询市场活动
    @RequestMapping("/workbench/activity/queryActivityDetailById")
    public String queryActivityDetailById(String id, Model model){
        Activity activity = activityService.queryActivityDetailById(id);
        model.addAttribute(activity);
        return "forward:/toView/activity/detail";
    }


    //异步修改备注内容
    @RequestMapping("/workbench/activity/updateActivityRemark")
    @ResponseBody
    public ResultVo updateActivityRemark(ActivityRemark activityRemark){

        ResultVo resultVo = new ResultVo();
        try{
            activityService.updateActivityRemark(activityRemark);
            resultVo.setSuccess(true);
            resultVo.setMess("修改备注成功");
        }catch (CrmException e){
            resultVo.setSuccess(false);
            //将异常信息添加到resultVo
            resultVo.setMess(e.getMessage());
        }
        return resultVo;
    }

    //异步删除
    //异步修改备注内容
    @RequestMapping("/workbench/activity/deleteActivityRemark")
    @ResponseBody
    public ResultVo deleteActivityRemark(String id){

        ResultVo resultVo = new ResultVo();
        try{
            activityService.deleteActivityRemark(id);
            resultVo.setSuccess(true);
            resultVo.setMess("删除备注成功");
        }catch (CrmException e){
            resultVo.setSuccess(false);
            //将异常信息添加到resultVo
            resultVo.setMess(e.getMessage());
        }
        return resultVo;
    }


    //添加市场活动备注
    @RequestMapping("/workbench/activity/saveActivityRemark")
    @ResponseBody
    public ResultVo saveActivityRemark(ActivityRemark activityRemark,HttpSession session){
        ResultVo resultVo = new ResultVo();
        try{
            //获取创建人
           User user = (User) session.getAttribute(CrmConstants.LOGIN_USER);
          activityRemark.setCreateBy(user.getName());
            activityService.saveActivityRemark(activityRemark);
            resultVo.setSuccess(true);
            resultVo.setMess("添加市场多动备注成功");
        }catch (CrmException e){
            resultVo.setSuccess(false);
            //将异常信息添加到resultVo
            resultVo.setMess(e.getMessage());
        }
        return resultVo;
    }

}

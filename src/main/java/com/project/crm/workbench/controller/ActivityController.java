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
import com.project.crm.workbench.service.ActivityService;
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
         resultVo.setOk(true);
         resultVo.setMess("添加成功");
     }catch (CrmException e){
         resultVo.setOk(false);
         //将异常信息添加到resultVo
         resultVo.setMess(e.getMessage());
   }
        return resultVo;
    }
}

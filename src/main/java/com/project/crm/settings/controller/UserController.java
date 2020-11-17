package com.project.crm.settings.controller;

import com.project.crm.base.constants.CrmConstants;
import com.project.crm.base.exception.CrmException;
import com.project.crm.settings.bean.User;
import com.project.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.settings.controller
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/16 19:14
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryUsers")
    @ResponseBody
    public List<User> queryUsers(){
        return userService.queryUsers();
    }


    @PostMapping("/settings/user/login")
    public String login(User user, Model model, HttpSession session, HttpServletRequest request){

        
        //获取用户登录的IP地址
        String ip = request.getRemoteAddr();
        user.setAllowIps(ip);

        try{
            //登录成功
            user = userService.login(user);
            session.setAttribute(CrmConstants.LOGIN_USER,user);
        }catch (CrmException e){
            //登录失败,各种异常
            String mess = e.getMessage();
            model.addAttribute("mess",mess);

            //转发到登录页面,显示错误信息
            return "../../login";
        }

        return "index";
    }
}

package com.project.crm.settings.controller;

import com.project.crm.settings.bean.User;
import com.project.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}

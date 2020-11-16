package com.project.crm.settings.service.impl;

import com.project.crm.settings.bean.User;
import com.project.crm.settings.mapper.UserMapper;
import com.project.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.settings.service.impl
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/16 19:16
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Service("/userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUsers() {
        return userMapper.selectAll();
    }
}

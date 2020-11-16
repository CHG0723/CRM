package com.project.crm.settings.service;

import com.project.crm.settings.bean.User;

import java.util.List;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.settings.service
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/16 19:16
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
public interface UserService {
    List<User> queryUsers();
}

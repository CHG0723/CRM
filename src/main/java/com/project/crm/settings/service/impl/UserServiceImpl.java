package com.project.crm.settings.service.impl;

import com.project.crm.base.constants.CrmExceptionEnum;
import com.project.crm.base.exception.CrmException;
import com.project.crm.settings.bean.User;
import com.project.crm.settings.mapper.UserMapper;
import com.project.crm.settings.service.UserService;
import com.project.crm.base.util.DateTimeUtil;
import com.project.crm.base.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.settings.service.impl
 * @Description: 登录校验
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



    @Override
    public User login(User user) {
        //将用户输入的密码进行MD5加密
        String loginPass = MD5Util.getMD5(user.getLoginPwd());
        user.setLoginPwd(loginPass);

        //获取当前用户登录的ip地址
        String ip = user.getAllowIps();
        //不取出就会当做条件参与查询
        user.setAllowIps(null);
        user = userMapper.selectOne(user);

        //用户名和密码出现错误
        if (user ==null){
            throw new CrmException(CrmExceptionEnum.LOGIN_ACCOUNT_ERROR);
        }else{
            //校验账户是否失效
            String expireTime = user.getExpireTime();

            String now = DateTimeUtil.getSysTime();
            //日期失效了
            if (now.compareTo(expireTime) >0){
                throw new CrmException(CrmExceptionEnum.LOGIN_ACCOUNT_EXPIRE);
            }
            //查看用户账户是否被禁用 0:禁用  1:可用
            if ("0".equals(user.getLockState())){
                //用户账号被禁用
                throw new CrmException(CrmExceptionEnum.LOGIN_ACCOUNT_FORBID);
            }
            //允许登录的IP地址
            if(user.getAllowIps() !=null){
                if (!user.getAllowIps().contains(ip)){
                    //用户不允许登录的ip地址
                    throw new CrmException(CrmExceptionEnum.LOGIN_ACCOUNT_IP);
                }
            }

        }

        return user;
    }
}

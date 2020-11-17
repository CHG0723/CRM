package com.project.crm.settings.bean;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.settings.bean
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/16 19:15
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Table(name = "tbl_user")
@NameStyle(Style.normal)
public class User {
    @Id
    private String id;//主键 UUID
    private String loginAct;//登录账号
    private String name;//用户姓名
    private String loginPwd;//登录密码:不能明文登录 MD5加密
    private String email;//邮箱
    private String expireTime;//失效时间:注册的时候指定使用期限 yyyy-MM-dd hh:mm:ss 失效时间为空的时候表示永不失效
    private String lockState;//账户是否被锁定 0时表示锁定，为1时表示启用
    private String deptno;//所在部门
    private String allowIps;//允许登录的ip地址 IP为空时表示IP地址永不受限
    private String createTime;//创建时间 yyyy-MM-dd hh:mm:ss
    private String createBy;//创建者    yyyy-MM-dd hh:mm:ss
    private String editTime;//编辑时间
    private String editBy;//修改者

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", loginAct='" + loginAct + '\'' +
                ", name='" + name + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                ", email='" + email + '\'' +
                ", expireTime='" + expireTime + '\'' +
                ", lockState='" + lockState + '\'' +
                ", deptno='" + deptno + '\'' +
                ", allowIps='" + allowIps + '\'' +
                ", createTime='" + createTime + '\'' +
                ", createBy='" + createBy + '\'' +
                ", editTime='" + editTime + '\'' +
                ", editBy='" + editBy + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginAct() {
        return loginAct;
    }

    public void setLoginAct(String loginAct) {
        this.loginAct = loginAct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getLockState() {
        return lockState;
    }

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getAllowIps() {
        return allowIps;
    }

    public void setAllowIps(String allowIps) {
        this.allowIps = allowIps;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime;
    }

    public String getEditBy() {
        return editBy;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }
}

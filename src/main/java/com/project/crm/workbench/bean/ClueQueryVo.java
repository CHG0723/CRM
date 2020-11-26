package com.project.crm.workbench.bean;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.workbench.bean
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/22 11:46
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
public class ClueQueryVo {
    private String fullname;
    private String appellation;
    private String phone;
    private String mphone;
    private String source;
    private String owner;
    private String state;

    @Override
    public String toString() {
        return "ClueQueryVo{" +
                "fullname='" + fullname + '\'' +
                ", appellation='" + appellation + '\'' +
                ", phone='" + phone + '\'' +
                ", mphone='" + mphone + '\'' +
                ", source='" + source + '\'' +
                ", owner='" + owner + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

package com.project.crm.workbench.bean;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.workbench.bean
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/29 15:20
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
public class CustomerQueryVo {

    private String name;
    private String owner;
    private String phone;
    private String website;

    @Override
    public String toString() {
        return "CustomerQueryVo{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}

package com.project.crm.settings.bean;

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
public class User {

    @Id
    private String id;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

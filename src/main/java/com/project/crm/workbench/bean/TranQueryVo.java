package com.project.crm.workbench.bean;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.workbench.bean
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/26 19:30
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
public class TranQueryVo {

    private String id;
    private String name;
    private String customerId;
    private String stage;
    private String type;
    private String owner;
    private String source;
    private String contactsId;

    @Override
    public String toString() {
        return "TranQueryVo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", customerId='" + customerId + '\'' +
                ", stage='" + stage + '\'' +
                ", type='" + type + '\'' +
                ", owner='" + owner + '\'' +
                ", source='" + source + '\'' +
                ", contactsId='" + contactsId + '\'' +
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContactsId() {
        return contactsId;
    }

    public void setContactsId(String contactsId) {
        this.contactsId = contactsId;
    }
}

package com.project.crm.workbench.bean;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.workbench.bean
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/18 10:48
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
public class ActivityQueryVo {
    private String name;
    private String owner;
    private String startTime;
    private String endTime;

    @Override
    public String toString() {
        return "ActivityQueryVo{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}

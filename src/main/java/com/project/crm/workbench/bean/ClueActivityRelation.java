package com.project.crm.workbench.bean;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.workbench.bean
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/23 21:17
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Table(name = "tbl_clue_activity_relation")
@NameStyle(Style.normal)
public class ClueActivityRelation {
    @Id
    private String id;
    private String clueId;
    private String activityId;

    @Override
    public String toString() {
        return "ClueActivityRelation{" +
                "id='" + id + '\'' +
                ", clueId='" + clueId + '\'' +
                ", activityId='" + activityId + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClueId() {
        return clueId;
    }

    public void setClueId(String clueId) {
        this.clueId = clueId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }
}

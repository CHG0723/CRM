package com.project.crm.base.bean;

import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Table;
import java.util.List;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.base.bean
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/21 20:42
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Table(name = "tbl_dic_type")
@NameStyle(Style.normal)
public class DictionaryType {
    private String code;
    private String name;
    private String description;

    private List<DictionaryValue> dictionaryValues;

    @Override
    public String toString() {
        return "DictionaryType{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", dictionaryValues=" + dictionaryValues +
                '}';
    }

    public List<DictionaryValue> getDictionaryValues() {
        return dictionaryValues;
    }

    public void setDictionaryValues(List<DictionaryValue> dictionaryValues) {
        this.dictionaryValues = dictionaryValues;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

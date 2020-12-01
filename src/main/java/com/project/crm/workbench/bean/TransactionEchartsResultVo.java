package com.project.crm.workbench.bean;

import java.util.List;
import java.util.Map;


public class TransactionEchartsResultVo {

    private Map<String, List<Map<String,String>>> dataMap;

    private List<String> dataList;

    @Override
    public String toString() {
        return "TransactionEchartsResultVo{" +
                "dataMap=" + dataMap +
                ", dataList=" + dataList +
                '}';
    }

    public Map<String, List<Map<String, String>>> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, List<Map<String, String>>> dataMap) {
        this.dataMap = dataMap;
    }

    public List<String> getDataList() {
        return dataList;
    }

    public void setDataList(List<String> dataList) {
        this.dataList = dataList;
    }
}
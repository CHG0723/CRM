package com.project.crm.base.bean;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.base.bean
 * @Description: 给客户反馈消息的实体类
 * @Author chg
 * @CreateDate: 2020/11/18 14:58
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
public class ResultVo {
private boolean isOk;
private String mess;

    @Override
    public String toString() {
        return "ResultVo{" +
                "isOk=" + isOk +
                ", mess='" + mess + '\'' +
                '}';
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }
}

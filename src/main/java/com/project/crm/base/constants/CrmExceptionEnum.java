package com.project.crm.base.constants;

/**
 * 定义异常的类型
 * 001:用户登录异常
 */
public enum  CrmExceptionEnum {
    LOGIN_ACCOUNT_ERROR("001","用户名或密码错误"),
    LOGIN_ACCOUNT_EXPIRE("001","账户已经失效"),
    LOGIN_ACCOUNT_FORBID("001","账户被禁用"),
    LOGIN_ACCOUNT_IP("001","IP地址错误"),

    ACTIVITY_SAVE("002","添加市场活动失败"),
    ACTIVITY_UPDATE("002","修改市场活动失败"),
    ACTIVITY_DELETE("002","删除市场活动失败"),
    ACTIVITY_REMARK_UPDATE("002","更新市场活动备注失败"),
    ACTIVITY_REMARK_DELETE("002","删除市场活动备注失败"),
    ACTIVITY_REMARK_SAVE("002","添加市场活动备注失败");



    //业务状态码  001:用户登录  002:交易模块
    private String code;

    private String mess;

    CrmExceptionEnum(String code, String mess) {
        this.code = code;
        this.mess = mess;
    }

    @Override
    public String toString() {
        return "CrmExceptionEnum{" +
                "code='" + code + '\'' +
                ", mess='" + mess + '\'' +
                '}';
    }

    public String getCode() {

        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }
}

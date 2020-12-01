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
    ACTIVITY_REMARK_SAVE("002","添加市场活动备注失败"),

   CLUE_SAVE("003","添加线索失败"),
   CLUE_REMARK_UPDATE("003","更新线索失败"),
   CLUE_REMARK_SAVE("003","添加线索失败"),
   CLUE_ACTIVITY_UNBIND("003","线索和市场活动解绑失败"),
   CLUE_UPADATE("003","更新线索失败"),
   CLUE_REMARK_DELETE("003","删除线索失败"),
    CLUE_ACTIVITY_BIND("003","线索和市场活动绑定失败"),
    CLUE_CONVERT("003","线索转换失败"),


    TRANSACTION_SAVE("004","交易失败"),
    TRANSACTION_HISTORY_SAVE("004","交易历史创建失败"),
    TRANSACTION_STAGE_UPDATE("004","交易阶段修改失败"),

    CUSTOMER_SAVE("005","创建客户失败");




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

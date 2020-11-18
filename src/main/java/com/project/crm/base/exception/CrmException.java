package com.project.crm.base.exception;

import com.project.crm.base.constants.CrmExceptionEnum;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.base.exception
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/17 16:12
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 * 自定义异常:
 * 1、可以给用户返回信息
 * 2、项目线上出现bug
 */
public class CrmException extends RuntimeException{

    private CrmExceptionEnum exceptionEnum;

    public CrmException(CrmExceptionEnum exceptionEnum) {
        //将异常信息放在堆栈信息中
        super(exceptionEnum.getMess());

        this.exceptionEnum = exceptionEnum;
    }

    public CrmExceptionEnum getExceptionEnum() {
        return exceptionEnum;
    }

    public void setExceptionEnum(CrmExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }
}

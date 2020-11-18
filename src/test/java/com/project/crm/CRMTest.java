package com.project.crm;

import com.project.crm.base.constants.CrmExceptionEnum;
import com.project.crm.base.exception.CrmException;
import com.project.crm.base.util.DateTimeUtil;
import com.project.crm.base.util.MD5Util;
import com.project.crm.base.util.UUIDUtil;
import com.project.crm.workbench.mapper.ActivityMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;


/**
 * @ProjectName: CRM
 * @Package: com.project.crm
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/16 20:56
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
public class CRMTest {

    //获取UUID的值
    @Test
    public void test01(){
        String uuid = UUIDUtil.getUUID();

        System.out.println(uuid);
    }

    //测试md5加密
    @Test
    public void test02(){
        String admin = MD5Util.getMD5("hei");
        System.out.println(admin);
    }

    //测试日期比较

    /**
     * now>time  返回值>0  now<time 返回值<0
     */
    @Test
    public void test03(){
        String now = DateTimeUtil.getSysTime();
        String time  = "2042-02-03";

        System.out.println(now.compareTo(time));
    }


    //测试自定义异常
    @Test
    public void test04(){
       try{
           int a  =0;
           if (a == 0){
               throw new CrmException(CrmExceptionEnum.LOGIN_ACCOUNT_ERROR);
           }
       }catch (CrmException e){
           System.out.println(e.getMessage());
       }
    }

    //测试查询所有市场活动信息
    @Test
    public void test05(){
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("spring/applicationContext.xml");
       SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) beanFactory.getBean("sqlSessionFactory");
        ActivityMapper activityMapper = sqlSessionFactory.openSession().getMapper(ActivityMapper.class);

        List<Map<String, String>> maps =
                activityMapper.queryAllActivity();

        System.out.println(maps);
    }
}

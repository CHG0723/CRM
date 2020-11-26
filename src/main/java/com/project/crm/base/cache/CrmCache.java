package com.project.crm.base.cache;

import com.project.crm.base.bean.DictionaryType;
import com.project.crm.settings.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import java.util.List;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.base.cache
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/21 20:34
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Component
public class CrmCache {

    @Autowired
    private DictionaryService dictionaryService;

    @Autowired
    private ServletContext servletContext;

    //在bean对象初始化的时候执行对应的方法
    @PostConstruct
    public void cache(){
        List<DictionaryType> dictionaryTypes = dictionaryService.queryDictionary();

        //将dictionaryTypes放入ServletContext中
        servletContext.setAttribute("dictionaryTypes",dictionaryTypes);
    }
}

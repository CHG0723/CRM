package com.project.crm.base.controller;


import com.project.crm.base.bean.DictionaryType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.base.controller
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/21 21:39
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@RestController
public class DictionaryController {

    @RequestMapping("/dictionaryCache")
    public List<DictionaryType> dictionaryCache(HttpSession session){
        ServletContext servletContext = session.getServletContext();
        List<DictionaryType> dictionaryTypes = (List<DictionaryType>) servletContext.getAttribute("dictionaryTypes");
        return dictionaryTypes;
    }


}

package com.project.crm.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.base.controller
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/17 19:28
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Controller
public class ViewController {

    //跳转所有页面    required默认是true,每次必须给该变量传值,false可以传值,也可以不传值
    @RequestMapping({"/toView/{firstView}/{secondView}/{finalView}","/toView/{firstView}/{finalView}","/toView/{finalView}"})
    public String toView(
            @PathVariable(value = "firstView",required = false) String firstView,
            @PathVariable(value = "secondView",required = false) String secondView,
            @PathVariable("finalView") String finalView){

        if(firstView != null){
            if(secondView != null){
                return firstView + File.separator + secondView + File.separator + finalView;
            }
            return firstView + File.separator + finalView;
        }else{
            return finalView;
        }
    }
}

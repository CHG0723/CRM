package com.project.crm.workbench.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.project.crm.base.bean.PaginationVo;
import com.project.crm.base.bean.ResultVo;
import com.project.crm.base.constants.CrmConstants;
import com.project.crm.base.exception.CrmException;
import com.project.crm.settings.bean.User;
import com.project.crm.settings.service.UserService;
import com.project.crm.workbench.bean.*;
import com.project.crm.workbench.service.ClueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: CRM
 * @Package: com.project.crm.workbench.controller
 * @Description: java类作用描述
 * @Author chg
 * @CreateDate: 2020/11/22 11:50
 * Version:  V1.0
 * Copyright:Copyright(c)2020
 */
@Controller
public class ClueController {


    @Autowired
    private ClueService clueService;
    @Autowired
    private UserService userService;

       @RequestMapping("/workbench/clue/queryAllClue")
    @ResponseBody
    public PaginationVo queryAllClue(@RequestParam(
            defaultValue = "1", required = false) int page
            , @RequestParam(defaultValue = "2", required = false) int pageSize
            , ClueQueryVo queryVo) {

        //开启分页功能
        PageHelper.startPage(page, pageSize);
        List<Map<String, String>> clues = clueService.queryAllClue(queryVo);

        PageInfo<Map<String, String>> pageInfo = new PageInfo<>(clues);
        //把前台分页插件所需要的数据都封装到paginationVo
        PaginationVo paginationVo = new PaginationVo(pageInfo);
        return paginationVo;
    }


    //异步查询所有用户
    @RequestMapping("/workbench/clue/queryAllUsers")
    @ResponseBody
    public List<User> queryAllUsers(){
        return  userService.queryAllUsers();
    }


    //根据主键查询市场活动
    @RequestMapping("/workbench/activity/queryClueById")
    @ResponseBody
    public Clue queryClueById(String id){
        Clue clue = clueService.queryClueById(id);
        return clue;
    }


    //异步更新市场活动
    @RequestMapping("/workbench/clue/updateClue")
    @ResponseBody
    public ResultVo updateClue(Clue clue,HttpSession session){
        //获取当前登录用户
        User user = (User) session.getAttribute(CrmConstants.LOGIN_USER);
        clue.setCreateBy(user.getName());

        ResultVo resultVo = new ResultVo();
        try{
            clueService.updateClue(clue);
            resultVo.setSuccess(true);
            resultVo.setMess("更新成功");
        }catch (CrmException e){
            resultVo.setSuccess(false);
            //将异常信息添加到resultVo
            resultVo.setMess(e.getMessage());
        }
        return resultVo;
    }

    //根据线索查询线索及其线索备注信息
    @RequestMapping("/workbench/clue/queryClueDetailById")
    public String queryClueDetailById(String id, Model model) {
        Clue clue = clueService.queryClueDetailById(id);
        model.addAttribute("clue",clue);
        return "/clue/detail";
    }


    @RequestMapping("/workbench/clue/saveClue")
    @ResponseBody
    public ResultVo saveClue(Clue clue, HttpSession session) {
        ResultVo resultVo = new ResultVo();
        try {
            User user = (User) session.getAttribute(CrmConstants.LOGIN_USER);
            clue.setCreateBy(user.getName());
            clueService.saveClue(clue);
            resultVo.setSuccess(true);
            resultVo.setMess("添加线索成功");
        } catch (CrmException e) {
            resultVo.setSuccess(false);
            //将异常信息添加到resultVo
            resultVo.setMess(e.getMessage());
        }
        return resultVo;

    }


    //更新线索备注
    @RequestMapping("/workbench/clue/updateClueRemark")
    @ResponseBody
    public ResultVo updateClueRemark(ClueRemark clueRemark,HttpSession session){
        ResultVo resultVo = new ResultVo();
        try {
            User user = (User) session.getAttribute(CrmConstants.LOGIN_USER);
            clueRemark.setEditBy(user.getName());
            clueService.updateClueRemark(clueRemark);
            resultVo.setSuccess(true);
            resultVo.setMess("更新线索备注成功");
        } catch (CrmException e) {
            resultVo.setSuccess(false);
            //将异常信息添加到resultVo
            resultVo.setMess(e.getMessage());
        }
        return resultVo;
    }

    @RequestMapping("/workbench/clue/saveClueRemark")
    @ResponseBody
    public ResultVo saveClueRemark(ClueRemark clueRemark,HttpSession session){
        ResultVo resultVo = new ResultVo();
        try {
            User user = (User) session.getAttribute(CrmConstants.LOGIN_USER);
            clueRemark.setCreateBy(user.getName());
            clueService.saveClueRemark(clueRemark);
            resultVo.setSuccess(true);
            resultVo.setMess("添加线索备注成功");
        } catch (CrmException e) {
            resultVo.setSuccess(false);
            //将异常信息添加到resultVo
            resultVo.setMess(e.getMessage());
        }
        return resultVo;
    }

    //异步删除
    //异步修改备注内容
    @RequestMapping("/workbench/clue/deleteClueRemark")
    @ResponseBody
    public ResultVo deleteClueRemark(String id){

        ResultVo resultVo = new ResultVo();
        try{
            clueService.deleteClueRemark(id);
            resultVo.setSuccess(true);
            resultVo.setMess("删除备注成功");
        }catch (CrmException e){
            resultVo.setSuccess(false);
            //将异常信息添加到resultVo
            resultVo.setMess(e.getMessage());
        }
        return resultVo;
    }

    //解除线索和市场活动的关联
    @RequestMapping("/workbench/clue/deleteBind")
    @ResponseBody
    public ResultVo deleteBind(ClueActivityRelation clueActivityRelation){
        ResultVo resultVo = new ResultVo();
        try{
            clueService.deleteBind(clueActivityRelation);
            resultVo.setSuccess(true);
            resultVo.setMess("线索和市场活动解绑成功");
        }catch (CrmException e){
            resultVo.setSuccess(false);
            resultVo.setMess(e.getMessage());
        }

        return resultVo;
    }


    //解除多个线索和市场活动的关联
    @RequestMapping("/workbench/clue/deleteManyBind")
    @ResponseBody
    public ResultVo deleteManyBind(String clueId,String activityIds){
        ResultVo resultVo = new ResultVo();
        try{
            clueService.deleteManyBind(clueId,activityIds);
            resultVo.setSuccess(true);
            resultVo.setMess("线索和市场活动解绑成功");
        }catch (CrmException e){
            resultVo.setSuccess(false);
            resultVo.setMess(e.getMessage());
        }

        return resultVo;
    }


    //查询所有市场活动,但是不包含当前线索对象
    @RequestMapping("/workbench/clue/queryActivityExculdeNow")
    @ResponseBody
    public  List<Activity> queryActivityExculdeNow(String clueId,String activityName){
        List<Activity> activities =  clueService.queryActivityExculdeNow(clueId,activityName);
        return activities;
    }

//线索转换发生交易查询当前线索下的所有活动
    @RequestMapping("/workbench/clue/queryActivityIncludeNow")
    @ResponseBody
    public  List<Activity> queryActivityIncludeNow(String clueId,String activityName){
        List<Activity> activities =  clueService.queryActivityIncludeNow(clueId,activityName);
        return activities;
    }


    //保存线索和市场活动的关联
    @RequestMapping("/workbench/clue/saveBind")
    @ResponseBody
    public ResultVo saveBind(String clueId,String activityIds){
        ResultVo resultVo = new ResultVo();
        try{
            clueService.saveBind(clueId,activityIds);
            resultVo.setSuccess(true);
            resultVo.setMess("线索和市场活动绑定成功");
        }catch (CrmException e){
            resultVo.setSuccess(false);
            resultVo.setMess(e.getMessage());
        }

        return resultVo;
    }

    //线索个市场活动关联成功后,再异步查询关联后的所有市场活动
    @RequestMapping("/workbench/clue/queryClueActivity")
    @ResponseBody
    public  List<Activity> queryClueActivity(String clueId){
        List<Activity> activities =  clueService.queryClueActivity(clueId);
        return activities;
    }

    //跳转到线索转换页面
    @RequestMapping("/workbench/clue/toConvertView")
    public String toConvertView(String id,Model model){
        Clue clue = clueService.queryClueDetailById(id);
        model.addAttribute("clue",clue);
           return "/clue/convert";
    }
    //转换
    /*
    * transaction:用于接收交易的表单
    * clueId:线索id
    * isCreateTransaction:是否进行交易
    */
    @RequestMapping("/workbench/clue/convert")
    public String convert(Transaction transaction,String clueId,HttpSession session,String isCreateTransaction){
           User user = (User) session.getAttribute(CrmConstants.LOGIN_USER);
           clueService.convert(transaction,clueId,user.getName(),isCreateTransaction);
           return "redirect:/toView/clue/index";
    }
}
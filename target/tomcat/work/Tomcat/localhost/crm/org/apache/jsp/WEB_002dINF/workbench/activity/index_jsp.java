/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-11-30 02:57:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.workbench.activity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"/crm/jquery/bootstrap_3.3.0/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"/crm/jquery/bootstrap-datetimepicker-master/css/bootstrap-datetimepicker.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/crm/jquery/jquery-1.11.1-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/crm/jquery/bootstrap_3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/crm/jquery/bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/crm/jquery/bootstrap-datetimepicker-master/locale/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<link href=\"/crm/jquery/bs_pagination/jquery.bs_pagination.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/crm/jquery/bs_pagination/en.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/crm/jquery/bs_pagination/jquery.bs_pagination.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 创建市场活动的模态窗口 -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"createActivityModal\" role=\"dialog\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\" style=\"width: 85%;\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">×</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel1\">创建市场活动</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\" id=\"createActivityForm\" action=\"/crm/workbench/activity/saveActivity\" method=\"post\" role=\"form\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"create-marketActivityOwner\" class=\"col-sm-2 control-label\">所有者<span style=\"font-size: 15px; color: red;\">*</span></label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\" style=\"width: 300px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"form-control\" name=\"owner\" id=\"create-marketActivityOwner\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                            <label for=\"create-marketActivityName\" class=\"col-sm-2 control-label\">名称<span style=\"font-size: 15px; color: red;\">*</span></label>\r\n");
      out.write("                            <div class=\"col-sm-10\" style=\"width: 300px;\">\r\n");
      out.write("                                <input type=\"text\" name=\"name\" class=\"form-control\" id=\"create-marketActivityName\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"create-startTime\" class=\"col-sm-2 control-label\">开始日期</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\" style=\"width: 300px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"startDate\" class=\"form-control\" id=\"create-startTime\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"create-endTime\" class=\"col-sm-2 control-label\">结束日期</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\" style=\"width: 300px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"endDate\" class=\"form-control\" id=\"create-endTime\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("                            <label for=\"create-cost\" class=\"col-sm-2 control-label\">成本</label>\r\n");
      out.write("                            <div class=\"col-sm-10\" style=\"width: 300px;\">\r\n");
      out.write("                                <input type=\"text\" name=\"cost\" class=\"form-control\" id=\"create-cost\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"create-describe\" class=\"col-sm-2 control-label\">描述</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\" style=\"width: 81%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea class=\"form-control\" name=\"description\" rows=\"3\" id=\"create-describe\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\">关闭</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id=\"saveActivityBtn\" class=\"btn btn-primary\">保存</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 修改市场活动的模态窗口 -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"editActivityModal\" role=\"dialog\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\" style=\"width: 85%;\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">×</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\" id=\"myModalLabel2\">修改市场活动</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" id=\"activityId\"/>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"edit-marketActivityOwner\" class=\"col-sm-2 control-label\">所有者<span style=\"font-size: 15px; color: red;\">*</span></label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\" style=\"width: 300px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<select class=\"form-control\" id=\"edit-marketActivityOwner\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("                            <label for=\"edit-marketActivityName\" class=\"col-sm-2 control-label\">名称<span style=\"font-size: 15px; color: red;\">*</span></label>\r\n");
      out.write("                            <div class=\"col-sm-10\" style=\"width: 300px;\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"edit-marketActivityName\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"edit-startTime\" class=\"col-sm-2 control-label\">开始日期</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\" style=\"width: 300px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"edit-startTime\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"edit-endTime\" class=\"col-sm-2 control-label\">结束日期</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\" style=\"width: 300px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"edit-endTime\" >\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"edit-cost\" class=\"col-sm-2 control-label\">成本</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\" style=\"width: 300px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"edit-cost\" >\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"edit-describe\" class=\"col-sm-2 control-label\">描述</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\" style=\"width: 81%;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<textarea class=\"form-control\" rows=\"3\" id=\"edit-describe\"></textarea>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" id=\"updateActivity-btn\">更新</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div style=\"position: relative; left: 10px; top: -10px;\">\r\n");
      out.write("\t\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t\t<h3>市场活动列表</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"position: relative; top: -20px; left: 0px; width: 100%; height: 100%;\">\r\n");
      out.write("\t\t<div style=\"width: 100%; position: absolute;top: 5px; left: 10px;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"btn-toolbar\" role=\"toolbar\" style=\"height: 80px;\">\r\n");
      out.write("\t\t\t\t<form class=\"form-inline\" role=\"form\" style=\"position: relative;top: 8%; left: 5px;\">\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t\t      <div class=\"input-group-addon\">名称</div>\r\n");
      out.write("\t\t\t\t      <input class=\"form-control\" id=\"name\" type=\"text\">\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t\t      <div class=\"input-group-addon\">所有者</div>\r\n");
      out.write("\t\t\t\t      <input class=\"form-control\" id=\"owner\" type=\"text\">\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t\t      <div class=\"input-group-addon\">开始日期</div>\r\n");
      out.write("\t\t\t\t\t  <input class=\"form-control\" type=\"text\" id=\"startTime\" />\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t\t      <div class=\"input-group-addon\">结束日期</div>\r\n");
      out.write("\t\t\t\t\t  <input class=\"form-control\" type=\"text\" id=\"endTime\">\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <button type=\"button\" onclick=\"queryActivity()\" class=\"btn btn-default\">查询</button>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"btn-toolbar\" role=\"toolbar\" style=\"background-color: #F7F7F7; height: 50px; position: relative;top: 5px;\">\r\n");
      out.write("\t\t\t\t<div class=\"btn-group\" style=\"position: relative; top: 18%;\">\r\n");
      out.write("\t\t\t\t  <button type=\"button\" id=\"createActivity\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#createActivityModal\"><span class=\"glyphicon glyphicon-plus\"></span> 创建</button>\r\n");
      out.write("\t\t\t\t  <button id=\"updateActivityBtn\" type=\"button\" class=\"btn btn-default\" data-toggle=\"modal\"><span class=\"glyphicon glyphicon-pencil\"></span> 修改</button>\r\n");
      out.write("\t\t\t\t  <button id=\"deleteActivityBtn\" type=\"button\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-minus\"></span> 删除</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"position: relative;top: 10px;\">\r\n");
      out.write("\t\t\t\t<table class=\"table table-hover\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr style=\"color: #B3B3B3;\">\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"checkbox\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>名称</td>\r\n");
      out.write("                            <td>所有者</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>开始日期</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>结束日期</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody id=\"activityBody\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div style=\"height: 50px; position: relative;top: 20px;\">\r\n");
      out.write("\t\t\t\t<div  id=\"activityPage\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\t//提交新建市场活动表单\r\n");
      out.write("\t$('#saveActivityBtn').click(function () {\r\n");
      out.write("\r\n");
      out.write("\t\t//异步提交创建市场活动表单\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : '/crm/workbench/activity/saveActivity',\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t'owner' : $('#create-marketActivityOwner').val(),\r\n");
      out.write("\t\t\t\t'name'  : $('#create-marketActivityName').val(),\r\n");
      out.write("\t\t\t\t'startDate' : $('#create-startTime').val(),\r\n");
      out.write("\t\t\t\t'endDate'  : $('#create-endTime').val(),\r\n");
      out.write("\t\t\t\t'cost' :$('#create-cost').val(),\r\n");
      out.write("\t\t\t\t'description' : $('#create-describe').val()\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\ttype : 'post',\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\talert(data.mess);\r\n");
      out.write("\t\t\t\t//表单重置\r\n");
      out.write("\t\t\t\t$('#createActivityForm')[0].reset();\r\n");
      out.write("\t\t\t\t/*\r\n");
      out.write("\t\t\t\tmodal函数:弹窗函数 show:显示  hide:隐藏\r\n");
      out.write("\t\t\t\t */\r\n");
      out.write("\t\t\t\t//隐藏模态窗口\r\n");
      out.write("\t\t\t\t$('#createActivityModal').modal('hide');\r\n");
      out.write("\t\t\t\t//调用pageList刷新页面\r\n");
      out.write("\t\t\t\tpageList(1,2);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t//打开新建市场活动模态窗查询所有用户\r\n");
      out.write("\t$('#createActivity').click(function () {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : '/crm/workbench/activity/queryAllUsers',\r\n");
      out.write("\t\t\ttype : 'get',\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\t//清空上一页拼接的数据\r\n");
      out.write("\t\t\t\t$('#create-marketActivityOwner').html(\"\");\r\n");
      out.write("\t\t\t\tfor (var i=0;i < data.length;i++){\r\n");
      out.write("\t\t\t\t\t$('#create-marketActivityOwner')\r\n");
      out.write("\t\t\t\t\t\t\t.append(\"<option value=\"+data[i].id+\">\"+data[i].name+\"</option>\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t//点击查询按钮查询数据\r\n");
      out.write("\tfunction queryActivity(){\r\n");
      out.write("\t\tpageList(1,2);\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t/*参数一:当前页码\r\n");
      out.write("\t参数二:每页记录数\r\n");
      out.write("\t* */\r\n");
      out.write("\tpageList(1,2);\r\n");
      out.write("\t//跳转到活动列表首页的时候,向后台发送查询所有市场活动信息列表的异步请求\r\n");
      out.write("\t//刷新页面的方法\r\n");
      out.write("\tfunction pageList(page,pageSize) {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : '/crm/workbench/activity/queryAllActivity',\r\n");
      out.write("\t\t\tdata : {'page':page,\r\n");
      out.write("\t\t\t    'pageSize':pageSize,\r\n");
      out.write("\t\t\t\t'name':$('#name').val(),\r\n");
      out.write("\t\t\t\t'owner':$('#owner').val(),\r\n");
      out.write("\t\t\t\t'startTime':$('#startTime').val(),\r\n");
      out.write("\t\t\t\t'endTime':$('#endTime').val()},\r\n");
      out.write("\t\t\ttype : 'get',\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\t//清空上一页拼接的数据\r\n");
      out.write("\t\t\t\t$('#activityBody').html(\"\");\r\n");
      out.write("\t\t\t\t//后台传递的每页的总数据\r\n");
      out.write("\t\t\t\tvar dataList = data.dataList;\r\n");
      out.write("\t\t\t\tfor (var i=0;i<dataList.length;i++){\r\n");
      out.write("\t\t\t\t\t//list是每页遍历的数据\r\n");
      out.write("\t\t\t\t\tvar list = dataList[i];\r\n");
      out.write("\t\t\t\t\t$('#activityBody').append(\"<tr class=\\\"active\\\">\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"<td><input type=\\\"checkbox\\\" class='son' value=\"+list.id+\" /></td>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"<td><a style=\\\"text-decoration: none; cursor: pointer;\\\" href=/crm/workbench/activity/queryActivityDetailById?id=\"+list.id+\">\"+list.name+\"</a></td>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"<td>\"+list.uname+\"</td>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"<td>\"+list.startDate+\"</td>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"<td>\"+list.endDate+\"</td>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"</tr> \");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t//利用分页插件查询第一页数据\r\n");
      out.write("\t\t\t\t$(\"#activityPage\").bs_pagination({\r\n");
      out.write("\t\t\t\t\tcurrentPage: data.page, // 页码\r\n");
      out.write("\t\t\t\t\trowsPerPage: data.pageSize, // 每页显示的记录条数\r\n");
      out.write("\t\t\t\t\tmaxRowsPerPage: 20, // 每页最多显示的记录条数\r\n");
      out.write("\t\t\t\t\ttotalPages: data.pages, // 总页数\r\n");
      out.write("\t\t\t\t\ttotalRows: data.total, // 总记录条数\r\n");
      out.write("\t\t\t\t\tvisiblePageLinks: 3, // 显示几个卡片\r\n");
      out.write("\t\t\t\t\tshowGoToPage: true,\r\n");
      out.write("\t\t\t\t\tshowRowsPerPage: true,\r\n");
      out.write("\t\t\t\t\tshowRowsInfo: true,\r\n");
      out.write("\t\t\t\t\tshowRowsDefaultInfo: true,\r\n");
      out.write("\t\t\t\t\t//回调函数，用户每次点击分页插件进行翻页的时候就会触发该函数\r\n");
      out.write("\t\t\t\t\tonChangePage : function(event, obj){\r\n");
      out.write("\t\t\t\t\t\t//刷新页面，obj.currentPage:当前点击的页码\r\n");
      out.write("\t\t\t\t\t\tpageList(obj.currentPage,obj.rowsPerPage);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("//条件查询日历插件\r\n");
      out.write("\t//条件查询日历插件\r\n");
      out.write("\t$(\"#startTime\").datetimepicker({\r\n");
      out.write("\t\tlanguage:  \"zh-CN\",\r\n");
      out.write("\t\tformat: \"yyyy-mm-dd\",//显示格式\r\n");
      out.write("\t\tminView: \"day\",//设置只显示到月份\r\n");
      out.write("\t\tinitialDate: new Date(),//初始化当前日期\r\n");
      out.write("\t\tautoclose: true,//选中自动关闭\r\n");
      out.write("\t\ttodayBtn: true, //显示今日按钮\r\n");
      out.write("\t\tclearBtn : true,\r\n");
      out.write("\t\tpickerPosition: \"bottom-left\"\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(\"#endTime\").datetimepicker({\r\n");
      out.write("\t\tlanguage:  \"zh-CN\",\r\n");
      out.write("\t\tformat: \"yyyy-mm-dd\",//显示格式\r\n");
      out.write("\t\tminView: \"day\",//设置只显示到月份\r\n");
      out.write("\t\tinitialDate: new Date(),//初始化当前日期\r\n");
      out.write("\t\tautoclose: true,//选中自动关闭\r\n");
      out.write("\t\ttodayBtn: true, //显示今日按钮\r\n");
      out.write("\t\tclearBtn : true,\r\n");
      out.write("\t\tpickerPosition: \"bottom-left\"\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("//创建市场活动日期\r\n");
      out.write("\r\n");
      out.write("\t$(\"#create-startTime\").datetimepicker({\r\n");
      out.write("\t\tlanguage:  \"zh-CN\",\r\n");
      out.write("\t\tformat: \"yyyy-mm-dd\",//显示格式\r\n");
      out.write("\t\tminView: \"day\",//设置只显示到月份\r\n");
      out.write("\t\tinitialDate: new Date(),//初始化当前日期\r\n");
      out.write("\t\tautoclose: true,//选中自动关闭\r\n");
      out.write("\t\ttodayBtn: true, //显示今日按钮\r\n");
      out.write("\t\tclearBtn : true,\r\n");
      out.write("\t\tpickerPosition: \"bottom-left\"\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(\"#create-endTime\").datetimepicker({\r\n");
      out.write("\t\tlanguage:  \"zh-CN\",\r\n");
      out.write("\t\tformat: \"yyyy-mm-dd\",//显示格式\r\n");
      out.write("\t\tminView: \"day\",//设置只显示到月份\r\n");
      out.write("\t\tinitialDate: new Date(),//初始化当前日期\r\n");
      out.write("\t\tautoclose: true,//选中自动关闭\r\n");
      out.write("\t\ttodayBtn: true, //显示今日按钮\r\n");
      out.write("\t\tclearBtn : true,\r\n");
      out.write("\t\tpickerPosition: \"bottom-left\"\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//点击修改按钮弹出模态窗\r\n");
      out.write("\t$('#updateActivityBtn').click(function () {\r\n");
      out.write("\t\t//获取勾中的son的个数\r\n");
      out.write("\t\tif ($('.son:checked').length ==0){\r\n");
      out.write("\t\t\talert(\"至少勾中一条记录\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}else if ($('.son:checked').length>1){\r\n");
      out.write("\t\t\talert(\"只能勾中一条记录\");\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t    //手动显示模态窗\r\n");
      out.write("\t\t\t$('#editActivityModal').modal('show');\r\n");
      out.write("\t\t\t//异步查询所有者信息\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url : '/crm/workbench/activity/queryAllUsers',\r\n");
      out.write("                type : 'get',\r\n");
      out.write("                dataType : 'json',\r\n");
      out.write("                success : function(data){\r\n");
      out.write("                    //清空上一页拼接的数据\r\n");
      out.write("                    $('#edit-marketActivityOwner').html(\"\");\r\n");
      out.write("                    for (var i=0;i < data.length;i++){\r\n");
      out.write("                        $('#edit-marketActivityOwner')\r\n");
      out.write("                            .append(\"<option value=\"+data[i].id+\">\"+data[i].name+\"</option>\");\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            //向后台传递主键,查询该条市场活动信息\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                url : '/crm/workbench/activity/queryActivityById',\r\n");
      out.write("                type : 'get',\r\n");
      out.write("\t\t\t\tdata : {'id':$('.son:checked').val()},\r\n");
      out.write("                dataType : 'json',\r\n");
      out.write("                success : function(data){\r\n");
      out.write("                \t//隐藏域\r\n");
      out.write("\t\t\t\t\t$('#activityId').val(data.id);\r\n");
      out.write("\t\t\t\t\t//让修改模态窗的所有者和查询出来的市场活动的所有者相同\r\n");
      out.write("\t\t\t\t\t//市场活动的owner\r\n");
      out.write("\t\t\t\t\tvar owner = data.owner;\r\n");
      out.write("\t\t\t\t\t$('#edit-marketActivityOwner option').each(function () {\r\n");
      out.write("\t\t\t\t\t\tif($(this).val() == owner){\r\n");
      out.write("\t\t\t\t\t\t\t//选中\r\n");
      out.write("\t\t\t\t\t\t\t$(this).prop('selected',true);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t$('#edit-marketActivityName').val(data.name);\r\n");
      out.write("\t\t\t\t\t$('#edit-startTime').val(data.startDate);\r\n");
      out.write("\t\t\t\t\t$('#edit-endTime').val(data.endDate);\r\n");
      out.write("\t\t\t\t\t$('#edit-cost').val(data.cost);\r\n");
      out.write("\t\t\t\t\t$('#edit-describe').val(data.description);\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\t//点击修改模态窗口更新按钮，异步提交表单\r\n");
      out.write("\t$('#updateActivity-btn').click(function () {\r\n");
      out.write("\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : '/crm/workbench/activity/updateActivity',\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t'id' : $('#activityId').val(),\r\n");
      out.write("\t\t\t\t'owner' : $('#edit-marketActivityOwner').val(),\r\n");
      out.write("\t\t\t\t'name' : $('#edit-marketActivityName').val(),\r\n");
      out.write("\t\t\t\t'startDate' : $('#edit-startTime').val(),\r\n");
      out.write("\t\t\t\t'endDate' : $('#edit-endTime').val(),\r\n");
      out.write("\t\t\t\t'cost' : $('#edit-cost').val(),\r\n");
      out.write("\t\t\t\t'description' : $('#edit-describe').val(),\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\ttype : 'post',\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\talert(data.mess);\r\n");
      out.write("\t\t\t\t//刷新页面\r\n");
      out.write("\t\t\t\tpageList(1,2);\r\n");
      out.write("\t\t\t\t//关闭模态窗口\teasyui\r\n");
      out.write("\t\t\t\t$('#editActivityModal').modal('hide');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("               //修改模态窗口的日历插件\r\n");
      out.write("\t$(\"#edit-startTime\").datetimepicker({\r\n");
      out.write("\t\tlanguage:  \"zh-CN\",\r\n");
      out.write("\t\tformat: \"yyyy-mm-dd\",//显示格式\r\n");
      out.write("\t\tminView: \"day\",//设置只显示到月份\r\n");
      out.write("\t\tinitialDate: new Date(),//初始化当前日期\r\n");
      out.write("\t\tautoclose: true,//选中自动关闭\r\n");
      out.write("\t\ttodayBtn: true, //显示今日按钮\r\n");
      out.write("\t\tclearBtn : true,\r\n");
      out.write("\t\tpickerPosition: \"bottom-left\"\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t$(\"#edit-endTime\").datetimepicker({\r\n");
      out.write("\t\tlanguage:  \"zh-CN\",\r\n");
      out.write("\t\tformat: \"yyyy-mm-dd\",//显示格式\r\n");
      out.write("\t\tminView: \"day\",//设置只显示到月份\r\n");
      out.write("\t\tinitialDate: new Date(),//初始化当前日期\r\n");
      out.write("\t\tautoclose: true,//选中自动关闭\r\n");
      out.write("\t\ttodayBtn: true, //显示今日按钮\r\n");
      out.write("\t\tclearBtn : true,\r\n");
      out.write("\t\tpickerPosition: \"bottom-left\"\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t//删除市场活动\r\n");
      out.write("\t$('#deleteActivityBtn').bind('click',function () {\r\n");
      out.write("\t\t//获取勾中的记录,获取主键\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : '/crm/workbench/activity/deleteActivity',\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\t'id' : $('.son:checked').val()\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\ttype : 'get',\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\trefresh(data);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t//增删改之后弹出消息,刷新页面\r\n");
      out.write("\tfunction refresh(data) {\r\n");
      out.write("\t\talert(data.mess);\r\n");
      out.write("\t\t//刷新页面\r\n");
      out.write("\t\tpageList(1,2);\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

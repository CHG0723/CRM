/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-11-26 12:32:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.workbench.transaction;

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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("\t<link href=\"/crm/jquery/bootstrap_3.3.0/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<link href=\"/crm/jquery/bootstrap-datetimepicker-master/css/bootstrap-datetimepicker.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/crm/jquery/jquery-1.11.1-min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/crm/jquery/bootstrap_3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/crm/jquery/bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/crm/jquery/bootstrap-datetimepicker-master/locale/bootstrap-datetimepicker.zh-CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<link href=\"/crm/jquery/bs_pagination/jquery.bs_pagination.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/crm/jquery/bs_pagination/en.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/crm/jquery/bs_pagination/jquery.bs_pagination.min.js\"></script>\r\n");
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
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div style=\"position: relative; left: 10px; top: -10px;\">\r\n");
      out.write("\t\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t\t<h3>交易列表</h3>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"position: relative; top: -20px; left: 0px; width: 100%; height: 100%;\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div style=\"width: 100%; position: absolute;top: 5px; left: 10px;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"btn-toolbar\" role=\"toolbar\" style=\"height: 80px;\">\r\n");
      out.write("\t\t\t\t<form class=\"form-inline\" role=\"form\" style=\"position: relative;top: 8%; left: 5px;\">\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t\t      <div class=\"input-group-addon\">所有者</div>\r\n");
      out.write("\t\t\t\t      <input class=\"form-control\" type=\"text\">\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t\t      <div class=\"input-group-addon\">名称</div>\r\n");
      out.write("\t\t\t\t      <input class=\"form-control\" type=\"text\">\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t\t      <div class=\"input-group-addon\">客户名称</div>\r\n");
      out.write("\t\t\t\t      <input class=\"form-control\" type=\"text\">\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <br>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t\t      <div class=\"input-group-addon\">阶段</div>\r\n");
      out.write("\t\t\t\t\t  <select class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t  \t<option></option>\r\n");
      out.write("\t\t\t\t\t  \t<option>资质审查</option>\r\n");
      out.write("\t\t\t\t\t  \t<option>需求分析</option>\r\n");
      out.write("\t\t\t\t\t  \t<option>价值建议</option>\r\n");
      out.write("\t\t\t\t\t  \t<option>确定决策者</option>\r\n");
      out.write("\t\t\t\t\t  \t<option>提案/报价</option>\r\n");
      out.write("\t\t\t\t\t  \t<option>谈判/复审</option>\r\n");
      out.write("\t\t\t\t\t  \t<option>成交</option>\r\n");
      out.write("\t\t\t\t\t  \t<option>丢失的线索</option>\r\n");
      out.write("\t\t\t\t\t  \t<option>因竞争丢失关闭</option>\r\n");
      out.write("\t\t\t\t\t  </select>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t\t      <div class=\"input-group-addon\">类型</div>\r\n");
      out.write("\t\t\t\t\t  <select class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t  \t<option></option>\r\n");
      out.write("\t\t\t\t\t  \t<option>已有业务</option>\r\n");
      out.write("\t\t\t\t\t  \t<option>新业务</option>\r\n");
      out.write("\t\t\t\t\t  </select>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t\t      <div class=\"input-group-addon\">来源</div>\r\n");
      out.write("\t\t\t\t      <select class=\"form-control\" id=\"create-clueSource\">\r\n");
      out.write("\t\t\t\t\t\t  <option></option>\r\n");
      out.write("\t\t\t\t\t\t  <option>广告</option>\r\n");
      out.write("\t\t\t\t\t\t  <option>推销电话</option>\r\n");
      out.write("\t\t\t\t\t\t  <option>员工介绍</option>\r\n");
      out.write("\t\t\t\t\t\t  <option>外部介绍</option>\r\n");
      out.write("\t\t\t\t\t\t  <option>在线商场</option>\r\n");
      out.write("\t\t\t\t\t\t  <option>合作伙伴</option>\r\n");
      out.write("\t\t\t\t\t\t  <option>公开媒介</option>\r\n");
      out.write("\t\t\t\t\t\t  <option>销售邮件</option>\r\n");
      out.write("\t\t\t\t\t\t  <option>合作伙伴研讨会</option>\r\n");
      out.write("\t\t\t\t\t\t  <option>内部研讨会</option>\r\n");
      out.write("\t\t\t\t\t\t  <option>交易会</option>\r\n");
      out.write("\t\t\t\t\t\t  <option>web下载</option>\r\n");
      out.write("\t\t\t\t\t\t  <option>web调研</option>\r\n");
      out.write("\t\t\t\t\t\t  <option>聊天</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <div class=\"input-group\">\r\n");
      out.write("\t\t\t\t      <div class=\"input-group-addon\">联系人名称</div>\r\n");
      out.write("\t\t\t\t      <input class=\"form-control\" type=\"text\">\r\n");
      out.write("\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <button type=\"submit\" class=\"btn btn-default\">查询</button>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"btn-toolbar\" role=\"toolbar\" style=\"background-color: #F7F7F7; height: 50px; position: relative;top: 10px;\">\r\n");
      out.write("\t\t\t\t<div class=\"btn-group\" style=\"position: relative; top: 18%;\">\r\n");
      out.write("\t\t\t\t  <button type=\"button\" class=\"btn btn-primary\" onclick=\"window.location.href='save.html';\"><span class=\"glyphicon glyphicon-plus\"></span> 创建</button>\r\n");
      out.write("\t\t\t\t  <button type=\"button\" class=\"btn btn-default\" onclick=\"window.location.href='edit.html';\"><span class=\"glyphicon glyphicon-pencil\"></span> 修改</button>\r\n");
      out.write("\t\t\t\t  <button type=\"button\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-minus\"></span> 删除</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"position: relative;top: 10px;\">\r\n");
      out.write("\t\t\t\t<table class=\"table table-hover\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr style=\"color: #B3B3B3;\">\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"checkbox\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>客户名称</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>阶段</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>类型</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>所有者</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>来源</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>联系人名称</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody id=\"activityBody\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<div style=\"height: 50px; position: relative;top: 20px;\">\r\n");
      out.write("\t\t\t\t<div  id=\"activityPage\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t//跳转到活动列表首页的时候,向后台发送查询所有市场活动信息列表的异步请求\r\n");
      out.write("\t//刷新页面的方法\r\n");
      out.write("\tpageList(1,2);\r\n");
      out.write("\tfunction pageList(page,pageSize) {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : '/crm/workbench/transaction/queryAllTran',\r\n");
      out.write("\t\t\tdata : {'page':page,\r\n");
      out.write("\t\t\t\t'pageSize':pageSize,\r\n");
      out.write("\t\t\t\t'name':$('#name').val(),\r\n");
      out.write("\t\t\t\t'customerId':$('#customerId').val(),\r\n");
      out.write("\t\t\t\t'stage':$('#stage').val(),\r\n");
      out.write("\t\t\t\t'type':$('#type').val(),\r\n");
      out.write("\t\t\t\t'owner':$('#owner').val(),\r\n");
      out.write("\t\t\t\t'source':$('#source').val(),\r\n");
      out.write("\t\t\t\t'contactsId':$('#contactsId').val()},\r\n");
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
      out.write("\t\t\t\t\t$('#activityBody').append(\"\\t<tr>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"\\t\\t\\t\\t\\t\\t\\t<td><input type=\\\"checkbox\\\" /></td>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"\\t\\t\\t\\t\\t\\t\\t<td><a style=\\\"text-decoration: none; cursor: pointer;\\\" href=/crm/workbench/transaction/queryTranDetailById?id=\"+list.id+\">\"+list.name+\"</a></td>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"\\t\\t\\t\\t\\t\\t\\t<td>\"+list.customerId+\"</td>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"\\t\\t\\t\\t\\t\\t\\t<td>\"+list.stage+\"</td>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"\\t\\t\\t\\t\\t\\t\\t<td>\"+list.type+\"</td>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"\\t\\t\\t\\t\\t\\t\\t<td>\"+list.owner+\"</td>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"\\t\\t\\t\\t\\t\\t\\t<td>\"+list.source+\"</td>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"\\t\\t\\t\\t\\t\\t\\t<td>\"+list.contactsId+\"</td>\\n\" +\r\n");
      out.write("\t\t\t\t\t\t\t\"\\t\\t\\t\\t\\t\\t</tr>\");\r\n");
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
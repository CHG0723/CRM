/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-11-19 09:07:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.workbench;

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
      out.write("<link href=\"/crm/jquery/bootstrap_3.3.0/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"/crm/jquery/jquery-1.11.1-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/crm/jquery/bootstrap_3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t//页面加载完毕\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//导航中所有文本颜色为黑色\r\n");
      out.write("\t\t$(\".liClass > a\").css(\"color\" , \"black\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//默认选中导航菜单中的第一个菜单项\r\n");
      out.write("\t\t$(\".liClass:first\").addClass(\"active\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//第一个菜单项的文字变成白色\r\n");
      out.write("\t\t$(\".liClass:first > a\").css(\"color\" , \"white\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//给所有的菜单项注册鼠标单击事件\r\n");
      out.write("\t\t$(\".liClass\").click(function(){\r\n");
      out.write("\t\t\t//移除所有菜单项的激活状态\r\n");
      out.write("\t\t\t$(\".liClass\").removeClass(\"active\");\r\n");
      out.write("\t\t\t//导航中所有文本颜色为黑色\r\n");
      out.write("\t\t\t$(\".liClass > a\").css(\"color\" , \"black\");\r\n");
      out.write("\t\t\t//当前项目被选中\r\n");
      out.write("\t\t\t$(this).addClass(\"active\");\r\n");
      out.write("\t\t\t//当前项目颜色变成白色\r\n");
      out.write("\t\t\t$(this).children(\"a\").css(\"color\",\"white\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//打开一个新窗口 ，以open的形式打开窗口，在右侧显示\r\n");
      out.write("\t\twindow.open(\"/crm/toView/main/index\",\"workareaFrame\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 我的资料 -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"myInformation\" role=\"dialog\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\" style=\"width: 30%;\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">×</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">我的资料</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<div style=\"position: relative; left: 40px;\">\r\n");
      out.write("\t\t\t\t\t\t姓名：<b>张三</b><br><br>\r\n");
      out.write("\t\t\t\t\t\t登录帐号：<b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b><br><br>\r\n");
      out.write("\t\t\t\t\t\t组织机构：<b>1005，市场部，二级部门</b><br><br>\r\n");
      out.write("\t\t\t\t\t\t邮箱：<b>zhangsan@bjpowernode.com</b><br><br>\r\n");
      out.write("\t\t\t\t\t\t失效时间：<b>2017-02-14 10:10:10</b><br><br>\r\n");
      out.write("\t\t\t\t\t\t允许访问IP：<b>127.0.0.1,192.168.100.2</b>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">关闭</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 修改密码的模态窗口 -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"editPwdModal\" role=\"dialog\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\" style=\"width: 70%;\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">×</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">修改密码</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<form class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"oldPwd\" class=\"col-sm-2 control-label\">原密码</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\" style=\"width: 300px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"oldPwd\" style=\"width: 200%;\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"newPwd\" class=\"col-sm-2 control-label\">新密码</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\" style=\"width: 300px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"newPwd\" style=\"width: 200%;\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<label for=\"confirmPwd\" class=\"col-sm-2 control-label\">确认密码</label>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-sm-10\" style=\"width: 300px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"confirmPwd\" style=\"width: 200%;\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\" onclick=\"window.location.href='../login.html';\">更新</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 退出系统的模态窗口 -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"exitModal\" role=\"dialog\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\" style=\"width: 30%;\">\r\n");
      out.write("\t\t\t<div class=\"modal-content\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">×</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">离开</h4>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<p>您确定要退出系统吗？</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">取消</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\" data-dismiss=\"modal\" onclick=\"window.location.href='/crm/settings/user/loginOut';\">确定</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 顶部 -->\r\n");
      out.write("\t<div id=\"top\" style=\"height: 50px; background-color: #3C3C3C; width: 100%;\">\r\n");
      out.write("\t\t<div style=\"position: absolute; top: 5px; left: 0px; font-size: 30px; font-weight: 400; color: white; font-family: 'times new roman'\">CRM &nbsp;<span style=\"font-size: 12px;\">&copy;客户关系&nbsp;管理系统</span></div>\r\n");
      out.write("\t\t<div style=\"position: absolute; top: 15px; right: 15px;\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li class=\"dropdown user-dropdown\">\r\n");
      out.write("\t\t\t\t\t<a href=\"javascript:void(0)\" style=\"text-decoration: none; color: white;\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"glyphicon glyphicon-user\"></span> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" <span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"../settings/index.html\"><span class=\"glyphicon glyphicon-wrench\"></span> 系统设置</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"javascript:void(0)\" data-toggle=\"modal\" data-target=\"#myInformation\"><span class=\"glyphicon glyphicon-file\"></span> 我的资料</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"javascript:void(0)\" data-toggle=\"modal\" data-target=\"#editPwdModal\"><span class=\"glyphicon glyphicon-edit\"></span> 修改密码</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"javascript:void(0);\" data-toggle=\"modal\" data-target=\"#exitModal\"><span class=\"glyphicon glyphicon-off\"></span> 退出</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 中间 -->\r\n");
      out.write("\t<div id=\"center\" style=\"position: absolute;top: 50px; bottom: 30px; left: 0px; right: 0px;\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- 导航 -->\r\n");
      out.write("\t\t<div id=\"navigation\" style=\"left: 0px; width: 18%; position: relative; height: 100%; overflow:auto;\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<ul id=\"no1\" class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"main/index.html\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-home\"></span> 工作台</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"javascript:void(0);\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-tag\"></span> 动态</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"javascript:void(0);\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-time\"></span> 审批</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"javascript:void(0);\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-user\"></span> 客户公海</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"/crm/toView/activity/index\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-play-circle\"></span> 市场活动</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"clue/index.html\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-search\"></span> 线索（潜在客户）</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"customer/index.html\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-user\"></span> 客户</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"contacts/index.html\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-earphone\"></span> 联系人</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"transaction/index.html\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-usd\"></span> 交易（商机）</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"visit/index.html\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-phone-alt\"></span> 售后回访</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#no2\" class=\"collapsed\" data-toggle=\"collapse\"><span class=\"glyphicon glyphicon-stats\"></span> 统计图表</a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"no2\" class=\"nav nav-pills nav-stacked collapse\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"liClass\"><a href=\"chart/activity/index.html\" target=\"workareaFrame\">&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-chevron-right\"></span> 市场活动统计图表</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"liClass\"><a href=\"chart/clue/index.html\" target=\"workareaFrame\">&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-chevron-right\"></span> 线索统计图表</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"liClass\"><a href=\"chart/customerAndContacts/index.html\" target=\"workareaFrame\">&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-chevron-right\"></span> 客户和联系人统计图表</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"liClass\"><a href=\"chart/transaction/index.html\" target=\"workareaFrame\">&nbsp;&nbsp;&nbsp;<span class=\"glyphicon glyphicon-chevron-right\"></span> 交易统计图表</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"javascript:void(0);\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-file\"></span> 报表</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"javascript:void(0);\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-shopping-cart\"></span> 销售订单</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"javascript:void(0);\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-send\"></span> 发货单</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"javascript:void(0);\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-earphone\"></span> 跟进</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"javascript:void(0);\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-leaf\"></span> 产品</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"liClass\"><a href=\"javascript:void(0);\" target=\"workareaFrame\"><span class=\"glyphicon glyphicon-usd\"></span> 报价</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- 分割线 -->\r\n");
      out.write("\t\t\t<div id=\"divider1\" style=\"position: absolute; top : 0px; right: 0px; width: 1px; height: 100% ; background-color: #B3B3B3;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 工作区 -->\r\n");
      out.write("\t\t<div id=\"workarea\" style=\"position: absolute; top : 0px; left: 18%; width: 82%; height: 100%;\">\r\n");
      out.write("\t\t\t<iframe style=\"border-width: 0px; width: 100%; height: 100%;\" name=\"workareaFrame\"></iframe>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"divider2\" style=\"height: 1px; width: 100%; position: absolute;bottom: 30px; background-color: #B3B3B3;\"></div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 底部 -->\r\n");
      out.write("\t<div id=\"down\" style=\"height: 30px; width: 100%; position: absolute;bottom: 0px;\"></div>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-11-28 11:45:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.workbench.transaction;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".mystage{\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".closingDate{\r\n");
      out.write("\tfont-size : 15px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tvertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\" src=\"/crm/jquery/jquery-1.11.1-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/crm/jquery/bootstrap_3.3.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t//默认情况下取消和保存按钮是隐藏的\r\n");
      out.write("\tvar cancelAndSaveBtnDefault = true;\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#remark\").focus(function(){\r\n");
      out.write("\t\t\tif(cancelAndSaveBtnDefault){\r\n");
      out.write("\t\t\t\t//设置remarkDiv的高度为130px\r\n");
      out.write("\t\t\t\t$(\"#remarkDiv\").css(\"height\",\"130px\");\r\n");
      out.write("\t\t\t\t//显示\r\n");
      out.write("\t\t\t\t$(\"#cancelAndSaveBtn\").show(\"2000\");\r\n");
      out.write("\t\t\t\tcancelAndSaveBtnDefault = false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#cancelBtn\").click(function(){\r\n");
      out.write("\t\t\t//显示\r\n");
      out.write("\t\t\t$(\"#cancelAndSaveBtn\").hide();\r\n");
      out.write("\t\t\t//设置remarkDiv的高度为130px\r\n");
      out.write("\t\t\t$(\"#remarkDiv\").css(\"height\",\"90px\");\r\n");
      out.write("\t\t\tcancelAndSaveBtnDefault = true;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\".remarkDiv\").mouseover(function(){\r\n");
      out.write("\t\t\t$(this).children(\"div\").children(\"div\").show();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\".remarkDiv\").mouseout(function(){\r\n");
      out.write("\t\t\t$(this).children(\"div\").children(\"div\").hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\".myHref\").mouseover(function(){\r\n");
      out.write("\t\t\t$(this).children(\"span\").css(\"color\",\"red\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\".myHref\").mouseout(function(){\r\n");
      out.write("\t\t\t$(this).children(\"span\").css(\"color\",\"#E6E6E6\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//阶段提示框\r\n");
      out.write("\t\t$(\".mystage\").popover({\r\n");
      out.write("            trigger:'manual',\r\n");
      out.write("            placement : 'bottom',\r\n");
      out.write("            html: 'true',\r\n");
      out.write("            animation: false\r\n");
      out.write("        }).on(\"mouseenter\", function () {\r\n");
      out.write("                    var _this = this;\r\n");
      out.write("                    $(this).popover(\"show\");\r\n");
      out.write("                    $(this).siblings(\".popover\").on(\"mouseleave\", function () {\r\n");
      out.write("                        $(_this).popover('hide');\r\n");
      out.write("                    });\r\n");
      out.write("                }).on(\"mouseleave\", function () {\r\n");
      out.write("                    var _this = this;\r\n");
      out.write("                    setTimeout(function () {\r\n");
      out.write("                        if (!$(\".popover:hover\").length) {\r\n");
      out.write("                            $(_this).popover(\"hide\")\r\n");
      out.write("                        }\r\n");
      out.write("                    }, 100);\r\n");
      out.write("                });\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 返回按钮 -->\r\n");
      out.write("\t<div style=\"position: relative; top: 35px; left: 10px;\">\r\n");
      out.write("\t\t<a href=\"javascript:void(0);\" onclick=\"window.history.back();\"><span class=\"glyphicon glyphicon-arrow-left\" style=\"font-size: 20px; color: #DDDDDD\"></span></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 大标题 -->\r\n");
      out.write("\t<div style=\"position: relative; left: 40px; top: -30px;\">\r\n");
      out.write("\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" <small>￥");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.money}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</small></h3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"position: relative; height: 50px; width: 250px;  top: -72px; left: 700px;\">\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-default\" onclick=\"window.location.href='edit.html';\"><span class=\"glyphicon glyphicon-edit\"></span> 编辑</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-minus\"></span> 删除</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 阶段状态 -->\r\n");
      out.write("\t<div style=\"position: relative; left: 40px; top: -50px;\">\r\n");
      out.write("\t\t阶段&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-ok-circle mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"资质审查\" style=\"color: #90F790;\"></span>\r\n");
      out.write("\t\t-----------\r\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-ok-circle mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"需求分析\" style=\"color: #90F790;\"></span>\r\n");
      out.write("\t\t-----------\r\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-ok-circle mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"价值建议\" style=\"color: #90F790;\"></span>\r\n");
      out.write("\t\t-----------\r\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-ok-circle mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"确定决策者\" style=\"color: #90F790;\"></span>\r\n");
      out.write("\t\t-----------\r\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-map-marker mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"提案/报价\" style=\"color: #90F790;\"></span>\r\n");
      out.write("\t\t-----------\r\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-record mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"谈判/复审\"></span>\r\n");
      out.write("\t\t-----------\r\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-record mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"成交\"></span>\r\n");
      out.write("\t\t-----------\r\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-remove mystage\" style=\"color: red\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"丢失的线索\"></span>\r\n");
      out.write("\t\t-----------\r\n");
      out.write("\t\t<span class=\"glyphicon glyphicon-remove mystage\" data-toggle=\"popover\" data-placement=\"bottom\" data-content=\"因竞争丢失关闭\"></span>\r\n");
      out.write("\t\t-----------\r\n");
      out.write("\t\t<span class=\"closingDate\">2010-10-10</span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 详细信息 -->\r\n");
      out.write("\t<div style=\"position: relative; top: 0px;\">\r\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px;\">\r\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">所有者</div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.owner}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 450px; top: -40px; color: gray;\">金额</div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 650px; top: -60px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.money}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;\"></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 10px;\">\r\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">名称</div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 450px; top: -40px; color: gray;\">预计成交日期</div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 650px; top: -60px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.expectedDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;\"></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 20px;\">\r\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">客户名称</div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.customerId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 450px; top: -40px; color: gray;\">阶段</div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 650px; top: -60px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.stage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;\"></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 30px;\">\r\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">类型</div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 450px; top: -40px; color: gray;\">可能性</div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 650px; top: -60px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.possibility.get(0)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;\"></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 40px;\">\r\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">来源</div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.source}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 450px; top: -40px; color: gray;\">市场活动源</div>\r\n");
      out.write("\t\t\t<div style=\"width: 300px;position: relative; left: 650px; top: -60px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.activityId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px;\"></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -60px; left: 450px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 50px;\">\r\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">联系人名称</div>\r\n");
      out.write("\t\t\t<div style=\"width: 500px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.contactsId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 550px; background: #D5D5D5; position: relative; top: -20px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 60px;\">\r\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">创建者</div>\r\n");
      out.write("\t\t\t<div style=\"width: 500px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.createBy}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&nbsp;&nbsp;</b><small style=\"font-size: 10px; color: gray;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.createTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</small></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 550px; background: #D5D5D5; position: relative; top: -20px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 70px;\">\r\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">修改者</div>\r\n");
      out.write("\t\t\t<div style=\"width: 500px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.editBy}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&nbsp;&nbsp;</b><small style=\"font-size: 10px; color: gray;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.editTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</small></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 550px; background: #D5D5D5; position: relative; top: -20px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 80px;\">\r\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">描述</div>\r\n");
      out.write("\t\t\t<div style=\"width: 630px;position: relative; left: 200px; top: -20px;\">\r\n");
      out.write("\t\t\t\t<b>\r\n");
      out.write("\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t</b>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 850px; background: #D5D5D5; position: relative; top: -20px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 90px;\">\r\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">联系纪要</div>\r\n");
      out.write("\t\t\t<div style=\"width: 630px;position: relative; left: 200px; top: -20px;\">\r\n");
      out.write("\t\t\t\t<b>\r\n");
      out.write("\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.contactSummary}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t</b>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 850px; background: #D5D5D5; position: relative; top: -20px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div style=\"position: relative; left: 40px; height: 30px; top: 100px;\">\r\n");
      out.write("\t\t\t<div style=\"width: 300px; color: gray;\">下次联系时间</div>\r\n");
      out.write("\t\t\t<div style=\"width: 500px;position: relative; left: 200px; top: -20px;\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.nextContactTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</b></div>\r\n");
      out.write("\t\t\t<div style=\"height: 1px; width: 400px; background: #D5D5D5; position: relative; top: -20px;\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 备注 -->\r\n");
      out.write("\t<div style=\"position: relative; top: 100px; left: 40px;\">\r\n");
      out.write("\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t<h4>备注</h4>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 备注 -->\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<div id=\"remarkDiv\" style=\"background-color: #E6E6E6; width: 870px; height: 90px;\">\r\n");
      out.write("\t\t\t<form role=\"form\" style=\"position: relative;top: 10px; left: 10px;\">\r\n");
      out.write("\t\t\t\t<textarea id=\"remark\" class=\"form-control\" style=\"width: 850px; resize : none;\" rows=\"2\"  placeholder=\"添加备注...\"></textarea>\r\n");
      out.write("\t\t\t\t<p id=\"cancelAndSaveBtn\" style=\"position: relative;left: 737px; top: 10px; display: none;\">\r\n");
      out.write("\t\t\t\t\t<button id=\"cancelBtn\" type=\"button\" class=\"btn btn-default\">取消</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary\">保存</button>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 阶段历史 -->\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div style=\"position: relative; top: 100px; left: 40px;\">\r\n");
      out.write("\t\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t\t<h4>阶段历史</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"position: relative;top: 0px;\">\r\n");
      out.write("\t\t\t\t<table id=\"activityTable\" class=\"table table-hover\" style=\"width: 900px;\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr style=\"color: #B3B3B3;\">\r\n");
      out.write("\t\t\t\t\t\t\t<td>阶段</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>金额</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>可能性</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>预计成交日期</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>创建时间</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>创建人</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div style=\"height: 200px;\"></div>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/workbench/transaction/detail.jsp(224,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/workbench/transaction/detail.jsp(224,2) '${transaction.transactionRemarks}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${transaction.transactionRemarks}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/workbench/transaction/detail.jsp(224,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("transactionRemark");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<div class=\"remarkDiv\" style=\"height: 60px;\">\r\n");
          out.write("\t\t\t\t<img title=\"zhangsan\" src=\"/crm/image/user-thumbnail.png\" style=\"width: 30px; height:30px;\">\r\n");
          out.write("\t\t\t\t<div style=\"position: relative; top: -40px; left: 40px;\" >\r\n");
          out.write("\t\t\t\t\t<h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transactionRemark.noteContent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</h5>\r\n");
          out.write("\t\t\t\t\t<font color=\"gray\">交易</font> <font color=\"gray\">-</font> <b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</b> <small style=\"color: gray;\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.expectedDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.createBy}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</small>\r\n");
          out.write("\t\t\t\t\t<div style=\"position: relative; left: 500px; top: -30px; height: 30px; width: 100px; display: none;\">\r\n");
          out.write("\t\t\t\t\t\t<a class=\"myHref\" href=\"javascript:void(0);\"><span class=\"glyphicon glyphicon-edit\" style=\"font-size: 20px; color: #E6E6E6;\"></span></a>\r\n");
          out.write("\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t\t\t\t<a class=\"myHref\" href=\"javascript:void(0);\"><span class=\"glyphicon glyphicon-remove\" style=\"font-size: 20px; color: #E6E6E6;\"></span></a>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/workbench/transaction/detail.jsp(268,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/workbench/transaction/detail.jsp(268,6) '${transaction.transactionHistories}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${transaction.transactionHistories}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/workbench/transaction/detail.jsp(268,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("transactionHistory");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transactionHistory.stage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transactionHistory.money}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transaction.possibility.get(0)}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transactionHistory.expectedDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transactionHistory.createTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${transactionHistory.createBy}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2017-04-27 02:23:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1493259754000L));
    _jspx_dependants.put("/import.jsp", Long.valueOf(1493259754000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1493259754000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/ico\" href=\"favicon.ico\" /> \n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery.min.js\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/Chart.js\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/Chart.min.js\" ></script>\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/src/Chart.Line.js\" ></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link  rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/all.css\" >\n");
      out.write("\n");
      out.write(" ");
      out.write(" \n");
      out.write("<title>Nhập từ vựng</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head> \n");
      out.write("<style>\n");
      out.write("ul {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    border: 1px solid #e7e7e7;\n");
      out.write("    background-color: #f3f3f3;\n");
      out.write("    list-style: none;\n");
      out.write("    margin-top: 10px;\n");
      out.write("}\n");
      out.write(" \n");
      out.write("li {\n");
      out.write(" \tfloat: left; \n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("    display: block;\n");
      out.write("    color: #666;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 5px 10px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active) {\n");
      out.write("    background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a.active {\n");
      out.write("    color: white;\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<ul>\n");
      out.write("  <li><a id=\"home\"  href=\"");
      out.print(request.getContextPath());
      out.write("\">Home</a></li> \n");
      out.write("  <li><a id=\"anhviet\" href=\"");
      out.print(request.getContextPath());
      out.write("/anhviet\">Anh-Việt</a></li>\n");
      out.write("  <li><a id=\"vietanh\" href=\"");
      out.print(request.getContextPath());
      out.write("/vietanh\">Việt-Anh</a></li>\n");
      out.write("  <li><a id=\"chitiet\" href=\"");
      out.print(request.getContextPath());
      out.write("/chitiet\">Chi tiết</a></li>\n");
      out.write("  <li><a id=\"toeic600\" href=\"");
      out.print(request.getContextPath());
      out.write("/toeic600\">Toeic 600</a></li>\n");
      out.write("  <li><a id=\"macdinh\" href=\"");
      out.print(request.getContextPath());
      out.write("/macdinh\">Cài đặt mặc định</a></li>\n");
      out.write("  <li><a id=\"homnay\" href=\"");
      out.print(request.getContextPath());
      out.write("/homnay\">Hôm nay</a></li>\n");
      out.write("  <li><a id=\"homqua\" href=\"");
      out.print(request.getContextPath());
      out.write("/homqua\">Hôm qua</a></li>\n");
      out.write("  <li><a id=\"homkia\" href=\"");
      out.print(request.getContextPath());
      out.write("/homkia\">Hôm kia</a></li> \n");
      out.write("  <li><a id=\"fibonaci\" href=\"");
      out.print(request.getContextPath());
      out.write("/fibonaci\">Fibonaci</a></li>\n");
      out.write("  <li><a id=\"ontap\" href=\"");
      out.print(request.getContextPath());
      out.write("/ontap\">Ôn tập</a></li>\n");
      out.write("  \n");
      out.write("  <li><a id=\"theodoi\" href=\"");
      out.print(request.getContextPath());
      out.write("/theodoi\">Theo dõi</a></li>\n");
      out.write("</ul>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write(" \n");
      out.write("\t<hr>\n");
      out.write("\thello review\n");
      out.write("\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/nhaptuvung\" >list vocal</a>\n");
      out.write("\tSố từ vựng: ");
      out.print(request.getSession().getAttribute("sotuvung") );
      out.write("\n");
      out.write("\t<div id=\"divtest\" ></div>\n");
      out.write("\t<button id=\"btntest\" >Test ajax</button>\n");
      out.write("\t\n");
      out.write("\t<!-- FORM NHAP TU VUNG -->\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/nhaptuvung\" method=\"post\" enctype=\"multipart/form-data\" acceptcharset=\"UTF-8\" >\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Từ vựng:</td>\n");
      out.write("\t\t\t\t<td><input id=\"tuvung\" name=\"tuvung\" type=\"text\" size=\"50\" autofocus ></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Nghĩa:</td>\n");
      out.write("\t\t\t\t<td><input id=\"nghia\" name=\"nghia\" type=\"text\" size=\"50\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Ví dụ 1:</td>\n");
      out.write("\t\t\t\t<td><input id=\"vidu1\" name=\"vidu1\" type=\"text\" size=\"50\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Ví dụ 2:</td>\n");
      out.write("\t\t\t\t<td><input id=\"vidu2\" name=\"vidu2\" type=\"text\" size=\"50\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Từ loại:</td>\n");
      out.write("\t\t\t\t<td><input id=\"tuloai\" name=\"tuloai\" type=\"text\" size=\"50\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.tuloai}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"  ></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Nơi học:</td>\n");
      out.write("\t\t\t\t<td><input id=\"noihoc\" name=\"noihoc\" type=\"text\" size=\"50\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.noihoc}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" ></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Từ đồng nghĩa:</td>\n");
      out.write("\t\t\t\t<td><input id=\"tudongnghia\" name=\"tudongnghia\" type=\"text\" size=\"50\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Từ trái nghĩa:</td>\n");
      out.write("\t\t\t\t<td><input id=\"tutrainghia\" name=\"tutrainghia\" type=\"text\" size=\"50\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Ngày nhập:</td>\n");
      out.write("\t\t\t\t<td><input id=\"ngaynhap\" name=\"ngaynhap\" type=\"text\" size=\"50\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Ghi chú:</td>\n");
      out.write("\t\t\t\t<td><input id=\"ghichu\" name=\"ghichu\" type=\"text\" size=\"50\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.ghichu}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"  ></td>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Hình ảnh:</td>\n");
      out.write("\t\t\t\t<td><input type=\"file\" name=\"uploadFile\" ></td>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<td><input type=\"submit\" value=\"Nhập\" ></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table> \n");
      out.write("\t\t\n");
      out.write("\t</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<hr>\n");
      out.write("\t ");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\tfoooter\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("\t <script type=\"text/javascript\">\n");
      out.write("$( document ).ready(function(){\n");
      out.write("\t \n");
      out.write("// \t\talert(\"asdf\");\n");
      out.write("\t\t$.ajax({\n");
      out.write("\t\t    url: '");
      out.print(request.getContextPath());
      out.write("/listvocal',\n");
      out.write("\t\t    data: \"kjh\",\n");
      out.write("\t\t    type: 'post',\n");
      out.write("\t\t    dataType:'text',\n");
      out.write("\t\t    success: function(data){ \n");
      out.write("\t\t        console.log(data);\n");
      out.write("// \t\t        alert(data);\n");
      out.write("\t\t    }\n");
      out.write("\t\t});\n");
      out.write("\t \n");
      out.write("\t\n");
      out.write("\t$(\"#home\").addClass(\"active\");\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

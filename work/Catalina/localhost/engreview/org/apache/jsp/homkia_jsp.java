/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2017-05-04 09:09:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.object.TuVung;

public final class homkia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1493259754000L));
    _jspx_dependants.put("jar:file:/root/tomcat/tomcat-8.5.11/webapps/engreview/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425978670000L));
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1493259754000L));
    _jspx_dependants.put("/import.jsp", Long.valueOf(1493259754000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1493857769000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.object.TuVung");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
      out.write("<title>Hôm kia</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("table#tuvung {\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\tcolor: blue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a.linktuvung {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor: #3b5998;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a.linktuvung:HOVER {\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".xoa{\n");
      out.write("\tvisibility:hidden\n");
      out.write("}\n");
      out.write(".nghia{\n");
      out.write("\tvisibility:hidden\n");
      out.write("}\n");
      out.write("\n");
      out.write(".display{\n");
      out.write("\tvisibility:visible;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#hienthixoa{\n");
      out.write("\twidth: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#hienthinghia{\n");
      out.write("\twidth: 105px;\n");
      out.write("}\n");
      out.write("</style>\n");
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
      out.write("/macdinh\">Cài đặt</a></li>\n");
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
      out.write("  <li><a id=\"filter\" href=\"");
      out.print(request.getContextPath());
      out.write("/chaofilter\">Chao Filter</a></li>\n");
      out.write("  \n");
      out.write("  <li><a id=\"theodoi\" href=\"");
      out.print(request.getContextPath());
      out.write("/theodoi\">Theo dõi</a></li>\n");
      out.write("</ul>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write(" \n");
      out.write("\t<hr>\n");
      out.write("\t\t");
List<TuVung> listTuVung = (List<TuVung>)request.getAttribute("listTuVung");
		
      out.write("\n");
      out.write("\t\tSố từ vựng hôm kia học: ");
      out.print(listTuVung.size() );
      out.write(" <br>\n");
      out.write("\t");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t<button id=\"hienthixoa\" >Hiển thị xóa</button>\n");
      out.write("\t<button id=\"hienthinghia\" >Hiển thị nghĩa</button>\n");
      out.write("\t<table id=\"tuvung\" style=\"width: 100%\" >\n");
      out.write("\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /homkia.jsp(58,1) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/homkia.jsp(58,1) '${listTuVung}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${listTuVung}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
        // /homkia.jsp(58,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("tuvung");
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("\t\t<tr>\n");
              out.write("\t\t\t<td><a class=\"linktuvung\" href=\"");
              out.print(request.getContextPath());
              out.write("/chitiet?id=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tuvung.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write('"');
              out.write(' ');
              out.write('>');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write('.');
              out.write(' ');
              out.write(' ');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tuvung.tuvung }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</a></td>\n");
              out.write("\t\t\t<td class=\"xoa\" style=\"padding-left: 30px\" ><a href=\"#\" onclick=\"xoa(");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tuvung.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write(")\"  >Xóa</a></td>\n");
              out.write("\t\t\t<td class=\"nghia\" style=\"text-align: right;\" >");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tuvung.nghia }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write(' ');
              out.write('.');
              out.write(' ');
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("</td>\n");
              out.write("\t\t</tr>\n");
              out.write("\t\t");
              if (_jspx_meth_c_005fset_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                return;
              out.write('\n');
              out.write('	');
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
        _jspx_th_c_005fforEach_005f0_reused = true;
      } finally {
        if (!_jspx_th_c_005fforEach_005f0_reused) {
          _jspx_th_c_005fforEach_005f0.release();
          _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fforEach_005f0);
        }
      }
      out.write("\n");
      out.write("\t</table>\n");
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
      out.write('\n');
      out.write('\n');
 request.removeAttribute("listTuVung") ;
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t$(\"#homkia\").addClass(\"active\");\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t$(\"#hienthinghia\").click(function() {\n");
      out.write("\t\t\t\t$(\".nghia\").toggleClass(\"display\");\n");
      out.write("\t\t\t\t$('#hienthinghia').html()===\"Hiển thị nghĩa\"?$('#hienthinghia').html(\"Tắt nghĩa\"):$('#hienthinghia').html(\"Hiển thị nghĩa\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$(\"#hienthixoa\").click(function() {\n");
      out.write("\t\t\t\t$(\".xoa\").toggleClass(\"display\");\n");
      out.write("\t\t\t\t$('#hienthixoa').html()===\"Hiển thị xóa\"?$('#hienthixoa').html(\"Tắt xóa\"):$('#hienthixoa').html(\"Hiển thị xóa\");\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\tfunction xoa(id) {\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t    url: '");
      out.print(request.getContextPath());
      out.write("/anhviet',\n");
      out.write("\t\t\t    data: \"ma=xoa&&id=\"+ id,\n");
      out.write("\t\t\t    type: 'post',\n");
      out.write("\t\t\t    dataType:'text',\n");
      out.write("\t\t\t    success: function(data){ \n");
      out.write("\t\t\t    \twindow.location.href = \"/engreview/anhviet\"; \n");
      out.write("\t\t\t    }\n");
      out.write("\t\t\t});\t\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /homkia.jsp(54,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("i");
      // /homkia.jsp(54,1) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/homkia.jsp(54,1) '1'",_jsp_getExpressionFactory().createValueExpression("1",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /homkia.jsp(54,1) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setScope("page");
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      if (!_jspx_th_c_005fset_005f0_reused) {
        _jspx_th_c_005fset_005f0.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fset_005f0);
      }
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f1_reused = false;
    try {
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /homkia.jsp(64,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("i");
      // /homkia.jsp(64,2) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/homkia.jsp(64,2) '${i + 1}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${i + 1}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /homkia.jsp(64,2) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setScope("page");
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fscope_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      _jspx_th_c_005fset_005f1_reused = true;
    } finally {
      if (!_jspx_th_c_005fset_005f1_reused) {
        _jspx_th_c_005fset_005f1.release();
        _jsp_getInstanceManager().destroyInstance(_jspx_th_c_005fset_005f1);
      }
    }
    return false;
  }
}

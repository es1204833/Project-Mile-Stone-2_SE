package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class textbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_remove_var_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_remove_var_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_remove_var_scope_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TextBooks</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("        <h3>TextBooks</h3>\r\n");
      out.write("\r\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <table id=\"textbookListTable\">\r\n");
      out.write("            <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>Isbn</th>\r\n");
      out.write("                    <th>Title</th>\r\n");
      out.write("                    <th>Author</th>\r\n");
      out.write("                    <th>Year</th>\r\n");
      out.write("                    <th>Publisher</th>\r\n");
      out.write("                    <th>Price</th>\r\n");
      out.write("                    <th>Image</th>\r\n");
      out.write("                    <th>Status</th>\r\n");
      out.write("                    <th>No Of required copies</th>\r\n");
      out.write("                    <th>Date</th>\r\n");
      out.write("                    <th colspan=\"2\"></th>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>978</td>\r\n");
      out.write("                    <td>C++ Without Fear</td>\r\n");
      out.write("                    <td>Brian Overlan</td>\r\n");
      out.write("                    <td>2004</td>\r\n");
      out.write("                    <td>Dean & Deka ,United States</td>\r\n");
      out.write("                    <td>8</td>\r\n");
      out.write("                    <td>false</td>\r\n");
      out.write("                    <td>Avilable</td>\r\n");
      out.write("                    <td>80</td>\r\n");
      out.write("                    <td>12/5/2006</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>631</td>\r\n");
      out.write("                    <td>Practical C++ Programming</td>\r\n");
      out.write("                    <td>Steve Oualline</td>\r\n");
      out.write("                    <td>2002</td>\r\n");
      out.write("                    <td>Liz Co,Norway</td>\r\n");
      out.write("                    <td>32</td>\r\n");
      out.write("                    <td>true</td>\r\n");
      out.write("                    <td>Not Avilable</td>\r\n");
      out.write("                    <td>9</td>\r\n");
      out.write("                    <td>12/5/2009</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>678</td>\r\n");
      out.write("                    <td>The C++ Programming Language</td>\r\n");
      out.write("                    <td>Bjarne Stroustrup</td>\r\n");
      out.write("                    <td>1997</td>\r\n");
      out.write("                    <td>Hrij,Norway</td>\r\n");
      out.write("                    <td>54</td>\r\n");
      out.write("                    <td>false</td>\r\n");
      out.write("                    <td>Ordered</td>\r\n");
      out.write("                    <td>2</td>\r\n");
      out.write("                    <td>12/5/2008</td>\r\n");
      out.write("                </tr>     \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>234</td>\r\n");
      out.write("                    <td>C++ For Dummies</td>\r\n");
      out.write("                    <td>Stephen R. Davis</td>\r\n");
      out.write("                    <td>2000</td>\r\n");
      out.write("                    <td>VanK,Lebanon</td>\r\n");
      out.write("                    <td>2</td>\r\n");
      out.write("                    <td>true</td>\r\n");
      out.write("                    <td>Avilable</td>\r\n");
      out.write("                    <td>3</td>\r\n");
      out.write("                    <td>12/5/2008</td>\r\n");
      out.write("                </tr>  \r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>897</td>\r\n");
      out.write("                    <td>Enterprise Applications</td>\r\n");
      out.write("                    <td>Helen King</td>\r\n");
      out.write("                    <td>2009</td>\r\n");
      out.write("                    <td>Linda la&c</td>\r\n");
      out.write("                    <td> 86</td>\r\n");
      out.write("                    <td>true</td>\r\n");
      out.write("                    <td>Avilable</td>\r\n");
      out.write("                    <td>8</td>\r\n");
      out.write("                    <td>27/5/2015</td>\r\n");
      out.write("                </tr>  \r\n");
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty message}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <p class='message'>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("            ");
        if (_jspx_meth_c_remove_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_remove_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_remove_0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _jspx_tagPool_c_remove_var_scope_nobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    _jspx_th_c_remove_0.setPageContext(_jspx_page_context);
    _jspx_th_c_remove_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_remove_0.setVar("message");
    _jspx_th_c_remove_0.setScope("session");
    int _jspx_eval_c_remove_0 = _jspx_th_c_remove_0.doStartTag();
    if (_jspx_th_c_remove_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
      return true;
    }
    _jspx_tagPool_c_remove_var_scope_nobody.reuse(_jspx_th_c_remove_0);
    return false;
  }
}

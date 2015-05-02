package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updatetextbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Update TextBook</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\" />\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("        <h3>Update TextBook</h3>\r\n");
      out.write("        <form action=\"updateTextBook\" method=\"post\">\r\n");
      out.write("            <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${textbook.isbn}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"hidden\" id = \"isbn\" name=\"isbn\" />\r\n");
      out.write("             <label>Title\r\n");
      out.write("                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${textbook.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" id = \"title\" name=\"title\" required/>\r\n");
      out.write("            </label> \r\n");
      out.write("            <label>Authors\r\n");
      out.write("                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${textbook.author}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"type=\"text\" id = \"author\" name=\"author\" />\r\n");
      out.write("            </label>\r\n");
      out.write("            <label>Year\r\n");
      out.write("                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${textbook.year}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"number\" id = \"year\" name=\"year\" required />\r\n");
      out.write("            </label>\r\n");
      out.write("            <label>Publisher\r\n");
      out.write("                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${textbook.publisher}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" id = \"publisher\" name=\"publisher\" required />\r\n");
      out.write("            </label>\r\n");
      out.write("            <label>Image\r\n");
      out.write("                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${textbook.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"number\" id = \"image\" name=\"image\" />\r\n");
      out.write("            </label>\r\n");
      out.write("            <label>Status\r\n");
      out.write("                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${textbook.status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text\" id = \"status\" name=\"status\" />\r\n");
      out.write("            </label>\r\n");
      out.write("            <label>Number of copies \r\n");
      out.write("                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${textbook.noOfCopies}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"number\" id = \"noOfCopies\" name=\"noOfCopies\" />\r\n");
      out.write("            </label>\r\n");
      out.write("             <label>Date\r\n");
      out.write("                <input value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${textbook.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"  type=\"Date\" id = \"date\" name=\"date\" />\r\n");
      out.write("            </label>\r\n");
      out.write("            \r\n");
      out.write("             <input type=\"submit\" id=\"submit\" value=\"Submit\" />\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
}

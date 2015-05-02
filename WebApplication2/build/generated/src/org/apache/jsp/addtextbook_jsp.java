package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addtextbook_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Add TextBook</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\" />\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <h3>Add TextBook</h3>\n");
      out.write("        <form action=\"addTextBook\" method=\"post\">\n");
      out.write("            <label> TextBook Isbn\n");
      out.write("                <input type=\"number\" id = \"isbn\" name=\"Isbn\" required />\n");
      out.write("            </label>\n");
      out.write("            <label>Title\n");
      out.write("                <input type=\"text\" id = \"title\" name=\"title\" required/>\n");
      out.write("            </label> \n");
      out.write("            <label>Authors\n");
      out.write("                <input type=\"text\" id = \"author\" name=\"author\" />\n");
      out.write("            </label>\n");
      out.write("            <label>Year\n");
      out.write("                <input type=\"number\" id = \"year\" name=\"year\" required />\n");
      out.write("            </label>\n");
      out.write("            <label>Publisher\n");
      out.write("                <input type=\"text\" id = \"publisher\" name=\"publisher\" required />\n");
      out.write("            </label>\n");
      out.write("            <label>Price\n");
      out.write("                <input type=\"number\" id = \"publisher\" name=\"publisher\" required />\n");
      out.write("            </label>\n");
      out.write("            <label>Image\n");
      out.write("                <input type=\"number\" id = \"image\" name=\"image\" />\n");
      out.write("            </label>\n");
      out.write("            <label>Status\n");
      out.write("                <input type=\"text\" id = \"status\" name=\"status\" />\n");
      out.write("            </label>\n");
      out.write("            <label>Number of copies \n");
      out.write("                <input type=\"number\" id = \"noOfCopies\" name=\"noOfCopies\" />\n");
      out.write("            </label>\n");
      out.write("             <label>Date\n");
      out.write("                <input type=\"Date\" id = \"date\" name=\"date\" />\n");
      out.write("            </label>\n");
      out.write("                       \n");
      out.write("            <input type=\"submit\" id=\"submit\" value=\"Submit\" />\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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

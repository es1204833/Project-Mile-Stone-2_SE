package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ModifyNumberOfCopies_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Modify Number Of Copies</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" />\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/styles.css\" />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("        <h3>Modify Number Of Copies</h3>\r\n");
      out.write("        <form action=\"ModifyNumberOfcopies\" method=\"post\">\r\n");
      out.write("             <label> Enter ISBN </label>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            <input type=\"text\" id = \"isbn\" name=\"Isbn\" required />\r\n");
      out.write("            \r\n");
      out.write("            <input type=\"submit\" id=\"submit\" value=\"Search\" />\r\n");
      out.write("            80\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <br>\r\n");
      out.write("           \r\n");
      out.write("          <div class=\"range-selector\">\r\n");
      out.write("                    <label for=\"maleCopies\">Male Copies: \r\n");
      out.write("                        <output id=\"selectedMaleCopies\" for=\"maleCopies\"></output>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <input type=\"range\" id=\"maleCopies\" name=\"maleCopies\"\r\n");
      out.write("                           min=\"1\" max=\"50\" \r\n");
      out.write("                           >\r\n");
      out.write("          </div>\r\n");
      out.write("            <div class=\"range-selector\">\r\n");
      out.write("                    <label for=\"femaleCopies\">Female Copies: \r\n");
      out.write("                        <output id=\"selectedFemaleCopies\" for=\"femaleCopies\"></output>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <input type=\"range\" id=\"femaleCopies\" name=\"femaleCopies\"\r\n");
      out.write("                           min=\"1\" max=\"50\" \r\n");
      out.write("                           >\r\n");
      out.write("            </div>\r\n");
      out.write("                 <div class=\"range-selector\">\r\n");
      out.write("\r\n");
      out.write("                    <label for=\"instructorCopies\">Instructor Copies: \r\n");
      out.write("                        <output id=\"selectedInstructorCopies\" for=\"instructorCopies\"></output>\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <input type=\"range\" id=\"instructorCopies\" name=\"instructorCopies\"\r\n");
      out.write("                           min=\"1\" max=\"50\" >\r\n");
      out.write("                           \r\n");
      out.write("                \r\n");
      out.write("          \r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <input type=\"submit\" id=\"request order\" value=\"Request Order\" />\r\n");
      out.write("                alert(\"Your request has been saved and being processed \");\r\n");
      out.write("                \r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <div>\r\n");
      out.write("                <input type=\"submit\" id=\"save\" value=\"Save\" />   \r\n");
      out.write("                <input type=\"submit\" id=\"cancel\" value=\"Cancel\" />\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

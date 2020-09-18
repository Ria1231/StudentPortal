package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class riya_005fcheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <script>\n");
      out.write("        var dbList = new Array(\"kite\", \"mills\", \"rose\");\n");
      out.write("\n");
      out.write("$(document).ready(function() {\n");
      out.write("$(\"#inputField\").keyup(function(e) {\n");
      out.write("\n");
      out.write("code = (e.keyCode ? e.keyCode : e.which);\n");
      out.write("\n");
      out.write("// this code is the ascii value of key pressed,\n");
      out.write("// you can use it to filter only alphanumeric keys\n");
      out.write("// like\n");
      out.write("/*\n");
      out.write("if (code == 13)\n");
      out.write("{\n");
      out.write("\n");
      out.write("}\n");
      out.write("*/\n");
      out.write("\n");
      out.write("var typedText = $(\"#inputField\").val();\n");
      out.write("\n");
      out.write("      for (var i = 0; i < dbList.length; i++) {\n");
      out.write("\n");
      out.write("            if (typedText == dbList[i]) {\n");
      out.write("                $(\"#inputField\").css('background-color', '#00FF00');\n");
      out.write("            }\n");
      out.write("      }\n");
      out.write("});\n");
      out.write("});\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <input type=\"text\" name=\"\" id=\"inputField\"/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

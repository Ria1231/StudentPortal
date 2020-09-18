package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class aform2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Enquiry Form</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"\" href=\"css/main.css\">\n");
      out.write("    </head>        \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.html", out, false);
      out.write("\n");
      out.write("    <body><style>\n");
      out.write("            td{\n");
      out.write("                font-size: 1.3vw;\n");
      out.write("                padding-left: 17vw;\n");
      out.write("                width: 30vw;\n");
      out.write("            }\n");
      out.write("            input[type=file]{\n");
      out.write("                font-size: 1.3vw;\n");
      out.write("                margin-left: -13vw;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        ");

                        out.print(request.getParameter("stu_name"));

            
      out.write("\n");
      out.write("    <div class=\"a\">REQUIRED DOCUMENTS</div>\n");
      out.write("    <div style=\"height:34.5vw;\" class=\"form_bg\"></div>\n");
      out.write("    <div class=\"form\"  style=\"font-size: 1.6vw;\">\n");
      out.write("    <form action=\"doc_upload.jsp\" method=\"post\">\n");
      out.write("        <center>\n");
      out.write("        <table><tr style=\"height: 2vw;\">\n");
      out.write("    </tr><tr>\n");
      out.write("    <td>Passport Size Photo</td>\n");
      out.write("    <td><input type=\"file\" name=\"photo\"  required></td>\n");
      out.write("    </tr><tr style=\"height: 0.5vw;\">\n");
      out.write("    </tr><tr>\n");
      out.write("    <td>10th Marksheet</td>\n");
      out.write("    <td><input type=\"file\" name=\"10_marksheet\" required></td>\n");
      out.write("    </tr><tr style=\"height: 0.5vw;\">\n");
      out.write("    </tr><tr>\n");
      out.write("    <td>12th Marksheet</td>\n");
      out.write("    <td><input type=\"file\" name=\"12_marksheet\" required></td>\n");
      out.write("    </tr><tr style=\"height: 0.5vw;\">\n");
      out.write("    </tr><tr>\n");
      out.write("    <td>School Leaving Certificate</td>\n");
      out.write("     <td><input type=\"file\" name=\"scl_leaving\" required></td>\n");
      out.write("    </tr><tr style=\"height: 0.5vw;\">\n");
      out.write("    </tr><tr>\n");
      out.write("    <td>Aadhar Card</td>\n");
      out.write("    <td><input type=\"file\" name=\"aadhar_card\" required></td>\n");
      out.write("    </tr><tr style=\"height: 0.5vw;\">\n");
      out.write("    </tr><tr>\n");
      out.write("    <td>Code Of Conduct</td>\n");
      out.write("    <td><input type=\"file\" name=\"coc\" required></td>\n");
      out.write("    </tr><tr style=\"height: 0.5vw;\">\n");
      out.write("     </tr><tr>\n");
      out.write("    <td>Affidavit</td>\n");
      out.write("    <td><input type=\"file\" name=\"affidavit\" required></td>\n");
      out.write("    </tr><tr style=\"height: 0.5vw;\">\n");
      out.write("    </tr><tr>\n");
      out.write("    <td>Document</td>\n");
      out.write("    <td><input type=\"file\" name=\"doc\" required></td>\n");
      out.write("    </tr><tr style=\"height: 3vw;\">\n");
      out.write("    </tr><tr>\n");
      out.write("        <td colspan=\"2\" align=\"center\" style=\"padding-left:0vw;\"><input type=\"submit\" value=\"Submit\" class=\"sub_btn\"/></td></tr>\n");
      out.write("    <input type=\"hidden\" name=\"id\" value=\"");
 
      out.write("\" />\n");
      out.write("        </table></center>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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

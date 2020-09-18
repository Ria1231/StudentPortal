package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class payment_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Payment Detail</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/bootstrap.min.js\">\n");
      out.write("    </head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.html", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <table border=\"1\" class=\"table table-hover\" style=\"text-align: center;width: 99%;background-color: white;border:gray;\n");
      out.write("    margin-left: 0.5vw;font-size: 1.1vw;\">\n");
      out.write("<tr style=\"background-color: rgba(154,169,172,1);\">\n");
      out.write("<td></td>\n");
      out.write("<th>Full Name</th>\n");
      out.write("<th>Course</th>\n");
      out.write("<th>Semester-1</th>\n");
      out.write("<th>Semester-2</th>\n");
      out.write("<th>Semester-3</th>\n");
      out.write("<th>Semester-4</th>\n");
      out.write("<th>Semester-5</th>\n");
      out.write("<th>Semester-6</th>\n");
      out.write("<th></th>\n");
      out.write("</tr>\n");
      out.write("\n");

    String stmt="";
    int counter=0;
    Class.forName("com.mysql.jdbc.Driver");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
    stmt="Select * from stu_addminssion";
    PreparedStatement ps=c.prepareStatement(stmt);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
        int id=rs.getInt(3);
    
      out.write("\n");
      out.write("    <tr id=\"t");
      out.print( counter );
      out.write("\">\n");
      out.write("<!--<td style=\"padding: 0.5vw;vertical-align: middle;\"><input type=\"checkbox\" name=\"foo\" value=\"");
      out.print( id );
      out.write("\"></td>-->\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(4) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(17) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(9) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(18) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(31) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(32) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(33) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(34) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(44) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\"><form method=\"post\" style=\"margin-block-end: 0vw;\">\n");
      out.write("<input type=\"hidden\" name=\"id1\" value=\"");
      out.print( id );
      out.write("\"/>\n");
      out.write("<input type=\"hidden\" name=\"edit\" value=\"aedit\"/>\n");
      out.write("</form>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
 counter++;
    } 
      out.write("\n");
      out.write("    <div style=\"position: absolute;top: 6vw;margin-left:47%;font-size: 1.4vw;\">Data : ");
      out.print( counter );
      out.write("</div>\n");
      out.write("    </table>\n");
      out.write("    </form>\n");
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

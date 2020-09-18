package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;

public final class fees_005fdetail_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Fees Data</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/bootstrap.min.js\">\n");
      out.write("    </head>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("    <style>\n");
      out.write("        .addFees{\n");
      out.write("            font-size: 1vw;\n");
      out.write("            margin: 0.3vw;\n");
      out.write("            background-color: whitesmoke;\n");
      out.write("            width: 8vw;\n");
      out.write("            margin-right: -5.6vw;\n");
      out.write("            cursor: pointer\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.html", out, false);
      out.write("\n");
      out.write("        <table border=\"1\" class=\"table table-hover\" style=\"text-align: center;width: 99%;background-color: white;border:gray;\n");
      out.write("    margin-left: 0.5vw;font-size: 1.1vw;\">\n");
      out.write("<tr style=\"background-color: rgba(154,169,172,1);\">\n");
      out.write("    <th></th>\n");
      out.write("    <th style=\"width: 2vw\">Enrollment Number</th>\n");
      out.write("<th>Full Name</th>\n");
      out.write("<th style=\"width: 2vw\">Current Semester</th>\n");
      out.write("<th>Course</th>\n");
      out.write("<th>Fees</th>\n");
      out.write("\n");
      out.write("<th></th>\n");
      out.write("</tr>\n");
  

String s_by="",sname="",stmt="";
    long millis=System.currentTimeMillis();
    Date d=new Date(millis);
    int counter=0;
    Class.forName("com.mysql.jdbc.Driver");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
    s_by=request.getParameter("s_by");
    sname=request.getParameter("sname");
    stmt="Select * from stu_admission";
    PreparedStatement ps=c.prepareStatement(stmt);
    ResultSet rs=ps.executeQuery();
    int id=0;
    while(rs.next()){
        id=rs.getInt(3);

      out.write(" \n");
      out.write("<tr id=\"t");
      out.print( counter);
      out.write("\" id1=\"");
      out.print( rs.getString(2) );
      out.write("\" id2=\"");
      out.print( rs.getString(3));
      out.write("\">\n");
      out.write("    <td id=\"");
      out.print( rs.getString(2) );
      out.write("\">t");
      out.print( counter );
      out.write("</td>\n");
      out.write("    <td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("    <td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(4) );
      out.write("</td>\n");
      out.write("    <td style=\"padding: 0.2vw;vertical-align: middle;\">");
 //rs.getString(9) 
      out.write("1</td>\n");
      out.write("    <td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(44) );
      out.write("</td>\n");
      out.write("    <td style=\"padding: 0.2vw;vertical-align: middle;\">");
// rs.getString(31) 
      out.write("</td>\n");
      out.write("        \n");
      out.write("    <td style=\"padding: 0.2vw;vertical-align: middle;\"><form method=\"post\" style=\"margin-block-end: 0vw;\">\n");
      out.write("            <input type=\"hidden\" name=\"id1\" value=\"");
      out.print( id );
      out.write("\"/>\n");
      out.write("            <input type=\"hidden\" name=\"edit\" value=\"aedit\"/>\n");
      out.write("    <div class=\"addFees\">Add Fees</div>\n");
      out.write("    <div class=\"popup-overlay\">\n");
      out.write("<!--Creates the popup content-->\n");
      out.write("    <div class=\"popup-content\" >\n");
      out.write("    <label>Student Name : ");
      out.print( rs.getString(4));
      out.write("</label><br>\n");
      out.write("    <input type=\"hidden\" name=\"stu_enroll\" class=\"stu_enroll\">\n");
      out.write("    <input type=\"hidden\" name=\"stu_add_id\" class=\"stu_add_id\">\n");
      out.write("    <button type=\"button\" class=\"pm\" data-toggle=\"collapse\" data-target=\"#demo\">Cash</button>\n");
      out.write("    <input type=\"hidden\" name=\"cash\" class=\"pm_type1\" value=\"1\">\n");
      out.write("    \n");
      out.write("    <table id=\"cash demo\" style=\"text-align: center\" class=\"collapse\">\n");
      out.write("        <tr>\n");
      out.write("            <td style=\"width: 50%\">Amount\n");
      out.write("            <input type=\"text\" name=\"c_amount\" style=\"width: 15vw\"></td>\n");
      out.write("        \n");
      out.write("            <td style=\"width: 50%\">Date\n");
      out.write("                <input type=\"date\" name=\"c_date\" value=\"");
      out.print(d);
      out.write("\" style=\"width: 15vw\"></td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write(" </form>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
 counter++;
    } 
      out.write("\n");
      out.write("    \n");
      out.write("        </table>             \n");
      out.write("            \n");
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

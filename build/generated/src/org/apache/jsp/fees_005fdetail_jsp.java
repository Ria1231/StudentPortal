package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class fees_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("    <script>\n");
      out.write("       \n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("         ");
 //        if(session.getAttribute("user")!=null){
//         if(session.getAttribute("user").equals("")){
       
      out.write("<script>alert(\"Authentication Failure !\");\n");
      out.write("                    location='login.html';</script>\n");
      out.write("                    ");
 // }
//else{
      out.write(' ');
      out.write('\n');
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

      out.write("  \n");
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
      out.write("<!--<td style=\"padding: 0.5vw;vertical-align: middle;\"><input type=\"checkbox\" name=\"foo\" value=\"");
      out.print( id );
      out.write("\"></td>-->\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(4) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
 //rs.getString(9) 
      out.write("1</td>\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(44) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\">");
// rs.getString(31) 
      out.write("</td>\n");
      out.write("\n");
      out.write("<td style=\"padding: 0.2vw;vertical-align: middle;\"><form method=\"post\" style=\"margin-block-end: 0vw;\">\n");
      out.write("<input type=\"hidden\" name=\"id1\" value=\"");
      out.print( id );
      out.write("\"/>\n");
      out.write("<input type=\"hidden\" name=\"edit\" value=\"aedit\"/>\n");
      out.write("<!--<input type=\"submit\" value=\"\" class=\"s1\" style=\"background-image: url(css/icons/upload_doc.png)\"  formaction=\"fileUpload.jsp\"/>&nbsp;-->\n");
      out.write("<div class=\"open1\" style=\"font-size: 1vw;margin: 0.3vw;\n");
      out.write("     background-color: whitesmoke;width: 8vw;margin-right: -5.6vw;cursor: pointer\">Add Fees</div>\n");
      out.write("     \n");
      out.write("<div class=\"popup-overlay\">\n");
      out.write("<!--Creates the popup content-->\n");
      out.write("<div class=\"popup-content\" >\n");
      out.write("    <label>Student Name : ");
      out.print( rs.getString(4));
      out.write("</label><br>\n");
      out.write("    <input type=\"hidden\" name=\"stu_enroll\" class=\"stu_enroll\">\n");
      out.write("    <input type=\"hidden\" name=\"stu_add_id\" class=\"stu_add_id\">\n");
      out.write("    <br><br>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<div class=\"pm\" id=\"pm1\">cash</div>\n");
      out.write("<input type=\"hidden\" name=\"cash\" class=\"pm_type1\" value=\"1\">\n");
      out.write("<table id=\"cash\" style=\"text-align: center\">\n");
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
      out.write("<div class=\"pm\" id=\"pm2\">cheque</div>\n");
      out.write("<input type=\"hidden\" name=\"cheque\" class=\"pm_type2\" value=\"1\">\n");
      out.write("<table id=\"cheque\">\n");
      out.write("        <tr>\n");
      out.write("            <td style=\"text-align: left\">Cheque No.&nbsp;\n");
      out.write("                <input type=\"text\" name=\"ch_no\" style=\"width: 15vw\"></td>\n");
      out.write("            <td style=\"text-align: left\">Bank Name &nbsp;\n");
      out.write("                <input type=\"text\" name=\"bank_name\" style=\"width: 15vw\"></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr><td style=\"text-align: left\">Amount &nbsp;\n");
      out.write("                <input type=\"text\" name=\"ch_amount\" style=\"width: 15vw\"></td>\n");
      out.write("            <td style=\"text-align: left\">Date &nbsp;\n");
      out.write("                <input type=\"date\" name=\"ch_date\" value=\"");
      out.print(d);
      out.write("\" style=\"width: 15vw\"></td>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("<div  class=\"pm\" id=\"pm3\">dd</div>\n");
      out.write("<input type=\"hidden\" name=\"dd\" class=\"pm_type3\" value=\"1\">\n");
      out.write("<table id=\"dd\"><tr>\n");
      out.write("    <tr><td colspan=\"2\" style=\"text-align: left\">Name  &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <input type=\"text\" name=\"dd_name\" style=\"width: 25vw\"></td></tr>\n");
      out.write("        <tr><td style=\"text-align: left\">Amount &nbsp;\n");
      out.write("                <input type=\"text\" name=\"dd_amount\" style=\"width: 15vw\"></td>\n");
      out.write("            <td style=\"text-align: left\">Date &nbsp;\n");
      out.write("                <input type=\"date\" name=\"dd_date\" value=\"");
      out.print(d);
      out.write("\" style=\"width: 15vw\"></td>\n");
      out.write("    </tr></table>\n");
      out.write("\n");
      out.write("<div class=\"pm\" id=\"pm4\">ot</div>\n");
      out.write("<input type=\"hidden\" name=\"ot\" class=\"pm_type4\" value=\"1\">\n");
      out.write("<table id=\"ot\"><tr>\n");
      out.write("    <tr><td colspan=\"2\" style=\"text-align: left\">Reference No. &nbsp;&nbsp;\n");
      out.write("            <input type=\"text\" name=\"ot_ref\" style=\"width: 20vw\"></td></tr>\n");
      out.write("        <tr><td style=\"text-align: left\">Amount &nbsp;\n");
      out.write("                <input type=\"text\" name=\"ot_amount\" style=\"width: 15vw\"></td>\n");
      out.write("            <td style=\"text-align: left\">Date &nbsp;\n");
      out.write("                <input type=\"date\" name=\"ot_date\" value=\"");
      out.print(d);
      out.write("\" style=\"width: 15vw\"></td>\n");
      out.write("    </tr></table>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table><tr><td>Semester</td>\n");
      out.write("                <td><select name=\"sem\">\n");
      out.write("        <option>Select</option>\n");
      out.write("        <option id=\"sm1\" value=\"1\">Semester-1</option>\n");
      out.write("        <option id=\"sm2\" value=\"2\">Semester-2</option>\n");
      out.write("        <option id=\"sm3\" value=\"3\">Semester-3</option>\n");
      out.write("        <option id=\"sm4\" value=\"4\">Semester-4</option>\n");
      out.write("        <option id=\"sm5\" value=\"5\">Semester-5</option>\n");
      out.write("        <option id=\"sm6\" value=\"6\">Semester-6</option>\n");
      out.write("                    </select></td></tr></table>\n");
      out.write("   <!--popup's close button-->\n");
      out.write("        <button class=\"close1\">Close</button>    \n");
      out.write("       <input type=\"submit\" value=\"ADD\" formaction=\"fees_add.jsp\"/>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    </form>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
 counter++;
    } 
      out.write("\n");
      out.write("    \n");
      out.write("        </table>\n");
      out.write("    ");
 // }}
//else{

      out.write("\n");
      out.write("<!--       <script>alert(\"Authentication Failure !\");\n");
      out.write("                    location='login.html';</script>-->\n");
      out.write("                    ");

//} 
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function (){\n");
      out.write("        $(\".open1\").on(\"click\", function() {\n");
      out.write("        $(\".popup-overlay, .popup-content\").addClass(\"active\");\n");
      out.write("        var trid=$(this).closest('tr').attr('id1');\n");
      out.write("        var aid=$(this).closest('tr').attr('id2');\n");
      out.write("        $(\"input.stu_enroll\").val(trid)\n");
      out.write("        $(\"input.stu_add_id\").val(aid)\n");
      out.write("        alert(trid);\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\".close1\").on(\"click\", function() {\n");
      out.write("          $(\".popup-overlay, .popup-content\").removeClass(\"active\");\n");
      out.write("        });\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        $('.popup-overlay .popup-content #cash').hide(); \n");
      out.write("       $('.popup-overlay .popup-content #cheque').hide(); \n");
      out.write("       $('.popup-overlay .popup-content #dd').hide(); \n");
      out.write("       $('.popup-overlay .popup-content #ot').hide(); \n");
      out.write("       \n");
      out.write("        $('.popup-overlay .popup-content #pm1').click(function() {  \n");
      out.write("             $('.popup-overlay .popup-content #cash').toggle(900);\n");
      out.write("             $('.popup-overlay .popup-content #cheque').hide();\n");
      out.write("             $('.popup-overlay .popup-content #dd').hide();\n");
      out.write("             $('.popup-overlay .popup-content #ot').hide();\n");
      out.write("             $(\"input.pm_type1\").val(101);\n");
      out.write("             \n");
      out.write("//             document.getElementById(\"pm_type1\").value = \"cash\";\n");
      out.write("             \n");
      out.write("    });\n");
      out.write("        \n");
      out.write("        $('.popup-overlay .popup-content #pm2').click(function() {  \n");
      out.write("             $('.popup-overlay .popup-content #cheque').toggle(900);\n");
      out.write("             $('.popup-overlay .popup-content #cash').hide();\n");
      out.write("             $('.popup-overlay .popup-content #dd').hide();\n");
      out.write("             $('.popup-overlay .popup-content #ot').hide();\n");
      out.write("             $(\"input.pm_type2\").val(102);\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        $('.popup-overlay .popup-content #pm3').click(function() {  \n");
      out.write("             $('.popup-overlay .popup-content #dd').toggle(900);\n");
      out.write("             $('.popup-overlay .popup-content #cash').hide();\n");
      out.write("             $('.popup-overlay .popup-content #cheque').hide();\n");
      out.write("             $('.popup-overlay .popup-content #ot').hide();\n");
      out.write("             $(\"input.pm_type3\").val(103);\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        $('.popup-overlay .popup-content #pm4').click(function() {  \n");
      out.write("             $('.popup-overlay .popup-content #ot').toggle(900);\n");
      out.write("             $('.popup-overlay .popup-content #cash').hide();\n");
      out.write("             $('.popup-overlay .popup-content #cheque').hide();\n");
      out.write("             $('.popup-overlay .popup-content #dd').hide();\n");
      out.write("             $(\"input.pm_type4\").val(104);\n");
      out.write("        });\n");
      out.write("  \n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("        .popup-overlay {\n");
      out.write("        visibility:hidden;\n");
      out.write("        }\n");
      out.write("        .popup-content {        \n");
      out.write("        background-color: gainsboro;padding: 2vw;border: 1vw;\n");
      out.write("        width: 40%;\n");
      out.write("        position: absolute;\n");
      out.write("        top: 30%;\n");
      out.write("        left: 30%;\n");
      out.write("        }\n");
      out.write("        .popup-overlay.active{\n");
      out.write("        visibility:visible;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .popup-content.active {\n");
      out.write("        visibility:visible;\n");
      out.write("        }\n");
      out.write("        .pm{\n");
      out.write("           width: 35vw;\n");
      out.write("           background-color: #07cdae;\n");
      out.write("           padding: 0.4vw;\n");
      out.write("           margin-bottom: 0.4vw;\n");
      out.write("           cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .pm:hover{\n");
      out.write("            background-color:#047edf;\n");
      out.write("        }\n");
      out.write("        </style>\n");
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

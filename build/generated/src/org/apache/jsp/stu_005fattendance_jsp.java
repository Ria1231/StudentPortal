package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public final class stu_005fattendance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Stu Attendance</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/bootstrap.min.js\">\n");
      out.write("    </head>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.html", out, false);
      out.write("\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("        ");

            long millis=System.currentTimeMillis();
            Date d1=new Date(millis);
            out.println(d1);
            Date d = new Date();
            SimpleDateFormat fmt_m = new SimpleDateFormat("M");
            SimpleDateFormat fmt_y = new SimpleDateFormat("Y");
            int month=Integer.parseInt(fmt_m.format(d));
            int year=Integer.parseInt(fmt_y.format(d));
        
      out.write("\n");
      out.write("        Today's date: ");
      out.print( (new java.util.Date()).toLocaleString());
      out.write("\n");
      out.write("       \n");
      out.write("        ");

          Date dNow = new Date();
         SimpleDateFormat ft = new SimpleDateFormat ("M");
         
        
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <table style=\"width: 80%\"><tr>\n");
      out.write("                    <td>Batch &nbsp;<select name=\"batch\" style=\"width: 10vw\">\n");
      out.write("                    <option id=\"batch0\">Select</option>\n");
      out.write("                    <option id=\"batch1\" value=\"morning\">Morning</option>\n");
      out.write("                    <option id=\"batch2\" value=\"noon\">Noon</option>\n");
      out.write("                    </select></td>\n");
      out.write("                \n");
      out.write("                <td>Select Course &nbsp;\n");
      out.write("                <select name=\"course\" style=\"width:25vw\">\n");
      out.write("                    <option id=\"course0\">SELECT</option>\n");
      out.write("                    <option value=\"IT-IMS\" id=\"course1\">IT-IMS & CYBER SECURITY </option>\n");
      out.write("                    <option value=\"SOFTWARE\" id=\"course2\">SOFTWARE DEVELOPMENT(WEB & MOBILE)</option>\n");
      out.write("                    <option value=\"ANIMATION\" id=\"course3\">ANIMATION & VFX</option>\n");
      out.write("                    <option value=\"DIGITAL-DESIGN\" id=\"course4\">DIGITAL DESIGN</option>\n");
      out.write("                </select></td>\n");
      out.write("                <td>Choose Date\n");
      out.write("                    <input type=\"date\" name=\"enq_date\" id=\"datePicker\">\n");
      out.write("                </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <table border=\"1\" class=\"table\" style=\"text-align: center;width: 99%;background-color: white;border:gray;\n");
      out.write("    margin-left: 0.5vw;font-size: 0.9vw;\">\n");
      out.write("<tr style=\"width: 2vw;height: 2vw;padding: 0.2vw;background-color: rgba(154,169,172,1);\">\n");
      out.write("<td style=\"width: 2vw;height: 2vw;padding: 0.2vw;\">Full Name</td>\n");
      out.write("<td>1</td>\n");
      out.write("<td>2</td>\n");
      out.write("<td>3</td>\n");
      out.write("<td>4</td>\n");
      out.write("<td>5</td>\n");
      out.write("<td>6</td>\n");
      out.write("<td>7</td>\n");
      out.write("<td>8</td>\n");
      out.write("<td>9</td>\n");
      out.write("<td>10</td>\n");
      out.write("<td>11</td>\n");
      out.write("<td>12</td>\n");
      out.write("<td>13</td>\n");
      out.write("<td>14</td>\n");
      out.write("<td>15</td>\n");
      out.write("<td>16</td>\n");
      out.write("<td>17</td>\n");
      out.write("<td>18</td>\n");
      out.write("<td>19</td>\n");
      out.write("<td>20</td>\n");
      out.write("<td>21</td>\n");
      out.write("<td>22</td>\n");
      out.write("<td>23</td>\n");
      out.write("<td>24</td>\n");
      out.write("<td>25</td>\n");
      out.write("<td>26</td>\n");
      out.write("<td>28</td>\n");

    if(month==2){
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
      out.write("\n");
      out.write("        <td>29</td>\n");
}}
      out.write('\n');
        
if(month!=2){
      out.write("\n");
      out.write("    <td>29</td>\n");
      out.write("    <td>30</td>\n");
}
if(month==1|| month==3||month==5||month==7||month==8||month==10||month==12){
      out.write("\n");
      out.write("        <td>31</td>\n");
}

      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
  
    String s_by="",sname="",stmt="";
//    String s=request.getParameter("sform");
    int counter=0;
    Class.forName("com.mysql.jdbc.Driver");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
    stmt="Select * from stu_admission";
    PreparedStatement ps=c.prepareStatement(stmt);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
        int id=rs.getInt(3);
    
      out.write("\n");
      out.write("    <tr id=\"data\" style=\"cursor: pointer;\"> \n");
      out.write("    <td style=\"width: 2vw;height: 2vw;padding: 0.2vw;vertical-align: middle;\">");
      out.print( rs.getString(4) );
      out.write("</td>\n");
      out.write("    <td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("<td>P</td>\n");
      out.write("</tr>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        var count = 0;\n");
      out.write("  $('#data td').on('click', function() {\n");
      out.write("       \n");
      out.write("    $(this).toggleClass('highlight').text($(this).text() == 'P' ? 'A' : 'P');\n");
      out.write("    count++;\n");
      out.write("    alert(count);\n");
      out.write("});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("        .highlight { background-color: red;}\n");
      out.write("        \n");
      out.write("    </style>\n");
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

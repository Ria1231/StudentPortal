package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class course_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Course</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"js/bootstrap.min.js\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.html", out, false);
      out.write("\n");
      out.write("        ");
 //        if(session.getAttribute("user")!=null){
//         if(session.getAttribute("user").equals("")){
       
      out.write("<script>alert(\"Authentication Failure !\");\n");
      out.write("//                    location='login.html';</script>\n");
      out.write("                    ");
 //}
//else{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1","root","root");
            String title="";
            String c_name="",per="",total="";
    int sem=0,total_sem=0,c_id=0;int counter=0;  
                
      out.write("\n");
      out.write("        <script>\n");
      out.write("    var checkboxes=[];\n");
      out.write("    function toggle(source){\n");
      out.write("        checkboxes=document.getElementsByName('foo');\n");
      out.write("        for(var i=0, n=checkboxes.length;i<n;i++){\n");
      out.write("            checkboxes[i].checked=source.checked;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    function add(){\n");
      out.write("        document.getElementById('add_form').style.display=\"block\";\n");
      out.write("    }\n");
      out.write("    function close(){\n");
      out.write("        document.getElementById('add_form').style.display=\"none\";   \n");
      out.write("        document.getElementById('edit_form').style.display=\"none\";        \n");
      out.write("    }\n");
      out.write("    function edit(id){\n");
      out.write("        document.getElementById('edit_form').style.display=\"block\";\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("        <div class=\"a\" style=\"margin-left: 1vw;\">COURSES</div>\n");
      out.write("\n");
      out.write("        <form method=\"post\">\n");
      out.write("    <br>\n");
      out.write("<input style=\"margin-left: 1vw;font-size: 1vw;\" type=\"checkbox\" onclick=\"toggle(this)\"/>\n");
      out.write("<span style=\"font-size: 1.2vw;\">Select All</span>\n");
      out.write("<input type=\"hidden\" value=\"fees\" name=\"delete\"/>\n");
      out.write("<input class=\"delete_btn\" type=\"submit\" value=\"Delete\" formaction=\"delete.jsp\"/>\n");
      out.write("<div class=\"add_btn\" onclick=\"add()\" style=\"text-align:center; padding-top: 0.3vw;font-size: 1.3vw;\">Add Course</div>\n");
      out.write("    <br><br>\n");
      out.write("<table border=\"1\" class=\"table table-hover\" style=\"text-align: center;width: 99%;background-color: white;border:black;\n");
      out.write("    margin-left: 0.5vw;font-size: 1vw;\">\n");
      out.write("<tr style=\"background-color: rgba(154,169,172,1);\">\n");
      out.write("<td></td>\n");
      out.write("<th>Course Name</th>\n");
      out.write("<th>Fees per Semester</th>\n");
      out.write("<th>Total Semesters</th>\n");
      out.write("<th>Course Duration</th>\n");
      out.write("<th>Total Fees</th>\n");
      out.write("<th></th>\n");
      out.write("</tr>\n");
    
    try{
    PreparedStatement ps=c.prepareStatement("Select * from fees");
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
        
      out.write("            \n");
      out.write("<tr id=\"t");
      out.print( counter );
      out.write("\">\n");
      out.write("    <td style=\"padding: 0.5vw;vertical-align: middle;\"><input type=\"checkbox\" id=\"foo\" value=\"");
      out.print( rs.getString(1) );
      out.write("\"></td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\">");
      out.print( rs.getString(2) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\">");
      out.print( rs.getString(3) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\">");
      out.print( rs.getInt(4) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\">");
      out.print( rs.getInt(5) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\">");
      out.print( rs.getString(6) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\"><form method=\"post\" style=\"margin-block-end: 0vw;\">\n");
      out.write("<input type=\"hidden\" name=\"id\" value=\"");
      out.print( rs.getString(1) );
      out.write("\"/>\n");
      out.write("<script>\n");
      out.write("</script>\n");
      out.write("<div  onclick=\"edit(");
      out.print( rs.getString(1) );
      out.write(")\" style=\"text-align:center; font-size: 1.2vw;border: 1px solid black;\">Edit</div>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
 counter++;
}}
catch(Exception e){
    out.print(e.getMessage());
}
      out.write("\n");
      out.write("<div class=\"data_counter\">Data : ");
      out.print( counter );
      out.write("</div>\n");
      out.write("    </table></form>\n");
      out.write("    <div id=\"edit_form\" style=\"display:none\">\n");
      out.write("         <form method=\"post\">\n");
      out.write("             <button onclick=\"close()\" style=\"float: right;background: none;border:none;\">X</button><br>\n");
      out.write("             <h2>Edit Course</h2>\n");
      out.write("             <br><input type=\"text\" placeholder=\"Course Name\" name=\"c_name\" value=\"");
      out.print( c_name );
      out.write("\" required/>\n");
      out.write("             <br><input type=\"text\" placeholder=\"Fees Per Semester\" name=\"per\" value=\"");
      out.print( per );
      out.write("\" required/>\n");
      out.write("             <br><input type=\"number\" placeholder=\"Total Semesters\" name=\"total_sem\" value=\"");
      out.print( sem );
      out.write("\" required/>\n");
      out.write("             <br><input type=\"number\" placeholder=\"Course Duration\" name=\"duration\" value=\"");
      out.print( total_sem );
      out.write("\" required/>\n");
      out.write("             <br><input type=\"text\" placeholder=\"Total Fees\" name=\"total_fees\" value=\"");
      out.print( total );
      out.write("\" required/><br>\n");
      out.write("             <input type=\"hidden\" name=\"act\" value=\"edit\"/>\n");
      out.write("             <br><input type=\"submit\" value=\"Submit\" class=\"sub_btn\" formaction=\"course_add\"/>\n");
      out.write("         </form>\n");
      out.write("     </div>\n");
      out.write("     <div id=\"add_form\" style=\"display:none\">\n");
      out.write("         <form method=\"post\">\n");
      out.write("             <button onclick=\"close()\" style=\"float: right;background: none;border:none;\">X</button><br>\n");
      out.write("             <h2>Add Course</h2>\n");
      out.write("             <br><input type=\"text\" placeholder=\"Course Name\" name=\"c_name\" />\n");
      out.write("             <br><input type=\"text\" placeholder=\"Fees Per Semester\" name=\"per\"  />\n");
      out.write("             <br><input type=\"number\" placeholder=\"Total Semesters\" name=\"total_sem\" />\n");
      out.write("             <br><input type=\"number\" placeholder=\"Course Duration\" name=\"duration\" />\n");
      out.write("             <br><input type=\"text\" placeholder=\"Total Fees\" name=\"total_fees\" /><br>\n");
      out.write("                          <input type=\"hidden\" name=\"act\" value=\"add\"/>\n");
      out.write("             <br><input type=\"submit\" value=\"Submit\" class=\"sub_btn\" formaction=\"course_add\"/>\n");
      out.write("         </form>\n");
      out.write("     </div>\n");
 }//}
//else{

      out.write("<script>alert(\"Authentication Failure !\");\n");
      out.write("                    location='login.html';</script>\n");
      out.write("                    ");

//} 
      out.write("\n");
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

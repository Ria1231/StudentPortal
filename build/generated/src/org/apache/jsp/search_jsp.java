package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       
      out.write("<script>alert(\"Authentication Failure !\");\n");
      out.write("                    location='login.html';</script>\n");
      out.write("                    ");
 }
else{
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.html", out, false);
      out.write("\n");
      out.write("        <script>\n");
      out.write("    var chk=[];\n");
      out.write("    function toggle(source){\n");
      out.write("        checkboxes=document.getElementByName('foo');\n");
      out.write("        for(var i=0, n=checkboxes.length;i<n;i++){\n");
      out.write("            checkboxes[i].checked=source.checked;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("        </script>\n");

         Cookie cookie=null;
         Cookie cookies[]=null;
         cookies=request.getCookies();
         String search_by=request.getParameter("s_by");
         String value=request.getParameter("sname");
         int counter=0;
         Class.forName("com.mysql.jdbc.Driver");
         Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1","root","root");
         for(int i=0;i<cookies.length;i++){
                   cookie=cookies[i];
                   if(cookie.getName().equalsIgnoreCase("pname")){
                   if(cookie.getValue().equalsIgnoreCase("admisssion")){
                       PreparedStatement ps=c.prepareStatement("Select * from stu_admission where "+search_by+" = "+value);
                        ResultSet rs=ps.executeQuery();
                        while(rs.next()){
                         int id=rs.getInt(3);
            
      out.write("\n");
      out.write("<form method=\"post\">\n");
      out.write("    <br>\n");
      out.write("<input style=\"margin-left: 1vw;font-size: 1vw;\" type=\"checkbox\" onclick=\"toggle(this)\"/>\n");
      out.write("<span style=\"font-size: 1.2vw;\">Select All</span>\n");
      out.write("<input type=\"hidden\" value=\"enquiry\" name=\"delete\"/>\n");
      out.write("<input class=\"delete_btn\" type=\"submit\" value=\"Delete\" formaction=\"delete.jsp\"/>\n");
      out.write("    <br><br>\n");
      out.write("<table border=\"1\" class=\"table table-hover\" style=\"text-align: center;width: 99%;\n");
      out.write("    margin-left: 0.5vw;font-size: 1vw;\">\n");
      out.write("<tr style=\"background-color: #ccc;\">\n");
      out.write("<td></td>\n");
      out.write("<th>Full Name</th>\n");
      out.write("<th>Parent's Name</th>\n");
      out.write("<th>Mobile No.</th>\n");
      out.write("<th>Parent's No.</th>\n");
      out.write("<th>School 12</th>\n");
      out.write("<th>Stream 12</th>\n");
      out.write("<th>Board 12</th>\n");
      out.write("<th>Passing Year of 12th</th>\n");
      out.write("<th></th>\n");
      out.write("</tr>\n");
      out.write("<tr id=\"t");
      out.print( counter );
      out.write("\">\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\"><input type=\"checkbox\" name=\"foo\" value=\"");
      out.print( id );
      out.write("\"/></td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\">");
      out.print( rs.getString(5) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\">");
      out.print( rs.getString(18) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\">");
      out.print( rs.getString(10) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\">");
      out.print( rs.getString(19) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\">");
      out.print( rs.getString(32) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\">");
      out.print( rs.getString(33) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\">");
      out.print( rs.getString(34) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\">");
      out.print( rs.getString(35) );
      out.write("</td>\n");
      out.write("<td style=\"padding: 0.5vw;vertical-align: middle;\"><form method=\"post\" style=\"margin-block-end: 0vw;\">\n");
      out.write("<input type=\"hidden\" name=\"id1\" value=\"");
      out.print( id );
      out.write("\"/>\n");
      out.write("<input type=\"hidden\" name=\"edit\" value=\"aedit\"/>\n");
      out.write("<input type=\"submit\" value=\"view\" formaction=\"stu_detail.jsp\"/>&nbsp;\n");
      out.write("<input type=\"submit\" value=\"Edit\" formaction=\"admission_form.jsp\"/>\n");
      out.write("    </form>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
 counter++;
    }
}
else{

}
}
      out.write("\n");
      out.write("<div style=\"position: absolute;top: 6vw;margin-left:47%;font-size: 1.4vw;\">Data : ");
      out.print( counter );
      out.write("</div>\n");
      out.write("    </table></form>\n");
      out.write("     ");
 }}}
else{

      out.write("<script>alert(\"Authentication Failure !\");\n");
      out.write("                    location='login.html';</script>\n");
      out.write("                    ");

} 
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class eform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--        <link rel=\"stylesheet\" type='text/javascript' href=\"css/state_city.js\">-->\n");
      out.write("    </head>  \n");
      out.write("    <script type=\"text/javascript\" src=\"css/state_city.js\"></script>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.html", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       
      out.write("<script>alert(\"Authentication Failure !\");\n");
      out.write("                    location='login.html';</script>\n");
      out.write("                    ");
 }
else{
      out.write('\n');

    String name="", mob="", scl="", stream="", board="";
    int yr=0000;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
        String id=request.getParameter("id1");
        if(id!=null){
            String sql="Select * from stu_db where stu_id="+id+"";
            Statement st=c.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                name=rs.getString(2);
                mob=rs.getString(3);
                scl=rs.getString(4);
                stream=rs.getString(5);
                board=rs.getString(6);
                yr=rs.getInt(7);
                }
            }

      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div class=\"a\">ENQUIRY FORM</div>\n");
      out.write("    </center>\n");
      out.write("    <div style=\"height:72.5vw;\" class=\"form_bg\"></div>\n");
      out.write("    <div class=\"form\">\n");
      out.write("    <form action=\"enquiry.jsp\" method=\"post\" autocomplete=\"off\">\n");
      out.write("        <table>\n");
      out.write("            <tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("        <tr><td colspan=\"4\" class=\"h1\">Student Details</td></tr>\n");
      out.write("        <tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Name<br>(As per Marksheet)</td>\n");
      out.write("    <td>\n");
      out.write("        <input type=\"text\" id=\"contact_name\" name=\"name\" value=\"");
      out.print( name );
      out.write("\" width=\"25vw\" required>\n");
      out.write("        <span class=\"error\">This field is required</span>\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("    <td>Email Id</td>\n");
      out.write("    <td><input type=\"email\" name=\"email\" style=\"text-transform:none;\" required></td>\n");
      out.write("    <td>State</td>\n");
      out.write("    <td>\n");
      out.write("        <!--<input type=\"text\" name=\"state\">-->\n");
      out.write("        <select id=\"countrySelect\" name=\"state\" onchange=\"makeSubmenu(this.value)\">\n");
      out.write("        <option value=\"\" disabled selected>Choose State</option>\n");
      out.write("        <option value=\"AndhraPradesh\">Andhra Pradesh</option>\n");
      out.write("<option value=\"Arunachal_Pradesh\">Arunachal Pradesh</option>\n");
      out.write("<option value=\"Assam\">Assam</option>\n");
      out.write("<option value=\"Bihar\">Bihar</option>\n");
      out.write("<option value=\"Chandigarh\">Chandigarh</option>\n");
      out.write("<option value=\"Chhattisgarh\">Chhattisgarh</option>\n");
      out.write("<option value=\"Dadra_and_Nagar_Haveli\">Dadar and Nagar Haveli</option>\n");
      out.write("<option value=\"Daman_and_Diu\">Daman and Diu</option>\n");
      out.write("<option value=\"Delhi\">Delhi</option>\n");
      out.write("<option value=\"Pondicherry\">Pondicherry</option>\n");
      out.write("<option value=\"Goa\">Goa</option>\n");
      out.write("<option value=\"Gujarat\">Gujarat</option>\n");
      out.write("<option value=\"Haryana\">Haryana</option>\n");
      out.write("<option value=\"Himachal_Pradesh\">Himachal Pradesh</option>\n");
      out.write("<option value=\"Jammu_and_Kashmir\">Jammu and Kashmir</option>\n");
      out.write("<option value=\"Jharkhand\">Jharkhand</option>\n");
      out.write("<option value=\"Karnataka\">Karnataka</option>\n");
      out.write("<option value=\"Kerala\">Kerala</option>\n");
      out.write("<option value=\"Madhya_Pradesh\">Madhya Pradesh</option>\n");
      out.write("<option value=\"Maharashtra\">Maharashtra</option>\n");
      out.write("<option value=\"Manipur\">Manipur</option>\n");
      out.write("<option value=\"Meghalaya\">Meghalaya</option>\n");
      out.write("<option value=\"Mizoram\">Mizoram</option>\n");
      out.write("<option value=\"Nagaland\">Nagaland</option>\n");
      out.write("<option value=\"Odisha\">Odisha</option>\n");
      out.write("<option value=\"Punjab\">Punjab</option>\n");
      out.write("<option value=\"Rajasthan\">Rajasthan</option>\n");
      out.write("<option value=\"Sikkim\">Sikkim</option>\n");
      out.write("<option value=\"Tamil Nadu\">Tamil Nadu</option>\n");
      out.write("<option value=\"Telangana\">Telangana</option>\n");
      out.write("<option value=\"Tripura\">Tripura</option>\n");
      out.write("<option value=\"Uttar_Pradesh\">Uttar Pradesh</option>\n");
      out.write("<option value=\"Uttarakhand\">Uttarakhand</option>\n");
      out.write("<option value=\"West_Bengal\">West Bengal</option>\n");
      out.write("</select>\n");
      out.write("\n");
      out.write("    </td>\n");
      out.write("    <script>\n");
      out.write("  var objSelect = document.getElementById(\"countrySelect\");\n");
      out.write("\n");
      out.write("//Set selected\n");
      out.write("setSelectedValue(objSelect,state);\n");
      out.write("\n");
      out.write("function setSelectedValue(selectObj, valueToSet) {\n");
      out.write("    for (var i = 0; i < selectObj.options.length; i++) {\n");
      out.write("        if (selectObj.options[i].text=== valueToSet) {\n");
      out.write("            selectObj.options[i].selected = true;\n");
      out.write("            alert(valueToSet);\n");
      out.write("            return;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("    <td>Mobile Number</td>\n");
      out.write("    <td><input type=\"text\" name=\"mobile_no\" value=\"");
      out.print( mob );
      out.write("\" required></td>\n");
      out.write("    <td>City</td>\n");
      out.write("    <td>\n");
      out.write("        <!--<input type=\"text\" name=\"city\" required>-->\n");
      out.write("        <select id=\"citySelect\" size=\"1\" name=\"city\" >\n");
      out.write("        <option value=\"\" disabled selected>Choose City</option>\n");
      out.write("        <option></option>\n");
      out.write("        </select>\n");
      out.write("    </td>\n");
      out.write("    <tr>\n");
      out.write("    <td>Residential Address</td>\n");
      out.write("    <td ><textarea name=\"address\" rows=\"3\" cols=\"30\"></textarea></td>\n");
      out.write("    <td>Pin Code</td>\n");
      out.write("    <td><input type=\"text\" name=\"pincode\"></td></tr>\n");
      out.write("    \n");
      out.write("    <tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("    <tr><td colspan=\"4\" class=\"h1\">Parent Details</td></tr>\n");
      out.write("    <tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("    <tr>\n");
      out.write("    <td>Name</td>\n");
      out.write("    <td><input type=\"text\" name=\"pname\" required></td>\n");
      out.write("    <td>Email Id</td>\n");
      out.write("    <td><input type=\"email\" name=\"pemail\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("    <td>Mobile Number</td>\n");
      out.write("    <td><input type=\"text\" name=\"pmobile_no\" required></td>\n");
      out.write("    <td>Occupation</td>\n");
      out.write("    <td><input type=\"text\" name=\"occupation\"></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    </table><table>\n");
      out.write("        <tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("    <tr><td colspan=\"6\" class=\"h1\">Past Academic Record</td></tr>\n");
      out.write("    <tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>Qualification</td>\n");
      out.write("            <td>School/College Name</td>\n");
      out.write("            <td>Stream</td>\n");
      out.write("            <td>Board</td>\n");
      out.write("            <td>Passing Year</td>\n");
      out.write("            <td>Grade%</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>12<sup>th</sup></td>\n");
      out.write("            <td><input type=\"text\" name=\"scl_12\" value=\"");
      out.print( scl );
      out.write("\" style=\"width:13vw;\" required></td>\n");
      out.write("            <td>\n");
      out.write("                 <select name=\"stream_12\" style=\"width:8vw;\">\n");
      out.write("                 ");
 
                     if(stream.equalsIgnoreCase("science"))
                    {
                 
      out.write("\n");
      out.write("                        <option>Select</option>\n");
      out.write("                        <option value=\"science\" selected>Science</option>\n");
      out.write("                        <option value=\"commerce\">Commerce</option>\n");
      out.write("                        <option value=\"arts\">Arts</option>\n");
      out.write("                     ");
}
                    else if(stream.equalsIgnoreCase("commerce")){
      out.write("\n");
      out.write("                        <option>Select</option>\n");
      out.write("                        <option value=\"science\" >Science</option>\n");
      out.write("                        <option value=\"commerce\" selected>Commerce</option>\n");
      out.write("                        <option value=\"arts\">Arts</option>\n");
      out.write("                     ");
 }
                     else if(stream.equalsIgnoreCase("arts")){
      out.write("\n");
      out.write("                        <option>Select</option>\n");
      out.write("                        <option value=\"science\" >Science</option>\n");
      out.write("                        <option value=\"commerce\">Commerce</option>\n");
      out.write("                        <option value=\"arts\" selected>Arts</option>\n");
      out.write("                     ");
 }
                    else{
      out.write("\n");
      out.write("                    <option selected>Select</option>\n");
      out.write("                    <option value=\"science\" >Science</option>\n");
      out.write("                    <option value=\"commerce\" >Commerce</option>\n");
      out.write("                    <option value=\"arts\">Arts</option>\n");
      out.write("                    ");
}
      out.write(" \n");
      out.write("                 </select>\n");
      out.write("              \n");
      out.write("            </td>\n");
      out.write("            <td><select name=\"board_12\" style=\"width:8vw;\">\n");
      out.write("                    \n");
      out.write("                     ");
 
                     if(board.equalsIgnoreCase("cbse"))
                    {
                    
      out.write("\n");
      out.write("                    <option>Select</option>                    \n");
      out.write("                    <option value=\"CBSE\" selected>CBSE</option>\n");
      out.write("                    <option value=\"ICSE\">ICSE</option>\n");
      out.write("                    <option value=\"GSHEB\">GSHEB</option>\n");
      out.write("                    <option value=\"other\">Other</option>\n");
      out.write("                    ");
}
                    else if(board.equalsIgnoreCase("other")){
      out.write("\n");
      out.write("                        <option>Select</option>\n");
      out.write("                        <option value=\"CBSE\">CBSE</option>\n");
      out.write("                        <option value=\"ICSE\">ICSE</option>\n");
      out.write("                        <option value=\"GSHEB\">GSHEB</option>\n");
      out.write("                        <option value=\"other\" selected>Other</option>\n");
      out.write("                     ");
 }
                     else if(board.equalsIgnoreCase("icse")){
      out.write("\n");
      out.write("                        <option>Select</option>\n");
      out.write("                        <option value=\"CBSE\">CBSE</option>\n");
      out.write("                        <option value=\"ICSE\" selected>ICSE</option>\n");
      out.write("                        <option value=\"GSHEB\">GSHEB</option>\n");
      out.write("                        <option value=\"other\">Other</option>\n");
      out.write("                     ");
 }
                    else if(board.equalsIgnoreCase("GSHEB")){
      out.write("\n");
      out.write("                        <option>Select</option>\n");
      out.write("                        <option value=\"CBSE\">CBSE</option>\n");
      out.write("                        <option value=\"ICSE\">ICSE</option>\n");
      out.write("                        <option value=\"GSHEB\" selected>GSHEB</option>\n");
      out.write("                        <option value=\"other\">Other</option>\n");
      out.write("                    ");
}
                    else{
      out.write("\n");
      out.write("                        <option selected>Select</option>\n");
      out.write("                        <option value=\"CBSE\">CBSE</option>\n");
      out.write("                        <option value=\"ICSE\">ICSE</option>\n");
      out.write("                        <option value=\"GSHEB\">GSHEB</option>\n");
      out.write("                        <option value=\"other\">Other</option>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </select></td>\n");
      out.write("            <!--<td><input type=\"text\" name=\"pyear_12\" style=\"width:8vw;\" value=\"\" required></td>-->\n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    <input list=\"pyear_12\" placeholder=\"Select\" name=\"pyear_12\" value=\"");
      out.print( yr);
      out.write("\" style=\"width:8vw;\" class=\"list\">\n");
      out.write("        <datalist name=\"pyear_12\" style=\"width:2vw;\" required id=\"pyear_12\">\n");
      out.write("                        <option value=\"2013\">\n");
      out.write("                        <option value=\"2014\">\n");
      out.write("                        <option value=\"2015\">\n");
      out.write("                        <option value=\"2016\">\n");
      out.write("                        <option value=\"2017\">\n");
      out.write("                        <option value=\"2018\">\n");
      out.write("                        <option value=\"2019\">\n");
      out.write("        </datalist></td>\n");
      out.write("            <td><input type=\"text\" name=\"grade_12\" style=\"width:8vw;\" required></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr align=\"center\">\n");
      out.write("            <td>10<sup>th</sup></td>\n");
      out.write("            <td><input type=\"text\" name=\"scl_10\" style=\"width:13vw;\"></td>\n");
      out.write("            <td><input type=\"text\" name=\"stream_10\" style=\"width:8vw;\"></td>\n");
      out.write("            <!--<td><input type=\"text\" name=\"board_10\" style=\"width:8vw;\"></td>-->\n");
      out.write("            <td><select name=\"board_10\" style=\"width:8vw;\">\n");
      out.write("                        <option selected>Select</option>\n");
      out.write("                        <option value=\"CBSE\">CBSE</option>\n");
      out.write("                        <option value=\"ICSE\">ICSE</option>\n");
      out.write("                        <option value=\"GSHEB\">GSHEB</option>\n");
      out.write("                        <option value=\"other\">Other</option>\n");
      out.write("                </select></td>\n");
      out.write("            \n");
      out.write("                 <td>\n");
      out.write("        <input list=\"pyear_10\" placeholder=\"Select\" name=\"pyear_10\" style=\"width:8vw;\" class=\"list\">\n");
      out.write("        <datalist name=\"pyear_10\" style=\"width:2vw;\" required id=\"pyear_10\">\n");
      out.write("                        <option value=\"2013\">\n");
      out.write("                        <option value=\"2014\">\n");
      out.write("                        <option value=\"2015\">\n");
      out.write("                        <option value=\"2016\">\n");
      out.write("                        <option value=\"2017\">\n");
      out.write("                        <option value=\"2018\">\n");
      out.write("                        <option value=\"2019\">\n");
      out.write("        </datalist></td>\n");
      out.write("            <td><input type=\"text\" name=\"grade_10\" style=\"width:8vw;\" required></td>\n");
      out.write("        </tr>\n");
      out.write("    </table><table>\n");
      out.write("        <tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("        <tr><td class=\"h1\">Course </td></tr>\n");
      out.write("        <tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("        <tr><td><input type=\"checkbox\" name=\"chbox\" value=\"IT-IMS\">\n");
      out.write("                IT-IMS & CYBER SECURITY - <small>[B.Sc + M.Sc] - (5 Year Integrated)</small></td></tr>\n");
      out.write("        <tr><td><input type=\"checkbox\" name=\"chbox\" value=\"SOFTWARE\">\n");
      out.write("                SOFTWARE DEVELOPMENT (WEB & MOBILE APPLICATION) - <small>[B.Sc + M.Sc] - (5 Year Integrated)</small></td></tr>\n");
      out.write("        <tr><td><input type=\"checkbox\" name=\"chbox\" value=\"ANIMATION\">\n");
      out.write("                ANIMATION & VFX - <small>[B.Sc + M.Sc] - (5 Year Integrated)</small></td></tr>\n");
      out.write("        <tr><td><input type=\"checkbox\" name=\"chbox\" value=\"DIGITAL-DESIGN\">\n");
      out.write("                DIGITAL DESIGN - <small>[B.Sc + M.Sc] - (5 Year Integrated)</small></td></tr>\n");
      out.write("    </table><table>\n");
      out.write("        <tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("    <tr><td colspan=\"2\" class=\"h1\">How Did You Hear About The Courses ?</td></tr>\n");
      out.write("    <tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("    <tr><td>\n");
      out.write("    <input type=\"checkbox\" name=\"ref\" value=\"SMS\">&nbsp;SMS &nbsp;&nbsp;\n");
      out.write("    <input type=\"checkbox\" name=\"ref\" value=\"email\">&nbsp;E-Mail&nbsp;&nbsp;\n");
      out.write("    <input type=\"checkbox\" name=\"ref\" value=\"facebook\">&nbsp;FaceBook&nbsp;&nbsp;\n");
      out.write("    <input type=\"checkbox\" name=\"ref\" value=\"newspaper\">&nbsp;Newspaper ADVT&nbsp;&nbsp;\n");
      out.write("    <input type=\"checkbox\" name=\"ref\" value=\"whatsapp\">&nbsp;WhatsApp&nbsp;&nbsp;\n");
      out.write("    <input type=\"checkbox\" name=\"ref\" value=\"website\">&nbsp;Website&nbsp;&nbsp;\n");
      out.write("    <input type=\"checkbox\" name=\"ref\" value=\"Seminar\">&nbsp;Seminar&nbsp;&nbsp;</td></tr>\n");
      out.write("    <tr><td colspan=\"2\"><label>Through Student: If yes, Name of the Student</label>&nbsp;&nbsp;\n");
      out.write("            <input type=\"text\" name=\"cname\" ></td></tr>\n");
      out.write("    <tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("    <tr>\n");
      out.write("        \n");
      out.write("    <td>    <label>Interest Status : </label>&nbsp;\n");
      out.write("        <input type=\"radio\" name=\"stat\" value=\"Interested\">&nbsp;Interested &nbsp;&nbsp;\n");
      out.write("        <input type=\"radio\" name=\"stat\" value=\"Moderate\">&nbsp;Moderate &nbsp;&nbsp;\n");
      out.write("        <input type=\"radio\" name=\"stat\" value=\"Not_Interested\">&nbsp;Not-Interested &nbsp;&nbsp;\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("    <tr><td>\n");
      out.write("    <label>Name of Counsellor : </label>&nbsp;\n");
      out.write("    <input type=\"text\" name=\"counsellor\" required>\n");
      out.write("        </td></tr>\n");
      out.write("    <tr style=\"height: 1.2vw;\"></tr>\n");
      out.write("    <tr>\n");
      out.write("        <td colspan=\"4\" style=\"text-align: center\"><input type=\"submit\" value=\"Submit\" class=\"sub_btn\" /></td></tr>\n");
      out.write("    <input type=\"hidden\" name=\"id\" value=\"");
      out.print( id );
      out.write("\" />\n");
      out.write("    </table>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("       ");
 }       
        catch(Exception e){
            e.printStackTrace();
} 
}}
else{

      out.write("<script>alert(\"Authentication Failure !\");\n");
      out.write("                    location='login.html';</script>\n");
      out.write("                    ");

} 
      out.write("\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("\t//jQuery code goes here\n");
      out.write("        $('#contact_name').on('input', function() {\n");
      out.write("\tvar input=$(this);\n");
      out.write("\tvar is_name=input.val();\n");
      out.write("\tif(is_name){input.removeClass(\"invalid\").addClass(\"valid\");}\n");
      out.write("\telse{input.removeClass(\"valid\").addClass(\"invalid\");}\n");
      out.write("});\n");
      out.write("});\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("    input.invalid, textarea.invalid{\n");
      out.write("\tborder: 2px solid red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input.valid, textarea.valid{\n");
      out.write("\tborder: 2px solid green;\n");
      out.write("}\n");
      out.write("</style>\n");
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

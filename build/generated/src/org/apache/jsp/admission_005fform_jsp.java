package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public final class admission_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admission Form</title>\n");
      out.write("        <!--<link rel=\"stylesheet\" type=\"\" href=\"css/main.css\">-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"\" href=\"css/form_main.css\">\n");
      out.write("    </head>\n");
      out.write("    <script type=\"text/javascript\" src=\"css/state_city.js\"></script>\n");
      out.write("    <body>    \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.html", out, false);
      out.write("\n");
      out.write("        \n");

    String name="",mob1="",mob2="",email="",state="",city="",address="",pincode="",stu_dob="",ac="",g="",bg="",cate="",
    fname="",mname="",fmob1="",fmob2="",mmob1="",mmob2="",femail="",memail="",focc="",mocc="",fcmp="",mcmp="",
    fdesg="",mdesg="",scl_12="",stream_12="",board_12="",grade_12="",date="",gapr="",achiev="",batch="",edate="",
    scl_10="",stream_10="",board_10="",grade_10="",course="",ref_by="",counsellor="",eid="",aid="";
    int aform=0,e_num=0,pyr_12=0,pyr_10=0,gyr=0;
    Blob image=null,doc10=null,doc12=null,scl_leaving=null,aadhar_card=null,coc=null,affidavit=null,doc=null;
    long millis=System.currentTimeMillis();
    Date d=new Date(millis);
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
        String p=request.getParameter("edit");
        String btn="Submit";
        String sql="";
        if(p!=null){
        if(p.equalsIgnoreCase("eedit")){
            eid=request.getParameter("id1");
            if(eid!=null){
                sql="Select * from stu_enquiry where stu_enquiry_id="+eid+"";
                Statement st=c.createStatement();
                ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                name=rs.getString(2);
                address=rs.getString(3);
                state=rs.getString(4);
                city=rs.getString(5);
                pincode=rs.getString(6);
                mob1=rs.getString(7);
                email=rs.getString(8);
                fname=rs.getString(9);
                fmob1=rs.getString(10);
                femail=rs.getString(11);
                focc=rs.getString(12);
                scl_12=rs.getString(13);
                stream_12=rs.getString(14);
                board_12=rs.getString(15);
                pyr_12=Integer.parseInt(rs.getString(16));                
                grade_12=rs.getString(17);
                scl_10=rs.getString(18);
                stream_10=rs.getString(19);
                board_10=rs.getString(20);
                pyr_10=Integer.parseInt(rs.getString(21));
                grade_10=rs.getString(22);
                course=rs.getString(23);
                ref_by=rs.getString(24);
                counsellor=rs.getString(25);
                edate=rs.getDate(27).toString();
                }}}
        else {
                    aid=request.getParameter("id1");
                    btn="Save";
                    sql="Select * from stu_admission where stu_admission_id="+aid+"";
                    Statement st=c.createStatement();
                ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                aform=rs.getInt(1);
                e_num=rs.getInt(2);
                name=rs.getString(4);
                address=rs.getString(5);
                state=rs.getString(6);
                city=rs.getString(7);
                pincode=rs.getString(8);
                mob1=rs.getString(9);
                mob2=rs.getString(10);
                email=rs.getString(11);
                stu_dob=rs.getDate(12).toString();
                ac=rs.getString(13);
                g=rs.getString(14);
                bg=rs.getString(15);
                cate=rs.getString(16);
                fname=rs.getString(17);
                fmob1=rs.getString(18);
                fmob2=rs.getString(19);
                femail=rs.getString(20);
                focc=rs.getString(21);
                fcmp=rs.getString(21);
                fdesg=rs.getString(23);
                mname=rs.getString(24);
                mmob1=rs.getString(25);
                mmob2=rs.getString(26);
                memail=rs.getString(27);
                mocc=rs.getString(28);
                mcmp=rs.getString(29);
                mdesg=rs.getString(30);
                scl_12=rs.getString(31);
                stream_12=rs.getString(32);
                board_12=rs.getString(33);
                pyr_12=Integer.parseInt(rs.getString(34));                
                grade_12=rs.getString(35);
                scl_10=rs.getString(36);
                stream_10=rs.getString(37);
                board_10=rs.getString(38);
                pyr_10=Integer.parseInt(rs.getString(39));
                grade_10=rs.getString(40);
                gyr=Integer.parseInt(rs.getString(41));
                gapr=rs.getString(42);
                achiev=rs.getString(43);
                course=rs.getString(44);
                batch=rs.getString(45);
                eid=rs.getString(46);
                edate=rs.getDate(47).toString();
                counsellor=rs.getString(48);
                d=rs.getDate(49);
                ref_by=rs.getString(50);
                }
            }}
                
      out.write("\n");
      out.write("    <center><div class=\"a\">ADMISSION FORM</div></center>\n");
      out.write("        <div style=\"height:104vw;\" class=\"form_bg\"></div>\n");
      out.write("    \n");
      out.write("    <div class=\"form\">\n");
      out.write("        <form action=\"addmission_add\" method=\"post\">\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("<td style=\"text-align: center;\">Enrollment No.</td>\n");
      out.write("<td><input type=\"text\" name=\"enroll_no\" value=\"");
      out.print( e_num );
      out.write("\" class=\"border\"></td>\n");
      out.write("<td style=\"text-align: center;\">Form No.</td>\n");
      out.write("<td><input type=\"text\" name=\"form_no\" value=\"");
      out.print( aid );
      out.write("\" class=\"border\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("<tr><td colspan=\"4\" class=\"h1\">Student Details</td></tr>\n");
      out.write("<tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("<tr>\n");
      out.write("<td>Full Name<br>(As per Marksheet)</td>\n");
      out.write("<td colspan=\"2\"><input type=\"text\" name=\"name\" style=\"width:35vw;\" value=\"");
      out.print( name );
      out.write("\" required></td>\n");
      out.write("<tr>\n");
      out.write("<td>Email ID</td>\n");
      out.write("<td><input type=\"email\" name=\"email\" value=\"");
      out.print( email );
      out.write("\" required></td>\n");
      out.write("<td rowspan=\"3\">Residential Address</td>\n");
      out.write("<td rowspan=\"3\"><textarea name=\"address\" rows=\"5\" cols=\"30\">");
      out.print( address );
      out.write("</textarea></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Mobile No.(1)</td>\n");
      out.write("<td><input type=\"text\" name=\"mobile_no1\" value=\"");
      out.print( mob1 );
      out.write("\" maxlength=\"10\" minlength=\"10\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Mobile No.(2)</td>\n");
      out.write("<td><input type=\"text\" name=\"mobile_no2\"  value=\"");
      out.print( mob2 );
      out.write("\" maxlength=\"10\" minlength=\"10\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Aadhar Card No.</td>\n");
      out.write("<td><input type=\"text\" name=\"adhar_no\" value=\"");
      out.print( ac );
      out.write("\"></td>\n");
      out.write("<td>State</td>\n");
      out.write("<td>\n");
      out.write("    <!--<input type=\"text\" name=\"state\" value=\"");
      out.print( state );
      out.write("\" required>-->\n");
      out.write("    \n");
      out.write("    <select id=\"countrySelect\" name=\"state\" size=\"1\" onchange=\"makeSubmenu(this.value)\">\n");
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
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("  var objSelect = document.getElementById(\"countrySelect\");\n");
      out.write("\n");
      out.write("//Set selected\n");
      out.write("setSelectedValue(objSelect,\"");
      out.print(state);
      out.write("\" );\n");
      out.write("\n");
      out.write("//display(this.objSelect)\n");
      out.write("\n");
      out.write("function setSelectedValue(selectObj, valueToSet) {\n");
      out.write("    //alert(\"Hi\");\n");
      out.write("    for (var i = 0; i < selectObj.options.length; i++) {\n");
      out.write("        if (selectObj.options[i].text=== valueToSet) {\n");
      out.write("            selectObj.options[i].selected = true;\n");
      out.write("            return;\n");
      out.write("        }}}\n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td>Date Of Birth</td>\n");
      out.write("<td><input type=\"date\" name=\"dob\" value=\"");
      out.print( stu_dob );
      out.write("\" required></td>\n");
      out.write("<td>City</td>\n");
      out.write("<td>\n");
      out.write("    <!--<input type=\"text\" name=\"city\" value=\"");
      out.print( city );
      out.write("\" required>-->\n");
      out.write("    <select id=\"citySelect\" size=\"1\" name=\"city\" >\n");
      out.write("        <option value=\"\" disabled selected>Choose City</option>\n");
      out.write("        <option></option>\n");
      out.write("        </select>\n");
      out.write("</td>\n");
      out.write("<script>\n");
      out.write("    makeSubmenu(\"");
      out.print(state);
      out.write("\");\n");
      out.write("  var objSelect = document.getElementById(\"citySelect\");\n");
      out.write("\n");
      out.write("//Set selected\n");
      out.write("setSelectedValue(objSelect,\"");
      out.print(city);
      out.write("\" );\n");
      out.write("\n");
      out.write("//display(this.objSelect)\n");
      out.write("\n");
      out.write("function setSelectedValue(selectObj, valueToSet) {\n");
      out.write("    //alert(\"Hi\");\n");
      out.write("    for (var i = 0; i < selectObj.options.length; i++) {\n");
      out.write("        if (selectObj.options[i].text=== valueToSet) {\n");
      out.write("            selectObj.options[i].selected = true;\n");
      out.write("            return;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("  \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Gender</td>\n");
 if(g.equalsIgnoreCase("male")){ 
      out.write("\n");
      out.write("<td><input type=\"radio\" name=\"gender\" value=\"male\" checked>&nbsp;Male &nbsp;&nbsp;&nbsp;\n");
      out.write("    <input type=\"radio\" name=\"gender\" value=\"female\">&nbsp;Female</td>\n");
      out.write("    ");
 } 
else if(g.equalsIgnoreCase("female")){ 
      out.write("\n");
      out.write("<td><input type=\"radio\" name=\"gender\" value=\"male\">&nbsp;Male &nbsp;&nbsp;&nbsp;\n");
      out.write("    <input type=\"radio\" name=\"gender\" value=\"female\" checked>&nbsp;Female</td>\n");
      out.write("    ");
}
else{
      out.write("\n");
      out.write("<td><input type=\"radio\" name=\"gender\" value=\"male\">&nbsp;Male &nbsp;&nbsp;&nbsp;\n");
      out.write("    <input type=\"radio\" name=\"gender\" value=\"female\">&nbsp;Female</td>\n");
}
      out.write("\n");
      out.write("<td>Pin Code</td>\n");
      out.write("<td><input type=\"text\" name=\"pincode\" value=\"");
      out.print( pincode );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Blood Group</td>\n");
      out.write("<td><select name=\"blood_group\">\n");
      out.write("    <option id=\"bg0\">Select</option>\n");
      out.write("    <option id=\"bg1\" value=\"A+\">A+</option>\n");
      out.write("    <option id=\"bg2\" value=\"A-\">A-</option>\n");
      out.write("    <option id=\"bg3\" value=\"B+\">B+</option>\n");
      out.write("    <option id=\"bg4\" value=\"B-\">B-</option>\n");
      out.write("    <option id=\"bg5\" value=\"AB+\">AB+</option>\n");
      out.write("    <option id=\"bg6\" value=\"AB-\">AB-</option>\n");
      out.write("    <option id=\"bg7\" value=\"O+\">O+</option>\n");
      out.write("    <option id=\"bg8\" value=\"O-\">O-</option>\n");
   if(bg!=null){
        if(bg.equalsIgnoreCase("a+")){ 
      out.write("\n");
      out.write("    <script> document.getElementById('bg1').selected=true; </script>\n");
    }
else if(bg.equalsIgnoreCase("a-")){ 
      out.write("\n");
      out.write("    <script> document.getElementById('bg2').selected=true; </script>\n");
    }
else if(bg.equalsIgnoreCase("b+")){ 
      out.write("\n");
      out.write("    <script> document.getElementById('bg3').selected=true; </script>\n");
    }
else if(bg.equalsIgnoreCase("b-")){ 
      out.write("\n");
      out.write("    <script> document.getElementById('bg4').selected=true; </script>\n");
    }
else if(bg.equalsIgnoreCase("ab+")){ 
      out.write("\n");
      out.write("    <script> document.getElementById('bg5').selected=true; </script>\n");
    }
else if(bg.equalsIgnoreCase("ab-")){ 
      out.write("\n");
      out.write("    <script> document.getElementById('bg6').selected=true; </script>\n");
    }
else if(bg.equalsIgnoreCase("o+")){ 
      out.write("\n");
      out.write("    <script> document.getElementById('bg7').selected=true; </script>\n");
    }
else if(bg.equalsIgnoreCase("o-")){ 
      out.write("\n");
      out.write("    <script> document.getElementById('bg8').selected=true; </script>\n");
    }
else{ 
      out.write("\n");
      out.write("    <script> document.getElementById('bg0').selected=true; </script>\n");
 } } 
      out.write("\n");
      out.write("    </select></td>\n");
      out.write("<td>Category</td>\n");
      out.write("<td>\n");
      out.write("    <input list=\"category\" placeholder=\"Select\" value=\"");
      out.print(cate);
      out.write("\" name=\"category\" class=\"list\">\n");
      out.write("    <datalist name=\"category\" id=\"category\">\n");
      out.write("    <option id=\"c1\" value=\"SC\">SC</option>\n");
      out.write("    <option id=\"c2\" value=\"ST\">ST</option>\n");
      out.write("    <option id=\"c3\" value=\"OBC\">OBC</option>\n");
      out.write("    <option id=\"c4\" value=\"General\">General</option>\n");
      out.write("    <option id=\"c5\" value=\"Other\">Other</option>\n");
      out.write("    ");
   if(cate!=null){
        if(cate.equalsIgnoreCase("sc")){ 
      out.write("\n");
      out.write("    <script> document.getElementById('c1').selected=true; </script>\n");
    }
else if(cate.equalsIgnoreCase("st")){ 
      out.write("\n");
      out.write("    <script> document.getElementById('c2').selected=true; </script>\n");
    }
else if(cate.equalsIgnoreCase("obc")){ 
      out.write("\n");
      out.write("    <script> document.getElementById('c3').selected=true; </script>\n");
    }
else if(cate.equalsIgnoreCase("general")){ 
      out.write("\n");
      out.write("    <script> document.getElementById('c4').selected=true; </script>\n");
    }
else if(cate.equalsIgnoreCase("other")){ 
      out.write("\n");
      out.write("    <script> document.getElementById('c5').selected=true; </script>\n");
    }
else{ 
      out.write("\n");
      out.write("    <script> document.getElementById('c0').selected=true; </script>\n");
  }}
      out.write("\n");
      out.write("    </datalist></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("<tr><td colspan=\"4\" class=\"h1\">Parent Details</td></tr><tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("<tr>\n");
      out.write("<td>Father Name</td>\n");
      out.write("<td><input type=\"text\" name=\"fname\" value=\"");
      out.print( fname );
      out.write("\"></td>\n");
      out.write("<td>Contact No.(1)</td>\n");
      out.write("<td><input type=\"text\" minlength=\"10\" maxlength=\"10\" name=\"father_mob1\" value=\"");
      out.print( fmob1 );
      out.write("\" required>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Email ID</td>\n");
      out.write("<td><input type=\"email\" name=\"father_email\" value=\"");
      out.print( femail );
      out.write("\" required></td>\n");
      out.write("<td>Contact No.(2)</td>\n");
      out.write("<td><input type=\"text\" minlength=\"10\" maxlength=\"10\" name=\"father_mob2\" value=\"");
      out.print( fmob2 );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Occupation</td>\n");
      out.write("<td colspan=\"3\">\n");
      out.write("<input type=\"checkbox\" name=\"f_occ\" id=\"f1\" value=\"business\"> Business &nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"checkbox\" name=\"f_occ\"  id=\"f2\"value=\"salaried\"> Salaried &nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"checkbox\" name=\"f_occ\" id=\"f3\" value=\"govt_emp\"> Govt. Employed &nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"checkbox\" name=\"f_occ\" id=\"f4\" value=\"self_emp\"> Self Employed &nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"checkbox\" name=\"f_occ\" id=\"f5\" value=\"others\"> Others &nbsp;&nbsp;&nbsp;\n");
 if(focc!=null){
        if(focc.equalsIgnoreCase("business")){ 
      out.write("\n");
      out.write("    <script>        document.getElementById('f1').checked=true;    </script>\n");
      out.write("    ");
 } 
if(focc.equalsIgnoreCase("salaried")){ 
      out.write("\n");
      out.write("<script>        document.getElementById('f2').checked=true;    </script>\n");
      out.write("    ");
 } 
if(focc.equalsIgnoreCase("govt_emp")){ 
      out.write("\n");
      out.write("<script>        document.getElementById('f3').checked=true;    </script>\n");
      out.write("    ");
 } 
if(focc.equalsIgnoreCase("self_emp")){ 
      out.write("\n");
      out.write("<script>        document.getElementById('f4').checked=true;     </script>\n");
      out.write("    ");
 } 
if(focc.equalsIgnoreCase("others")){ 
      out.write("\n");
      out.write("<script>        document.getElementById('f5').checked=true;      </script>");
 } }
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Company Name</td>\n");
      out.write("<td><input type=\"text\" name=\"f_company\" value=\"");
      out.print( fcmp );
      out.write("\"></td>\n");
      out.write("<td>Designation</td>\n");
      out.write("<td><input type=\"text\" name=\"f_designation\" value=\"");
      out.print( fdesg );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td colspan=\"4\"><hr style=\"color:black;\"></td></tr>\n");
      out.write("<tr>\n");
      out.write("<td>Mother Name</td>\n");
      out.write("<td><input type=\"text\" name=\"mother_name\" value=\"");
      out.print( mname );
      out.write("\"></td>\n");
      out.write("<td>Contact No.(1)</td>\n");
      out.write("<td><input type=\"text\" name=\"mother_mob1\"  value=\"");
      out.print( mmob1 );
      out.write("\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Email ID</td>\n");
      out.write("<td><input type=\"email\" name=\"m_email\" value=\"");
      out.print( memail );
      out.write("\"></td>\n");
      out.write("<td>Contact No.(2)</td>\n");
      out.write("<td><input type=\"text\" name=\"mother_mob2\" value=\"");
      out.print( mmob2 );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Occupation</td>\n");
      out.write("<td colspan=\"3\">\n");
      out.write("<input type=\"checkbox\" name=\"m_occ\" id=\"m1\" value=\"housewife\"> House Wife &nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"checkbox\" name=\"m_occ\" id=\"m2\" value=\"business\"> Business &nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"checkbox\" name=\"m_occ\" id=\"m3\" value=\"salaried\"> Salaried &nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"checkbox\" name=\"m_occ\" id=\"m4\" value=\"govt_emp\"> Govt. Employed &nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"checkbox\" name=\"m_occ\" id=\"m5\" value=\"self_emp\"> Self Employed &nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"checkbox\" name=\"m_occ\" id=\"m6\" value=\"others\"> Others &nbsp;&nbsp;&nbsp;\n");
 if(mocc!=null){
     if(mocc.equalsIgnoreCase("housewife")){ 
      out.write("\n");
      out.write("    <script>        document.getElementById('m1').checked=true;    </script>\n");
      out.write("    ");
 }
        if(mocc.equalsIgnoreCase("business")){ 
      out.write("\n");
      out.write("    <script>        document.getElementById('m2').checked=true;    </script>\n");
      out.write("    ");
 } 
if(mocc.equalsIgnoreCase("salaried")){ 
      out.write("\n");
      out.write("<script>        document.getElementById('m3').checked=true;    </script>\n");
      out.write("    ");
 } 
if(mocc.equalsIgnoreCase("govt_emp")){ 
      out.write("\n");
      out.write("<script>        document.getElementById('m4').checked=true;    </script>\n");
      out.write("    ");
 } 
if(mocc.equalsIgnoreCase("self_emp")){ 
      out.write("\n");
      out.write("<script>        document.getElementById('m5').checked=true;     </script>\n");
      out.write("    ");
 } 
if(mocc.equalsIgnoreCase("others")){ 
      out.write("\n");
      out.write("<script>        document.getElementById('m6').checked=true;      </script>");
 } }
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Company Name</td>\n");
      out.write("<td><input type=\"text\" name=\"m_company\" value=\"");
      out.print( mcmp );
      out.write("\"></td>\n");
      out.write("<td>Designation</td>\n");
      out.write("<td><input type=\"text\" name=\"m_designation\" value=\"");
      out.print( mdesg );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<table>\n");
      out.write("    <tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("<tr><td colspan=\"6\" class=\"h1\">Past Academic Record</td></tr>\n");
      out.write("<tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("<tr align=\"center\">\n");
      out.write("<td>Qualification</td>\n");
      out.write("<td>School/College Name</td>\n");
      out.write("<td>Stream</td>\n");
      out.write("<td>Board</td>\n");
      out.write("<td>Passing Year</td>\n");
      out.write("<td>Grade%</td>\n");
      out.write("</tr>\n");
      out.write("<tr align=\"center\">\n");
      out.write("<td>12<sup>th</sup></td>\n");
      out.write("<td><input type=\"text\" name=\"scl_12\" value=\"");
      out.print( scl_12 );
      out.write("\" style=\"width:13vw;\" required></td>\n");
      out.write("<td>\n");
      out.write("    <input list=\"s120\" placeholder=\"Select\" value=\"");
      out.print( stream_12 );
      out.write("\" name=\"stream_12\" style=\"width:8vw;\" class=\"list\">\n");
      out.write("    <datalist name=\"stream_12\" style=\"width:8vw;\" id=\"s120\">\n");
      out.write("    <option value=\"science\" id=\"s121\" >\n");
      out.write("    <option value=\"commerce\" id=\"s122\" >\n");
      out.write("    <option value=\"arts\" id=\"s123\">\n");
  if(stream_12.equalsIgnoreCase("science")){ 
      out.write("\n");
      out.write("<script> document.getElementById(\"s121\").selected=true; </script>\n");
 } 
    else if(stream_12.equalsIgnoreCase("commerce")){
      out.write("\n");
      out.write("<script> document.getElementById(\"s122\").selected=true; </script>\n");
 }
    else if(stream_12.equalsIgnoreCase("arts")){
      out.write("\n");
      out.write("<script> document.getElementById(\"s123\").selected=true; </script>    \n");
 }
    else{ 
      out.write("\n");
      out.write("<script> document.getElementById(\"s120\").selected=true; </script>    \n");
 } 
      out.write(" \n");
      out.write("</datalist>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("    <input list=\"b120\" placeholder=\"Select\" value=\"");
      out.print( board_12 );
      out.write("\" name=\"board_12\" style=\"width:8vw;\" class=\"list\">\n");
      out.write("    <datalist name=\"board_12\" style=\"width:8vw;\" id=\"b120\">\n");
      out.write("    <option value=\"CBSE\" id=\"b121\">\n");
      out.write("    <option value=\"ICSE\" id=\"b122\">\n");
      out.write("    <option value=\"GSHEB\" id=\"b123\">\n");
      out.write("    <option value=\"other\" id=\"b124\">\n");
  if(board_12.equalsIgnoreCase("cbse")){ 
      out.write("\n");
      out.write("<script> document.getElementById(\"b121\").selected=true; </script>    \n");
 }
    else if(board_12.equalsIgnoreCase("other")){
      out.write("\n");
      out.write("<script> document.getElementById(\"b124\").selected=true; </script>    \n");
 }
    else if(board_12.equalsIgnoreCase("icse")){
      out.write("\n");
      out.write("   <script> document.getElementById(\"b122\").selected=true; </script>    \n");
 }
    else if(board_12.equalsIgnoreCase("GSHEB")){
      out.write("\n");
      out.write("   <script> document.getElementById(\"b123\").selected=true; </script>    \n");
}
    else{
      out.write("\n");
      out.write("   <script> document.getElementById(\"b120\").selected=true; </script>    \n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    </datalist></td>\n");
      out.write("\n");
      out.write("    <td>\n");
      out.write("            <input list=\"pyear_12\" value=\"");
      out.print( pyr_12 );
      out.write("\" placeholder=\"Select\" name=\"pyear_12\" style=\"width:8vw;\" class=\"list\">\n");
      out.write("            <datalist name=\"pyear_12\" required id=\"pyear_12\">\n");
      out.write("                            <option value=\"2013\">\n");
      out.write("                            <option value=\"2014\">\n");
      out.write("                            <option value=\"2015\">\n");
      out.write("                            <option value=\"2016\">\n");
      out.write("                            <option value=\"2017\">\n");
      out.write("                            <option value=\"2018\">\n");
      out.write("                            <option value=\"2019\">\n");
      out.write("            </datalist></td>    \n");
      out.write("\n");
      out.write("<td><input type=\"text\" name=\"grade_12\" value=\"");
      out.print( grade_12 );
      out.write("\" style=\"width:8vw;\" required></td>\n");
      out.write("</tr>\n");
      out.write("<tr align=\"center\">\n");
      out.write("<td>10<sup>th</sup></td>\n");
      out.write("<td><input type=\"text\" name=\"scl_10\" style=\"width:13vw;\" value=\"");
      out.print( scl_10 );
      out.write("\"></td>\n");
      out.write("<td>\n");
      out.write("    <input list=\"s100\" placeholder=\"Select\" value=\"");
      out.print( stream_10 );
      out.write("\" name=\"stream_10\" style=\"width:8vw;\" class=\"list\">\n");
      out.write("    <datalist name=\"stream_10\" style=\"width:8vw;\" id=\"s100\">\n");
      out.write("    <option value=\"science\" id=\"s101\" >\n");
      out.write("    <option value=\"commerce\" id=\"s102\" >\n");
      out.write("    <option value=\"arts\" id=\"s103\">\n");
  if(stream_10.equalsIgnoreCase("science")){ 
      out.write("\n");
      out.write("<script> document.getElementById(\"s101\").selected=true; </script>\n");
 } 
    else if(stream_10.equalsIgnoreCase("commerce")){
      out.write("\n");
      out.write("<script> document.getElementById(\"s102\").selected=true; </script>\n");
 }
    else if(stream_10.equalsIgnoreCase("arts")){
      out.write("\n");
      out.write("<script> document.getElementById(\"s103\").selected=true; </script>    \n");
 }
    else{ 
      out.write("\n");
      out.write("<script> document.getElementById(\"s100\").selected=true; </script>    \n");
 } 
      out.write(" \n");
      out.write("    </datalist></td>\n");
      out.write("<td>\n");
      out.write("    <input list=\"b100\" placeholder=\"Select\" value=\"");
      out.print(board_10);
      out.write("\" name=\"board_10\" style=\"width:8vw;\" class=\"list\">\n");
      out.write("    <datalist name=\"board_10\" style=\"width:8vw;\" id=\"b100\">\n");
      out.write("    <option value=\"CBSE\" id=\"b101\">\n");
      out.write("    <option value=\"ICSE\" id=\"b102\">\n");
      out.write("    <option value=\"GSHEB\" id=\"b103\">\n");
      out.write("    <option value=\"Other\" id=\"b104\">\n");
  if(board_10.equalsIgnoreCase("cbse")){ 
      out.write("\n");
      out.write("<script> document.getElementById(\"b101\").selected=true; </script>    \n");
 }
    else if(board_10.equalsIgnoreCase("other")){
      out.write("\n");
      out.write("<script> document.getElementById(\"b104\").selected=true; </script>    \n");
 }
    else if(board_10.equalsIgnoreCase("icse")){
      out.write("\n");
      out.write("   <script> document.getElementById(\"b102\").selected=true; </script>    \n");
 }
    else if(board_10.equalsIgnoreCase("GSHEB")){
      out.write("\n");
      out.write("   <script> document.getElementById(\"b103\").selected=true; </script>    \n");
}
    else{
      out.write("\n");
      out.write("   <script> document.getElementById(\"s120\").selected=true; </script>    \n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("    </datalist></td>\n");
      out.write("\n");
      out.write("    <td>\n");
      out.write("        <input list=\"pyear_10\" placeholder=\"Select\" value=\"");
      out.print(pyr_10);
      out.write("\" name=\"pyear_10\" style=\"width:8vw;\" class=\"list\">\n");
      out.write("        <datalist name=\"pyear_10\" style=\"width:2vw;\" required id=\"pyear_10\">\n");
      out.write("                        <option value=\"2013\">\n");
      out.write("                        <option value=\"2014\">\n");
      out.write("                        <option value=\"2015\">\n");
      out.write("                        <option value=\"2016\">\n");
      out.write("                        <option value=\"2017\">\n");
      out.write("                        <option value=\"2018\">\n");
      out.write("                        <option value=\"2019\">\n");
      out.write("        </datalist></td>\n");
      out.write("                    \n");
      out.write("<td><input type=\"text\" name=\"grade_10\" style=\"width:8vw;\" value=\"");
      out.print( grade_10 );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr align=\"center\">\n");
      out.write("<td>Others</td>\n");
      out.write("<td><input type=\"text\" name=\"scl_other\" style=\"width:13vw;\" ></td>\n");
      out.write("<td><input type=\"text\" name=\"stream_other\" style=\"width:8vw;\"></td>\n");
      out.write("<td><input type=\"text\" name=\"board_other\"  style=\"width:8vw;\"></td>\n");
      out.write("<td><input type=\"text\" name=\"pyear_other\" style=\"width:8vw;\"></td>\n");
      out.write("<td><input type=\"text\" name=\"grade_other\" style=\"width:8vw;\"></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td colspan=\"6\"><hr></td></tr>\n");
      out.write("<tr> \n");
      out.write("<td>Any Gap </td>\n");
      out.write("<td><input type=\"radio\" name=\"gap\" value=\"yes\" id=\"gapy\"> YES &nbsp;&nbsp;\n");
      out.write("<input type=\"radio\" name=\"gap\" value=\"no\" id=\"gapn\"> NO</td>\n");
  if(gyr!=0){ 
      out.write("\n");
      out.write("<script> document.getElementById(\"gapy\").checked=true; </script>\n");
 }
else{ 
      out.write("\n");
      out.write("<script> document.getElementById(\"gapn\").checked=true; </script>\n");
 } 
      out.write("\n");
      out.write("<td colspan=\"2\" align='center'>No. of Years  &nbsp;&nbsp;\n");
      out.write("<input type=\"number\" value=\"0\" name=\"gap_yr\" value=\"");
      out.print( gyr );
      out.write("\"></td>\n");
      out.write("<td colspan=\"2\" align=\"center\">Reason &nbsp;&nbsp;\n");
      out.write("<input type=\"text\" name=\"reason\" value=\"");
      out.print( gapr );
      out.write("\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"6\" >Awards & Achievements(if any) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<input type=\"text\" name=\"achievements\" style=\"width:40vw;\" value=\"");
      out.print( achiev );
      out.write("\" ></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<table><tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("<tr><td colspan=\"4\"class=\"h1\">Course </td></tr><tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("<tr>\n");
      out.write("<td>Select Course </td>\n");
      out.write("<td colspan=\"2\">\n");
      out.write("<select name=\"course\" style=\"width:30vw\">\n");
      out.write("    <option id=\"course0\">SELECT</option>\n");
      out.write("    <option value=\"IT-IMS\" id=\"course1\">IT-IMS & CYBER SECURITY </option>\n");
      out.write("    <option value=\"SOFTWARE\" id=\"course2\">SOFTWARE DEVELOPMENT(WEB & MOBILE)</option>\n");
      out.write("    <option value=\"ANIMATION\" id=\"course3\">ANIMATION & VFX</option>\n");
      out.write("    <option value=\"DIGITAL-DESIGN\" id=\"course4\">DIGITAL DESIGN</option>\n");
  if(course.equalsIgnoreCase("IT-IMS")){ 
      out.write("\n");
      out.write("   <script> document.getElementById(\"course1\").selected=true; </script> \n");
      out.write("    ");
}
    else if(course.equalsIgnoreCase("SOFTWARE")){
      out.write("\n");
      out.write("       <script> document.getElementById(\"course2\").selected=true; </script> \n");
      out.write("    ");
 }
    else if(course.equalsIgnoreCase("ANIMATION")){
      out.write("\n");
      out.write("      <script> document.getElementById(\"course3\").selected=true; </script> \n");
      out.write("    ");
 }
    else if(course.equalsIgnoreCase("DIGITAL-DESIGN")){
      out.write("\n");
      out.write("       <script> document.getElementById(\"course4\").selected=true; </script> \n");
      out.write("    ");
 }
    else{
      out.write("\n");
      out.write("       <script> document.getElementById(\"course0\").selected=true; </script> \n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("</select>\n");
      out.write("</td>\n");
      out.write("<td>Batch &nbsp;<select name=\"batch\">\n");
      out.write("        <option id=\"batch0\">Select</option>\n");
      out.write("        <option id=\"batch1\" value=\"morning\">Morning</option>\n");
      out.write("        <option id=\"batch2\" value=\"noon\">Noon</option>\n");
  if(batch!=null){
    if(batch.equalsIgnoreCase("morning")){ 
      out.write("\n");
      out.write("       <script> document.getElementById(\"batch1\").selected=true; </script> \n");
  }
else if(batch.equalsIgnoreCase("noon")){ 
      out.write("\n");
      out.write("       <script> document.getElementById(\"batch2\").selected=true; </script> \n");
  }
else {
      out.write("\n");
      out.write("       <script> document.getElementById(\"batch0\").selected=true; </script> \n");
  }} 
      out.write("\n");
      out.write("</select></td>\n");
      out.write("</tr><tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("<tr><td colspan=\"4\"class=\"h1\">Enquiry Details</td></tr><tr style=\"height: 0.8vw;\"></tr>\n");
      out.write("<tr>\n");
      out.write("<td>Enquiry Form No.</td>\n");
      out.write("<td><input type='text' name=\"enq_form_no\" value=\"");
      out.print( eid );
      out.write("\"></td>\n");
      out.write("<td>Enquiry Date</td>\n");
      out.write("<td>\n");
      out.write("    <input type=\"date\" name=\"enq_date\" value=\"");
      out.print( edate );
      out.write("\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Counselor Name</td>\n");
      out.write("<td><input type='text' name=\"counsellor_name\" value=\"");
      out.print( counsellor );
      out.write("\"></td>\n");
      out.write("<td>Admission Date</td>\n");
      out.write("<td><input type=\"date\" name=\"admission_date\" value=\"");
      out.print( d );
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("<table>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("    <td colspan=\"4\" align=\"center\"><br><br><input type=\"submit\" name=\"submit\" value=\"");
      out.print( btn );
      out.write("\" class=\"sub_btn\"\n");
      out.write("    style=\"\"/></td>\n");
      out.write("</tr>\n");
      out.write("<input type=\"hidden\" name=\"id\" value=\"");
      out.print( aid );
      out.write("\" />\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
 }       
catch(Exception e){
          e.printStackTrace();
}        
      out.write("\n");
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

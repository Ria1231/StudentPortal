<%@page import="java.sql.Blob"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admission Form</title>
        <!--<link rel="stylesheet" type="" href="css/main.css">-->
        <link rel="stylesheet" type="" href="css/form_main.css">
        
    </head>
    <script type="text/javascript" src="js/state_city.js"></script>
    <body> 
        <%        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       %><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <% }
else{%>
        <jsp:include page="base.html"/>
        
<%
    String name="",mob1="",mob2="",email="",state="",city="",address="",pincode="",stu_dob="",ac="",g="",bg="",cate="",
    fname="",mname="",fmob1="",fmob2="",mmob1="",mmob2="",femail="",memail="",focc="",mocc="",fcmp="",mcmp="",
    fdesg="",mdesg="",scl_12="",stream_12="",board_12="",grade_12="",date="",gapr="",achiev="",batch="",edate="",
    scl_10="",stream_10="",board_10="",grade_10="",course="",ref_by="",counsellor="",aid="";
    int aform=0,e_num=0,pyr_12=0,pyr_10=0,gyr=0,eid=0;
    Blob image=null,doc10=null,doc12=null,scl_leaving=null,aadhar_card=null,coc=null,affidavit=null,doc=null;
    long millis=System.currentTimeMillis();
    Date d=new Date(millis);
    Date ed=new Date(millis);
    edate=ed.toString();
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
        String p=request.getParameter("edit");
        String btn="Submit";
        String sql="";
        if(p!=null){
        if(p.equalsIgnoreCase("eedit")){
            eid=Integer.parseInt(request.getParameter("id1"));
            String eid_1=String.valueOf(eid);
            if(eid_1!=null){
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
                eid=Integer.parseInt(rs.getString(46));
                edate=rs.getDate(47).toString();
                counsellor=rs.getString(48);
                d=rs.getDate(49);
                ref_by=rs.getString(50);
                }
            }}
                %>
    <center><div class="a">ADMISSION FORM</div></center>
        <div style="height:104vw;" class="form_bg"></div>
    
    <div class="form">
        <form action="addmission_add" method="post">
<table>
<tr>
<td style="text-align: center;">Enrollment No.</td>
<td><input type="text" name="enroll_no" value="<%= e_num %>" class="border"></td>
<td style="text-align: center;">Form No.</td>
<td><input type="text" name="form_no" value="<%= aform %>" class="border"></td>
</tr>
<tr style="height: 0.8vw;"></tr>
<tr><td colspan="4" class="h1">Student Details</td></tr>
<tr style="height: 0.8vw;"></tr>
<tr>
<td>Full Name<br>(As per Marksheet)</td>
<td colspan="2"><input type="text" name="name" style="width:35vw;" value="<%= name %>" required></td>
<tr>
<td>Email ID</td>
<td><input type="email" name="email" value="<%= email %>" required></td>
<td rowspan="3">Residential Address</td>
<td rowspan="3"><textarea name="address" rows="5" cols="30"><%= address %></textarea></td>
</tr>
<tr>
<td>Mobile No.(1)</td>
<td><input type="text" name="mobile_no1" value="<%= mob1 %>" maxlength="10" minlength="10" required></td>
</tr>
<tr>
<td>Mobile No.(2)</td>
<td><input type="text" name="mobile_no2"  value="<%= mob2 %>" maxlength="10" minlength="10"></td>
</tr>
<tr>
<td>Aadhar Card No.</td>
<td><input type="text" name="adhar_no" value="<%= ac %>"></td>
<td>State</td>
<td>
    <!--<input type="text" name="state" value="<%= state %>" required>-->
    
    <select id="countrySelect" name="state" onchange="makeSubmenu(this.value)">
        <option value="" disabled selected>Choose State</option>
        <option value="AndhraPradesh">Andhra Pradesh</option>
<option value="Arunachal_Pradesh">Arunachal Pradesh</option>
<option value="Assam">Assam</option>
<option value="Bihar">Bihar</option>
<option value="Chandigarh">Chandigarh</option>
<option value="Chhattisgarh">Chhattisgarh</option>
<option value="Dadra_and_Nagar_Haveli">Dadar and Nagar Haveli</option>
<option value="Daman_and_Diu">Daman and Diu</option>
<option value="Delhi">Delhi</option>
<option value="Pondicherry">Pondicherry</option>
<option value="Goa">Goa</option>
<option value="Gujarat">Gujarat</option>
<option value="Haryana">Haryana</option>
<option value="Himachal_Pradesh">Himachal Pradesh</option>
<option value="Jammu_and_Kashmir">Jammu and Kashmir</option>
<option value="Jharkhand">Jharkhand</option>
<option value="Karnataka">Karnataka</option>
<option value="Kerala">Kerala</option>
<option value="Madhya_Pradesh">Madhya Pradesh</option>
<option value="Maharashtra">Maharashtra</option>
<option value="Manipur">Manipur</option>
<option value="Meghalaya">Meghalaya</option>
<option value="Mizoram">Mizoram</option>
<option value="Nagaland">Nagaland</option>
<option value="Odisha">Odisha</option>
<option value="Punjab">Punjab</option>
<option value="Rajasthan">Rajasthan</option>
<option value="Sikkim">Sikkim</option>
<option value="Tamil Nadu">Tamil Nadu</option>
<option value="Telangana">Telangana</option>
<option value="Tripura">Tripura</option>
<option value="Uttar_Pradesh">Uttar Pradesh</option>
<option value="Uttarakhand">Uttarakhand</option>
<option value="West_Bengal">West Bengal</option>
</select>
</td>
</tr>

<script>
  var objSelect = document.getElementById("countrySelect");

//Set selected
setSelectedValue(objSelect,"<%=state%>" );

//display(this.objSelect)

function setSelectedValue(selectObj, valueToSet) {
    //alert("Hi");
    for (var i = 0; i < selectObj.options.length; i++) {
        if (selectObj.options[i].text=== valueToSet) {
            selectObj.options[i].selected = true;
            return;
        }}}
    
</script>

<tr>
<td>Date Of Birth</td>
<td><input type="date" name="dob" value="<%= stu_dob %>" required></td>
<td>City</td>
<td>
    <!--<input type="text" name="city" value="<%= city %>" required>-->
    <select id="citySelect" size="1" name="city" >
        <option value="" disabled selected>Choose City</option>
        <option></option>
        </select>
</td>
<script>
    makeSubmenu("<%=state%>");
  var objSelect = document.getElementById("citySelect");

//Set selected
setSelectedValue(objSelect,"<%=city%>" );

//display(this.objSelect)

function setSelectedValue(selectObj, valueToSet) {
    //alert("Hi");
    for (var i = 0; i < selectObj.options.length; i++) {
        if (selectObj.options[i].text=== valueToSet) {
            selectObj.options[i].selected = true;
            return;
        }
    }
    
    
}
  
    
</script>
</tr>
<tr>
<td>Gender</td>
<% if(g.equalsIgnoreCase("male")){ %>
<td><input type="radio" name="gender" value="male" checked>&nbsp;Male &nbsp;&nbsp;&nbsp;
    <input type="radio" name="gender" value="female">&nbsp;Female</td>
    <% } 
else if(g.equalsIgnoreCase("female")){ %>
<td><input type="radio" name="gender" value="male">&nbsp;Male &nbsp;&nbsp;&nbsp;
    <input type="radio" name="gender" value="female" checked>&nbsp;Female</td>
    <%}
else{%>
<td><input type="radio" name="gender" value="male">&nbsp;Male &nbsp;&nbsp;&nbsp;
    <input type="radio" name="gender" value="female">&nbsp;Female</td>
<%}%>
<td>Pin Code</td>
<td><input type="text" name="pincode" value="<%= pincode %>"></td>
</tr>
<tr>
<td>Blood Group</td>
<td><select name="blood_group">
    <option id="bg0">Select</option>
    <option id="bg1" value="A+">A+</option>
    <option id="bg2" value="A-">A-</option>
    <option id="bg3" value="B+">B+</option>
    <option id="bg4" value="B-">B-</option>
    <option id="bg5" value="AB+">AB+</option>
    <option id="bg6" value="AB-">AB-</option>
    <option id="bg7" value="O+">O+</option>
    <option id="bg8" value="O-">O-</option>
<%   if(bg!=null){
        if(bg.equalsIgnoreCase("a+")){ %>
    <script> document.getElementById('bg1').selected=true; </script>
<%    }
else if(bg.equalsIgnoreCase("a-")){ %>
    <script> document.getElementById('bg2').selected=true; </script>
<%    }
else if(bg.equalsIgnoreCase("b+")){ %>
    <script> document.getElementById('bg3').selected=true; </script>
<%    }
else if(bg.equalsIgnoreCase("b-")){ %>
    <script> document.getElementById('bg4').selected=true; </script>
<%    }
else if(bg.equalsIgnoreCase("ab+")){ %>
    <script> document.getElementById('bg5').selected=true; </script>
<%    }
else if(bg.equalsIgnoreCase("ab-")){ %>
    <script> document.getElementById('bg6').selected=true; </script>
<%    }
else if(bg.equalsIgnoreCase("o+")){ %>
    <script> document.getElementById('bg7').selected=true; </script>
<%    }
else if(bg.equalsIgnoreCase("o-")){ %>
    <script> document.getElementById('bg8').selected=true; </script>
<%    }
else{ %>
    <script> document.getElementById('bg0').selected=true; </script>
<% } } %>
    </select></td>
<td>Category</td>
<td>
    <input list="category" placeholder="Select" value="<%=cate%>" name="category" class="list">
    <datalist name="category" id="category">
    <option id="c1" value="SC">SC</option>
    <option id="c2" value="ST">ST</option>
    <option id="c3" value="OBC">OBC</option>
    <option id="c4" value="General">General</option>
    <option id="c5" value="Other">Other</option>
    <%   if(cate!=null){
        if(cate.equalsIgnoreCase("sc")){ %>
    <script> document.getElementById('c1').selected=true; </script>
<%    }
else if(cate.equalsIgnoreCase("st")){ %>
    <script> document.getElementById('c2').selected=true; </script>
<%    }
else if(cate.equalsIgnoreCase("obc")){ %>
    <script> document.getElementById('c3').selected=true; </script>
<%    }
else if(cate.equalsIgnoreCase("general")){ %>
    <script> document.getElementById('c4').selected=true; </script>
<%    }
else if(cate.equalsIgnoreCase("other")){ %>
    <script> document.getElementById('c5').selected=true; </script>
<%    }
else{ %>
    <script> document.getElementById('c0').selected=true; </script>
<%  }}%>
    </datalist></td>
</tr>

<tr style="height: 0.8vw;"></tr>
<tr><td colspan="4" class="h1">Parent Details</td></tr><tr style="height: 0.8vw;"></tr>
<tr>
<td>Father Name</td>
<td><input type="text" name="fname" value="<%= fname %>"></td>
<td>Contact No.(1)</td>
<td><input type="text" minlength="10" maxlength="10" name="father_mob1" value="<%= fmob1 %>" required>
</tr>
<tr>
<td>Email ID</td>
<td><input type="email" name="father_email" value="<%= femail %>" required></td>
<td>Contact No.(2)</td>
<td><input type="text" minlength="10" maxlength="10" name="father_mob2" value="<%= fmob2 %>"></td>
</tr>
<tr>
<td>Occupation</td>
<td colspan="3">
<input type="checkbox" name="f_occ" id="f1" value="business"> Business &nbsp;&nbsp;&nbsp;
<input type="checkbox" name="f_occ"  id="f2"value="salaried"> Salaried &nbsp;&nbsp;&nbsp;
<input type="checkbox" name="f_occ" id="f3" value="govt_emp"> Govt. Employed &nbsp;&nbsp;&nbsp;
<input type="checkbox" name="f_occ" id="f4" value="self_emp"> Self Employed &nbsp;&nbsp;&nbsp;
<input type="checkbox" name="f_occ" id="f5" value="others"> Others &nbsp;&nbsp;&nbsp;
<% if(focc!=null){
        if(focc.equalsIgnoreCase("business")){ %>
    <script>        document.getElementById('f1').checked=true;    </script>
    <% } 
if(focc.equalsIgnoreCase("salaried")){ %>
<script>        document.getElementById('f2').checked=true;    </script>
    <% } 
if(focc.equalsIgnoreCase("govt_emp")){ %>
<script>        document.getElementById('f3').checked=true;    </script>
    <% } 
if(focc.equalsIgnoreCase("self_emp")){ %>
<script>        document.getElementById('f4').checked=true;     </script>
    <% } 
if(focc.equalsIgnoreCase("others")){ %>
<script>        document.getElementById('f5').checked=true;      </script><% } }%>
</td>
</tr>
<tr>
<td>Company Name</td>
<td><input type="text" name="f_company" value="<%= fcmp %>"></td>
<td>Designation</td>
<td><input type="text" name="f_designation" value="<%= fdesg %>"></td>
</tr>
<tr><td colspan="4"><hr style="color:black;"></td></tr>
<tr>
<td>Mother Name</td>
<td><input type="text" name="mother_name" value="<%= mname %>"></td>
<td>Contact No.(1)</td>
<td><input type="text" name="mother_mob1" maxlength="10" value="<%= mmob1 %>" required></td>
</tr>
<tr>
<td>Email ID</td>
<td><input type="email" name="m_email" value="<%= memail %>"></td>
<td>Contact No.(2)</td>
<td><input type="text" name="mother_mob2" maxlength="10" value="<%= mmob2 %>"></td>
</tr>
<tr>
<td>Occupation</td>
<td colspan="3">
<input type="checkbox" name="m_occ" id="m1" value="housewife"> House Wife &nbsp;&nbsp;&nbsp;
<input type="checkbox" name="m_occ" id="m2" value="business"> Business &nbsp;&nbsp;&nbsp;
<input type="checkbox" name="m_occ" id="m3" value="salaried"> Salaried &nbsp;&nbsp;&nbsp;
<input type="checkbox" name="m_occ" id="m4" value="govt_emp"> Govt. Employed &nbsp;&nbsp;&nbsp;
<input type="checkbox" name="m_occ" id="m5" value="self_emp"> Self Employed &nbsp;&nbsp;&nbsp;
<input type="checkbox" name="m_occ" id="m6" value="others"> Others &nbsp;&nbsp;&nbsp;
<% if(mocc!=null){
     if(mocc.equalsIgnoreCase("housewife")){ %>
    <script>        document.getElementById('m1').checked=true;    </script>
    <% }
        if(mocc.equalsIgnoreCase("business")){ %>
    <script>        document.getElementById('m2').checked=true;    </script>
    <% } 
if(mocc.equalsIgnoreCase("salaried")){ %>
<script>        document.getElementById('m3').checked=true;    </script>
    <% } 
if(mocc.equalsIgnoreCase("govt_emp")){ %>
<script>        document.getElementById('m4').checked=true;    </script>
    <% } 
if(mocc.equalsIgnoreCase("self_emp")){ %>
<script>        document.getElementById('m5').checked=true;     </script>
    <% } 
if(mocc.equalsIgnoreCase("others")){ %>
<script>        document.getElementById('m6').checked=true;      </script><% } }%>
</td>
</tr>
<tr>
<td>Company Name</td>
<td><input type="text" name="m_company" value="<%= mcmp %>"></td>
<td>Designation</td>
<td><input type="text" name="m_designation" value="<%= mdesg %>"></td>
</tr>
</table>
<table>
    <tr style="height: 0.8vw;"></tr>
<tr><td colspan="6" class="h1">Past Academic Record</td></tr>
<tr style="height: 0.8vw;"></tr>
<tr align="center">
<td>Qualification</td>
<td>School/College Name</td>
<td>Stream</td>
<td>Board</td>
<td>Passing Year</td>
<td>Grade%</td>
</tr>
<tr align="center">
<td>12<sup>th</sup></td>
<td><input type="text" name="scl_12" value="<%= scl_12 %>" style="width:13vw;" required></td>
<td>
    <input list="s120" placeholder="Select" value="<%= stream_12 %>" name="stream_12" style="width:8vw;" class="list">
    <datalist name="stream_12" style="width:8vw;" id="s120">
    <option value="science" id="s121" >
    <option value="commerce" id="s122" >
    <option value="arts" id="s123">
<%  if(stream_12.equalsIgnoreCase("science")){ %>
<script> document.getElementById("s121").selected=true; </script>
<% } 
    else if(stream_12.equalsIgnoreCase("commerce")){%>
<script> document.getElementById("s122").selected=true; </script>
<% }
    else if(stream_12.equalsIgnoreCase("arts")){%>
<script> document.getElementById("s123").selected=true; </script>    
<% }
    else{ %>
<script> document.getElementById("s120").selected=true; </script>    
<% } %> 
</datalist>
</td>
<td>
    <input list="b120" placeholder="Select" value="<%= board_12 %>" name="board_12" style="width:8vw;" class="list">
    <datalist name="board_12" style="width:8vw;" id="b120">
    <option value="CBSE" id="b121">
    <option value="ICSE" id="b122">
    <option value="GSHEB" id="b123">
    <option value="other" id="b124">
<%  if(board_12.equalsIgnoreCase("cbse")){ %>
<script> document.getElementById("b121").selected=true; </script>    
<% }
    else if(board_12.equalsIgnoreCase("other")){%>
<script> document.getElementById("b124").selected=true; </script>    
<% }
    else if(board_12.equalsIgnoreCase("icse")){%>
   <script> document.getElementById("b122").selected=true; </script>    
<% }
    else if(board_12.equalsIgnoreCase("GSHEB")){%>
   <script> document.getElementById("b123").selected=true; </script>    
<%}
    else{%>
   <script> document.getElementById("b120").selected=true; </script>    
    <% } %>
    </datalist></td>

    <td>
            <input list="pyear_12" value="<%= pyr_12 %>" placeholder="Select" name="pyear_12" style="width:8vw;" class="list">
            <datalist name="pyear_12" required id="pyear_12">
                            <option value="2013">
                            <option value="2014">
                            <option value="2015">
                            <option value="2016">
                            <option value="2017">
                            <option value="2018">
                            <option value="2019">
            </datalist></td>    

<td><input type="text" name="grade_12" value="<%= grade_12 %>" style="width:8vw;" required></td>
</tr>
<tr align="center">
<td>10<sup>th</sup></td>
<td><input type="text" name="scl_10" style="width:13vw;" value="<%= scl_10 %>"></td>
<td>
    <input list="s100" placeholder="Select" value="<%= stream_10 %>" name="stream_10" style="width:8vw;" class="list">
    <datalist name="stream_10" style="width:8vw;" id="s100">
    <option value="science" id="s101" >
    <option value="commerce" id="s102" >
    <option value="arts" id="s103">
<%  if(stream_10.equalsIgnoreCase("science")){ %>
<script> document.getElementById("s101").selected=true; </script>
<% } 
    else if(stream_10.equalsIgnoreCase("commerce")){%>
<script> document.getElementById("s102").selected=true; </script>
<% }
    else if(stream_10.equalsIgnoreCase("arts")){%>
<script> document.getElementById("s103").selected=true; </script>    
<% }
    else{ %>
<script> document.getElementById("s100").selected=true; </script>    
<% } %> 
    </datalist></td>
<td>
    <input list="b100" placeholder="Select" value="<%=board_10%>" name="board_10" style="width:8vw;" class="list">
    <datalist name="board_10" style="width:8vw;" id="b100">
    <option value="CBSE" id="b101">
    <option value="ICSE" id="b102">
    <option value="GSHEB" id="b103">
    <option value="Other" id="b104">
<%  if(board_10.equalsIgnoreCase("cbse")){ %>
<script> document.getElementById("b101").selected=true; </script>    
<% }
    else if(board_10.equalsIgnoreCase("other")){%>
<script> document.getElementById("b104").selected=true; </script>    
<% }
    else if(board_10.equalsIgnoreCase("icse")){%>
   <script> document.getElementById("b102").selected=true; </script>    
<% }
    else if(board_10.equalsIgnoreCase("GSHEB")){%>
   <script> document.getElementById("b103").selected=true; </script>    
<%}
    else{%>
   <script> document.getElementById("s120").selected=true; </script>    
    <% } %>
    </datalist></td>

    <td>
        <input list="pyear_10" placeholder="Select" value="<%=pyr_10%>" name="pyear_10" style="width:8vw;" class="list">
        <datalist name="pyear_10" style="width:2vw;" required id="pyear_10">
                        <option value="2013">
                        <option value="2014">
                        <option value="2015">
                        <option value="2016">
                        <option value="2017">
                        <option value="2018">
                        <option value="2019">
        </datalist></td>
                    
<td><input type="text" name="grade_10" style="width:8vw;" value="<%= grade_10 %>"></td>
</tr>
<tr align="center">
<td>Others</td>
<td><input type="text" name="scl_other" style="width:13vw;" ></td>
<td><input type="text" name="stream_other" style="width:8vw;"></td>
<td><input type="text" name="board_other"  style="width:8vw;"></td>
<td><input type="text" name="pyear_other" style="width:8vw;"></td>
<td><input type="text" name="grade_other" style="width:8vw;"></td>
</tr>
<tr><td colspan="6"><hr></td></tr>
<tr> 
<td>Any Gap </td>
<td><input type="radio" name="gap" value="yes" id="gapy"> YES &nbsp;&nbsp;
<input type="radio" name="gap" value="no" id="gapn"> NO</td>
<%  if(gyr!=0){ %>
<script> document.getElementById("gapy").checked=true; </script>
<% }
else{ %>
<script> document.getElementById("gapn").checked=true; </script>
<% } %>
<td colspan="2" align='center'>No. of Years  &nbsp;&nbsp;
<input type="number" value="0" name="gap_yr" value="<%= gyr %>"></td>
<td colspan="2" align="center">Reason &nbsp;&nbsp;
<input type="text" name="reason" value="<%= gapr %>">
</td>
</tr>
<tr>
<td colspan="6" >Awards & Achievements(if any) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="text" name="achievements" style="width:40vw;" value="<%= achiev %>" ></td>
</tr>
</table>
<table><tr style="height: 0.8vw;"></tr>
<tr><td colspan="4"class="h1">Course </td></tr><tr style="height: 0.8vw;"></tr>
<tr>
<td>Select Course </td>
<td colspan="2">
<select name="course" style="width:30vw">
    <option id="course0">SELECT</option>
    <option value="IT-IMS" id="course1">IT-IMS & CYBER SECURITY </option>
    <option value="SOFTWARE" id="course2">SOFTWARE DEVELOPMENT(WEB & MOBILE)</option>
    <option value="ANIMATION" id="course3">ANIMATION & VFX</option>
    <option value="DIGITAL-DESIGN" id="course4">DIGITAL DESIGN</option>
<%  if(course.equalsIgnoreCase("IT-IMS")){ %>
   <script> document.getElementById("course1").selected=true; </script> 
    <%}
    else if(course.equalsIgnoreCase("SOFTWARE")){%>
       <script> document.getElementById("course2").selected=true; </script> 
    <% }
    else if(course.equalsIgnoreCase("ANIMATION")){%>
      <script> document.getElementById("course3").selected=true; </script> 
    <% }
    else if(course.equalsIgnoreCase("DIGITAL-DESIGN")){%>
       <script> document.getElementById("course4").selected=true; </script> 
    <% }
    else{%>
       <script> document.getElementById("course0").selected=true; </script> 
    <% } %>
</select>
</td>
<td>Batch &nbsp;<select name="batch">
        <option id="batch0">Select</option>
        <option id="batch1" value="morning">Morning</option>
        <option id="batch2" value="noon">Noon</option>
<%  if(batch!=null){
    if(batch.equalsIgnoreCase("morning")){ %>
       <script> document.getElementById("batch1").selected=true; </script> 
<%  }
else if(batch.equalsIgnoreCase("noon")){ %>
       <script> document.getElementById("batch2").selected=true; </script> 
<%  }
else {%>
       <script> document.getElementById("batch0").selected=true; </script> 
<%  }} %>
</select></td>
</tr><tr style="height: 0.8vw;"></tr>
<tr><td colspan="4"class="h1">Enquiry Details</td></tr><tr style="height: 0.8vw;"></tr>
<tr>
<td>Enquiry Form No.</td>
<td><input type='text' name="enq_form_no" value="<%= eid %>"></td>
<td>Enquiry Date</td>
<td>
    <input type="date" name="enq_date" value="<%= edate %>">
</td>
</tr>
<tr>
<td>Counselor Name</td>
<td><input type='text' name="counsellor_name" value="<%= counsellor %>"></td>
<td>Admission Date</td>
<td><input type="date" name="admission_date" value="<%= d %>"></td>
</tr>

</table>
<table>

<tr>
    <td colspan="4" align="center"><br><br><input type="submit" name="submit" value="<%= btn %>" class="sub_btn"
    style=""/></td>
</tr>
<input type="hidden" name="id" value="<%= aid %>" />
        </table>
    </form>
</div>
<% }       
catch(Exception e){
          e.printStackTrace();
} } }else{
%><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <%}     %>
</body>
</html>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enquiry Form</title>
        <link rel="stylesheet" type="" href="css/main.css">
    </head>  
    <script type="text/javascript" src="js/state_city.js"></script>
<jsp:include page="base.html"/>
    <body>
        <%        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       %><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <% }
else{%>
<%
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
%>
    <center>
        <div class="a">ENQUIRY FORM</div>
    </center>
    <div style="height:72.5vw;" class="form_bg"></div>
    <div class="form">
    <form action="enquiry.jsp" method="post" autocomplete="off">
        <table>
            <tr style="height: 0.8vw;"></tr>
        <tr><td colspan="4" class="h1">Student Details</td></tr>
        <tr style="height: 0.8vw;"></tr>
    <tr>
        <td>Name<br>(As per Marksheet)</td>
    <td>
        <input type="text" id="contact_name" name="name" value="<%= name %>" width="25vw" required>
    </td>
    </tr>
    <tr>
    <td>Email Id</td>
    <td><input type="email" name="email" style="text-transform:none;" required></td>
    <td>State</td>
    <td>
        <!--<input type="text" name="state">-->
        <select id="countrySelect" name="state" onchange="makeSubmenu(this.value)" required>
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
    <script>
  var objSelect = document.getElementById("countrySelect");

//Set selected
setSelectedValue(objSelect,state);

function setSelectedValue(selectObj, valueToSet) {
    for (var i = 0; i < selectObj.options.length; i++) {
        if (selectObj.options[i].text=== valueToSet) {
            selectObj.options[i].selected = true;
            alert(valueToSet);
            return;
        }
    }
}
    
</script>
    </tr>
    <tr>
    <td>Mobile Number</td>
    <td><input type="text" name="mobile_no" maxlength="10" value="<%= mob %>" required></td>
    <td>City</td>
    <td>
        <!--<input type="text" name="city" required>-->
        <select id="citySelect" size="1" name="city" required>
        <option value="" disabled selected>Choose City</option>
        <option></option>
        </select>
    </td>
    <tr>
    <td>Residential Address</td>
    <td ><textarea name="address" rows="3" cols="30"></textarea></td>
    <td>Pin Code</td>
    <td><input type="text" name="pincode"></td></tr>
    
    <tr style="height: 0.8vw;"></tr>
    <tr><td colspan="4" class="h1">Parent Details</td></tr>
    <tr style="height: 0.8vw;"></tr>
    <tr>
    <td>Name</td>
    <td><input type="text" name="pname" required></td>
    <td>Email Id</td>
    <td><input type="email" name="pemail"></td>
    </tr>
    <tr>
    <td>Mobile Number</td>
    <td><input type="text" name="pmobile_no" maxlength="10" required></td>
    <td>Occupation</td>
    <td><input type="text" name="occupation"></td>
    </tr>
    
    </table><table>
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
            <td><input type="text" name="scl_12" value="<%= scl %>" style="width:13vw;" required></td>
            <td>
                 <select name="stream_12" style="width:8vw;">
                 <% 
                     if(stream.equalsIgnoreCase("science"))
                    {
                 %>
                        <option>Select</option>
                        <option value="science" selected>Science</option>
                        <option value="commerce">Commerce</option>
                        <option value="arts">Arts</option>
                     <%}
                    else if(stream.equalsIgnoreCase("commerce")){%>
                        <option>Select</option>
                        <option value="science" >Science</option>
                        <option value="commerce" selected>Commerce</option>
                        <option value="arts">Arts</option>
                     <% }
                     else if(stream.equalsIgnoreCase("arts")){%>
                        <option>Select</option>
                        <option value="science" >Science</option>
                        <option value="commerce">Commerce</option>
                        <option value="arts" selected>Arts</option>
                     <% }
                    else{%>
                    <option selected>Select</option>
                    <option value="science" >Science</option>
                    <option value="commerce" >Commerce</option>
                    <option value="arts">Arts</option>
                    <%}%> 
                 </select>
              
            </td>
            <td><select name="board_12" style="width:8vw;">
                    
                     <% 
                     if(board.equalsIgnoreCase("cbse"))
                    {
                    %>
                    <option>Select</option>                    
                    <option value="CBSE" selected>CBSE</option>
                    <option value="ICSE">ICSE</option>
                    <option value="GSHEB">GSHEB</option>
                    <option value="other">Other</option>
                    <%}
                    else if(board.equalsIgnoreCase("other")){%>
                        <option>Select</option>
                        <option value="CBSE">CBSE</option>
                        <option value="ICSE">ICSE</option>
                        <option value="GSHEB">GSHEB</option>
                        <option value="other" selected>Other</option>
                     <% }
                     else if(board.equalsIgnoreCase("icse")){%>
                        <option>Select</option>
                        <option value="CBSE">CBSE</option>
                        <option value="ICSE" selected>ICSE</option>
                        <option value="GSHEB">GSHEB</option>
                        <option value="other">Other</option>
                     <% }
                    else if(board.equalsIgnoreCase("GSHEB")){%>
                        <option>Select</option>
                        <option value="CBSE">CBSE</option>
                        <option value="ICSE">ICSE</option>
                        <option value="GSHEB" selected>GSHEB</option>
                        <option value="other">Other</option>
                    <%}
                    else{%>
                        <option selected>Select</option>
                        <option value="CBSE">CBSE</option>
                        <option value="ICSE">ICSE</option>
                        <option value="GSHEB">GSHEB</option>
                        <option value="other">Other</option>
                    <% } %>
                </select></td>
            <!--<td><input type="text" name="pyear_12" style="width:8vw;" value="" required></td>-->
                
                <td>
                    <input list="pyear_12" placeholder="Select" name="pyear_12" placeholder="Select" value="<%= yr%>" style="width:8vw;" class="list">
        <datalist name="pyear_12" style="width:2vw;" required id="pyear_12">
                        <option value="2013">
                        <option value="2014">
                        <option value="2015">
                        <option value="2016">
                        <option value="2017">
                        <option value="2018">
                        <option value="2019">
        </datalist></td>
            <td><input type="text" name="grade_12" style="width:8vw;" required></td>
        </tr>
        <tr align="center">
            <td>10<sup>th</sup></td>
            <td><input type="text" name="scl_10" style="width:13vw;"></td>
            
            <td><input type="text" name="stream_10" style="width:8vw;"></td>
            <!--<td><input type="text" name="board_10" style="width:8vw;"></td>-->
            <td><select name="board_10" style="width:8vw;">
                        <option selected>Select</option>
                        <option value="CBSE">CBSE</option>
                        <option value="ICSE">ICSE</option>
                        <option value="GSHEB">GSHEB</option>
                        <option value="other">Other</option>
                </select></td>
            
                 <td>
        <input list="pyear_10" placeholder="Select" name="pyear_10" style="width:8vw;" class="list">
        <datalist name="pyear_10" style="width:2vw;" required id="pyear_10">
                        <option value="2013">
                        <option value="2014">
                        <option value="2015">
                        <option value="2016">
                        <option value="2017">
                        <option value="2018">
                        <option value="2019">
        </datalist></td>
            <td><input type="text" name="grade_10" style="width:8vw;" required></td>
        </tr>
    </table><table>
        <tr style="height: 0.8vw;"></tr>
        <tr><td class="h1">Course </td></tr>
        <tr style="height: 0.8vw;"></tr>
        <tr><td><input type="checkbox" name="chbox" value="IT-IMS">
                IT-IMS & CYBER SECURITY - <small>[B.Sc + M.Sc] - (5 Year Integrated)</small></td></tr>
        <tr><td><input type="checkbox" name="chbox" value="SOFTWARE">
                SOFTWARE DEVELOPMENT (WEB & MOBILE APPLICATION) - <small>[B.Sc + M.Sc] - (5 Year Integrated)</small></td></tr>
        <tr><td><input type="checkbox" name="chbox" value="ANIMATION">
                ANIMATION & VFX - <small>[B.Sc + M.Sc] - (5 Year Integrated)</small></td></tr>
        <tr><td><input type="checkbox" name="chbox" value="DIGITAL-DESIGN">
                DIGITAL DESIGN - <small>[B.Sc + M.Sc] - (5 Year Integrated)</small></td></tr>
    </table><table>
        <tr style="height: 0.8vw;"></tr>
    <tr><td colspan="2" class="h1">How Did You Hear About The Courses ?</td></tr>
    <tr style="height: 0.8vw;"></tr>
    <tr><td>
    <input type="checkbox" name="ref" value="SMS">&nbsp;SMS &nbsp;&nbsp;
    <input type="checkbox" name="ref" value="email">&nbsp;E-Mail&nbsp;&nbsp;
    <input type="checkbox" name="ref" value="facebook">&nbsp;FaceBook&nbsp;&nbsp;
    <input type="checkbox" name="ref" value="newspaper">&nbsp;Newspaper ADVT&nbsp;&nbsp;
    <input type="checkbox" name="ref" value="whatsapp">&nbsp;WhatsApp&nbsp;&nbsp;
    <input type="checkbox" name="ref" value="website">&nbsp;Website&nbsp;&nbsp;
    <input type="checkbox" name="ref" value="Seminar">&nbsp;Seminar&nbsp;&nbsp;</td></tr>
    <tr><td colspan="2"><label>Through Student: If yes, Name of the Student</label>&nbsp;&nbsp;
            <input type="text" name="cname" ></td></tr>
    <tr style="height: 0.8vw;"></tr>
    <tr>
        
    <td>    <label>Interest Status : </label>&nbsp;
        <input type="radio" name="stat" value="Interested">&nbsp;Interested &nbsp;&nbsp;
        <input type="radio" name="stat" value="Moderate">&nbsp;Moderate &nbsp;&nbsp;
        <input type="radio" name="stat" value="Not_Interested">&nbsp;Not-Interested &nbsp;&nbsp;
    </td>
    </tr>
    <tr style="height: 0.8vw;"></tr>
    <tr><td>
    <label>Name of Counsellor : </label>&nbsp;
    <input type="text" name="counsellor" required>
        </td></tr>
    <tr style="height: 1.2vw;"></tr>
    <tr>
        <td colspan="4" style="text-align: center"><input type="submit" value="Submit" class="sub_btn" /></td></tr>
    <input type="hidden" name="id" value="<%= id %>" />
    </table>
    </form>
</div>
       <% }       
        catch(Exception e){
            e.printStackTrace();
} 
}}
else{
%><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <%
} %>
</body>

</html>
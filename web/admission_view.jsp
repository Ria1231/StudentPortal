<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admission Data</title>
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="js/bootstrap.min.js">
    </head>

<body>
    <%  
        session.setAttribute("check","admission_search");
    
        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       %><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <% }
else{%><jsp:include page="base.html"/>
    
    <script>
    var checkboxes=[];
    function toggle(source){
        checkboxes=document.getElementsByName('foo');
        for(var i=0, n=checkboxes.length;i<n;i++){
            checkboxes[i].checked=source.checked;
        }
    }
        </script>
<form method="post"> 
<input style="margin-left: 1vw;font-size: 1vw;" type="checkbox" onclick="toggle(this)"/>
<span style="font-size: 1.2vw;">Select All</span>
<input type="hidden" value="admission_data" name="delete"/>
<input class="delete_btn" type="submit" value="Delete" formaction="delete.jsp"/>
    <br><br>
<table border="1" class="table table-hover" style="text-align: center;width: 99%;background-color: white;border:gray;
    margin-left: 0.5vw;font-size: 1.1vw;">
<tr style="background-color: rgba(154,169,172,1);">
<td></td>
<th>Full Name</th>
<th>Parent's Name</th>
<th>Mobile No.</th>
<th>Parent's No.</th>
<th>School 12</th>
<th>Stream 12</th>
<th>Board 12</th>
<th>Passing Year(12<sup>th</sup>)</th>
<th>Course</th>
<th></th>
</tr>
<%  

String s_by="",sname="",stmt="";
String s=request.getParameter("sform");

    int counter=0;
    Class.forName("com.mysql.jdbc.Driver");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
//    ServletContext sc=request.getServletContext();
            s_by=request.getParameter("s_by");
            sname=request.getParameter("sname");
        
        if (s_by!=null && sname!=null) {
            stmt="Select * from stu_admission where "+s_by+" like '%"+sname+"%'";
            }
        else {
            s_by="";
            sname="";
            stmt="Select * from stu_admission";
        }
       
    PreparedStatement ps=c.prepareStatement(stmt);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
        int id=rs.getInt(3);
%>            
<tr id="t<%= counter %>">
<td style="padding: 0.5vw;vertical-align: middle;"><input type="checkbox" name="foo" value="<%= id %>"></td>
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(4) %></td>
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(17) %></td>
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(9) %></td>
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(18) %></td>
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(31) %></td>
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(32) %></td>
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(33) %></td>
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(34) %></td>
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(44) %></td>
<td style="padding: 0.2vw;vertical-align: middle;"><form method="post" style="margin-block-end: 0vw;">
<input type="hidden" name="id1" value="<%= id %>"/>
<input type="hidden" name="edit" value="aedit"/>
<input type="submit" value="" class="s1" style="background-image: url(css/icons/upload_doc.png)"  formaction="fileUpload.jsp"/>&nbsp;
<input type="submit" value="" class="s1" style="background-image: url(css/icons/view.png)"  formaction="stu_detail.jsp"/>&nbsp;
<input type="submit" value="" class="s1" style="background-image: url(css/icons/edit_data.png);" formaction="admission_form.jsp"/>
    </form>
</td>
</tr>
<% counter++;
} %>
<center>
    <div style="position: absolute;top: 6vw;margin-left:47%;font-size: 1.6vw;">Data : <%= counter %></div>
</center>
</table></form>
<% }}
else{
%><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <%
} %>
</body>
</html>
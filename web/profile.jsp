<%-- 
    Document   : profile
    Created on : May 20, 2020, 9:27:10 PM
    Author     : LENOVO
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
                <link rel="stylesheet" type="text/css" href="css/main.css">
    </head>
    <body>
        <%        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       %><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <% }
else{%><jsp:include page="base.html"/>
<% 
    Class.forName("com.mysql.jdbc.Driver");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
    String user=session.getAttribute("user").toString();
    PreparedStatement ps=c.prepareStatement("select * from stu_users where user_name=?");
    ps.setString(1, user);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
%>
       <style>label{ margin-left: -17vw;}
           </style>
       <center>
            <div style="height:29vw;width:40%;left:24.5%;margin-top:0%;" class="form_bg"></div>
    <div class="form"  style="font-size: 1.6vw; margin-top: 6%;width: 38.5%;">
        <form action="createUser" method="post">
            <p style="font-size: 1.8vw;">Profile</p>
            <label>Name</label><br>
            <% if(user.equalsIgnoreCase("Admin")){ %>
            <input type='text' name="uname" value="<%= rs.getString(2) %>" class="form_input" readonly/><br>
            <label style="margin-left: 0vw;;color:red;">*Note: This email will be used for sending mails*</label><br> 
            <% } else{
            %><input type='text' name="uname" value="<%= rs.getString(2) %>" class="form_input" required/><br><br>
<% }%>
            <label>Email</label><br>
        <input type='email'  value="<%= rs.getString(4) %>" name="email" class="form_input" required/><br><br><br>
        <input type="hidden" value="update" name="action"/>
        <input type="hidden" value="<%= rs.getInt(1) %>" name="id"/>
        <input type="submit" value="Update" class="sub_btn"/><br><br>     
    </form>
</div>
</center>
<%
    }
 }}
else{
%><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <%
} %>       
    </body>
</html>

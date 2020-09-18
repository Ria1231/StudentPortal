<%-- 
    Document   : import
    Created on : May 13, 2020, 7:04:16 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="js/bootstrap.min.js">
    </head>
    <body>
        <%        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       %><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <% }
else{%>        
               <jsp:include page="base.html"/>
            <div class="a" style="margin-left: 1vw;">Import Data</div>
<br>
        <div style="background-color:whitesmoke;width: 60%;box-shadow: 0.1vw 0.1vw 0.7vw lightgray;margin-left: 15vw;">
            <form action="upload.jsp" method="post" enctype="multipart/form-data" style="margin-left: 4vw;">
                <br>
                <span style="font-size:1.3vw; font-weight: 800;margin-left: -2vw;">Student Data</span><br><br>
                <input type="file" name="file_name" style="font-size:1.3vw;" size="50"/>
                <input type="hidden" value="enquiry"/>
                <input type="submit" value="Import" class="sub_btn"/><br><br>
            </form>
        </div><br><br>
        <div style="background-color:whitesmoke;width: 60%;box-shadow: 0.1vw 0.1vw 0.7vw lightgray;margin-left: 15vw;">
            <form action="upload.jsp" method="post" enctype="multipart/form-data" style="margin-left: 4vw;">
                <br>
                  <span style="font-size:1.3vw; font-weight: 800;margin-left: -2vw;">Attendance Sheet</span><br><br>
                <input type="file" name="file_name" style="font-size:1.3vw;" size="50"/>
                <input type="hidden" value="attendance"/>
                <input type="submit" value="Import" class="sub_btn"/><br><br>
            </form>
        </div>
    </body>
    <% }}
else{
%><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <%
} %>
</html>

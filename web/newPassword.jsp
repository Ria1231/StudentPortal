<%-- 
    Document   : newPassword
    Created on : May 17, 2020, 9:47:30 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Change Password</title>
                        <link rel="stylesheet" href="css/main.css">
    </head>
    <body>
        <center>
            <div style="height:35vw;width:40%;left:24.5%;margin-top:0%;" class="form_bg"></div>
    <div class="form"  style="font-size: 1.6vw; margin-top: 6%;width: 38.5%;">
        <form action="changePassword" method="post">
        <img src="images/logo.png" class="form_logo" alt=''/>
        <h5 class="form_h5">Student Portal</h5>
        <p style="font-size: 1.8vw;">Forgot Password</p>
        <%          
            if(session.getAttribute("user")==null || session.getAttribute("user").equals("")){
            String entered=request.getParameter("entered");
            ServletContext sc=getServletContext();
            String toCheck=sc.getAttribute("otp").toString();
        String uname=request.getParameter("uname");
            if(!entered.equals(toCheck)){
                %><script>alert("OTP did'nt match.. Try Again !");
                    location='passwordForm.html';</script><%
            }
%>                <input type="text" value="<%= uname %>" class="form_input" name="uname" readonly/><br><%
}
else{
%>    <input type='password' placeholder="Old Password" name="pass" class="form_input" required/><br>
<% } %>
        <input type='password' placeholder="New Password" name="pass1" class="form_input" required/><br>
        <input type='password' placeholder="Confirm Password" name="pass2" class="form_input" required/><br><br><br>
        <input type="submit" value="Submit" class="sub_btn"/><br><br>
    </form>
</div>
</center>  
    </body>
</html>

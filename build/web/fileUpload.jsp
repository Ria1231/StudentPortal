    <%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%-- 
    Document   : fileUpload
    Created on : 12 Feb, 2020, 4:42:33 PM
    Author     : uspan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="" href="css/main.css">
    </head>
    <style>
       
            input[type=file]{
                font-size: 1vw;
                margin-left: -13vw;
            }
            
        td{
            
            align-content: center;
            padding: 1vw 5vw;
            font-size: 1.5vw;
            font-weight:bold;
            text-align: center;
        }
        
        .dname{
            text-align: left;
        }
    </style>
    <body>
         <%        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       %><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <% }
else{%>
<jsp:include page="base.html"/><br>
        <%
        String aid="",enroll="";
        Class.forName("com.mysql.jdbc.Driver");
        String full_path="",path="",check_path="";
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
        if(request.getParameter("id1")!=null){
            aid=request.getParameter("id1");
            PreparedStatement ps=c.prepareStatement("Select * from stu_admission where stu_admission_id="+aid);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
               path=rs.getString(51);
               full_path=rs.getString(52);
               check_path=rs.getString(53);
               enroll =rs.getString(2);
//               session.setAttribute("aid",aid);
               session.setAttribute("enroll",enroll);
               session.setAttribute("full_path",full_path);
//               out.println(Integer.parseInt(session.getAttribute("enroll").toString())); 
            }
            if(check_path!=null){ %>
            <script>
                alert("Files are already Uploaded..!!!");
                location='admission_view.jsp';
            </script>
           <% }
        }
         else{
         
         }
         
        %>
        
<!--        <div style="height:40vw;" class="form_bg"></div>-->
<div class="a" style="font-size: 2vw;padding: 1vw 4vw">Required Documents</div>
        <div style="height:40vw;" class="form_bg"></div>
        <form action="upload" method="post" enctype="multipart/form-data">
            <table style="width: 80%;margin: 0vw 10vw">
<!--            <tr>
                <td colspan='2' class="h1" align="center" style="padding: 1.3vw;font-size: 1.5vw">Required Documents</td></tr>
            <tr style="height: 0.8vw;"></tr>-->
            <tr>
                <td class="dname">10th Mark Sheet</td>
                <td><input type="file" name="marksheet_10" style="width:18vw;"></td>
            </tr>
            <tr>
                <td class="dname">12th Mark Sheet</td>
                <td><input type="file" name="marksheet_12" style="width:18vw;"></td>
            </tr>
            <tr>
                <td class="dname">School Leaving Certificate</td>
                <td><input type="file" name="scl_leaving" style="width:18vw;"></td>
            </tr>
            <tr>
                <td class="dname">Adhar Card </td>
                <td><input type="file" name="aadhar_card" style="width:18vw;"></td>
            </tr>
            
            <tr>
                <td class="dname">Recent Passport Size Photograph</td>
                <td><input type="file" name="stu_photo" style="width:18vw;"></td>
            </tr>
            
            <tr>
                <td class="dname">Code Of Conduct</td>
                <td><input type="file" name="code_of_conduct" style="width:18vw;"></td>
            </tr>
            
            <tr>
                <td class="dname">Affidavit</td>
                <td><input type="file" name="affidavit" style="width:18vw;"></td>
            </tr>
            
            <tr>
                <td class="dname">Document</td>
                <td><input type="file" name="doc" style="width:18vw;"></td>
            </tr>
    <input type="hidden" name="id" value="<%= aid %>" />
    <input type="hidden" name="full_path" value="<%= full_path %>" />
    <input type="hidden" name="path1" value="<%= path %>" />
            <tr>
                <td colspan="2" align="center">
                    <br>
                    <input type="submit" name="submit" value="Upload" class="sub_btn" style=""/></td>
            </tr>

        </table>
        </form>
         <% }}
else{
%><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <%
} %>
    </body>
</html>

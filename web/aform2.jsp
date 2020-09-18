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
    
    <body>
         <%        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       %><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <% }
else{%><jsp:include page="base.html"/><style>
            td{
                font-size: 1.3vw;
                padding-left: 17vw;
                width: 30vw;
            }
            input[type=file]{
                font-size: 1.3vw;
                margin-left: -13vw;
            }
        </style>
        <%
                        out.print(request.getParameter("stu_name"));

            %>
    <div class="a">REQUIRED DOCUMENTS</div>
    <div style="height:34.5vw;" class="form_bg"></div>
    <div class="form"  style="font-size: 1.6vw;">
    <form action="doc_upload.jsp" method="post">
        <center>
        <table><tr style="height: 2vw;">
    </tr><tr>
    <td>Passport Size Photo</td>
    <td><input type="file" name="photo"  required></td>
    </tr><tr style="height: 0.5vw;">
    </tr><tr>
    <td>10th Marksheet</td>
    <td><input type="file" name="10_marksheet" required></td>
    </tr><tr style="height: 0.5vw;">
    </tr><tr>
    <td>12th Marksheet</td>
    <td><input type="file" name="12_marksheet" required></td>
    </tr><tr style="height: 0.5vw;">
    </tr><tr>
    <td>School Leaving Certificate</td>
     <td><input type="file" name="scl_leaving" required></td>
    </tr><tr style="height: 0.5vw;">
    </tr><tr>
    <td>Aadhar Card</td>
    <td><input type="file" name="aadhar_card" required></td>
    </tr><tr style="height: 0.5vw;">
    </tr><tr>
    <td>Code Of Conduct</td>
    <td><input type="file" name="coc" required></td>
    </tr><tr style="height: 0.5vw;">
     </tr><tr>
    <td>Affidavit</td>
    <td><input type="file" name="affidavit" required></td>
    </tr><tr style="height: 0.5vw;">
    </tr><tr>
    <td>Document</td>
    <td><input type="file" name="doc" required></td>
    </tr><tr style="height: 3vw;">
    </tr><tr>
        <td colspan="2" align="center" style="padding-left:0vw;"><input type="submit" value="Submit" class="sub_btn"/></td></tr>
    <input type="hidden" name="id" value="<% %>" />
        </table></center>
    </form>
</div>
         <% }}
else{
%><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <%
} %>
</body>
</html>
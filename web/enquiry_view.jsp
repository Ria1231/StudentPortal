<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enquiry Data</title>
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <script>
       var chk=[];
    function toggle(source){
        checkboxes=document.getElementsByName('foo');
        
        var n=checkboxes.length;
        for(var i=0;i<n;i++){
            checkboxes[i].checked=source.checked;
        }
    }
        </script>
    <body>
        <%        
            session.setAttribute("check","enquiry_search");
            if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       %><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <% }
else{%>
<jsp:include page="base.html"/>
<form method="post">
    <input style="margin-left: 1vw;font-size: 1.2vw;" type="checkbox" onclick="toggle(this)" />
        <span style="font-size: 1.2vw;">Select All</span>
        <input type="hidden" value="enquiry_data" name="delete"/>
            <input class="delete_btn" type="submit" value="Delete" formaction="delete.jsp"/>
            <br><br>
<table border="1" class="table table-hover" style="text-align: center;width: 99%;
    margin-left: 0.5vw;font-size: 1vw;">
<tr style="background-color: #ccc;">
<td></td>
<th>Full Name</th>
<th>Parent's Name</th>
<th>Mobile No.</th>
<th>Parent's No.</th>
<th>School 12</th>
<th>Stream 12</th>
<th>Board 12</th>
<th>Passing Year of 12th</th>
<th></th>
</tr>
<%       
//    Cookie cookie=new Cookie("pname","enquiry");
//    cookie.setMaxAge(60*60*24);
//    response.addCookie(cookie);
    
String s_by="",sname="",stmt="";
String s=request.getParameter("sform");

    int counter=0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
            s_by=request.getParameter("s_by");
            sname=request.getParameter("sname");
             if (s_by!=null && sname!=null) {
            stmt="Select * from stu_enquiry where "+s_by+" like '%"+sname+"%'";
            }
        else {
            s_by="";
            sname="";
            stmt="Select * from stu_enquiry";
        }
            
            PreparedStatement ps=c.prepareStatement(stmt);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                 int id=rs.getInt(1);
                %>            
               <tr id="t<%= counter %>">
                   <td style="vertical-align: middle;"><input type="checkbox" name="foo" value="<%= id %>"/></td>
                    <td style="vertical-align: middle;"><%= rs.getString(2) %></td>
                    <td style="vertical-align: middle;"><%= rs.getString(9) %></td>
                    <td style="vertical-align: middle;"><%= rs.getString(7) %></td>
                    <td style="vertical-align: middle;"><%= rs.getString(10) %></td>
                    <td style="vertical-align: middle;"><%= rs.getString(13) %></td>
                    <td style="vertical-align: middle;"><%= rs.getString(14) %></td>
                    <td style="vertical-align: middle;"><%= rs.getString(15) %></td>
                    <td style="vertical-align: middle;"><%= rs.getString(16) %></td>
                        <td style="padding: 0.2vw;vertical-align: middle;">
                            <form method="post" style="margin-block-end: 0vw;"><input type="hidden" name="id1" value="<%= id %>"/>
                                <input type="hidden" name="edit" value="eedit"/>
                                <input type="submit" value="Edit" style="" formaction="admission_form.jsp"/></form>
                        </td>
                        <%
                                if(rs.getString(26).equalsIgnoreCase("interested")){
                            %>
                        <script>
                                document.getElementById("t<%= counter %>").style.backgroundColor="lightgreen";
                            </script>
                            <%}
                            else if(rs.getString(26).equalsIgnoreCase("moderate")){
                            %>
                            <script>
                                document.getElementById("t<%= counter %>").style.backgroundColor="yellow";
                            </script>
                            <%}
                            else if(rs.getString(26).equalsIgnoreCase("NotInterested")){
                            %>
                            <script>
                                document.getElementById("t<%= counter %>").style.backgroundColor="red";
                            </script>
                            <%}
                            else{
                            %>
                            <script>
                                document.getElementById("t<%= counter %>").style.backgroundColor="none";
                            </script>
                            <% } %>
                </tr>
                <%
                    counter++;
            }%>
            <center>
            <div style="position: absolute;top: 6vw;margin-left:47%;font-size: 1.6vw;">Data : <%= counter %></div>
            </center>
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

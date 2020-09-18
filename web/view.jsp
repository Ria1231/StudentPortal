<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Database</title>
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <body>
        <jsp:include page="base.html"/>
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
    <input style=" margin-left: 1.5vw;font-size: 1.2vw;" type="checkbox" onclick="toggle(this)"/>
    <span style="font-size: 1.4vw;">Select All</span>
    <input type="hidden" value="excel_data" name="delete"/>
    <input type="submit" value="Delete" class="delete_btn" formaction="delete.jsp"/>
    <br><br>
        <table border="1" class="table table-hover" style="margin-left: 0.5vw;width:99%;
               text-align: center;font-size: 1.2vw;background-color: white;">
                <tr style="background-color: rgba(154,169,172,1);">
                <th></th>
                <th>Full Name</th>
                <th>Mobile No.</th>
                <th>School 12</th>
                <th>Stream 12</th>
                <th>Board 12</th>
                <th>Passing Year of 12th</th>
                <th></th>
            </tr>
<%     
    session.setAttribute("check","import_search");
    String s_by="",sname="",stmt="";
    String s=request.getParameter("sform");

    
    int counter=0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
            s_by=request.getParameter("s_by");
            sname=request.getParameter("sname");
        
        if (s_by!=null && sname!=null) {
            stmt="Select * from stu_db where "+s_by+" like '%"+sname+"%'";
            }
        else {
            s_by="";
            sname="";
            stmt="Select * from stu_db";
        }
            
            PreparedStatement ps=c.prepareStatement(stmt);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                 int id=rs.getInt(1);
%>            
<tr>
    <td style="padding: 0.5vw;vertical-align: middle;"><input type="checkbox" name="foo" value="<%= id %>"/></td>
    <td style="padding: 0.5vw;vertical-align: middle;"><%= rs.getString(2) %></td>
    <td style="padding: 0.5vw;vertical-align: middle;"><%= rs.getString(3) %></td>
    <td style="padding: 0.5vw;vertical-align: middle;"><%= rs.getString(4) %></td>
    <td style="padding: 0.5vw;vertical-align: middle;"><%= rs.getString(5) %></td>
    <td style="padding: 0.5vw;vertical-align: middle;"><%= rs.getString(6) %></td>
    <td style="padding: 0.5vw;vertical-align: middle;"><%= rs.getString(7) %></td>
    <td style="padding: 0.5vw;vertical-align: middle;">
    <form method="post" style="margin-block-end: 0vw;"><input type="hidden" name="id1" value="<%= id %>"/>
        <input type="submit" value="Edit" formaction="eform.jsp"/></form>
    </td></tr></form>
<%  counter++; 
} %>
    <center>
        <div style="position: absolute;top: 6vw;margin-left:47%;font-size: 1.6vw;">Data : <%= counter %></div>
    </center>
        </table>
           
    </body>
</html>
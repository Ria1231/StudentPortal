<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course</title>
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="js/bootstrap.min.js">
    </head>
    <body>
        <jsp:include page="base.html"/>
        <%        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       %><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <% }
else{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
            String title="";
            String c_name="",per="",total="";
    int sem=0,total_sem=0,c_id=0;int counter=0;  
                %>
        <script>
    var checkboxes=[];
    function toggle(source){
        checkboxes=document.getElementsByName('foo');
        for(var i=0, n=checkboxes.length;i<n;i++){
            checkboxes[i].checked=source.checked;
        }
    }
    function add(){
        document.getElementById('add_form').style.display="block";
    }
    function close(){
        document.getElementById('add_form').style.display="none";   
        document.getElementById('edit_form').style.display="none";
      
    }
    function edit(id){
        document.getElementById('edit_form').style.display="block";
            
        }
        </script>
        <div class="a" style="margin-left: 1vw;">COURSES</div>
        <form method="post">
    <br>
<input style="margin-left: 1vw;font-size: 1vw;" type="checkbox" onclick="toggle(this)"/>
<span style="font-size: 1.2vw;">Select All</span>
<input type="hidden" value="fees" name="delete"/>
<input class="delete_btn" type="submit" value="Delete" formaction="delete.jsp"/>
<div class="add_btn" onclick="add()" style="text-align:center; padding-top: 0.3vw;font-size: 1.3vw;">Add Course</div>
    <br><br>
<table border="1" class="table table-hover" style="text-align: center;width: 99%;background-color: white;border:black;
    margin-left: 0.5vw;font-size: 1vw;">
<tr style="background-color: rgba(154,169,172,1);">
<td></td>
<th>Course Name</th>
<th>Fees per Semester</th>
<th>Total Semesters</th>
<th>Course Duration</th>
<th>Total Fees</th>
<th></th>
</tr>
<%    
    try{
    PreparedStatement ps=c.prepareStatement("Select * from course");
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
        %>            
<tr id="t<%= counter %>">
    <td><input type="checkbox" id="foo" value="<%= rs.getString(1) %>"></td>
<td><%= rs.getString(2) %></td>
<td><%= rs.getString(3) %></td>
<td><%= rs.getInt(4) %></td>
<td><%= rs.getInt(5) %></td>
<td><%= rs.getString(6) %></td>
<td><form method="post" style="margin-block-end: 0vw;">
<input type="hidden" name="id" value="<%= rs.getString(1) %>"/>
<script>
</script>
<div  onclick="edit(<%= rs.getString(1) %>)" style="cursor:pointer;text-align:center; font-size: 1.2vw;border: 1px solid black;">Edit</div>
</td>
</tr>
<% counter++;
}}
catch(Exception e){
    out.print(e.getMessage());
}%>
<div class="data_counter">Data : <%= counter %></div>
    </table></form>
    <div id="edit_form" style="display:none">
         <form method="post">
             <button class="close1" onclick="close()" style="float: right;background: none;border:none;">X</button><br>
             <h2>Edit Course</h2>
             <br><input type="text" placeholder="Course Name" name="c_name" value="<%= c_name %>" />
             <br><input type="text" placeholder="Fees Per Semester" name="per" value="<%= per %>" />
             <br><input type="number" placeholder="Total Semesters" name="total_sem" value="<%= sem %>" />
             <br><input type="number" placeholder="Course Duration" name="duration" value="<%= total_sem %>" />
             <br><input type="text" placeholder="Total Fees" name="total_fees" value="<%= total %>"/><br>
             <input type="hidden" name="act" value="edit"/>
             <br><input type="submit" value="Submit" class="sub_btn" formaction="course_add"/>
         </form>
     </div>
     <div id="add_form" style="display:none">
         <form method="post">
             <button class="close1" onclick="close()" style="float: right;background: none;border:none;">X</button><br>
             <h2>Add Course</h2>
             <br><input type="text" placeholder="Course Name" name="c_name" />
             <br><input type="text" placeholder="Fees Per Semester" name="per"  />
             <br><input type="number" placeholder="Total Semesters" name="total_sem" />
             <br><input type="number" placeholder="Course Duration" name="duration" />
             <br><input type="text" placeholder="Total Fees" name="total_fees" /><br>
                          <input type="hidden" name="act" value="add"/>
             <br><input type="submit" value="Submit" class="sub_btn" formaction="course_add"/>
         </form>
     </div>
<% }}
else{
%><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <%
} %>
    </body>
    <script>
    $(document).ready(function (){
        $(".close1").on("click", function() {
          $("#add_form").hide();
          $("#edit_form").hide();
        });
        
        
        
    }    
    </script>
</html>

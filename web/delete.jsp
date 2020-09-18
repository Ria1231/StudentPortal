<%-- 
    Document   : delete
    Created on : Dec 4, 2019, 12:11:07 PM
    Author     : LENOVO
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       %><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <% }
        else{
            String table_name="";
            String did="";
            System.out.print(request.getParameter("delete"));
            if(request.getParameter("delete").equals("excel_data")){
                table_name="stu_db";
                did="stu_id";
                }
            else if(request.getParameter("delete").equals("enquiry_data")){
                table_name="stu_enquiry";
                did="stu_enquiry_id";
            }
            else if(request.getParameter("delete").equals("admission_data")){
                table_name="stu_admission";
                did="stu_admission_id";
            }
            else if(request.getParameter("delete").equals("fees_data")){
                table_name="stu_fees_details";
                did="stu_fee_id";
            }
            else{
                
            }
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
            String[] id=request.getParameterValues("foo");
            if(id!=null){
            for(int i=0;i<id.length;i++){
                int val=Integer.parseInt(id[i]);
                out.print(id[i]);
                PreparedStatement ps3=c.prepareStatement("delete from "+table_name+" where "+did+"="+val);
                
                ps3.executeUpdate();
            }
            if(table_name.equals("stu_db")){%>
            <script>
                alert("Data Deleted from stu_db !\nRows : <%= id.length %>");
                location='view.jsp';
            </script>
            <% }
            else if(table_name.equals("stu_enquiry")){%>
            <script>
                alert("Data Deleted from stu_enquiry!\nRows : <%= id.length %>");
                location='enquiry_view.jsp';
            </script>
            <% }
            else if(table_name.equals("stu_admission")){%>
            <script>
                alert("Data Deleted from stu_admission!\nRows : <%= id.length %>");
                location='admission_view.jsp';
            </script>
            <% }
            else if(table_name.equals("stu_fees_details")){%>
            <script>
                alert("Data Deleted from stu_fees_details!\nRows : <%= id.length %>");
                location='fees_detail.jsp';
            </script>
            <% }
            else{%>
            <script>
                alert("Data Deleted from stu_enquiry!\nRows : <%= id.length %>");
                location='enquiry_view.jsp';
            </script>
            <% }
            } else{%>
            <script>
                alert("No Data Selected !");
                location='view.jsp';
            </script>
                    <% }}
            catch(Exception e){
                    e.printStackTrace();
            }
            } }
else{
%><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <%
} %>
    </body>
</html>

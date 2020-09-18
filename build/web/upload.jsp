<%-- 
    Document   : login
    Created on : 4 Dec, 2019, 6:59:31 PM
    Author     : uspan
--%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="org.apache.poi.ss.util.NumberToTextConverter"%>


<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="org.apache.poi.ss.usermodel.Cell"%>
<%@page import="org.apache.poi.ss.usermodel.Row"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.poi.xssf.usermodel.XSSFSheet"%>
<%@page import="org.apache.poi.xssf.usermodel.XSSFWorkbook"%>
<%@page import="java.io.File"%>
<%@page import="java.io.FileInputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       %><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <% }
else{
            try{
                MultipartRequest multi=new MultipartRequest(request,"D:\\");
//                out.println(multi.getOriginalFileName("file_name"));
                String fname=multi.getOriginalFileName("file_name");
//                System.out.print("fname  "+fname);
                if(fname==null){
                    %><script>
                    alert("No File Selected !!");
                    location='index.jsp';
                    </script><%
                }
                else{
                String full="D:\\sem3\\netbeans\\"+fname;
                int counter=0;
                File file=new File(full);
                FileInputStream fs=new FileInputStream(file);
                XSSFWorkbook wb=new XSSFWorkbook(fs);
                XSSFSheet sheet = wb.getSheetAt(0);
                Class.forName("com.mysql.jdbc.Driver");
                Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
                String sql="create table if not exists stu_db(stu_id int primary key auto_increment,stu_name varchar(100),stu_mob varchar(20),scl_12 varchar(150),stream_12 varchar(50),board_12 varchar(100),passingyr_12 int)";
                Statement st=c.createStatement();
                st.execute(sql);
                out.print("Table Ready");
                PreparedStatement ps=c.prepareStatement("insert into stu_db(stu_name,stu_mob,scl_12,stream_12,board_12,passingyr_12) values(?,?,?,?,?,?)");
                if(sheet.getLastRowNum()!=0 && sheet.getRow(0)!=null){
                    Iterator<Row> itr = sheet.iterator();  
                while (itr.hasNext())                 
                {  
                    Row row = itr.next();
                    Iterator<Cell> cellIterator = row.cellIterator();  
                    if(row!=sheet.getRow(0)){  
                            Cell cell = cellIterator.next();
                            String stu_name=row.getCell(0).getStringCellValue();
                            String stu_mob=NumberToTextConverter.toText(row.getCell(1).getNumericCellValue());
                            String scl_12=row.getCell(2).getStringCellValue();
                            String stream_12=row.getCell(3).getStringCellValue();
                            String board_12=row.getCell(4).getStringCellValue();
                            int passingyr_12=(int)row.getCell(5).getNumericCellValue();
                            ps.setString(1, stu_name);
                            ps.setString(2, stu_mob);
                            ps.setString(3, scl_12);
                            ps.setString(4, stream_12);
                            ps.setString(5, board_12);
                            ps.setInt(6, passingyr_12);
                            ps.execute();
                                            
                        }
                counter++;
                }
                %><script>
                    alert("Data Added to Database\nRows Added <%= counter-1 %> ");
                    location='view.jsp';
                    </script><%
                }
            else{                
                %><script>
                    alert("File is Empty !");
                    location='index.html';
                    </script><% }}
                                }
            catch(Exception e){
                e.printStackTrace();
                e.getCause();
                e.getMessage();
                }
} }
else{
%><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <%
} %>
    </body>
</html>

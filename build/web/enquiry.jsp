<%-- 
Adding excel data to enquiry
    Document   : enquiry
    Created on : Dec 1, 2019, 9:12:21 PM
    Author     : LENOVO
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try{
        Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
                String sql="create table if not exists stu_enquiry(stu_enquiry_id int primary key auto_increment,"
                        + "stu_name varchar(100) not null,"
                        + "address varchar(250),"
                        + "state varchar(50),"
                        + "city varchar(70),"
                        + "pincode int,"
                        + "stu_mob varchar(20),"
                        + "email varchar(100) unique key,"
                        + "parent_name varchar(100) not null,"
                        + "parent_mob varchar(20) not null,"
                        + "parent_email varchar(100),"
                        + "occupation varchar(50),"
                        + "scl_12 varchar(150) not null,"
                        + "stream_12 varchar(50) not null,"
                        + "board_12 varchar(100) not null,"
                        + "passingyr_12 int not null,"
                        + "grade_12 varchar(50),"
                        + "scl_10 varchar(150),"
                        + "stream_10 varchar(50),"
                        + "board_10 varchar(100),"
                        + "passingyr_10 int,"
                        + "grade_10 varchar(50),"
                        + "course varchar(150) not null,"
                        + "reference varchar(200),"
                        + "counsellor varchar(100) not null,"
                        + "stat varchar(30) not null,"
                        + "enq_date date not null)";
                Statement st=c.createStatement();
                st.execute(sql);
                System.out.print("Table Ready");
                String name=request.getParameter("name"),state=request.getParameter("state");
                String address=request.getParameter("address");
                String mobile_no=request.getParameter("mobile_no");
                String city=request.getParameter("city");
                String email=request.getParameter("email");
                int pincode=Integer.parseInt(request.getParameter("pincode"));
                String pname=request.getParameter("pname");
                String pmobile_no=request.getParameter("pmobile_no");
                String pemail=request.getParameter("pemail");
                String occupation=request.getParameter("occupation");
                String scl_12=request.getParameter("scl_12");
                String stream_12=request.getParameter("stream_12");
                String board_12=request.getParameter("board_12");
                int pyear_12=Integer.parseInt(request.getParameter("pyear_12"));
                String grade_12=request.getParameter("grade_12");
                String scl_10=request.getParameter("scl_10");
                String stream_10=request.getParameter("stream_10");
                String board_10=request.getParameter("board_10");
                int pyear_10=Integer.parseInt(request.getParameter("pyear_10"));
                String grade_10=request.getParameter("grade_10");
                String chbox=request.getParameter("chbox");
                String ref=request.getParameter("ref");
                String counsellor=request.getParameter("counsellor");
                String sta=request.getParameter("stat");
                long millis=System.currentTimeMillis();
                Date d=new Date(millis);
                System.out.print(d);
                PreparedStatement ps2=c.prepareStatement("insert into stu_enquiry(stu_name,"
                        + "address,state,city,pincode,"
                        + "stu_mob,email,parent_name,parent_mob,parent_email,occupation,"
                        + "scl_12,stream_12,board_12,passingyr_12,grade_12,"
                        + "scl_10,stream_10,board_10,passingyr_10,grade_10,"
                        + "course,reference,counsellor,stat,enq_date) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps2.setString(1,name);
                ps2.setString(2,address);
                ps2.setString(3,state);
                ps2.setString(4,city);
                ps2.setInt(5,pincode);
                ps2.setString(6,mobile_no);
                ps2.setString(7,email);
                ps2.setString(8,pname);
                ps2.setString(9,pmobile_no);
                ps2.setString(10,pemail);
                ps2.setString(11,occupation);
                ps2.setString(12,scl_12);
                ps2.setString(13,stream_12);
                ps2.setString(14,board_12);
                ps2.setInt(15,pyear_12);
                ps2.setString(16,grade_12);
                ps2.setString(17,scl_10);
                ps2.setString(18,stream_10);
                ps2.setString(19,board_10);
                ps2.setInt(20,pyear_10);
                ps2.setString(21,grade_10);
                ps2.setString(22,chbox);
                ps2.setString(23,ref );
                ps2.setString(24, counsellor);
                ps2.setString(25,sta);
                ps2.setDate(26, d);
                int i=ps2.executeUpdate();
                out.print(i);
                if(i!=0){
                    String id=request.getParameter("id");
                    //PreparedStatement ps3=c.prepareStatement("delete from stu_db where stu_id="+id+"");
                  //  ps3.executeUpdate();
                    %>
                    <script>
                    alert("Data Added to Enquiry Table !");
                    location='enquiry_view.jsp';
                    </script>
                    <%
                }
            }
           
        catch(Exception e){
            e.getMessage();
            e.printStackTrace();
}
            %>
    </body>
</html>

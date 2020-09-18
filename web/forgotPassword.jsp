<%-- 
    Document   : forgotPassword
    Created on : May 17, 2020, 7:53:24 PM
    Author     : LENOVO
--%>

<%@page import="javax.mail.internet.*"%>
<%@page import="javax.mail.*"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
                <link rel="stylesheet" href="css/main.css">
    </head>
    <body style="margin-left: 3vw;">
        <% 
        String uname=request.getParameter("uname");
        String email=request.getParameter("email");
                String check="no";
        Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
        PreparedStatement ps1=c.prepareStatement("select * from stu_users");
        ResultSet rs1=ps1.executeQuery();
        while(rs1.next()){
            if(rs1.getString(2).equalsIgnoreCase(uname) && rs1.getString(4).equalsIgnoreCase(email)){
                check="yes";
                break;  
            }
        }
       if(check.equals("yes")){
PreparedStatement ps2=c.prepareStatement("select * from stu_users where user_id=1");
                         ResultSet rs=ps2.executeQuery();
                         String toAddress="";
                         final String from="studentportal@aimeducation.in";
                         while(rs.next()){
                         toAddress=rs.getString(4);}
                         out.print(toAddress);
            Random otp  =new Random();
        StringBuilder builder=new StringBuilder();
        for(int count=0; count<=4;count++) {
            builder.append(otp.nextInt(10));
        }
        ServletContext sc=getServletContext();
        sc.setAttribute("otp", builder.toString());
        Properties properties = new Properties();
                        properties.put("mail.smtp.host", "mail.aimeducation.in");
                        properties.put("mail.smtp.port", 587);
                        properties.put("mail.smtp.auth", "true");
                        properties.put("mail.smtp.starttls.enable", "true");
	Authenticator auth = new Authenticator() {
                   @Override
	public PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, "123@Admin");
			}
		};
		Session sess = Session.getInstance(properties, auth);
		Message msg = new MimeMessage(sess);
		msg.setFrom(new InternetAddress(from));
		InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
		msg.setRecipients(Message.RecipientType.TO, toAddresses);
		msg.setSubject("GUAIM: Student Portal");
		msg.setSentDate(new java.util.Date());
                msg.setContent("<h4>GUAIM</h4><br>Your OTP For Changing Password is below<br>"
                                              + "<br><h3>"+builder.toString()+ "</h3>","text/html");
                                      try{

                                      Transport.send(msg);
                                      }
                                      catch(Exception ex){
                                          ex.printStackTrace();
                                          out.print(ex.getMessage());
                                      }
                                      }
        else{
                %><script>alert('Invalid Username or Email !');
                    location='passwordForm.html';</script><%
            }
        %>
         <h2>Verify It's You...</h2>
        <br>
        <p>Check Your Mail And Enter OTP Below</p>
        <form action='newPassword.jsp' method="post">
            <input type="text" placeholder="Enter OTP" name="entered" class="form_input" required/>
            <input type="hidden" value="<%= uname %>" name="uname"/>
        <input type="submit" value="Verify" class="sub_btn"/>
        </form>
        <% 
        %>
    </body>
</html>

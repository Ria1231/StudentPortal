    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author LENOVO
 */
public class createUser extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String uname=request.getParameter("uname");
        String p1=request.getParameter("pass");
        String p2=request.getParameter("pass2");
        String email=request.getParameter("email");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
        String sql="create table if not exists stu_users(" +
"user_id int primary key auto_increment," +
"user_name varchar(30) not null," +
"user_p varchar(50) not null," +
"email varchar(50) not null" +
")";
        Statement st=c.createStatement();
        st.execute(sql);
        if(request.getParameter("action")!=null){
            int id=Integer.parseInt(request.getParameter("id"));
            PreparedStatement ps=c.prepareStatement("update stu_users set user_name=?, email=? where user_id=?");
            ps.setString(1, uname);
            ps.setString(2, email);
            ps.setInt(3, id);
            if(ps.executeUpdate()>0){
                out.print("<script>alert('Profile Updated !');"+
                                            "location='profile.jsp';</script>");
            }
            else{
                out.print("<script>alert('Error in updating profile.. Try Again !');"+
                                            "location='profile.jsp';</script>");
            }
        }
        else{
PreparedStatement ps1=c.prepareStatement("select * from stu_users");
                        ResultSet rs1=ps1.executeQuery();
                        if(rs1.next()==false){
                            if(uname.equalsIgnoreCase("Admin")){
            if(p1.equals(p2)){
                if(p1.length()>=6){
                try{
                    PreparedStatement ps=c.prepareStatement("insert into stu_users(user_name,user_p,email) values(?,?,?)");
                    ps.setString(1,uname);
                    ps.setString(2,p1);
                    ps.setString(3,email);out.print("1a<br>");
                    if(ps.executeUpdate()>0){
                        out.print("<script>alert('Admin Created Successfully !');"+
                                            "location='login.html';</script>");
                        }
                     }
                    catch(SQLException ex){
                                                                  ex.getMessage();

                    }}
                        else{
                    out.print("<script>alert('Password Should Be 6 char or longer !');"+
                    "location='createUser.html';</script>");
                }
            }
            else{
                out.print("<script>alert('Confirm Password Incorrect !');"+
                    "location='createUser.html';</script>");
            }
        }
        else{
            out.print("<script>alert('Username should be *Admin* !');"+
                    "location='createUser.html';</script>");
        }}
                        else{
        if(!uname.equalsIgnoreCase("Admin")){
            if(p1.equals(p2)){
                if(p1.length()>=6){
                                 try{
                    PreparedStatement ps=c.prepareStatement("insert into stu_users(user_name,user_p,email) values(?,?,?)");
                    ps.setString(1,uname);
                    ps.setString(2,p1);
                    ps.setString(3,email);
                    if(ps.executeUpdate()>0){
                         PreparedStatement ps2=c.prepareStatement("select * from stu_users where user_id=1");
                         ResultSet rs=ps2.executeQuery();
                         String toAddress="";
                         final String from="studentportal@aimeducation.in";
                         while(rs.next()){
                         toAddress=rs.getString(4);}
                         out.print(toAddress);
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
		Session session = Session.getInstance(properties, auth);
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(from));
		InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
		msg.setRecipients(Message.RecipientType.TO, toAddresses);
		msg.setSubject("GUAIM: Student Portal");
		msg.setSentDate(new java.util.Date());
                                      msg.setContent("<h4>GUAIM</h4><br>New User Created in Student Portal<br>Username:- <b>"+uname+"</b><br>"
                                              + "Email:- <b>"+email+ "</b>","text/html");
                                      try{out.print("1<br>");
                                      Transport.send(msg);
                                      out.print("<script>alert('User Created Successfully !');"+
                                            "location='login.html';</script>");
                                      }
                                      catch(MessagingException ex){                                         
                                          out.print(ex.getMessage());
                                      }
                    }
                    else{
                        out.print("Error in execution");
                    }
                    }
                    catch(SQLException ex){
                                                                 ex.getMessage();

                    } catch (AddressException ex) {
                        Logger.getLogger(createUser.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (MessagingException ex) {
                        Logger.getLogger(createUser.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }  
                else{
                    out.print("<script>alert('Password Should Be 6 char or longer !');"+
                    "location='createUser.html';</script>");
                }
            }
            else{
                out.print("<script>alert('Confirm Password Incorrect !');"+
                    "location='createUser.html';</script>");
            }
        }
        else{
            out.print("<script>alert('Username cannot be *Admin* !');"+
                    "location='createUser.html';</script>");
        }}
                                }
        }   catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(createUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }

}

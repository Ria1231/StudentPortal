/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author uspan
 */
public class changePassword extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet changePassword</title>");            
            out.println("</head>");
            out.println("<body>");
            Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
        Statement st=c.createStatement();
        String p1=request.getParameter("pass1");
        String p2=request.getParameter("pass2");
        if(p1.equals(p2)){
        if(request.getParameter("uname")!=null){
             String uname=request.getParameter("uname");
             String q="update stu_users set user_p='"+p1+"' where user_name='"+uname+"'";
             int i1=st.executeUpdate(q);
             if(i1>0){
                 out.print("<script>alert('Password Changed Successfully !');"+
                    "location='login.html';</script>");
             }
             else{
                 out.print("<script>alert('Error Occured While Changing Password !');"+
                    "location='newPassword.jsp';</script>");
             }
        }
        else{
            HttpSession s=request.getSession();
            String uname=s.getAttribute("user").toString();
            String pass=request.getParameter("pass");
            PreparedStatement ps1=c.prepareStatement("Select * from stu_users");
            ResultSet rs=ps1.executeQuery();
            while(rs.next()){
                if(pass.equals(rs.getString(3))){
            String q2="update stu_users set user_p='"+p1+"' where user_name='"+uname+"'";
            int i2=st.executeUpdate(q2);
             if(i2>0){
                 out.print("<script>alert('Password Changed Successfully !');"+
                    "location='login.html';</script>");
             }
             else{
                 out.print("<script>alert('Error Occured While Changing Password !');"+
                    "location='newPassword.jsp';</script>");
             }
        break;
                }
                else{
                    out.print("<script>alert('Old Password did'nt match.. Try Again !');"+
                    "location='newPassword.jsp';</script>");
                }
            }}}
            else{
            out.print("<script>alert('Passwords did'nt match.. Try Again !');"+
                    "location='newPassword.jsp';</script>");
        }
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(changePassword.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(changePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(changePassword.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(changePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.oreilly.servlet.MultipartRequest;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author uspan
 */
public class upload extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet upload</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet upload at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
           
            HttpSession session=request.getSession();
            out.println("hii");
            int aid=Integer.parseInt(session.getAttribute("enroll").toString()); 
            out.println("aid"+aid);
            
                        
            String path=session.getAttribute("full_path").toString();
            out.println("<br>path"+path);
            try{
                Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
           
            
            Statement st=c.createStatement();
            String qry="update stu_admission set check_path='"+path+"' where enrollment_no="+aid;
            int i=st.executeUpdate(qry);
        
            out.println(i);
        
            }
            catch(Exception ex){
       out.println("<br>error"+ex.getLocalizedMessage());
                
            }

            out.println("path uploded");
            MultipartRequest m=new MultipartRequest(request, path);
            String marksheet_10=m.getOriginalFileName("marksheet_10");
            String marksheet_12=m.getOriginalFileName("marksheet_12");
            String scl_leaving=m.getOriginalFileName("scl_leaving");
            String aadhar_card=m.getOriginalFileName("aadhar_card");
            String stu_photo=m.getOriginalFileName("stu_photo");
            String code_of_conduct=m.getOriginalFileName("code_of_conduct");
            String affidavit=m.getOriginalFileName("affidavit");
            String doc=m.getOriginalFileName("doc");
            String exe1=FilenameUtils.getExtension(marksheet_10);
            String exe2=FilenameUtils.getExtension(marksheet_12);
            String exe3=FilenameUtils.getExtension(scl_leaving);
            String exe4=FilenameUtils.getExtension(aadhar_card);
            String exe5=FilenameUtils.getExtension(stu_photo);
            String exe6=FilenameUtils.getExtension(code_of_conduct);
            String exe7=FilenameUtils.getExtension(affidavit);
            String exe8=FilenameUtils.getExtension(doc);
          
            File f1 = new File(path+"/"+marksheet_10);
            File f2 = new File(path+"/"+marksheet_12); 
            File f3 = new File(path+"/"+scl_leaving); 
            File f4 = new File(path+"/"+aadhar_card); 
            File f5 = new File(path+"/"+stu_photo);
            File f6 = new File(path+"/"+code_of_conduct); 
            File f7 = new File(path+"/"+affidavit); 
            File f8 = new File(path+"/"+doc); 
            
            f1.renameTo(new File(path+"/marksheet_10."+exe1));
            f2.renameTo(new File(path+"/marksheet_12."+exe2));
            f3.renameTo(new File(path+"/scl_leaving."+exe3));
            f4.renameTo(new File(path+"/aadhar_card."+exe4));
            f5.renameTo(new File(path+"/stu_photo."+exe5));
            f6.renameTo(new File(path+"/code_of_conduct."+exe6));
            f7.renameTo(new File(path+"/affidavit."+exe7));
            f8.renameTo(new File(path+"/doc."+exe8));
            
            
            out.println("Successfully uploded");
            out.print("<script>");
            out.print("alert('Documents Uploded');");
            out.print("location='admission_view.jsp';");
            out.print("</script>"); 
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
        } catch (SQLException ex) {
            Logger.getLogger(upload.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (SQLException ex) {
            Logger.getLogger(upload.class.getName()).log(Level.SEVERE, null, ex);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@MultipartConfig(maxFileSize=16177215)

/**
 *
 * @author uspan
 */
public class addmission_add extends HttpServlet {

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
            throws ServletException, IOException, SQLException, ParseException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet addmission_add</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addmission_add at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
    Class.forName("com.mysql.jdbc.Driver");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
    
    String sql1="create table if not exists stu_fees_details("
            +"stu_fee_id int primary key auto_increment,"
            +"stu_admission_id int not null,"
            + "enrollment_no int,"
            + "stu_name varchar(100) not null,"
            + "semester varchar(100),"
            + "payment_method_id varchar(100),"
            + "amount int(100),"
            + "due_amount int(100),"
            + "date date,"
            + "course varchar(100)"
            + ")";
    String cash="create table if not exists cash_detail("
            + "cash_id int primary key auto_increment,"
            + "stu_fee_id int,"
            + "enrollment_no int,"
            + "amount int(100) not null,"
            + "c_date date not null)";
    
    String cheque="create table if not exists cheque_detail("
            + "cheque_id int primary key auto_increment,"
            + "stu_fee_id int,"
            + "enrollment_no int,"
            + "cheque_no int not null,"
            + "bank_name varchar(100),amount int(100) not null,"
            + "c_date date not null)";
    String dd="create table if not exists dd_detail("
            + "dd_id int primary key auto_increment,stu_fee_id int,"
            + "name varchar(100),amount int(100) not null,c_date date not null)";
    
    String ot="create table if not exists ot_detail("
            + "ot_id int primary key auto_increment,stu_fee_id int,"
            + "enrollment_no int,ref_no varchar(100),amount int(100) not null,c_date date not null)";
    
    String sql="create table if not exists stu_admission("
+"admission_form_no int,"
+"enrollment_no int,"
+"stu_admission_id int primary key auto_increment,"
+"stu_name varchar(100) not null,"
+"address varchar(250) not null,"
+"state varchar(50) not null,"
+"city varchar(70) not null,"
+"pincode int,"
+"stu_mob1 varchar(20) unique key not null,"
+"stu_mob2 varchar(20),"
+"email varchar(100) unique key,"
+"stu_dob date not null,"
+"aadhar_card_no varchar(15),"
+"gender varchar(10) not null,"
+"blood_group varchar(3),"
+"category varchar(10) not null,"
+"father_name varchar(100) not null,"
+"father_mob1 varchar(20) not null," 
+"father_mob2 varchar(20),"
+"father_email varchar(100),"
+"father_occupation varchar(50),"
+"father_cmp_name varchar(50),"
+"father_designation varchar(50),"
+"mother_name varchar(100) not null,"
+"mother_mob1 varchar(20),"
+"mother_mob2 varchar(20),"                        
+"mother_email varchar(100),"
+"mother_occupation varchar(50),"
+"mother_cmp_name varchar(50),"
+"mother_designation varchar(50),"
+"scl_12 varchar(150) not null,"
+"stream_12 varchar(50) not null,"
+"board_12 varchar(100) not null,"
+"passingyr_12 int not null,"
+"grade_12 varchar(50),"
+"scl_10 varchar(150),"
+"stream_10 varchar(50),"
+"board_10 varchar(100),"
+"passingyr_10 int,"
+"grade_10 varchar(50),"
+"gap_year int,"
+"gap_reason varchar(150),"
+"achievements varchar(200),"
+"course varchar(150) not null,"
+"batch varchar(50),"
+"enq_form_no int,"
+"enq_date date,"
+"counsellor_name varchar(100) not null,"
+"admission_date date not null,"
+"ref varchar(200),"
+"path varchar(200),"
+"full_path varchar(200),"
+ "check_path varchar(200))";
    Statement st=c.createStatement();
    st.execute(sql);
    st.execute(sql1);
    st.execute(cash);
    st.execute(cheque);
    st.execute(dd);
    st.execute(ot);
    
    out.print("Table Ready");
    String img_no=request.getParameter("form_no");
    int admission_form_no=Integer.parseInt(request.getParameter("form_no"));
    int enrollment_no=Integer.parseInt(request.getParameter("enroll_no"));
    String stu_name=request.getParameter("name");
    String address=request.getParameter("address");
    String state=request.getParameter("state");
    String city=request.getParameter("city");
    int pincode=Integer.parseInt(request.getParameter("pincode"));
    String stu_mob1=request.getParameter("mobile_no1");
    String stu_mob2=request.getParameter("mobile_no2");
    String email=request.getParameter("email");
    String stu_dob=request.getParameter("dob");
    SimpleDateFormat sp=new SimpleDateFormat("yyyy-MM-dd");
    java.util.Date d=sp.parse(stu_dob);
    Date dt=new Date(d.getTime());
    String aadhar_card_no=request.getParameter("adhar_no");
    String gender=request.getParameter("gender");
    String blood_group=request.getParameter("blood_group");
    String category=request.getParameter("category");
    String father_name=request.getParameter("fname");
    String father_mob1=request.getParameter("father_mob1");
    String father_mob2=request.getParameter("father_mob2");
    String father_email=request.getParameter("father_email");
    String father_occupation=request.getParameter("f_occ");
    String father_cmp_name=request.getParameter("f_company");
    String father_designation=request.getParameter("f_designation");
    String mother_name=request.getParameter("mother_name");
    String mother_mob1=request.getParameter("mother_mob1");
    String mother_mob2=request.getParameter("mother_mob2");
    String mother_email=request.getParameter("m_email");
    String mother_occupation=request.getParameter("m_occ");
    String mother_cmp_name=request.getParameter("m_company");
    String mother_designation=request.getParameter("m_designation");
    String scl_12=request.getParameter("scl_12");
    String stream_12=request.getParameter("stream_12");
    String board_12=request.getParameter("board_12");
    int passingyr_12=Integer.parseInt(request.getParameter("pyear_12")); 
    String grade_12=request.getParameter("grade_12");
    String scl_10=request.getParameter("scl_10");
    String stream_10=request.getParameter("stream_10");
    String board_10=request.getParameter("board_10");
    int passingyr_10=Integer.parseInt(request.getParameter("pyear_10"));
    String grade_10=request.getParameter("grade_10");
    String gap=request.getParameter("gap");
    int gap_year=0;
    
    
    if(gap.equalsIgnoreCase("yes")){
        gap_year=Integer.parseInt(request.getParameter("gap_yr"));
    }
    String gap_reason=request.getParameter("reason");
    String achievements=request.getParameter("achievements");
    String course=request.getParameter("course");
    String batch=request.getParameter("batch");
    int enq_form_no=Integer.parseInt(request.getParameter("enq_form_no"));
    String enq_date=request.getParameter("enq_date");
    String counsellor_name=request.getParameter("counsellor_name");
    String admission_date=request.getParameter("admission_date");
    String ref=request.getParameter("course_src");
    
    String img_name=stu_name+img_no;
    //give your directory Path
    String path="C:\\Users\\uspan\\OneDrive\\Documents\\NetBeansProjects\\stu_mgmt1\\web\\Documents\\"+course+"\\Sem-1\\"+img_name+"";
    String path1="Documents/"+course+"/Sem-1/"+img_name+"";
    String submitorSave="",feeInsert="",feeUpdate="";
    int fid=0;
    String aid=request.getParameter("id");
    if(request.getParameter("submit").equalsIgnoreCase("save")){
    PreparedStatement p=c.prepareStatement("select stu_fee_id from stu_fees_details where stu_admission_id="+aid);
    ResultSet rs1=p.executeQuery();
    while(rs1.next()){
       fid=rs1.getInt(1);
    }}
     if(!(request.getParameter("submit").equalsIgnoreCase("save"))){
         String a=request.getParameter("submit");
        submitorSave="insert into stu_admission(admission_form_no,enrollment_no,stu_name,"
    + "address,state,city,pincode,stu_mob1,stu_mob2,email,stu_dob,aadhar_card_no,gender,"
    + "blood_group,category,father_name,father_mob1,father_mob2,father_email,father_occupation,father_cmp_name,"
    + "father_designation,mother_name,mother_mob1,mother_mob2,mother_email,mother_occupation,mother_cmp_name,mother_designation,"
    + "scl_12,stream_12,board_12,passingyr_12,grade_12,scl_10,stream_10,board_10,passingyr_10,grade_10,"
    + "gap_year,gap_reason,achievements,course,batch,enq_form_no,enq_date,counsellor_name,admission_date,ref,path,full_path"
    + ") "
    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
     else{
         submitorSave="update stu_admission set admission_form_no=?,enrollment_no=?,stu_name=?,"
                 + "address=?,state=?,city=?,pincode=?,stu_mob1=?,stu_mob2=?,email=?,stu_dob=?,aadhar_card_no=?,"
                 + "gender=?,blood_group=?,category=?,father_name=?,father_mob1=?,father_mob2=?,"
                 + "father_email=?,father_occupation=?,father_cmp_name=?,father_designation=?,mother_name=?,mother_mob1=?,mother_mob2=?,"
                 + "mother_email=?,mother_occupation=?,mother_cmp_name=?,mother_designation=?,"
                 + "scl_12=?,stream_12=?,board_12=?,passingyr_12=?,grade_12=?,scl_10=?,stream_10=?,board_10=?,passingyr_10=?,grade_10=?,"
                 + "gap_year=?,gap_reason=?,achievements=?,course=?,batch=?,enq_form_no=?,enq_date=?,counsellor_name=?,admission_date=?,ref=?,path=?,full_path=?"
                 + " where stu_admission_id="+aid+"";
         feeUpdate="update stu_fees_details set enrollment_no=?,stu_name=?,"
                 + "course=? where stu_fee_id="+fid;
     }
    PreparedStatement ps2=c.prepareStatement(submitorSave);
    
    ps2.setInt(1, admission_form_no);
    ps2.setInt(2, enrollment_no);
    ps2.setString(3,stu_name);
    ps2.setString(4,address);
    ps2.setString(5,state);
    ps2.setString(6,city);
    ps2.setInt(7,pincode);
    ps2.setString(8,stu_mob1);
    ps2.setString(9,stu_mob2);
    ps2.setString(10,email);
    ps2.setDate(11,dt);
    ps2.setString(12,aadhar_card_no);
    ps2.setString(13,gender);
    ps2.setString(14,blood_group);
    ps2.setString(15,category);
    ps2.setString(16,father_name);
    ps2.setString(17,father_mob1);
    ps2.setString(18,father_mob2);
    ps2.setString(19,father_email);
    ps2.setString(20,father_occupation);
    ps2.setString(21,father_cmp_name);
    ps2.setString(22,father_designation);
    ps2.setString(23,mother_name);
    ps2.setString(24,mother_mob1);
    ps2.setString(25,mother_mob2);
    ps2.setString(26,mother_email);
    ps2.setString(27,mother_occupation);
    ps2.setString(28,mother_cmp_name);
    ps2.setString(29,mother_designation);
    ps2.setString(30,scl_12);
    ps2.setString(31,stream_12);
    ps2.setString(32,board_12);
    ps2.setInt(33,passingyr_12);
    ps2.setString(34,grade_12);
    ps2.setString(35,scl_10);
    ps2.setString(36,stream_10);
    ps2.setString(37,board_10);
    ps2.setInt(38,passingyr_10);
    ps2.setString(39,grade_10);
    ps2.setInt(40,gap_year);
    ps2.setString(41,gap_reason);
    ps2.setString(42,achievements);
    ps2.setString(43,course);
    ps2.setString(44,batch);
    ps2.setInt(45,enq_form_no);
    ps2.setString(46,enq_date);
    ps2.setString(47,counsellor_name);
    ps2.setString(48,admission_date);
    ps2.setString(49,ref);
    ps2.setString(50,path1);
    ps2.setString(51,path);
try{
    int i=ps2.executeUpdate();
    String stmt="select * from stu_admission ORDER BY stu_admission_id DESC LIMIT 1";
    PreparedStatement ps=c.prepareStatement(stmt);
    ResultSet rs=ps.executeQuery();
    int addmision_id=0,due_amount=460000,amount=0;
    String semester="1";
    while(rs.next()){
       addmision_id=rs.getInt(3);
    }
    if(!(request.getParameter("submit").equalsIgnoreCase("save"))){
    feeInsert="insert into stu_fees_details(stu_admission_id,enrollment_no,stu_name,semester,amount,due_amount,course) values(?,?,?,?,?,?,?)";
    PreparedStatement ps3=c.prepareStatement(feeInsert);
    
    ps3.setInt(1, addmision_id);
    ps3.setInt(2, enrollment_no);
    ps3.setString(3,stu_name);
    ps3.setString(4,semester);
    ps3.setInt(5,amount);
    ps3.setInt(6,due_amount);
    ps3.setString(7,course);
    int i1=ps3.executeUpdate(); 
}
else{
        PreparedStatement ps4=c.prepareStatement(feeUpdate);
         
        ps4.setInt(1, enrollment_no);
        ps4.setString(2,stu_name);
        ps4.setString(3,course);
        int i2=ps4.executeUpdate(); 
        out.print("<script>");
        out.print("alert('fees course Successfully Updated !');");
       
        out.print("</script>");
        
    }
}

catch(Exception ex){
    out.println(ex.getMessage());
}

        File files = new File(path);
        if (!files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Multiple directories are created!");
            }
             else {
                System.out.println("Failed to create multiple directories!");
            }
        }
        HttpSession session=request.getSession();  
        session.setAttribute("enroll",enrollment_no);
        session.setAttribute("full_path",path);
        session.setAttribute("stu_photo",img_name); 
        if(!(request.getParameter("submit").equalsIgnoreCase("save"))){
        out.print("<script>");
        out.print("alert('Data Added to Admission Table !');");
        out.print("location='fileUpload.jsp';");
        out.print("</script>");    
        }
        else{
            
            out.print("<script>");
        out.print("alert('Data Successfully Updated !');");
        out.print("location='admission_view.jsp';");
        out.print("</script>");   
        }
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
            Logger.getLogger(addmission_add.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(addmission_add.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addmission_add.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(addmission_add.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(addmission_add.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addmission_add.class.getName()).log(Level.SEVERE, null, ex);
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

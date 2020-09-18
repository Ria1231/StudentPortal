package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Date;

public final class fees_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 //        if(session.getAttribute("user")!=null){
        // if(session.getAttribute("user").equals("")){
       
      out.write("<script>alert(\"Authentication Failure !\");\n");
      out.write("                    location='login.html';</script>\n");
      out.write("                    ");
// }
//else{
      out.write("  \n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.html", out, false);
      out.write("\n");
      out.write("        ");

        int cash=0,cheque=0,dd=0,ot=0,amount=0,c_amount=0,ch_amount=0,dd_amount=0,ot_amount=0,due_amount=0,damount=0;
        String bank_name="",ch_date="",
                c_date="",dd_name="",dd_date="",
                ot_ref="",ot_date="",c_pay_id="",ch_pay_id="",dd_pay_id="",ot_pay_id="",
                sem="",pay_list="";
        int stu_fee_id=0,stu_enroll=0,ch_no=0,stu_add_id=0;
        long millis=System.currentTimeMillis();
        Date d=new Date(millis);
        stu_enroll=Integer.parseInt(request.getParameter("stu_enroll"));
        stu_add_id=Integer.parseInt(request.getParameter("stu_add_id"));
        sem=request.getParameter("sem");
        cheque=Integer.parseInt(request.getParameter("cheque"));
        cash=Integer.parseInt(request.getParameter("cash"));
        dd=Integer.parseInt(request.getParameter("dd"));
        ot=Integer.parseInt(request.getParameter("ot"));
        
//        out.println("<script>alert("+stu_enroll+")</script>");
//        out.println("<script>alert("+stu_add_id+")</script>");
        if(cash==101){
            c_pay_id="C0"+sem;
            
            if(pay_list.equals("")) {
            pay_list = c_pay_id;
            } else {
                pay_list += "," + c_pay_id;
            }
            c_amount=Integer.parseInt(request.getParameter("c_amount"));
            c_date=request.getParameter("c_date");
            out.println("cash");
            out.println(c_amount);
            out.println(c_date);
        }else{
//        out.println("<script>alert("+cash+")</script>");
        }
        if(cheque==102){
            ch_pay_id="CH0"+sem;
            if(pay_list.equals("")) {
            pay_list = ch_pay_id;
            } else {
                pay_list += "," + ch_pay_id;
            }
            ch_no=Integer.parseInt(request.getParameter("ch_no"));
            bank_name=request.getParameter("bank_name");
            ch_amount=Integer.parseInt(request.getParameter("ch_amount"));
            ch_date=request.getParameter("ch_date");
            out.println("cheque");
            out.println(ch_no);
            out.println(bank_name);
            out.println(ch_amount);
            out.println(ch_date);
            out.println("<br>");
        }else{
        out.println("<script>alert("+cheque+")</script>");}
        if(dd==103){
            dd_pay_id="DD0"+sem;
            if(pay_list.equals("")) {
            pay_list = dd_pay_id;
            } else {
                pay_list += "," + dd_pay_id;
            }
            dd_name=request.getParameter("dd_name");
            dd_amount=Integer.parseInt(request.getParameter("dd_amount"));
            dd_date=request.getParameter("dd_date");
            out.println("dd");
            out.println(dd_name);
            out.println(dd_amount);
            out.println(dd_date);
            out.println("<br>"); 
        }else{
//        out.println("<script>alert("+dd+")</script>");
        }
        if(ot==104){
            ot_pay_id="OT0"+sem;
            if(pay_list.equals("")) {
            pay_list = ot_pay_id;
            } else {
                pay_list += "," + ot_pay_id;
            }
            ot_ref=request.getParameter("ot_ref");
            ot_amount=Integer.parseInt(request.getParameter("ot_amount"));
            ot_date=request.getParameter("ot_date");
            out.println(ot_ref);
            out.println(ot_amount);
            out.println(ot_date);
            out.println("ot");
        }else{
        }
      
try{
                Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
            Statement st=c.createStatement();
            
            String qry1="update stu_fees_details set payment_method_id='"+pay_list+"',date='"+d+"' where stu_admission_id="+stu_add_id;
            int i=st.executeUpdate(qry1);
            out.println(i);
            out.println("<script>alert("+i+" row updated,fees added)</script>");
            
            PreparedStatement ps=c.prepareStatement("select stu_fee_id,due_amount from stu_fees_details where stu_admission_id="+stu_add_id);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
               stu_fee_id=rs.getInt("stu_fee_id");
               due_amount=rs.getInt("due_amount");
            }
            if(c_pay_id.equalsIgnoreCase("C01")){
                PreparedStatement ps1=c.prepareStatement("insert into cash_detail(stu_fee_id,enrollment_no,amount,c_date) values(?,?,?,?)");
                ps1.setInt(1, stu_fee_id);
                ps1.setInt(2, stu_enroll);
                ps1.setInt(3,c_amount);
                ps1.setString(4,c_date);
                int i1=ps1.executeUpdate();
                out.print("Cash update"+i1);
            }
            if(ch_pay_id.equalsIgnoreCase("CH0"+sem)){
                PreparedStatement ps2=c.prepareStatement("insert into cheque_detail(stu_fee_id,enrollment_no,cheque_no,bank_name,amount,c_date) values(?,?,?,?,?,?)");
                ps2.setInt(1, stu_fee_id);
                ps2.setInt(2, stu_enroll);
                ps2.setInt(3, ch_no);
                ps2.setString(4,bank_name);
                ps2.setInt(5,ch_amount);
                ps2.setString(6,ch_date);
                int i1=ps2.executeUpdate();
                out.print("cheque update"+i1);
            }
            if(dd_pay_id.equalsIgnoreCase("DD0"+sem)){
                PreparedStatement ps2=c.prepareStatement("insert into dd_detail(stu_fee_id,enrollment_no,name,amount,c_date) values(?,?,?,?,?)");
                ps2.setInt(1, stu_fee_id);
                ps2.setInt(2, stu_enroll);
                ps2.setString(3, dd_name);
                ps2.setInt(4,dd_amount);
                ps2.setString(5,dd_date);
                int i1=ps2.executeUpdate();
                out.print("dd update"+i1);
            }
            if(ot_pay_id.equalsIgnoreCase("OT0"+sem)){
                PreparedStatement ps2=c.prepareStatement("insert into ot_detail(stu_fee_id,enrollment_no,ref_no,amount,c_date) values(?,?,?,?,?)");
                ps2.setInt(1, stu_fee_id);
                ps2.setInt(2, stu_enroll);
                ps2.setString(3, ot_ref);
                ps2.setInt(4,ot_amount);
                ps2.setString(5,ot_date);
                int i1=ps2.executeUpdate();
                out.print("dd update"+i1);
            }
            amount=c_amount+ch_amount+dd_amount+ot_amount;
            damount=due_amount-amount;
            String qry="update stu_fees_details set amount='"+amount+"',due_amount='"+damount+"' where stu_admission_id="+stu_add_id;
            int i1=st.executeUpdate(qry);
            out.println("<script>alert("+amount+" updated to feed details)</script>");
            }
            catch(Exception ex){
            out.println("<br>error"+ex.getLocalizedMessage());
            }
//}
//}

            

      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

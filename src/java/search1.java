/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author uspan
 */
public class search1 extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet search1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet search1 at " + request.getContextPath() + "</h1>");
            
            String search_by=request.getParameter("s_by");
     String value=request.getParameter("sname");
     
     HttpSession session=request.getSession();  
//        session.setAttribute("s_by",search_by);
//        session.setAttribute("sname",value);
//        session.setMaxInactiveInterval(60);
if(session.getAttribute("check").equals("")){
     RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
}
if(session.getAttribute("check").equals("import_search")){
        session.setAttribute("s_by",search_by);
        session.setAttribute("sname",value);
        RequestDispatcher rd=request.getRequestDispatcher("view.jsp");
        rd.forward(request, response);
}
if(session.getAttribute("check").equals("admission_search")){
        session.setAttribute("s_by",search_by);
        session.setAttribute("sname",value);
        RequestDispatcher rd=request.getRequestDispatcher("admission_view.jsp");
        rd.forward(request, response);
}
if(session.getAttribute("check").equals("enquiry_search")){
        session.setAttribute("s_by",search_by);
        session.setAttribute("sname",value);
        RequestDispatcher rd=request.getRequestDispatcher("enquiry_view.jsp");
        rd.forward(request, response);
}
if(session.getAttribute("check").equals("fees_search")){
        session.setAttribute("s_by",search_by);
        session.setAttribute("sname",value);
        RequestDispatcher rd=request.getRequestDispatcher("fees_detail.jsp");
        rd.forward(request, response);
}

        out.print("<script>");
            out.print("alert('servlet Uploded');");
            out.print("location='admission_view.jsp';");
            out.print("</script>");
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
        processRequest(request, response);
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
        processRequest(request, response);
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

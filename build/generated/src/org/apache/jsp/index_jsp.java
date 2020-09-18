package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dashboard</title>\n");
      out.write("<!--        <link type=\"text/javascript\" href=\"js/Chart.min.js\">\n");
      out.write("        <link type=\"text/stylesheet\" href=\"js/Chart.min.css\">\n");
      out.write("        <link type=\"text/javascript\" href=\"js/analytics.js\">\n");
      out.write("        <link type=\"text/javascript\" href=\"js/javascript.util.min.js\">-->\n");
      out.write("\n");
      out.write("        <!--DashBoard-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendors/mdi/css/materialdesignicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/vendors/css/vendor.bundle.base.css\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<script async=\"\" src=\"//www.google-analytics.com/analytics.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js\"></script>\n");
      out.write("\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/javascript.util/0.12.12/javascript.util.min.js\"></script>\n");
      out.write("        <style type=\"text/css\">/* Chart.js */\n");
      out.write("            @keyframes chartjs-render-animation{from{opacity:.99}to{opacity:1}}\n");
      out.write("            .chartjs-render-monitor{animation:chartjs-render-animation 1ms}\n");
      out.write("            .chartjs-size-monitor,.chartjs-size-monitor-expand,\n");
      out.write("            .chartjs-size-monitor-shrink{position:relative;direction:ltr;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:1}\n");
      out.write("            .chartjs-size-monitor-expand>div{position:absolute;width:1000000px;height:1000000px;left:0;top:0}\n");
      out.write("            .chartjs-size-monitor-shrink>div{position:relative;width:200%;height:200%;left:0;top:0}</style>\n");
      out.write("        <script src=\"https://canvasjs.com/assets/script/canvasjs.min.js\"></script>\n");
      out.write("    </head>    \n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        .dash_main{\n");
      out.write("            height: 10vw;\n");
      out.write("            width: 20vw;\n");
      out.write("            background-repeat:no-repeat;\n");
      out.write("            background-size: cover;\n");
      out.write("            border-radius: 0.5vw;\n");
      out.write("            margin: 3vw;\n");
      out.write("            color:white;\n");
      out.write("           -webkit-box-shadow: 21px 10 99px -13px rgba(92,87,92,0.9);\n");
      out.write("            -moz-box-shadow: 21px 10px 99px -13px rgba(92,87,92,0.9);\n");
      out.write("            box-shadow: 21px 10px 99px -13px rgba(92,87,92,0.9);\n");
      out.write("        }\n");
      out.write("        .dash_main:hover{\n");
      out.write("            -moz-transform: scale(1.05);\n");
      out.write("            -webkit-transform: scale(1.05);\n");
      out.write("            -o-transform: scale(1.05);\n");
      out.write("            -ms-transform: scale(1.05);\n");
      out.write("            transform: scale(1.05);\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <body style=\"margin:0px;\">\n");
      out.write("               ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.html", out, false);
      out.write("\n");
      out.write("        ");

            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
                PreparedStatement ps=c.prepareStatement("Select * from stu_users");
                ResultSet rs=ps.executeQuery();
                String user="",user_p="";
                while(rs.next()){
                    user=rs.getString(2);
                    user_p=rs.getString(3);
                }
            if(request.getParameter("request")!=null){
            String uname=request.getParameter("uname");
            String pass=request.getParameter("pass");
            if(uname.equalsIgnoreCase(user)){
                if(pass.equals(user_p)){
                    session.setAttribute("user", user);

      out.write("<script>alert(\"Logged In Successfully !\");</script>");

}
else{
 
      out.write("<script>alert(\"Password Incorrect !\");\n");
      out.write("                    location='login.html';</script>\n");
}
            }
else{
 
      out.write("<script>alert(\"Username Incorrect !\");\n");
      out.write("                    location='login.html';</script>\n");
      out.write("                    ");

}
} 
      out.write("\n");
      out.write("        <div style=\"background-color:whitesmoke;width: 100%;\n");
      out.write("             box-shadow: inset 0.1vw 0.1vw 0.7vw lightgray;\">\n");
      out.write("            <form action=\"upload.jsp\" method=\"post\" enctype=\"multipart/form-data\" style=\"margin-left: 20vw;\">\n");
      out.write("                <br>\n");
      out.write("                  <span style=\"font-size:1.3vw; font: 800; margin-left: 0.5vw;\">Import Data From <img src=\"css/icons/excel.png\" style=\"height:3vw; width: 3vw;margin-bottom:-1vw;\" /> : &nbsp;&nbsp;</span>\n");
      out.write("                <input type=\"file\" name=\"file_name\" style=\"font-size:1.3vw;\" size=\"50\"/>\n");
      out.write("                <input type=\"submit\" value=\"Import\" class=\"sub_btn\"/><br><br>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"dash_main\" style=\"background-image: url('css/icons/gr4.jpg')\">\n");
      out.write("            <div style=\"padding:1.5vw 1vw;font-size: 2vw\">Addmission</div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"dash_main\" style=\"background-image: url('css/icons/gr3.jpg');\n");
      out.write("             position: absolute;left: 24vw;top: 10vw\">\n");
      out.write("            <div style=\"padding:1.5vw 1vw;font-size: 2vw\">Enquiry</div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"dash_main\" style=\"background-image: url('css/icons/gr6.jpg');\n");
      out.write("             position: absolute;left: 48vw;top: 10vw\">\n");
      out.write("            <div style=\"padding:1.5vw 1vw;font-size: 2vw\">Batch</div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"dash_main\" style=\"background-image: url('css/icons/New Project.jpg');\n");
      out.write("             position: absolute;left: 73vw;top: 10vw\">\n");
      out.write("            <div style=\"padding:1.5vw 1vw;font-size: 2vw\">Course</div>\n");
      out.write("        </div>\n");
      out.write("        ");

            String uname=request.getParameter("uname");
            String pass=request.getParameter("pass");
            
//if (uname.equalsIgnoreCase("admin")) {
//    if(pass.equalsIgnoreCase("admin@123")){
        
      out.write("\n");
      out.write("        <script>\n");
      out.write("//            alert(\"Loggined Successfully\");\n");
      out.write("        </script>\n");
      out.write("        ");

//    }
//else{

      out.write("\n");
      out.write("        <script>\n");
      out.write("//            alert(\"Password Incorrect\");\n");
      out.write("//            location='login.html';\n");
      out.write("        </script>\n");

//}
//        
//    }
//else{

      out.write("\n");
      out.write("<script>//\n");
      out.write("//            alert(\"UserName Incorrect!!\");\n");
      out.write("//            location='login.html';\n");
      out.write("        </script>\n");

//}
            
            
      out.write("\n");
      out.write("            \n");
      out.write("        \n");
      out.write("<script>\n");
      out.write("//charts\n");
      out.write("window.onload = function () {\n");
      out.write("\n");
      out.write("var chart1 = new CanvasJS.Chart(\"chartContainer1\", {\n");
      out.write("\tanimationEnabled: true,\n");
      out.write("\ttheme: \"light2\",\n");
      out.write("\t//title:{\n");
      out.write("\t//\ttext: \"Enquiry \"\n");
      out.write("\t//},\n");
      out.write("\taxisY:{\n");
      out.write("\t\tincludeZero: false\n");
      out.write("\t},\n");
      out.write("\tdata: [{        \n");
      out.write("\t\ttype: \"line\",       \n");
      out.write("\t\tdataPoints: [\n");
      out.write("\t\t\t{ y: 450 },\n");
      out.write("\t\t\t{ y: 414},\n");
      out.write("\t\t\t{ y: 520, indexLabel: \"highest\",markerColor: \"red\", markerType: \"triangle\" },\n");
      out.write("\t\t\t{ y: 460 },\n");
      out.write("\t\t\t{ y: 450 },\n");
      out.write("\t\t\t{ y: 500 },\n");
      out.write("\t\t\t{ y: 480 },\n");
      out.write("\t\t\t{ y: 480 },\n");
      out.write("\t\t\t{ y: 410 , indexLabel: \"lowest\",markerColor: \"DarkSlateGrey\", markerType: \"cross\" },\n");
      out.write("\t\t\t{ y: 500 },\n");
      out.write("\t\t\t{ y: 480 },\n");
      out.write("\t\t\t{ y: 510 }\n");
      out.write("\t\t]\n");
      out.write("\t}]\n");
      out.write("});\n");
      out.write("chart1.render();\n");
      out.write("\n");
      out.write("var chart2 = new CanvasJS.Chart(\"chartContainer2\", {\n");
      out.write("\tanimationEnabled: true,\n");
      out.write("\ttheme: \"light2\",\n");
      out.write("\t//title:{\n");
      out.write("\t//\ttext: \"Admissions \"\n");
      out.write("\t//},\n");
      out.write("\taxisY:{\n");
      out.write("\t\tincludeZero: false\n");
      out.write("\t},\n");
      out.write("\tdata: [{        \n");
      out.write("\t\ttype: \"line\",       \n");
      out.write("\t\tdataPoints: [\n");
      out.write("\t\t\t{ y: 450 },\n");
      out.write("\t\t\t{ y: 425},\n");
      out.write("\t\t\t{ y: 570, indexLabel: \"highest\",markerColor: \"red\", markerType: \"triangle\" },\n");
      out.write("\t\t\t{ y: 470 },\n");
      out.write("\t\t\t{ y: 450 },\n");
      out.write("\t\t\t{ y: 500 },\n");
      out.write("\t\t\t{ y: 480 },\n");
      out.write("\t\t\t{ y: 480 },\n");
      out.write("\t\t\t{ y: 410 , indexLabel: \"lowest\",markerColor: \"DarkSlateGrey\", markerType: \"cross\" },\n");
      out.write("\t\t\t{ y: 540 },\n");
      out.write("\t\t\t{ y: 500 },\n");
      out.write("\t\t\t{ y: 520 }\n");
      out.write("\t\t]\n");
      out.write("\t}]\n");
      out.write("});\n");
      out.write("chart2.render();\n");
      out.write("\n");
      out.write("//bar graph\n");
      out.write("var chart = new CanvasJS.Chart(\"chartContainer\", {\n");
      out.write("\tanimationEnabled: true,\n");
      out.write("        theme:\"light2\",\n");
      out.write("\t//title:{\n");
      out.write("\t//\ttext: \"Total Enquiries and Admissions Over past years\"\n");
      out.write("\t//},\n");
      out.write("\taxisY: {\n");
      out.write("\t\ttitle: \"Students\"\n");
      out.write("\t},\n");
      out.write("\tlegend: {\n");
      out.write("\t\tcursor:\"pointer\",\n");
      out.write("\t\titemclick : toggleDataSeries\n");
      out.write("\t},\n");
      out.write("\ttoolTip: {\n");
      out.write("\t\tshared: true,\n");
      out.write("\t\tcontent: toolTipFormatter\n");
      out.write("\t},\n");
      out.write("\tdata: [{\n");
      out.write("\t\ttype: \"bar\",\n");
      out.write("\t\tshowInLegend: true,\n");
      out.write("\t\tname: \"Gold\",\n");
      out.write("\t\tcolor: \"gold\",\n");
      out.write("\t\tdataPoints: [\n");
      out.write("\t\t\t{ y: 262, label: \"2015\" },\n");
      out.write("\t\t\t{ y: 130, label: \"2016\" },\n");
      out.write("\t\t\t{ y: 248, label: \"2017\" },\n");
      out.write("\t\t\t{ y: 322, label: \"2018\" },\n");
      out.write("\t\t\t{ y: 390, label: \"2019\" }\n");
      out.write("\t\t]\n");
      out.write("\t},\n");
      out.write("\t{\n");
      out.write("\t\ttype: \"bar\",\n");
      out.write("\t\tshowInLegend: true,\n");
      out.write("\t\tname: \"Silver\",\n");
      out.write("\t\tcolor: \"silver\",\n");
      out.write("\t\tdataPoints: [\n");
      out.write("\t\t\t{ y: 212, label: \"2015\" },\n");
      out.write("\t\t\t{ y: 186, label: \"2016\" },\n");
      out.write("\t\t\t{ y: 272, label: \"2017\" },\n");
      out.write("\t\t\t{ y: 299, label: \"2018\" },\n");
      out.write("\t\t\t{ y: 270, label: \"2019\" }\n");
      out.write("\t\t]\n");
      out.write("\t}]\n");
      out.write("});\n");
      out.write("chart.render();\n");
      out.write("\n");
      out.write("function toolTipFormatter(e) {\n");
      out.write("\tvar str = \"\";\n");
      out.write("\tvar total = 0 ;\n");
      out.write("\tvar str3;\n");
      out.write("\tvar str2 ;\n");
      out.write("\tfor (var i = 0; i < e.entries.length; i++){\n");
      out.write("\t\tvar str1 = \"<span style= \\\"color:\"+e.entries[i].dataSeries.color + \"\\\">\" + e.entries[i].dataSeries.name + \"</span>: <strong>\"+  e.entries[i].dataPoint.y + \"</strong> <br/>\" ;\n");
      out.write("\t\ttotal = e.entries[i].dataPoint.y + total;\n");
      out.write("\t\tstr = str.concat(str1);\n");
      out.write("\t}\n");
      out.write("\tstr2 = \"<strong>\" + e.entries[0].dataPoint.label + \"</strong> <br/>\";\n");
      out.write("\tstr3 = \"<span style = \\\"color:Tomato\\\">Total: </span><strong>\" + total + \"</strong><br/>\";\n");
      out.write("\treturn (str2.concat(str)).concat(str3);\n");
      out.write("}\n");
      out.write("\n");
      out.write("function toggleDataSeries(e) {\n");
      out.write("\tif (typeof (e.dataSeries.visible) === \"undefined\" || e.dataSeries.visible) {\n");
      out.write("\t\te.dataSeries.visible = false;\n");
      out.write("\t}\n");
      out.write("\telse {\n");
      out.write("\t\te.dataSeries.visible = true;\n");
      out.write("\t}\n");
      out.write("\tchart.render();\n");
      out.write("}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("    .card-body{\n");
      out.write("        box-shadow: 0.1vw 0.1vw 0.5vw 0.05vw #ccc;\n");
      out.write("        background-color:whitesmoke;\n");
      out.write("        width: 42vw;\n");
      out.write("        height: 24.5vw;\n");
      out.write("        margin-left: 2vw;\n");
      out.write("        margin-top: 2vw;\n");
      out.write("        padding: 0vw;\n");
      out.write("        padding-bottom: 1vw;\n");
      out.write("        border: thin solid #666666;\n");
      out.write("    }\n");
      out.write("    .title{\n");
      out.write("        text-align: center;\n");
      out.write("        font-size: 1.5vw;\n");
      out.write("        width: 100%;\n");
      out.write("        height: 2.5vw;\n");
      out.write("        background-color: #ccc;\n");
      out.write("        border-bottom: thin solid #666666;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    #chartContainer1{\n");
      out.write("        margin: 1vw;\n");
      out.write("        height: 20vw;\n");
      out.write("        width: 40vw;\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    #chartContainer2{\n");
      out.write("        margin: 1vw;\n");
      out.write("        height: 20vw;\n");
      out.write("        width: 40vw;\n");
      out.write("        top:2vw;\n");
      out.write("    }\n");
      out.write("    #chartContainer{\n");
      out.write("        margin: 1vw;\n");
      out.write("        height: 20vw;\n");
      out.write("        width: 40vw;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("        <div class=\"title\">Enquiry\n");
      out.write("            <div id=\"chartContainer1\"></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("        <div class=\"title\">Admission\n");
      out.write("        <div id=\"chartContainer2\"></div>\n");
      out.write("        </div></div>\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("        <div class=\"title\">Enquiry & Admission\n");
      out.write("        <div id=\"chartContainer\"></div>\n");
      out.write("        </div></div>\n");
      out.write("<br>\n");
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

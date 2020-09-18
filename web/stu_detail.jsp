<%@page import="java.sql.Date"%>
<%@page import="javax.servlet.annotation.MultipartConfig"%>
<%@page import="java.util.Base64"%>
<%@page import="java.io.ByteArrayOutputStream"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Detail</title>
        <link rel="stylesheet" type="" href="css/main.css">
        <jsp:include page="base.html"/><br>
       <style>
     * {
	 margin: 0;
	 box-sizing: border-box;
	 padding: 0;
}
 html, body {
	 width: 100%;
	 height: 100%;
	 overflow: hidden;
	 
}
 .wrapper {
	 width: 100%;
	 height: 100%;
	 -webkit-perspective: 200vw;
	 padding: 5vw;
	 perspective: 200vw;
	 display: flex;
	 justify-content: center;
	 align-items: center;
         position:absolute;
         top:2.5vw;
         
}
 .left, .middle, .right {
	 float: left;
	 position: relative;
	 height: 100%;
	 background-color: #fff;
	 width: 33%;
	 max-width: 40vw;
	 max-height:37vw;
}
 .left, .right {
	 transition: 0.7s ease-in-out;
}
 .left.open, .right.open {
	 transform: rotateY(0deg);
	 transition: 0.7s ease-in-out;
}
 .left {
	 z-index: 20;
	 transform: rotateY(180deg);
	 transform-origin: 100% 50%;
}
 .right {
	 transform: rotateY(-180deg);
	 transform-origin: 0% 50%;
}
 .front, .back {
	 height: 100%;
	 width: 100%;
	 position: absolute;
	 background-color: #fff;
	 top: 0;
}
 .front {
	 transform: rotateY(180deg);
	 z-index: 5;
}
 .back {
	 background-color: #fff;
	 z-index: 4;
	 backface-visibility: hidden;
	
}
 .back.open {
	 z-index: 10;
}
 .openb {
     
  background-color:#CCCCCC;
  border: none;
  padding: 0.8vw 1vw;
  text-align: center;
  display: inline-block;
  font-size: 1.3vw;
  box-shadow:inset 0 -0.6em 1em -0.35em rgba(0,0,0,0.3),inset 0 0.6em 2em -0.3em rgba(255,255,255,0.15),inset 0 0 0em 0.05em rgba(255,255,255,0.22);
  border-radius: 0.5vw;
  margin: 5px 20px 50px 90px;

}

.openb:active  {
    box-shadow:inset 0 0.6em 2em -0.3em rgba(0,0,0,0.15),inset 0 0 0em 0.05em rgba(255,255,255,0.12);
 
}
 .closeb {
     
	 position: absolute;
	 border: none;
	 background-color: rgba(0, 0, 0, 0.4);
	 color: white;
	 z-index: 50;
	 width: 3vw;
	 font-size: 1.5em;
	 cursor: pointer;
	 height: 3vw;
	 top: 1vw;
	 right: 1vw;
	 border-radius: 50%;
	 display: none;
}
 .closeb:hover {
	 background-color: rgba(0, 0, 0, 0.2);
	 transition: 0.2s ease-in-out;
}
 
 .sectionWrap {
	 height: 100%;
	 width: 100%;
	 padding: 3vw;
	 box-sizing: border-box;
	 overflow: hidden;
         background-color: lightgray;
         /*background-image: linear-gradient(whitesmoke,grey);*/
         /*background-image: url('css/final_1.jpg');*/
         
}
.shadow{
    /*box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);*/
}
.heading {
	 font-family:tahoma;
	 line-height: 1;
	 color: #34495e;
         font-size: 2vw;
         font-weight: 300;
        /*text-shadow: 0.2vw 0.2vw 0.3vw gray;*/
}
.p {
	 font-family:open sans;
	 font-size: 1.1em;
	 max-height: 100px;
	 text-overflow: clip;
}
.main_detail td.a1{
    align: left;
    font-family:sans-serif;
    font-size: 1.3vw;
    font-weight: bold;
    /*text-shadow: 0.2vw 0.2vw 0.3vw gray;*/
    padding: 0.5vw 1vw;
}

.main_detail td{
   font-weight: 500;
   text-shadow: 0.2vw 0.2vw 0.3vw gray;
}
th,td{
    text-align: left;
    width: 9vw;
    padding: 0.2vw;
}
.acad th,.acad td{
    padding: 0.5vw;
    text-align:center;
    font-size: 1vw;
    
}
fieldset th,fieldset td{
    text-align: left;
    padding: 0.1vw;
}
.stu_img{
margin-left: 7.5vw;  

}
    </style>
    
    </head>    
    <style>
        
        body{
            font-family: "ubuntu-regular", sans-serif;
        }
        fieldset {
  display: block;
/* margin-left: 0.2vw;*/
  margin-right: 1vw;
  padding: 1vw;
  border: 0.2vw groove (internal value);
  width: 8vw;
}
    </style>
    <body>
        <%        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       %><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <% }
else{%>
        <% 
            String name="",mob1="",mob2="",email="",state="",city="",address="",pincode="",stu_dob="",ac="",gen="",bg="",cate="",
    fname="",mname="",fmob1="",fmob2="",mmob1="",mmob2="",femail="",memail="",focc="",mocc="",fcmp="",mcmp="",
    fdesg="",mdesg="",scl_12="",stream_12="",board_12="",grade_12="",date="",gapr="",achiev="",batch="",edate="",
    scl_10="",stream_10="",board_10="",grade_10="",course="",ref_by="",counsellor="",eid="",aid="",path="";
    int aform=0,e_num=0,pyr_12=0,pyr_10=0,gyr=0;
    
    long millis=System.currentTimeMillis();
    Date d=new Date(millis);
    
            String id1=request.getParameter("id1");
    Class.forName("com.mysql.jdbc.Driver");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
    PreparedStatement ps=c.prepareStatement("Select * from stu_admission where stu_admission_id="+id1);
    ResultSet rs=ps.executeQuery();
    while(rs.next()){
        aform=rs.getInt(1);
                e_num=rs.getInt(2);
                name=rs.getString(4);
                address=rs.getString(5);
                state=rs.getString(6);
                city=rs.getString(7);
                pincode=rs.getString(8);
                mob1=rs.getString(9);
                mob2=rs.getString(10);
                email=rs.getString(11);
                stu_dob=rs.getDate(12).toString();
                ac=rs.getString(13);
                gen=rs.getString(14);
                bg=rs.getString(15);
                cate=rs.getString(16);
                fname=rs.getString(17);
                fmob1=rs.getString(18);
                fmob2=rs.getString(19);
                femail=rs.getString(20);
                focc=rs.getString(21);
                fcmp=rs.getString(21);
                fdesg=rs.getString(23);
                mname=rs.getString(24);
                mmob1=rs.getString(25);
                mmob2=rs.getString(26);
                memail=rs.getString(27);
                mocc=rs.getString(28);
                mcmp=rs.getString(29);
                mdesg=rs.getString(30);
                scl_12=rs.getString(31);
                stream_12=rs.getString(32);
                board_12=rs.getString(33);
                pyr_12=Integer.parseInt(rs.getString(34));                
                grade_12=rs.getString(35);
                scl_10=rs.getString(36);
                stream_10=rs.getString(37);
                board_10=rs.getString(38);
                pyr_10=Integer.parseInt(rs.getString(39));
                grade_10=rs.getString(40);
                gyr=Integer.parseInt(rs.getString(41));
                gapr=rs.getString(42);
                achiev=rs.getString(43);
                course=rs.getString(44);
                batch=rs.getString(45);
                eid=rs.getString(46);
                edate=rs.getDate(47).toString();
                counsellor=rs.getString(48);
                d=rs.getDate(49);
                ref_by=rs.getString(50);
                path=rs.getString(51);
%>
    <% 
        }
    %>
        <div class="wrapper">
            <div class="left">
                <div class="front">
                    <div class="sectionwrap">
                        <div class="stu_img">
                            
                            <img src="<%= path%>/stu_photo.jpg" style="height:8vw;width: 8vw">
                            </div>
                        <br><br>
                            <div class="details">
                                <table border="0" class="main_detail">
                                    <tr>
                                        <td class="a1">Name</td>
                                        <td><%= name %></td>
                                    </tr>
                                    <tr>
                                        <td class="a1">DOB</td>
                                        <td><%= stu_dob %></td>
                                    </tr>
                                    <tr>
                                        <td class="a1">Email</td>
                                        <td><%= email %></td>
                                    </tr>
                                    <tr>
                                        <td class="a1">Phone No. </td>
                                        <td><%= mob1 %></td>
                                    </tr>
                                    <tr>
                                        <td class="a1">Category </td>
                                        <td><%= cate %></td>
                                    </tr>
                                    <tr>
                                        <td class="a1">Course </td>
                                        <td><%= course %></td>
                                    </tr>
                                    
                                    
                                </table>

                            </div>
                        <br>

                        <button class="openb"><p>View More....</p></button>
                    </div>
                </div>
                
                <div class="back">
                    <div class="sectionwrap">
                        <div class="heading" style="text-align: center">Personal Details</div>
                        <br><br>
                        
                       <table border='0'>
                        <tr>
                            <th>Student Name</th>
                            <td><%= name %></td>
                        </tr>
                        <tr>
                            <th>Mobile No.(1)</th>
                            <td><%= mob1 %></td>
                        </tr>
                        <tr>
                            <th>Mobile No.(2)</th>
                            <td><%= mob2 %></td>
                        </tr>
                        <tr>
                            <th>Email Id</th>
                            <td><%= email %></td>
                        </tr>
                        <tr>
                            <th>DOB</th>
                            <td><%= stu_dob %></td>
                        </tr>
                        <tr>
                            <th>Gender</th>
                            <td><%= gen %></td>
                        </tr>
                        <tr>
                            <th>Category</th>
                            <td><%= cate %></td>
                        </tr>
                        <tr>
                            <th>Blood Group</th>
                            <td><%= bg %></td>
                        </tr>
                        
                        <tr>
                             <th>Address </th>
                             <td style="word-wrap: normal"><%= address %>,<br><%= city %>,<%= state %>,<%= pincode %></td>
                        </tr>
                    </table>
                    
                    </div>
                </div>
            </div>
            
            
            <div class="middle">
                <div class="sectionwrap">
                    <div class="heading" style="text-align: center">Parents Details</div>
                    <br>
                    <fieldset style="position: absolute;left: 0vw;">
                        <legend>Father</legend>
                            <table border='0'>
                                <tr><th>Name</th></tr>
                                <tr><td><%= fname %></td></tr>
                                <tr><th>Mobile No.</th></tr>
                                <tr><td>(1) <%= fmob1 %></td></tr>
                                <tr><td>(2) <%= fmob2 %></td></tr>
                                <tr><th>Email Id</th></tr>
                                <tr><td><%= femail %></td></tr>
                                
                                <tr><th>Occupation</th></tr>
                                <%if(focc.equalsIgnoreCase("")){%>
                                <tr><td>-</td></tr><%}else{%>
                                <tr><td><%= focc %></td></tr><%}%>
                                
                                <tr><th>Company Name</th></tr>
                                <%if(fcmp.equalsIgnoreCase("")){%>
                                <tr><td>-</td></tr><%}else{%>
                                <tr><td><%= fcmp %></td></tr><%}%>
                                
                                <tr><th>Designation</th></tr>
                                <%if(fdesg.equalsIgnoreCase("")){%>
                                <tr><td>-</td></tr><%}else{%>
                                <tr><td>-<%= fdesg %></td></tr><%}%>
                            </table>
                    </fieldset>
                            
                    <fieldset style="position: absolute;left: 15vw;top: 6.26vw">
                        <legend>Mother</legend>
                            <table border='0'>
                                <tr><th>Name</th></tr>
                                <tr><td><%= mname %></td></tr>
                                <tr><th>Mobile No.</th></tr>
                                <tr><td>(1) <%= mmob1 %></td></tr>
                                <tr><td>(2) <%= mmob2 %></td></tr>
                                
                                <tr><th>Email Id</th></tr>
                                <%if(memail.equalsIgnoreCase("")){%>
                                <tr><td>-</td></tr><%}else{%>
                                <tr><td><%= memail %></td></tr><%}%>
                                
                                <tr><th>Occupation</th></tr>
                                <%if(mocc.equalsIgnoreCase("")){%>
                                <tr><td>-</td></tr><%}else{%>
                                <tr><td><%= mocc %></td></tr><%}%>
                                
                                <tr><th>Company Name</th></tr>
                                <%if(mcmp.equalsIgnoreCase("")){%>
                                <tr><td>-</td></tr><%}else{%>
                                <tr><td><%= mcmp %></td></tr><%}%>
                                
                                <tr><th>Designation</th></tr>
                                <%if(mdesg.equalsIgnoreCase("")){%>
                                <tr><td>-</td></tr><%}else{%>
                                <tr><td>-<%= mdesg %></td></tr><%}%>
                            </table>
                    </fieldset>
                       
                </div>                
            </div>
            
            <div class="right">
                <div class="sectionwrap">
                    <div class="heading" style="text-align: center">Academic Details</div>
                    <br>
                        <table border='1'  style="border-collapse: collapse" class="acad">
                        <tr>
                            <td></td>
                            <th>School</th>
                            <th>Stream</th>
                            <th>Board</th>
                            <th>Passing<br>Year</th>
                            <th>Grade</th>
                        </tr>
                        <tr>
                            <td>12<sup>th</sup></td>
                            <td><%= scl_12 %></td>
                            <td><%= stream_12 %></td>
                            <td><%= board_12 %></td>
                            <td><%= pyr_12 %></td>
                            <td><%= grade_12 %></td>
                        </tr>
                        <tr>
                            <td>10<sup>th</sup></td>
                            <td><%= scl_10 %></td>
                            <td><%= stream_10 %></td>
                            <td><%= board_10 %></td>
                            <td><%= pyr_10 %></td>
                            <td><%= grade_10 %></td>
                        </tr>
                    </table>
<!--                    <fieldset style="width: 11vw;">
                        <legend>12<sup>th</sup></legend>
                            <table border='0'>
                                <tr><th>School Name</th></tr>
                                <tr><td><%= scl_12 %></td></tr>
                                <tr><th>Stream</th></tr>
                                <tr><td><%= stream_12 %></td></tr>
                                <tr><th>Board</th></tr>
                                <tr><td><%= board_12 %></td></tr>
                                <tr><th>Passing Year</th></tr>
                                <tr><td><%= pyr_12 %></td></tr>
                                <tr><th>Grade</th></tr>
                                <tr><td><%= grade_12 %></td></tr>
                            </table>
                    </fieldset>
                    <fieldset style="width: 11vw;position: absolute;left: 16vw;top: 6.25vw">
                        <legend>10<sup>th</sup></legend>
                            <table border='0'>
                                <tr><th>School Name</th></tr>
                                <tr><td><%= scl_10 %></td></tr>
                                <tr><th>Stream</th></tr>
                                <tr><td><%= stream_10 %></td></tr>
                                <tr><th>Board</th></tr>
                                <tr><td><%= board_10 %></td></tr>
                                <tr><th>Passing Year</th></tr>
                                <tr><td><%= pyr_10 %></td></tr>
                                <tr><th>Grade</th></tr>
                                <tr><td><%= grade_10 %></td></tr>
                            </table>
                    </fieldset>        -->
                <br><br>
                    <%
                        if(gyr!=0){%>
                        <table border="0">
                            <tr><td style="width: 2vw">Gap Year</td>
                                <td><%= gyr%></td></tr>
                            <tr><td style="width: 2vw">Reason</td>
                                <td><%= gapr %></td></tr>
                        </table><br>
                        <%}
%>
                   <div class="heading" style="text-align: center">Course Details</div>
                   <br>
                    <table border="0">
                        <tr>
                            <th style="text-align: center">Course</th>
                            <th style="text-align: center">Batch</th>
                        </tr>
                        <tr>
                            <td style="text-align: center"><%=course%></td>
                            <td style="text-align: center"><%=batch%></td>
                        </tr>
                    </table>
                            
                </div>
                <button class="closeb">X</button>
            </div>
        </div>
        
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
         <script>
    $(function(){
  $(".openb").click(function(){
    $(".left").addClass("open");
    setTimeout(function(){
      $(".right").addClass("open");
    }, 250);
    setTimeout(function(){
      $(".back").addClass("open");
    }, 350);
    $(".closeb").delay(1000).fadeIn();
                  });

  $(".closeb").click(function(){
    setTimeout(function(){
      $(".left").removeClass("open");
    }, 250);
    $(".right").removeClass("open");
    setTimeout(function(){
      $(".back").removeClass("open");
    }, 600);
    $(".closeb").fadeOut();
  });
});

    
</script>
<center>
    <div class="a">Student Details</div>
</center>
 <% }}
else{
%><script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <%
} %>
    </body>
</html>
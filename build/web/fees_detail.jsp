<%-- 
    Document   : fees_detail
    Created on : 16 Mar, 2020, 9:04:48 AM
    Author     : uspan
--%>

<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fees Data</title>
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="js/bootstrap.min.js">
    </head>
    <script>
        
    </script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    
    
    <body>
        
         <%        if(session.getAttribute("user")!=null){
         if(session.getAttribute("user").equals("")){
       %>
       <script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <%  }
else{%> 
<jsp:include page="base.html"/>
       <script>
    var checkboxes=[];
    function toggle(source){
        checkboxes=document.getElementsByName('foo');
        for(var i=0, n=checkboxes.length;i<n;i++){
            checkboxes[i].checked=source.checked;
        }
    }
        </script>
        <form method="post"> 
<input style="margin-left: 1vw;font-size: 1vw;" type="checkbox" onclick="toggle(this)"/>
<span style="font-size: 1.2vw;">Select All</span>
<input type="hidden" value="fees_data" name="delete"/>
<input class="delete_btn" type="submit" value="Delete" formaction="delete.jsp"/>
<br><br>
        <table border="1" class="table table-hover" style="text-align: center;width: 99%;background-color: white;border:gray;
    margin-left: 0.5vw;font-size: 1.1vw;">
<tr style="background-color: rgba(154,169,172,1);">
<th rowspan="2" style="width: 3vw"></th>   
<th rowspan="2" style="width: 2vw">Enrollment Number</th>
<th rowspan="2">Full Name</th>
<th rowspan="2" style="width: 2vw">Current Semester</th>
<th rowspan="2">Course</th>
<th colspan="2">Fees </th>
<th rowspan="2"></th>
</tr>
<tr style="background-color: rgba(154,169,172,1);">
    <th style="width: 12vw">Paid Amount</th> 
    <th style="width: 12vw">Due Amount</th>
    
</tr>
<%  
session.setAttribute("check","fees_search");
String s_by="",sname="",stmt="",stu_name="";
int amount=0,due_amount=0,sem=0,amount_check=0;
    long millis=System.currentTimeMillis();
    Date d=new Date(millis);
    int counter=0;
    Class.forName("com.mysql.jdbc.Driver");
    Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
    s_by=request.getParameter("s_by");
    sname=request.getParameter("sname");
    if (s_by!=null && sname!=null) {
            stmt="Select * from stu_fees_details where "+s_by+" like '%"+sname+"%'";
            }
        else {
            s_by="";
            sname="";
            stmt="Select * from stu_fees_details";
        }
    
    PreparedStatement ps=c.prepareStatement(stmt);
    ResultSet rs=ps.executeQuery();
    int id=0;
    while(rs.next()){
        id=rs.getInt(2);
        stu_name=rs.getString(4);
        sem=Integer.parseInt(rs.getString(5));
        amount=rs.getInt(7);
        amount_check=sem*amount;
        
%>  
<tr id="t<%= counter%>" id1="<%= rs.getString(3) %>" id2="<%= rs.getString(2)%>">
<td style="padding: 0.5vw;vertical-align: middle;"><input type="checkbox" name="foo" value="<%= id %>"></td>    
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(3) %></td>
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(4) %></td>
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(5) %></td>
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(10) %></td>
<td style="padding: 0.2vw;vertical-align: middle;" id="a<%= counter %>"><%= rs.getString(7) %></td>
<%
    if(sem==1 && amount>= 40000){
%>
<script>
    document.getElementById("a<%= counter %>").style.backgroundColor="lightgreen";
</script>
<% }
else if(sem==2 && amount>=80000){%>
    <script>
    document.getElementById("a<%= counter %>").style.backgroundColor="lightgreen";
</script>
<% }else if(sem==3 && amount>=120000){%>
     <script>
    document.getElementById("a<%= counter %>").style.backgroundColor="lightgreen";
</script>
<% }else if(sem==4 && amount>=160000){%>
    <script>
    document.getElementById("a<%= counter %>").style.backgroundColor="lightgreen";
    </script>
<% }
else if(sem==5 && amount>=200000){%>
    <script>
    document.getElementById("a<%= counter %>").style.backgroundColor="lightgreen";
    </script>
<% }else if(sem==6 && amount>=240000){%>
    <script>
    document.getElementById("a<%= counter %>").style.backgroundColor="lightgreen";
    </script>
<% }else{%>
<script>
    document.getElementById("a<%= counter %>").style.backgroundColor="red";
</script>
<% } %>
<td style="padding: 0.2vw;vertical-align: middle;"><%= rs.getString(8) %></td>

<td style="padding: 0.2vw;vertical-align: middle;"><form method="post" style="margin-block-end: 0vw;">
        
<input type="hidden" name="id1" value="<%= id %>"/>
<input type="hidden" name="edit" value="aedit"/>

<div class="open1" style="margin: 0.3vw;
    width: 8vw;margin-right: -5.6vw;cursor: pointer">
    <input type="hidden" value="<%= id %>" class="add_fee_id">
    <img src="css/icons/add_fees.png" class="addFees_icon" alt="Add fees"/></div>
   
    <div class="popup-overlay">
    <!--Creates the popup content-->
    <div class="popup-content" >
    <!--popup's close button-->
    
    <button class="close1">X</button>
    <label>Student Name : <%= rs.getString(4)%></label><br>
    <input type="hidden" name="stu_enroll" class="stu_enroll">
    <input type="hidden" name="stu_add_id" class="stu_add_id">
    <div class="pm" id="pm1">CASH</div>
    <input type="hidden" name="cash" class="pm_type1" value="1">
    <table id="cash" style="text-align: center">
        <tr>
            <td style="width: 50%">Amount
                <input type="text" name="c_amount" class="c_amount" value="0" style="width: 15vw"></td>
        
            <td style="width: 50%">Date
                <input type="date" name="c_date" value="<%=d%>" style="width: 15vw"></td>
        </tr>
    </table>
        
    <div class="pm" id="pm2">CHEQUE</div>
    <input type="hidden" name="cheque" class="pm_type2" value="1">
    <table id="cheque">
        <tr>
            <td style="text-align: left">Cheque No.&nbsp;
                <input type="text" name="ch_no" style="width: 15vw"></td>
            <td style="text-align: left">Bank Name &nbsp;
                <input type="text" name="bank_name" style="width: 15vw"></td>
        </tr>
        <tr><td style="text-align: left">Amount &nbsp;
                <input type="text" name="ch_amount" class="ch_amount" value="0" style="width: 15vw"></td>
            <td style="text-align: left">Date &nbsp;
                <input type="date" name="ch_date" value="<%=d%>" style="width: 15vw"></td>
            
        </tr>
    </table>
                
    <div  class="pm" id="pm3">DD</div>
    <input type="hidden" name="dd" class="pm_type3" value="1">
    <table id="dd"><tr>
    <tr>
        <td colspan="2" style="text-align: left">Name  &nbsp;&nbsp;&nbsp;&nbsp;
            <input type="text" name="dd_name" style="width: 25vw"></td>
    </tr>
    <tr><td style="text-align: left">Amount &nbsp;
                <input type="text" value="0" name="dd_amount" class="dd_amount" style="width: 15vw"></td>
            <td style="text-align: left">Date &nbsp;
                <input type="date" name="dd_date" value="<%=d%>" style="width: 15vw"></td>
    </tr>
    </table>

    <div class="pm" id="pm4">OT</div>
    <input type="hidden" name="ot" class="pm_type4" value="1">
    <table id="ot"><tr>
        <tr><td colspan="2" style="text-align: left">Reference No. &nbsp;&nbsp;
                <input type="text" name="ot_ref" style="width: 20vw"></td></tr>
            <tr><td style="text-align: left">Amount &nbsp;
                    <input type="text" value="0" name="ot_amount" class="ot_amount" style="width: 15vw"></td>
                <td style="text-align: left">Date &nbsp;
                    <input type="date" name="ot_date" value="<%=d%>" style="width: 15vw"></td>
    </tr></table>


        <table><tr><td>Semester</td>
                <td><select name="sem">
        <option>Select</option>
        <option id="sm1" value="1">Semester-1</option>
        <option id="sm2" value="2">Semester-2</option>
        <option id="sm3" value="3">Semester-3</option>
        <option id="sm4" value="4">Semester-4</option>
        <option id="sm5" value="5">Semester-5</option>
        <option id="sm6" value="6">Semester-6</option>
        </select></td></tr></table>
   
        <input type="submit" value="ADD" class="sub_btn" id="btn" formaction="fees_add.jsp"/>

        
    </div>
    </div>
    </form>
</td>
</tr>
<% counter++;
    } %>
    
        </table>
    <% }}
else{
%>
       <script>alert("Authentication Failure !");
                    location='login.html';</script>
                    <%
} %>
    </body>
    <script>
        $(document).ready(function (){
        $(".open1").on("click", function() {
        $(".popup-overlay, .popup-content").addClass("active");
        var trid=$(this).closest('tr').attr('id1');
        var aid=$(this).closest('tr').attr('id2');
        $("input.stu_enroll").val(trid)
        $("input.stu_add_id").val(aid)
        });

        $(".close1").on("click", function() {
          $(".popup-overlay, .popup-content").removeClass("active");
        });
        });
        
        $('.popup-overlay .popup-content #cash').hide(); 
       $('.popup-overlay .popup-content #cheque').hide(); 
       $('.popup-overlay .popup-content #dd').hide(); 
       $('.popup-overlay .popup-content #ot').hide(); 
       
        $('.popup-overlay .popup-content #pm1').click(function() {  
             $('.popup-overlay .popup-content #cash').toggle(900);
             $('.popup-overlay .popup-content #cheque').hide();
             $('.popup-overlay .popup-content #dd').hide();
             $('.popup-overlay .popup-content #ot').hide();
    });
    
        $('.popup-overlay .popup-content #pm2').click(function() {  
             $('.popup-overlay .popup-content #cheque').toggle(900);
             $('.popup-overlay .popup-content #cash').hide();
             $('.popup-overlay .popup-content #dd').hide();
             $('.popup-overlay .popup-content #ot').hide();
        });
        
        $('.popup-overlay .popup-content #pm3').click(function() {  
             $('.popup-overlay .popup-content #dd').toggle(900);
             $('.popup-overlay .popup-content #cash').hide();
             $('.popup-overlay .popup-content #cheque').hide();
             $('.popup-overlay .popup-content #ot').hide();
        });
        
        $('.popup-overlay .popup-content #pm4').click(function() {  
             $('.popup-overlay .popup-content #ot').toggle(900);
             $('.popup-overlay .popup-content #cash').hide();
             $('.popup-overlay .popup-content #cheque').hide();
             $('.popup-overlay .popup-content #dd').hide();
        });
        //
    $(document).ready(function(){
    $('.popup-overlay .popup-content #cash input:text').blur(function () {
    if ($('.c_amount').val().length==0) {
    $('.c_amount').val("0")
    $('.popup-overlay .popup-content #pm1').removeClass("addcolor");
  }else{$('.popup-overlay .popup-content #pm1').addClass("addcolor");}
}).keypress(function() {
    if($(this).val().length > 1) {
         $('.popup-overlay .popup-content #pm1').addClass("addcolor");}
    else {
         $('.popup-overlay .popup-content #pm1').removeClass("addcolor");}  
});

$('.popup-overlay .popup-content #cheque input:text').blur(function () {
  if ($('.ch_amount').val().length==0) {
    $('.ch_amount').val("0")
    $('.popup-overlay .popup-content #pm2').removeClass("addcolor");
  }else{$('.popup-overlay .popup-content #pm2').addClass("addcolor");}
}).keypress(function() {
    if($(this).val().length > 1) {
         $('.popup-overlay .popup-content #pm2').addClass("addcolor");}
    else {
         $('.popup-overlay .popup-content #pm2').removeClass("addcolor");}  
});
//
$('.popup-overlay .popup-content #dd input:text').blur(function () {
  if ($('.dd_amount').val().length==0) {
    $('.dd_amount').val("0")
    $('.popup-overlay .popup-content #pm3').removeClass("addcolor");
  }
}).keypress(function() {
    if($(this).val().length > 1) {
         $('.popup-overlay .popup-content #pm3').addClass("addcolor");}
    else {
         $('.popup-overlay .popup-content #pm3').removeClass("addcolor");}  
});

$('.popup-overlay .popup-content #ot input:text').blur(function () {
  if ($('.ot_amount').val().length==0) {
    $('.ot_amount').val("0")
    $('.popup-overlay .popup-content #pm4').removeClass("addcolor");
  }

}).keypress(function() {
    if($(this).val().length > 1) {
         $('.popup-overlay .popup-content #pm4').addClass("addcolor");}
    else {
         $('.popup-overlay .popup-content #pm4').removeClass("addcolor");}  
}); 

});
 
        
    </script>
    <style>
        .popup-overlay {
        visibility:hidden;
        }
        .popup-content {    
        background-color: whitesmoke;padding: 2vw;border: 1vw;
        width: 40%;
        position: absolute;
        top: 10%;
        left: 30%;
        
        -webkit-box-shadow: 12px 10 15px -13px rgba(92,87,92,0.5);
        -moz-box-shadow: 12px 10px 15px -13px rgba(92,87,92,0.5);
        box-shadow: 12px 10px 15px -13px rgba(92,87,92,0.5);
        }
        .popup-overlay.active{
        visibility:visible;
        }
        table{
            margin-left: -0.1rem;
        }
        .popup-content.active {
        visibility:visible;
        }
        .pm{
           width: 35.5vw;
           background-color: rgba(154,169,172,1);
           padding: 0.4vw;
           margin-bottom: 0.4vw;
           cursor: pointer;
        }
        .pm:after {
            font-family: "Glyphicons Halflings";
            content: "\e114";
            float: right;}
          
        .pm:hover{
            background-color:#047edf;
        }
        .close1{
            margin-top: -1.5vw;
            background:none;border:none;font-size:2.4vw;color:black;
            opacity: 1;z-index: 111;
            float: right;
        }
        
    .addcolor{
         background-color:#047edf;
    }
    .amount_paid{
        background-color: #00ff33;
    }
    .amount_unpaid{
        background-color: #ff3333;
    }
    
        </style>
</html>

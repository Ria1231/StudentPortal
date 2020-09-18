<%-- 
    Document   : index
    Created on : Dec 11, 2019, 12:33:48 PM
    Author     : LENOVO
--%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link type="text/javascript" href="js/Chart.min.js">
        <link type="text/stylesheet" href="js/Chart.min.css">
        <link type="text/javascript" href="js/analytics.js">
        <link type="text/javascript" href="js/javascript.util.min.js">

        <!--DashBoard-->
<!--    <link rel="stylesheet" href="assets/vendors/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="assets/vendors/css/vendor.bundle.base.css">
    -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script async="" src="//www.google-analytics.com/analytics.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/javascript.util/0.12.12/javascript.util.min.js"></script>
        <style type="text/css">/* Chart.js */
            @keyframes chartjs-render-animation{from{opacity:.99}to{opacity:1}}
            .chartjs-render-monitor{animation:chartjs-render-animation 1ms}
            .chartjs-size-monitor,.chartjs-size-monitor-expand,
            .chartjs-size-monitor-shrink{position:relative;direction:ltr;left:0;top:0;right:0;bottom:0;overflow:hidden;pointer-events:none;visibility:hidden;z-index:1}
            .chartjs-size-monitor-expand>div{position:absolute;width:1000000px;height:1000000px;left:0;top:0}
            .chartjs-size-monitor-shrink>div{position:relative;width:200%;height:200%;left:0;top:0}</style>
        <script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
    </head>    
    
    <style>
        .dash_main{
            height: 10vw;
            width: 20vw;
            background-repeat:no-repeat;
            background-size: cover;
            border-radius: 0.5vw;
            margin: 3vw;
            color:white;
            cursor: pointer;
           -webkit-box-shadow: 21px 10 99px -13px rgba(92,87,92,0.9);
            -moz-box-shadow: 21px 10px 99px -13px rgba(92,87,92,0.9);
            box-shadow: 21px 10px 99px -13px rgba(92,87,92,0.9);
        }
        .dash_main:hover{
            -moz-transform: scale(1.05);
            -webkit-transform: scale(1.05);
            -o-transform: scale(1.05);
            -ms-transform: scale(1.05);
            transform: scale(1.05);
        }
        
    </style>
    
    
    <body style="margin:0px;">
               <jsp:include page="base.html"/>
               
        <%
            session.setAttribute("check","");
            session.setAttribute("yearOption","2019");
             String uname=request.getParameter("uname");
            String pass=request.getParameter("pass"); 
            
            String animation="",software="",it_ims="",DD="",morning="",noon="";
    int jan=0,feb=0,mar=0,apr=0,may=0,jun=0,jul=0,aug=0,sep=0,oct=0,nov=0,dec=0;            
    int jan_a=0,feb_a=0,mar_a=0,apr_a=0,may_a=0,jun_a=0,jul_a=0,aug_a=0,sep_a=0,oct_a=0,nov_a=0,dec_a=0;            
    int enq_2022=0,enq_2021=0,enq_2018=0,enq_2019=0,enq_2020=0;
    int add_2022=0,add_2021=0,add_2018=0,add_2019=0,add_2020=0;
    
    
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1?autoReconnect=true&useSSL=false","root","root");
            ResultSet rs,rs1;
            Statement st;
            st=c.createStatement();
            java.sql.DatabaseMetaData dbm = c.getMetaData();
            rs = dbm.getTables(null, null, "stu_admission", null);
            if (rs.next()) {
                String q1="Select course,count(*) from stu_admission group by course";
                String q2="Select batch,count(*) from stu_admission group by batch";
                String q4="Select DATE_FORMAT(admission_date, '%b'),count(*) from stu_admission where DATE_FORMAT(enq_date, '%Y')='2020' group by admission_date";
                String q6="Select DATE_FORMAT(admission_date,'%Y') as year,count(*) from stu_admission group by admission_date";
    rs1 = st.executeQuery(q1);
    while(rs1.next()){
        if(rs1.getString(1).equalsIgnoreCase("animation")){
            animation=rs1.getString(2);
        }
        if(rs1.getString(1).equalsIgnoreCase("software")){
            software=rs1.getString(2);
        }
        if(rs1.getString(1).equalsIgnoreCase("it-ims")){
            it_ims=rs1.getString(2);
        }
        if(rs1.getString(1).equalsIgnoreCase("digital-design")){
            DD=rs1.getString(2);
        }
    }
    
 rs1 = st.executeQuery(q2);
    while(rs1.next()){
        if(rs1.getString(1).equalsIgnoreCase("Morning")){
            morning=rs1.getString(2);
        }
        if(rs1.getString(1).equalsIgnoreCase("noon")){
            noon=rs1.getString(2);
        }   
    }
    rs1 = st.executeQuery(q4);
    while(rs1.next()){
        if(rs1.getString(1).equalsIgnoreCase("jan")){
            jan_a+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("feb")){
            feb_a+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("mar")){
            mar_a+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("apr")){
            apr_a+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("may")){
            may_a+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("jun")){
            jun_a+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("jul")){
            jul_a+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("aug")){
            aug_a+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("sep")){
            sep_a+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("oct")){
            oct_a+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("nov")){
            nov_a+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("dec")){
            dec_a+=Integer.parseInt(rs1.getString(2));
    }
    }
    
    rs1 = st.executeQuery(q6);
    while(rs1.next()){
        if(rs1.getString(1).equalsIgnoreCase("2018")){
            add_2018+=Integer.parseInt(rs1.getString(2));
        }
        if(rs1.getString(1).equalsIgnoreCase("2019")){
            add_2019+=Integer.parseInt(rs1.getString(2));
        }
        if(rs1.getString(1).equalsIgnoreCase("2020")){
           add_2020+=Integer.parseInt(rs1.getString(2));
        }
        if(rs1.getString(1).equalsIgnoreCase("2021")){
            add_2021+=Integer.parseInt(rs1.getString(2));
        }
        if(rs1.getString(1).equalsIgnoreCase("2022")){
            add_2022+=Integer.parseInt(rs1.getString(2));
        }
    }
        
        %>
<!--                <script>alert("table Exists !");</script>-->
            <%}else{
                %>
<!--                <script>alert("table not Exists !");</script>-->
            <%
            }
                PreparedStatement ps=c.prepareStatement("Select * from stu_users where user_name='"+uname+"' and user_p='"+pass+"'");
                rs=ps.executeQuery();
                String user="",user_p="";
                while(rs.next()){
                    user=rs.getString(2);
                    user_p=rs.getString(3);
                }
            if(request.getParameter("request")!=null){
           
            if(uname.equalsIgnoreCase(user)){
                if(pass.equals(user_p)){
                    session.setAttribute("user", user);
%><script>alert("Logged In Successfully !");</script><%
}
else{
 %><script>alert("Password Incorrect !");
                    location='login.html';</script>
<%}
            }
else{
 %><script>alert("Username Incorrect !");
                    location='login.html';</script>
                    <%
}
} %>
        <div style="background-color:whitesmoke;width: 100%;
             box-shadow: inset 0.1vw 0.1vw 0.7vw lightgray;">
            <form action="upload.jsp" method="post" enctype="multipart/form-data" style="margin-left: 20vw;">
                <br>
                  <span style="font-size:1.3vw; font: 800; margin-left: 0.5vw;">Import Data From <img src="css/icons/excel.png" style="height:3vw; width: 3vw;margin-bottom:-1vw;" /> : &nbsp;&nbsp;</span>
                <input type="file" name="file_name" style="font-size:1.3vw;" size="50"/>
                <input type="submit" value="Import" class="sub_btn"/><br><br>
            </form>
        </div>
        
        
        <div class="dash_main admission" style="background-image: url('images/gr8.jpg')">
            <div style="padding:1.5vw 1vw;font-size: 2vw">Admission</div>
        </div>
        
        <div class="dash_main enquiry" style="background-image: url('images/gr3.jpg');
             position: absolute;left: 24vw;top: 10vw">
            <div style="padding:1.5vw 1vw;font-size: 2vw">Enquiry</div>
        </div>
        
        <div class="dash_main batch" style="background-image: url('images/gr6.jpg');
             position: absolute;left: 48vw;top: 10vw">
            <div style="padding:1.5vw 1vw;font-size: 2vw">Batch</div>
        </div>
        
        
        <div class="dash_main course" style="background-image: url('images/gr5.jpg');
             position: absolute;left: 73vw;top: 10vw">
            <div style="padding:1.5vw 1vw;font-size: 2vw">
                Course</div>
        </div>
    
        <%
             rs = dbm.getTables(null, null, "stu_enquiry", null);
            if (rs.next()) {
            
    String q3="Select DATE_FORMAT(enq_date, '%b'),count(*) from stu_enquiry where DATE_FORMAT(enq_date, '%Y')='2020' group by enq_date";
    String q5="Select DATE_FORMAT(enq_date,'%Y') as year,count(*) from stu_enquiry group by enq_date";
    
    rs1 = st.executeQuery(q3);
    
    while(rs1.next()){
        if(rs1.getString(1).equalsIgnoreCase("jan")){
            jan+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("feb")){
            feb+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("mar")){
            mar+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("apr")){
            apr+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("may")){
            may+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("jun")){
            jun+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("jul")){
            jul+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("aug")){
            aug+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("sep")){
            sep+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("oct")){
            oct+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("nov")){
            nov+=Integer.parseInt(rs1.getString(2));
    }
        if(rs1.getString(1).equalsIgnoreCase("dec")){
            dec+=Integer.parseInt(rs1.getString(2));
    }
    }
    
    
    rs1 = st.executeQuery(q5);
    while(rs1.next()){
        if(rs1.getString(1).equalsIgnoreCase("2018")){
            enq_2018+=Integer.parseInt(rs1.getString(2));
        }
        if(rs1.getString(1).equalsIgnoreCase("2019")){
            enq_2019+=Integer.parseInt(rs1.getString(2));
        }
        if(rs1.getString(1).equalsIgnoreCase("2020")){
            enq_2020+=Integer.parseInt(rs1.getString(2));
        }
        if(rs1.getString(1).equalsIgnoreCase("2021")){
            enq_2021+=Integer.parseInt(rs1.getString(2));
        }
        if(rs1.getString(1).equalsIgnoreCase("2022")){
            enq_2022+=Integer.parseInt(rs1.getString(2));
        }
    } 

//<script>alert("table Exists !");</script>
    }else{}

               %>
    <div class="popup-overlay">
    <div class="popup-content" >
        <button class="close1">X</button>
        <div class="selectYear">
                <select class="selectOption" onchange="myFunction(this.value)">>
                    <option>Select Year</option>
                    <option value="2019">2019</option>
                    <option value="2020">2020</option>
                    <option value="2021">2021</option>
                    <option value="2022">2022</option>
                </select>
            </div>
        <div class="card-body">
            
        <div class="title c1">Course
               <canvas id="course-chart" width="400" height="170"></canvas>
        </div>
        <div class="title b1">Batch
               <canvas id="batch-chart" width="400" height="170"></canvas>
        </div>
        <div class="title e1">Enquiry
               <canvas id="enquiry-chart" width="400" height="170"></canvas>
        </div>
        <div class="title a1">Admission
               <canvas id="admission-chart" width="400" height="170"></canvas>
        </div>
        </div>
    </div>
    </div>

       <script>
           
           $(document).ready(function (){
               
        $(".course").on("click", function() {
        $(".popup-overlay, .popup-content").addClass("active");
        $('.a1').hide();
        $('.e1').hide();
        $('.b1').hide();
        $('.c1').show();
       
        new Chart(document.getElementById("course-chart"), {
    animationEnabled: true,
    type: 'bar',
    data: {
      labels: ["IT-IMS", "Software Development", "Animation", "Digital Design"],
      datasets: [
        {
          label: "No. of Students",
          backgroundColor: ["#3e95cd", "#8e5ea2","#3cba9f","#e8c3b9"],
          borderWidth:2,hoverBorderColor:'black',barThickness:120,
          barPercentage:0.5,
          data: [<%= it_ims %>,<%= software %>,<%= animation %>,<%= DD %>]
        }
      ]
    },
    options: {
        scales: {
            xAxes: [{
                stacked: true,
                 gridLines: {
                offsetGridLines: true,lineWidth:0,drawBorder:false,zeroLineWidth:0,
                tickMarkLength:20
            }}],
            yAxes: [{
                stacked: true
            }]
        },
      legend: { display: false },
      title: {
        display: true,
        text: 'Total no of students in each Course (Current Year)'
      },
      ticks: {
        min: 0
    }}
});
});
//Batch

        $(".batch").on("click", function() {
        $(".popup-overlay, .popup-content").addClass("active");
        $('.a1').hide();
        $('.e1').hide();
        $('.c1').hide();
        $('.b1').show();
        new Chart(document.getElementById("batch-chart"), {
    animationEnabled: true,
    type: 'bar',
    data: {
      labels: ["Morning", "Noon"],
      datasets: [
        {
          label: "No. of Students",
          backgroundColor: ["#3e95cd", "#8e5ea2"],
          borderWidth:2,hoverBorderColor:'black',barThickness:120,
          barPercentage:0.5,
          data: [<%= morning %>,<%= noon %>]
        }
      ]
    },
    options: {
        scales: {
            xAxes: [{
                stacked: true,
                 gridLines: {
                offsetGridLines: true,lineWidth:0,drawBorder:false,zeroLineWidth:0,
                tickMarkLength:20
            }}],
            yAxes: [{
                stacked: true
            }]
        },
      legend: { display: false },
      title: {
        display: true,
        text: 'Total no of students in each Course (Current Year)'
      },
      ticks: {
        min: 0
    }}
});
});

//Enquiry
        $(".enquiry").on("click", function() {
        $(".popup-overlay, .popup-content").addClass("active");
        $('.a1').hide();
        $('.c1').hide();
        $('.b1').hide();
        $('.e1').show();
       new Chart(document.getElementById("enquiry-chart"), {
    type: 'line',
     data: {
        labels: ['JAN', 'FEB', 'MAR', 'APR', 'MAY', 'JUN', 'JUL', 'AUG', 'SEP', 'OCT','NOV','DEC'],
        datasets: [
            {
                label: "Students",
                lineTension: 0,
                borderColor: 'blue',
                borderWidth:2,
                fillColor: "rgba(151,187,205,0.5)",
                strokeColor: "rgba(151,187,205,1)",
                pointColor: "rgba(151,187,205,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(151,187,205,1)",
                data: [<%= jan%>,<%= feb%>,<%= mar%>,<%= apr%>,<%= may%>,<%= jun%>,<%= jul%>,<%= aug%>,<%= sep%>,<%= oct%>,<%= nov%>,<%= dec%>]
            }
        ]},
    options: {
        scales: {
             xAxes: [{
                stacked: true
            }],
            yAxes: [{
                stacked: true
            }]
        }
    }
});
});
//Admission
        $(".admission").on("click", function() {
        $(".popup-overlay, .popup-content").addClass("active");
        $('.e1').hide();
        $('.c1').hide();
        $('.b1').hide();
        $('.a1').show();

       new Chart(document.getElementById("admission-chart"), {
    type: 'line',
     data: {
        labels: ['JAN', 'FEB', 'MAR', 'APR', 'MAY', 'JUN', 'JUL', 'AUG', 'SEP', 'OCT','NOV','DEC'],
        datasets: [
            {
                label: "Students",
                fillColor: "rgba(151,187,205,0.5)",
                strokeColor: "rgba(151,187,205,1)",
                pointColor: "rgba(151,187,205,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(151,187,205,1)",
                data: [<%= jan_a%>,<%= feb_a%>,<%= mar_a%>,<%= apr_a%>,<%= may_a%>,<%= jun_a%>,<%= jul_a%>,<%= aug_a%>,<%= sep_a%>,<%= oct_a%>,<%= nov_a%>,<%= dec_a%>]
            }
        ]},
    options: {
        scales: {
             xAxes: [{
                stacked: true
            }],
            yAxes: [{
                stacked: true
            }]
        }
    }
});
});
 
        
          $(".close1").on("click", function() {
          $(".popup-overlay, .popup-content").removeClass("active");
        });
    
           });
       </script> 
<script>
//charts
window.onload = function () {

//bar graph
var chart = new CanvasJS.Chart("chartContainer_1", {
	animationEnabled: true,
        theme:"light2",
	//title:{
	//	text: "Total Enquiries and Admissions Over past years"
	//},
	axisY: {
		title: "Students"
	},
	legend: {
		cursor:"pointer",
		itemclick : toggleDataSeries
	},
	toolTip: {
		shared: true,
		content: toolTipFormatter
	},
	data: [{
		type: "bar",
		showInLegend: true,
		name: "Admission",
		color: "gold",
		dataPoints: [
			{ y: <%= add_2018 %>, label: "2018" },
			{ y: <%= add_2019 %>, label: "2019" },
			{ y: <%= add_2020 %>, label: "2020" },
			{ y: <%= add_2021 %>, label: "2021" },
			{ y: <%= add_2022 %>, label: "2022" }
		]
	},
	{
		type: "bar",
		showInLegend: true,
		name: "Enquiry",
		color: "silver",
		dataPoints: [
			{ y: <%= enq_2018 %>, label: "2018" },
			{ y: <%= enq_2019 %>, label: "2019" },
			{ y: <%= enq_2020 %>, label: "2020" },
			{ y: <%= enq_2021 %>, label: "2021" },
			{ y: <%= enq_2022 %>, label: "2022" }
		]
	}]
});
chart.render();

function toolTipFormatter(e) {
	var str = "";
	var total = 0 ;
	var str3;
	var str2 ;
	for (var i = 0; i < e.entries.length; i++){
		var str1 = "<span style= \"color:"+e.entries[i].dataSeries.color + "\">" + e.entries[i].dataSeries.name + "</span>: <strong>"+  e.entries[i].dataPoint.y + "</strong> <br/>" ;
		total = e.entries[i].dataPoint.y + total;
		str = str.concat(str1);
	}
	str2 = "<strong>" + e.entries[0].dataPoint.label + "</strong> <br/>";
	str3 = "<span style = \"color:Tomato\">Total: </span><strong>" + total + "</strong><br/>";
	return (str2.concat(str)).concat(str3);
}

function toggleDataSeries(e) {
	if (typeof (e.dataSeries.visible) === "undefined" || e.dataSeries.visible) {
		e.dataSeries.visible = false;
	}
	else {
		e.dataSeries.visible = true;
	}
	chart.render();
}
}
</script>
<style>
    .card-body{
        box-shadow: 0.1vw 0.1vw 0.5vw 0.05vw #ccc;
        background-color:whitesmoke;
        width: 75vw;
        height: 35vw;
        margin-left: 2vw;
        margin-top: 1vw;
        padding: 0vw;
        border: thin solid #666666;
    }
    
    #chartContainer1{
        margin: 3vw;        
        height: 20vw;
        width: 40vw;
    }
    .course-chart .batch-chart{
        padding: 2vw;
    }
    .card-body1{
        box-shadow: 0.1vw 0.1vw 0.5vw 0.05vw #ccc;
        background-color:whitesmoke;
        width: 80%;
        height: 35vw;
        margin: 2vw 10vw;
        /*margin-top: 2vw;*/
        padding: 0vw;
        padding-bottom: 1vw;
        border: thin solid #666666;
    }
    .title{
        text-align: center;
        font-size: 1.5vw;
        width: 100%;
        height: 2.5vw;
        background-color: #ccc;
        border-bottom: thin solid #666666;
        
    }
    #chartContainer1_1{
        margin: 1vw;
        height: 20vw;
        width: 40vw;

    }
    #chartContainer1_2{
        margin: 1vw;
        height: 20vw;
        width: 40vw;
        top:2vw;
    }
    #chartContainer_1{
        margin: 2.5vw 4vw;
        height: 30vw;
        width: 90%;
    }
    
    .popup-overlay {
        visibility:hidden;
        }
        .popup-content {    
        background-color: whitesmoke;padding: 2vw;border: 1vw;
        width: 80%;
        position: absolute;
        top: 10%;
        left: 10%;
        z-index: 9;

        -webkit-box-shadow: 12px 10 15px -13px rgba(92,87,92,0.5);
        -moz-box-shadow: 12px 10px 15px -13px rgba(92,87,92,0.5);
        box-shadow: 12px 10px 15px -13px rgba(92,87,92,0.5);
        }
        .popup-overlay.active{
        visibility:visible;
        }
        .popup-content.active {
        visibility:visible;
        }
        .close1{
            margin-top: -1.5vw;
            background:none;border:none;font-size:2.4vw;color:black;
            opacity: 1;z-index: 111;
            float: right;
        }
</style>

    <div class="card-body1">
        <div class="title">Enquiry & Admission
        <div id="chartContainer_1"></div>
        </div>         
    </div>
<br>

    </body>
</html>

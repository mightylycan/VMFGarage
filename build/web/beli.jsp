<%-- 
    Document   : beli
    Created on : Jul 11, 2019, 12:24:09 AM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Controller.carDAO,Model.car,java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    List<car> list = carDAO.getAllRecords();
    request.setAttribute("list", list);
%>

<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="w3.css">
	<link rel="stylesheet" type="text/css" href="css/all.css">
	<link rel="stylesheet" type="text/css" href="body.css">
        <script type="text/javascript" src="jquery-1.8.3.js"></script>
	<script type="text/javascript">
		function myFunction(id) {
  var x = document.getElementById(id);
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
  } else { 
    x.className = x.className.replace(" w3-show", "");
  }
}</script>
	<title>CAR STORE</title>
	<link href='https://fonts.googleapis.com/css?family=Faster One' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Racing Sans One' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Permanent Marker' rel='stylesheet'>
	<style>
		.header{
			background-image: url(header.png);
			padding: 10px;
			top: 0px;
			left: 0px;
			width: 1495px;
			position: absolute;
			z-index: 999;
		}
		.header2{
			z-index: 999;
		}
		.logo{
			height: 80px;
			width: 120px;
			margin-top: 0px;
		}	
		h1{
			color: white;
			font-size: 15px;
			top: 6px;
			right: 45px;
			position: absolute;
		}
		.gmail{
			height: 30px;
			width: 30px;
			background-color: black;
			border-radius: 50px;
			top: 50px;
			right: 10px;
			position: absolute; 
		}
		.tlp{
			height: 30px;
			width: 30px;
			background-color: black;
			border-radius: 50px;
			top: 10px;
			right: 10px;
			position: absolute;
		}
		.tlp:hover{
			 animation: shake 0.5s;
			 animation-iteration-count: infinite; 
		}
		@keyframes shake {
  0% { transform: translate(1px, 1px) rotate(0deg); }
  10% { transform: translate(-1px, -2px) rotate(-1deg); }
  20% { transform: translate(-3px, 0px) rotate(1deg); }
  30% { transform: translate(3px, 2px) rotate(0deg); }
  40% { transform: translate(1px, -1px) rotate(1deg); }
  50% { transform: translate(-1px, 2px) rotate(-1deg); }
  60% { transform: translate(-3px, 1px) rotate(0deg); }
  70% { transform: translate(3px, 1px) rotate(-1deg); }
  80% { transform: translate(-1px, -1px) rotate(1deg); }
  90% { transform: translate(1px, 2px) rotate(0deg); }
  100% { transform: translate(1px, -2px) rotate(-1deg); }
}
		h2{
			color: white;
			font-size: 15px;
			top: 42px;
			right: 45px;
			position: absolute;
		}
		.vmf{
			position: absolute;
			left: 650px;
			height: 50px;
			width: 200px;
			top: 25px;
		}
		.home{
			text-decoration: none;
			color: black;
			margin-top: -200px;
			background-color: whitesmoke;
			padding: 8px;
			font-size: 20px;
			margin-left: 50px;
			font-family: 'Racing Sans One'
		}
		.header2{
			position: absolute;
			top: 103px;
			background-color: whitesmoke;
			padding: 8px;
			width: 1520px;
			left: 0px;
		}
		.home:hover{
			background-color: lightsteelblue;
		}

		.why{
			width: 30%;
			height: 50px;
			margin-top: 50px;
			margin-left: 520px;
		}
		.cst{
			width: 120px;
			height: 120px;
			margin-top: 50px;
			margin-left: 80px;
			border-radius: 70px;
		}
		h4{
			color: white;
			text-align: center;
			font-size: 20px;
			margin-left: 0px;
		}
		h5{
			color: white;
			font-size: 20px;
			margin-left: 130px;
			text-align: center;
		}
		.quality{
			width: 120px;
			height: 120px;
			margin-top: 50px;
			margin-left: 200px;
			border-radius: 70px;
		}

		.best{
			height: 120px;
			width: 120px;
			margin-top: 80px;
			margin-left: 200px;
			border-radius: 70px;
		}
		h6{
			color: white;
			font-size: 20px;
			margin-left: 90px;
			margin-top: 20px;
			text-align: center;
		}
		.ftr{
			margin-top: -50px;
		}
		.dropbtn {
  			background-color: whitesmoke;
  			color: black;
  			padding: 8px;
  			font-size: 20px;
  			border: none;
  			cursor: pointer;
  			margin-top: -90px;
  			margin-left: 50px;
		}
		.dropbtn:hover, .dropbtn:focus {
  			background-color: lightsteelblue;
		}
		.dropdown {
 		 	position: relative;
  			display: inline-block;
		}
		.dropdown-content {
  			display: none;
  			position: absolute;
  			background-color: #f1f1f1;
  			min-width: 160px;
  			box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  			z-index: 1;
  			margin-left: 50px;
  			font-family: 'Faster One'
		}
		.dropdown-content a {
  			color: black;
  			padding: 12px 16px;
  			text-decoration: none;
  			display: block;
		}
		.dropdown-content a:hover {background-color: #ddd}
		.show {display:block;}
		.content {
			margin-top: 20px;
		}
		.beli{
			text-decoration: none;
			font-size: 20px;
			color: black;
			padding: 8px;
			background-color: whitesmoke;
			margin-left: 50px;
		}
		.beli:hover{
			background-color: lightsteelblue;
			padding: 8px;
		}
		.dropbtns {
  			background-color: whitesmoke;
  			color: black;
  			padding: 8px;
  			font-size: 20px;
  			border: none;
  			cursor: pointer;
  			position: absolute;
  			margin-left: 460px;
  			margin-top: -45px;
		}
		.dropbtns:hover, .dropbtns:focus {
  			background-color: lightsteelblue;
		}
		.dropdownku {
 		 	position: relative;
  			display: inline-block;
		}
		.dropdown-contents {
  			display: none;
  			position: absolute;
  			background-color: #f1f1f1;
  			min-width: 160px;
  			box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  			z-index: 1;
  			margin-left: 460px;
  			margin-top: 2px;
  			font-size: 16px;
  			width: 200px;
  			text-align: center;
		}
		.dropdown-contents a {
  			color: black;
  			padding: 12px 16px;
  			text-decoration: none;
  			display: block;
  			font-family: 'Permanent Marker'
		}
		.dropdown-contents a:hover {background-color: #ddd}
		.show {display:block;}
		.dropbtned {
  			background-color: #f1f1f1;
  			color: black;
  			padding: 16px;
  			font-size: 16px;
  			border: none;
  			width: 200px;
  			font-family: 'Permanent Marker'
		}
		.dropdowney {
  			position: relative;
  			display: inline-block;
		}
		.dropdown-contented {
  			display: none;
  			position: absolute;
  			background-color: #f1f1f1;
  			min-width: 160px;
  			box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  			z-index: 1;
  			margin-left: 200px;
  			margin-top: -54px;
		}
		.dropdown-contented a {
  			color: black;
  			padding: 12px 16px;
  			text-decoration: none;
  			display: block;
		}
		.dropdown-contented a:hover {background-color: pink;}
		.dropdowney:hover .dropdown-contented {display: block;}
		.dropdowney:hover .dropbtned {background-color: #ddd;}
		footer{
			display: block;
		}
		.container {
                        position: relative;
                        width: 50px;
                        margin-left: 200px;
                }
                
.image {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}

.container:hover .image {
  opacity: 0.3;
}

.container:hover .middle {
  opacity: 1;
}

.text {
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container1 {
  position: relative;
  width: 50px;
}

.image1 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle1 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}

.container1:hover .image1 {
  opacity: 0.3;
}

.container1:hover .middle1 {
  opacity: 1;
}

.text1 {
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container2 {
  position: relative;
  width: 50px;
}

.image2 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle2 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}

.container2:hover .image2 {
  opacity: 0.3;
}

.container2:hover .middle2 {
  opacity: 1;
}

.text2{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container3 {
  position: relative;
  width: 50px;
}
.image3 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle3 {
     transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container3:hover .image3 {
  opacity: 0.3;
}

.container3:hover .middle3 {
  opacity: 1;
}

.text3{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container4 {
  position: relative;
  width: 50px;
}
.image4 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle4 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container4:hover .image4 {
  opacity: 0.3;
}

.container4:hover .middle4 {
  opacity: 1;
}

.text4{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container5 {
  position: relative;
  width: 50px;
}
.image5 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle5 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container5:hover .image5 {
  opacity: 0.3;
}

.container5:hover .middle5 {
  opacity: 1;
}

.text5{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container6 {
  position: relative;
  width: 50px;
}
.image6 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle6 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container6:hover .image6 {
  opacity: 0.3;
}

.container6:hover .middle6 {
  opacity: 1;
}

.text6{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container7 {
  position: relative;
  width: 50px;
}
.image7 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle7 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container7:hover .image7 {
  opacity: 0.3;
}

.container7:hover .middle7 {
  opacity: 1;
}

.text7{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container8 {
  position: relative;
  width: 50px;
}
.image8 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle8 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container8:hover .image8 {
  opacity: 0.3;
}

.container8:hover .middle8 {
  opacity: 1;
}

.text8{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container9 {
  position: relative;
  width: 50px;
}
.image9 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle9 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container9:hover .image9 {
  opacity: 0.3;
}

.container9:hover .middle9 {
  opacity: 1;
}

.text9{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container10 {
  position: relative;
  width: 50px;
}
.image10 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle10 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container10:hover .image10 {
  opacity: 0.3;
}

.container10:hover .middle10 {
  opacity: 1;
}

.text10{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container11 {
  position: relative;
  width: 50px;
}
.image11 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle11 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container11:hover .image11 {
  opacity: 0.3;
}

.container11:hover .middle11 {
  opacity: 1;
}

.text11{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container12 {
  position: relative;
  width: 50px;
}
.image12 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle12 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container12:hover .image12 {
  opacity: 0.3;
}

.container12:hover .middle12 {
  opacity: 1;
}

.text12{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container13 {
  position: relative;
  width: 50px;
}
.image13 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle13 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container13:hover .image13 {
  opacity: 0.3;
}

.container13:hover .middle13 {
  opacity: 1;
}

.text13{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container14 {
  position: relative;
  width: 50px;
}
.image14 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle14 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container14:hover .image14 {
  opacity: 0.3;
}

.container14:hover .middle14 {
  opacity: 1;
}

.text14{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container15 {
  position: relative;
  width: 50px;
}
.image15 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle15 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container15:hover .image15 {
  opacity: 0.3;
}

.container15:hover .middle15 {
  opacity: 1;
}

.text15{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}

.container16 {
  position: relative;
  width: 50px;
}
.image16 {
  opacity: 1;
  display: block;
  width: 100px;
  height: auto;
  transition: .5s ease;
  backface-visibility: hidden;
}

.middle16 {
  transition: .5s ease;
  opacity: 0;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  text-align: center;
}
.container16:hover .image16 {
  opacity: 0.3;
}

.container16:hover .middle16 {
  opacity: 1;
}

.text16{
  background-color: gold;
  color: white;
  font-size: 16px;
  padding: 16px 32px;
  margin-top: 200px;
  width: 200px;
  height: 100px;
}
/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the "cart" column go on top) */
@media (max-width: 800px) {
  .row {
    flex-direction: column-reverse;
  }
  .col-25 {
    margin-bottom: 20px;
  }
}
                .signin{
                        text-decoration: none;
			font-size: 20px;
			color: black;
			padding: 8px;
			background-color: whitesmoke;
                        margin-left: 1300px;
                        margin-top: -45px;
                        position: absolute;
                }
                .signin:hover{
                    background-color: lightsteelblue;
                    padding: 8px; 
                }
</style>
</head>
<body background="black.jpg">
	
	<script>
		function myFunctioned() {
  		document.getElementById("myDropdown").classList.toggle("show");
		}
		window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
function myFunctions() {
  		document.getElementById("Dropdownku").classList.toggle("show");
		}
		window.onclick = function(event) {
  if (!event.target.matches('.dropbtns')) {
    var dropdowns = document.getElementsByClassName("dropdown-contents");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
	</script>
<div class="header">
	<img class="logo" src="logo.png">
	<img class="tlp" src="tlp.png">
	<img class="gmail" src="gmail.jpg">
	<a href="index.jsp"><img class="vmf" src="vmf.png"></a>
	<h1>021-322-009-111</h1>
	<h2>vmfgarage@customerservice.com</h2>
</div>
<div class="header2">
	<a class="home" href="index.jsp">Home</a>
	<div class="dropdown">
  <button style="font-family: 'Racing Sans One'" onclick="myFunctioned()" class="dropbtn">Car Menu</button>
  <div id="myDropdown" class="dropdown-content">
    <a href="lamborghini.jsp">Lamborghini</a>
    <a href="bmw.jsp">BMW</a>
    <a href="ferrari.jsp">Ferrari</a>
  </div>
</div>
	<a style="font-family: 'Racing Sans One'" class="beli" href="beli.jsp">Store</a>
<div class="dropdowny">
<button style="font-family: 'Racing Sans One'" onclick="myFunctions()" class="dropbtns">More</button>
  <div id="Dropdownku" class="dropdown-contents">
  	<a href="merch.jsp">Our Merchandise</a>
    <div class="dropdowney">
  <button class="dropbtned">Our Offline Store</button>
  <div class="dropdown-contented">
    <a href="jakarta.jsp">Jakarta</a>
    <a href="bandung.jsp">Bandung</a>
    <a href="yogya.jsp">Yogyakarta</a>
  </div>
</div>
<a href="profile.jsp">Our Profile</a>
  </div>
</div>
        <a style="font-family: 'Racing Sans One'" class="signin" href="signin.jsp">Sign In</a>
</div>
<div class="content">
    <c:forEach items="${list}" var="c">
	<div class="container" style="width: 400px; height: 200px; float: left; margin-top: 150px;">
  <img src="${c.getCar_pict()}" alt="Avatar" class="image" style="width:100%; height: 300px;">
  <div class="middle">
    <div class="text" style="color: black; width: 338px; margin-top: 100px;">${c.getCar_name()}<p>USD$${c.getCar_price()}</p></div> 
    <p></p>
    <a href="checkout.jsp" style="border: solid; padding: 16px 32px; font-size: 16px;color:orange;display: inline-block;text-decoration: none; ">Shop Now</a>
  </div>
</div>
    </c:forEach>
</html>	
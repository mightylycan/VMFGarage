<%-- 
    Document   : merch
    Created on : Jul 13, 2019, 12:35:54 AM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Controller.merchDAO,Model.merch,java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    List<merch> list = merchDAO.getAllRecords();
    request.setAttribute("list", list);
%>
<html>
<head>
	<title>Merchandise Shop</title>
	<link href='https://fonts.googleapis.com/css?family=Faster One' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Racing Sans One' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Aclonica' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Permanent Marker' rel='stylesheet'>
  <script
    src="https://code.jquery.com/jquery-3.3.1.js"
    integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
    crossorigin="anonymous">
  </script>
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
		.dropbtn {
  			background-color: whitesmoke;
  			color: black;
  			padding: 8px;
  			font-size: 20px;
  			border: none;
  			cursor: pointer;
  			margin-top: -90px;
  			margin-left: 50px;
  			font-family: 'Racing Sans One'
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
  			z-index: 4;
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
		.dropbtns {
  			background-color: whitesmoke;
  			color: black;
  			padding: 8px;
  			font-size: 20px;
  			border: none;
  			cursor: pointer;
  			position: absolute;
  			margin-left: 460px;
  			margin-top: -40px;
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
		.addto{
			text-decoration: none;
			color: black;
			font-weight: bold;
			background-color: lavender;
			padding: 8px;
			border-radius: 18px;
			font-size: 14px;
		}
		.addto:hover{
			background-color: pink;
			padding: 10px;
		}
		.container {
  			position: relative; 
  			max-width: 800px;
  			margin: 0 auto;
		}

		.container .content {
  			position: absolute;
  			bottom: 0;
  			background: rgb(0, 0, 0);
  			background: rgba(0, 0, 0, 0.5);
  			color: #f1f1f1;
  			width: 200px;
  			padding: 0px;
  			margin-left: -300px;
		}
		.containers {
  			position: relative; 
  			max-width: 800px;
  			margin: 0 auto;
		}

		.containers .contents {
  			position: absolute;
  			bottom: 0;
  			background: rgb(0, 0, 0);
  			background: rgba(0, 0, 0, 0.5);
  			color: #f1f1f1;
  			width: 200px;
  			padding: 0px;
  			margin-left: 100px;
		}
		.containered {
  			position: relative; 
  			max-width: 800px;
  			margin: 0 auto;
		}

		.containered .contented {
  			position: absolute;
  			bottom: 0;
  			background: rgb(0, 0, 0);
  			background: rgba(0, 0, 0, 0.5);
  			color: #f1f1f1;
  			width: 200px;
  			padding: 0px;
  			margin-left: 500px;
		}
		.containerey {
  			position: relative; 
  			max-width: 800px;
  			margin: 0 auto;
		}

		.containerey .contentey {
  			position: absolute;
  			bottom: 0;
  			background: rgb(0, 0, 0);
  			background: rgba(0, 0, 0, 0.5);
  			color: #f1f1f1;
  			width: 200px;
  			padding: 0px;
  			margin-left: 900px;
		}
    .signin{
                        text-decoration: none;
			font-size: 20px;
			color: black;
			padding: 8px;
			background-color: whitesmoke;
                        margin-left: 1300px;
                        margin-top: -40px;
                        position: absolute;
                }
                .signin:hover{
                    background-color: lightsteelblue;
                    padding: 8px; 
                }
                .content{
                    margin-top: 200px;
                }
	</style>
</head>
<body background="black.jpg">
	<script>
		function myFunction() {
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
  <button onclick="myFunction()" class="dropbtn">Car Menu</button>
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
<div class="container">
  <img src="${c.getMerch_pict()}" alt="bomber" style="width:200px; height: 300px; margin-top: 0px; margin-left: -300px;">
  <div class="content">
    <p style="font-size: 16px; margin-left: 5px; text-align: center">${c.getMerch_name()}</p>
    <p style="font-size: 16px; margin-left: 50px;">USD $${c.getMerch_price()}</p>
    <a href="checkoutmerch.jsp"><button style="margin-left: 40px" class="addto"><img style="height: 20px;width: 20px" src="cartlogo.jpg">Buy Now</button></a>
  </div>
</div>
      </c:forEach>
    </div>
</body>
</html>

<%-- 
    Document   : Home
    Created on : Jul 10, 2019, 10:51:00 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" type="text/css" href="w3.css">
	<link rel="stylesheet" type="text/css" href="css/all.css">
	<link rel="stylesheet" type="text/css" href="body.css">
	<script type="text/javascript">
		function myFunction(id) {
  var x = document.getElementById(id);
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
  } else { 
    x.className = x.className.replace(" w3-show", "");
  }
}
</script>
	<title>Homepage</title>
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
			width: 100%;
			margin-top: 155px;
			height: auto;
			padding: 0px;
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
	<script type="text/javascript" src="jquery-1.8.3.js"></script>
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
	<video id="vid" width="100%" playsinline autoplay muted loop>
		<source src="aventador.mp4" type="video/mp4">
		Error
	</video>
	<script>
		document.getElementById('vid').play();
	</script>

</div>
<div class="footer">
	<img class="why" src="why.png">
</div>
<div class="ftr">
	<table cellpadding="50" cellspacing="10">
	<tr><td><img class="cst" src="cst.jpg">
	<h4>We provide satisfying services with
	<br>world-class qualified employees</h4></td>
	<td><img class="quality" src="quality.jpg">
	<h5>We provide the best quality car</h5></td>
	<td><img class="best" src="award.jpg">
	<h6>We have won<br> "Auto Industry Exellence Awards 2019"</h6></td>
</tr>
</table>
    <footer>
	<div class="w3-row" id="footer-wrap" style="background-color: grey;">
 	<div class="w3-half w3-container" id="store">
 		<h3 style="color: black;">About Us</h3>
 		<p style="color: black;">
 			VMF Garage is Car Dealership<br>
 			When the price is lowest than the original company<br>
 			Trusted 100%
 		</p>
 	</div>

 	<div class="w3-half w3-container" id="cus-care" style="text-align:right;">
 		<h3 style="color: black;">Customer Care</h3>
 		<a href="#answer2"><p onclick="myFunction('answer2')" style="color: black">Contact Us</p></a>
 		<div id="answer2" class="w3-hide w3-animate-top">
 			<i class="fab fa-facebook" style="font-size: 20px">vmfgarage@yahoo.com</i>
 			<i class="fas fa-phone">021-322-099-111</i>
 			<i class="fab fa-google">vmfgarage@customerservice.com</i>
 			<i class="fab fa-instagram" style="font-size: 20px">vmf_garage</i>
 		</div>
 		<p><a href="faq.jsp" style="color: black;">FAQs</a></p>
 		<p><a href="feedback.jsp" style="color: black;">Feedback</a></p>
 		<p><a href="privacy.jsp" style="color: black;">Privacy Policy</a></p>
 		<p><a href="term.jsp" style="color: black;">Term Of Service</a></p>
 	</div>
 	<div class="w3-col w3-container" id="media" style="width: 100%">
 		<a href="facebook.com"><i></i></a>
 	</div>
 </div>
 <div class="w3-col" id="copyright" style="width: 100%" align="center">
		<p class="w3-medium" style="font-weight: bold">Copyright ©VMF Garage. All Right Reserved.</p>
	</div>
</footer>
</div>
<script>
function myFunction(id) {
  var x = document.getElementById(id);
  if (x.className.indexOf("w3-show") == -1) {
    x.className += " w3-show";
  } else { 
    x.className = x.className.replace(" w3-show", "");
  }
}
</script>
</body>
</html>	

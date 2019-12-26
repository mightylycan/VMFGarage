<%-- 
    Document   : bandung
    Created on : Jul 13, 2019, 1:26:22 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Bandung</title>
	<script src="ImageGallery/jQueryS/jquery-1.8.3.js"></script>
    <script src="ImageGallery/galleria/galleria-1.2.8.js"></script>
	<link href='https://fonts.googleapis.com/css?family=Faster One' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Racing Sans One' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Diplomata' rel='stylesheet'>
    <link href='https://fonts.googleapis.com/css?family=Permanent Marker' rel='stylesheet'>
	<style>
		.header{
			background-image: url(header.png);
			padding: 10px;
			top: 0px;
			left: 0px;
			width: 100%;
			position: fixed;
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
			right: 55px;
			position: fixed;
		}
		.gmail{
			height: 30px;
			width: 30px;
			background-color: black;
			border-radius: 50px;
			top: 50px;
			right: 10px;
			position: fixed; 
		}
		.tlp{
			height: 30px;
			width: 30px;
			background-color: black;
			border-radius: 50px;
			top: 10px;
			right: 10px;
			position: fixed;
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
			right: 50px;
			position: fixed;
		}
		.vmf{
			position: fixed;
			left: 650px;
			height: 50px;
			width: 200px;
			top: 25px;
		}
		.home{
			text-decoration: none;
			color: black;
			top: 20px;
			background-color: whitesmoke;
			padding: 8px;
			font-size: 20px;
			margin-left: 50px;
			font-family: 'Racing Sans One'
		}
		.header2{
			position: fixed;
			top: 103px;
			background-color: whitesmoke;
			padding: 8px;
			width: 100%;
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
		.ftr{
			position: fixed;
			top: 630px;
		}
		h3{
			color: white;
			font-size: 18px;
			text-align: center;
			margin-top: 55px;
			font-family: 'Diplomata'
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
<div class="content" style="width: 1500px; height: 500px; position: absolute; overflow: hidden; background-color: black; margin-left: 0px; margin-top: 150px; z-index: -1">
                 <img src="ImageGallery/contentFiles/bandung1.jpg">
                 <img src="ImageGallery/contentFiles/bandung3.jpg">
                 <img src="ImageGallery/contentFiles/bandung4.jpg">
               </div>
               <script> Galleria.loadTheme('ImageGallery/galleria/themes/classic/galleria.classic.min.js');
$(".content").galleria({
  width:1500,
  height:500
});
</script>
<div class="ftr">
<h3>Welcome to our offline store at Bandung, this store located on Lembang Street, block C number 301 north of Bandung. The store has been established since 2003.</h3>
</div>
</body>
</html>

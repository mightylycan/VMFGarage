<%-- 
    Document   : feedback
    Created on : Jul 13, 2019, 1:19:26 AM
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
		function sub(){
			if ((document.feedback.nama.value!='') && (document.feedback.contact.value!='') && (document.feedback.pesan.value!=''))
			{
				alert("Thanks For Your Feedback!!!");
			}
			else{
				alert("Please fill the blank space");
			}
		}
	</script>
	<title>FEEDBACK</title>
	<style type="text/css">	
		.cst{
			width: 120px;
			height: 120px;
			margin-top: 50px;
			margin-left: 80px;
			border-radius: 70px;
		}
		#nav-link a:hover {
			color: red;
		}
		#nav-link a {
			border: 10px solid snow; 
			border-radius:60px; 
		}

		.quality{
			width: 120px;
			height: 120px;
			margin-top: 60px;
			margin-left: 70px;
			border-radius: 90px;
		}

		.best{
			height: 120px;
			width: 120px;
			margin-top: 60px;
			margin-left: 70px;
			margin-right: 100px;
			border-radius: 90px;
		}

		.ftr{
			margin-top: -50px;
		}

		footer{
			display: block;
			margin-top: 110px
		}

		#cus-care a {
			text-decoration: none;
		}

		#cus-care a:hover {
			transition: 0.5s;
			background-color:steelblue;
		}
		#copyright {
			background-color: black;
			color: white;
			width: 1565px;
		}

		#copyright:hover {
			transition: 0.5s;
			background-color: red;
		}
	</style>
</head>
<body style="background-color: white;">
<div class="w3-row" id="contact-wrap">
	<div class="w3-row w3-container" id="nav-link" style="width: 100%">
			<p><a href="index.jsp" style="text-decoration: none;">Home</a></p>
	</div>
	<div class="w3-half w3-container" id="form-message">
		<form name="feedback">
			<h2>Please fill your Suggestion and Comments</h2>
			<p>
				<label>Your Name</label>
				<input class="w3-input w3-border" name="nama" type="text">
			</p>
			<p>
				<label>Your Email</label>
				<input class="w3-input w3-border" type="text" name="contact">
			</p>
			<p>
				<label>Your feedback for us</label>
				<input class="w3-input w3-border" type="text" name="pesan">
			</p>
			<button class="w3-button w3-black w3-round-xxlarge" onclick="sub();">Submit</button>
		</form>
	</div>
</div>
<footer>
<div class="w3-row" id="footer-wrap" style="background-color: grey;">
 	<div class="w3-half w3-container" id="store">
 		<h3 style="color: snow;">About Us</h3>
 		<p style="color: snow;">
 			VMF Garage is Car Dealership<br>
 			When the price is lowest than the original company<br>
 			Trusted 100%
 		</p>
 	</div>
 	<div class="w3-half w3-container" id="cus-care" style="text-align:right;">
 		<h3 style="color: snow;">Customer Care</h3>
 		<a href="#answer2"><p onclick="myFunction('answer2')" style="font-weight: bold">Contact Us</p></a>
 		<div id="answer2" class="w3-hide w3-animate-top">
 			<i class="fab fa-facebook" style="font-size: 20px">vmfgarage@yahoo.com</i>
 			<i class="fas fa-phone">021-322-099-111</i>
 			<i class="fab fa-google">vmfgarage@customerservice.com</i>
 			<i class="fab fa-instagram" style="font-size: 20px">vmf_garage</i>
 		</div>
 		<p><a href="faq.jsp" style="color: snow;">FAQs</a></p>
 		<p><a href="feedback.jsp" style="color: snow;">Feedback</a></p>
 		<p><a href="privacy.jsp" style="color: snow;">Privacy Policy</a></p>
 		<p><a href="" style="color: snow;">Term Of Service</a></p>
 	</div>
 	<div class="w3-col w3-container" id="media" style="width: 100%">
 		<a href="facebook.com"><i></i></a>
 	</div>
 </div>
 <div class="w3-col" id="copyright" style="width: 1565px; margin-left: -20px" align="center">
		<p class="w3-medium" style="font-weight: bold">Copyright © vmf garage. All Right Reserved.</p>
	</div>
</footer>
</body>

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
</html>
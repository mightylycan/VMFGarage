<%-- 
    Document   : signin
    Created on : Jul 16, 2019, 3:32:21 PM
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
			width: 1540px;
			position: absolute;
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
		.home:hover{
			background-color: lightsteelblue;
		}
                .content{
                    position: fixed;
                    left: 600px;
                    background-color: lightblue;
                    padding: 20px;
                    top: 300px;
                    border-radius: 20px;
                }
                .judul{
                    margin-top: 200px;
                }
                #submit{
                    border-radius: 20px;
                    padding: 8px;
                }
                #submit:hover{
                    padding: 10px;
                    background-color: lightblue;
                }
                h{
                  background-color: lightblue;
                  padding: 20px;
                  position: fixed;
                  left: 700px;
                  top: 250px;
                  border-radius: 20px;
                }
                body{
                    background-image: url("bglogin.jpg");
                    background-size: cover;
                }
                </style>
    </head>
    <body>
        <div class="header">
	<img class="logo" src="logo.png">
	<img class="tlp" src="tlp.png">
	<img class="gmail" src="gmail.jpg">
	<a href="index.jsp"><img class="vmf" src="vmf.png"></a>
	<h1>021-322-009-111</h1>
	<h2>vmfgarage@customerservice.com</h2>
</div>
        <div class="judul">
        <h><center><b>Please Sign-In</b></center></h>
        </div>
        <div class="content">        
<form name="signin" id="signin" method="post" action="login">
	<table> 
	<tr><td>Username</td>
	<td>:</td>
	<td><input type="text" name="uname" placeholder="Input Username"></td></tr>
	<tr><td>Password
	<td>:</td> 
	<td><input type="password" name="pwuser" size="20" maxlength="20"></td></tr>
        <tr><td><button id="submit" style="position: absolute; margin-top: 30px; margin-left: 60px" type="submit" name="Submit">Enter</button></td></tr>
        <tr><td><button id="submit" style="position: absolute; margin-top: 30px; margin-left: 150px;" name="Submit"><a style="text-decoration: none" href="index.jsp">Back to Home</a></button></td></tr>
</table>
</form>
        </div>
    </body>
</html>

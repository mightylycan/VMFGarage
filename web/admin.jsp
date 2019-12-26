<%-- 
    Document   : admin
    Created on : Jul 16, 2019, 4:22:14 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
			width: 1536px;
			position: absolute;
			z-index: 999;
		}
		.logo{
			height: 80px;
			width: 120px;
			margin-top: 0px;
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
                .signout{
                    color: white;
                    text-decoration: none;
                    margin-left: 1200px;
                }
                body{
                    background-image: url("bgadmin.jpg");
                }
                .content{
                    color: white;
                    position: absolute;
                    top: 200px;    
                }
                th{
                    background-color: blue;
                    border-color: blue;
                }
                td{
                    background-color: green;
                }
                table{
                    border-color: pink;
                }
                </style>
</head>
    <body>
        <div class="header">
	<img class="logo" src="logo.png">
	<img class="vmf" src="vmf.png">
        <a class="signout" href="index.jsp">Sign Out</a>
</div>
        <%@page import="Controller.transactionDAO,Model.transaction,java.util.*"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <div class="content">
        <h1>Order List</h1>
        <%
            List<transaction> list = transactionDAO.getAllRecords();
            request.setAttribute("list", list);
        %>
        <table border="1" width="100%">
            <tr><th>Id</th><th>Name</th><th>Email</th><th>Address</th><th>City</th><th>Product</th><th>Quantity</th><th>Name on Card</th><th>Credit Card Number</th><th>Exp Month</th><th>Exp Year</th><th>Edit</th><th>Delete</th></tr>
                    <c:forEach items="${list}" var="t">
                <tr><td>${t.getCheckout_id()}</td><td>${t.getName()}</td><td>${t.getEmail()}</td><td>${t.getAddress()}</td><td>${t.getCity()}</td><td>${t.getProduct()}</td><td>${t.getQuantity()}</td><td>${t.getCardname()}</td><td>${t.getNocard()}</td><td>${t.getExpmonth()}</td><td>${t.getExpyear()}</td><td><a href="editform.jsp?Checkout_id=${t.getCheckout_id()}">Edit</a></td><td><a href="deleteorder.jsp?checkout_id=${t.getCheckout_id()}">Delete</a></td></tr>
            </c:forEach>
        </table>
        </div>
    </body>
</html>

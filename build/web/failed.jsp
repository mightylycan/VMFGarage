<%-- 
    Document   : failed
    Created on : Jul 19, 2019, 4:39:54 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-image: url("1.jpg");
                background-size: cover;
            }
            .content{
                color: red;
                position: absolute;
                top: 450px;
                left: 500px;
                font-size: 24px;
            }
            .btn{
                color: white;
                background-color: black;
                text-decoration: none;
                position: absolute;
                top: 540px;
                left: 680px;
                font-size: 30px;
                padding: 12px;
                border-radius: 20px;
            }
            .btn:hover{
               padding: 18px; 
            }
        </style>
    </head>
    <body>
        <div class="content">
            <center><h1>Transaction Failed</center></h1>
        <br>
        <center><h2>Please Check Your Information</center></h2>
        </div>
        <a class="btn" href="index.jsp">Home</a>
    </body>
</html>

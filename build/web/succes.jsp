<%-- 
    Document   : succes
    Created on : Jul 19, 2019, 4:09:19 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transaction Success</title>
        <style>
            body{
                background-image:url("suks.jpg");
                background-size: cover;
            }
            h1{
                color: white;
                font-size: 60px;
            }
            .content{
                position: absolute;
                right: 520px;
                top: 300px;
            }
            .bck{
                color: pink;
                text-decoration: none;
                position: absolute;
                left: 680px;
                top: 450px;
                padding: 10px;
                background-color: whitesmoke;
                border-radius: 20px;
                font-size: 20px;
            }
            .bck:hover{
                background-color: blue;
            }
        </style>
    </head>
    <body>
        <div class="content">
            <h1><center>Transaction Success</center></h1>
        </div>
        <a href="index.jsp" class="bck">Back to Home</a>
    </body>
</html>

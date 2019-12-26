<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Edit Form</title>
        <style>
            .form{
                margin-left: 1200px;
                position: relative;
                right: 600px;
                top: 150px;
                color: white;
            }
            .btn{
                background-color: pink;
                border-radius: 20px;
                position: relative;
                left: 130px;
            }
            .btn:hover{
                padding: 12px;
            }
            .back{
                background-color: pink;
                border-radius: 20px;
                position: relative;
                left: 150px;
                text-decoration: none;
                padding: 4px;
                color: black;
            }
            .back:hover{
                padding:6px;
            }
        </style>
    </head>
    <body background="bgedit.png">
        <%@page import="Controller.transactionDAO,Model.transaction" %>

        <%
            String id = request.getParameter("Checkout_id");
            transaction t = transactionDAO.getRecordById(Integer.parseInt(id));
        %>
        <div class="form">
            <center><h1>Edit Form</h1></center>
        <form action="editorder.jsp" method="post">
            <input type="hidden" name="checkout_id" value="<%=t.getCheckout_id()%>"/>
            <table>
                <tr><td>Name:</td><td><input type="text" name="name" value="<%= t.getName()%>"/></td></tr>
                <tr><td>Email:</td><td><input type="text" name="email" value="<%= t.getEmail()%>"/></td></tr>
                <tr><td>Address:</td><td><input type="text" name="address" value="<%= t.getAddress()%>"/></td></tr>
                <tr><td>City:</td><td><input type="text" name="city" value="<%= t.getCity()%>"/></td></tr>
                <tr><td>Product:</td><td><input type="text" name="product" value="<%= t.getProduct()%>"/></td></tr>
                <tr><td>Quantity:</td><td><input type="text" name="quantity" value="<%= t.getQuantity()%>"/></td></tr>
                <tr><td>Name on Card:</td><td><input type="text" name="quantity" value="<%= t.getCardname()%>" readonly/></td></tr>
                <tr><td>Credit Card Number:</td><td><input type="text" name="quantity" value="<%= t.getNocard()%>" readonly/></td></tr>
                <tr><td>Exp Month:</td><td><input type="text" name="quantity" value="<%= t.getExpmonth()%>" readonly/></td></tr>
                <tr><td>Exp Year:</td><td><input type="text" name="quantity" value="<%= t.getExpyear()%>" readonly/></td></tr>
                <tr><td colspan="2"><input class="btn" type="submit" value="Edit Order"/></td></tr>
                <tr><td><a href="admin.jsp" class="back">Back</a></td></tr>
            </table>
        </form>
        </div>
    </body>
</html>
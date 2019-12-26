<%-- 
    Document   : checkout
    Created on : Jul 13, 2019, 12:28:54 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <link rel="stylesheet" type="text/css" href="w3.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script type="text/javascript">
    function sub(){
      if ((document.checkout.firstname.value!='') && (document.checkout.email.value!='') && (document.checkout.address.value!='') && (document.checkout.city.value!='') && (document.checkout.state.value!='') && (document.checkout.cardname.value!='')  && (document.checkout.cardnumber.value!='')  && (document.checkout.expmonth.value!='')  && (document.checkout.expyear.value!='')  && (document.checkout.sameadr.value!=''))
      {
        alert("Your order has been entered into us, thank you for ordering");
      }
      else{
        alert("Please fill the blank space for order");
      }
    }
  </script>
  <title>CheckOut Form</title>
  <style type="text/css">
    body{
      margin: 0;
      padding: 0;
      font-family: sans-serif;
      background: url(bg.jpg) no-repeat;
      background-size: 1900px;
    }
.login-box{
width: 280px;
position: absolute;
top:50%;
left: 50%;
transform: translate(-50%,-50%);
color: white;
}
.login-box h3{
float: left;
font-size: 25px;
border-bottom: 6px solid;
margin-bottom: 50px;
padding: 13px 
}
    

.row {
display: -ms-flexbox; /* IE10 */
display: flex;
-ms-flex-wrap: wrap; /* IE10 */
flex-wrap: wrap;
margin: 0 -16px;
}

.col-25 {
  -ms-flex: 25%; /* IE10 */
  flex: 25%;
}

.col-50 {
  -ms-flex: 50%; /* IE10 */
  flex: 50%;
}

.col-75 {
  -ms-flex: 75%; /* IE10 */
  flex: 75%;
}

.col-25,
.col-50,
.col-75 {
  padding: 0 16px;
}

.container {
  background-color: none;
  padding: 5px 20px 15px 20px;
}

input[type=text] {
  width: 100%;
  margin: 8px 0;
  padding: 8px 0;
  border-bottom: 10px  green;
  outline: none;
  background: none;
  color: white;
}



.icon-container {
  margin-bottom: 20px;
  padding: 7px 0;
  font-size: 30px;
}

.btn {
  background-color: #4CAF50;
  color: white;
  padding: 12px;
  margin: 10px 0;
  border: 2px solid black;
  width: 100%;
  border-radius: 3px;
  cursor: pointer;
  font-size: 17px;
}

.btn:hover {
  background-color: gold;
}
  </style>
</head>
<body>

<h2 align="center" style="color: white">Checkout Form</h2>
<p align="center" style="color: white">PLEASE TO FULL FILL THE FIELD</p>
<div class="row">
    <div class="container">
        <form name="checkout" action="adduser.jsp" method="post">
      <div class="row">
          <div class="col-50">
            <h3 style="color: white">Billing Address</h3>
            <label for="fname" style="color:white "><i class="fa fa-user" ></i>Full Name</label>
            <input type="text" id="fname" name="name" placeholder="Enter Your Name">
            <label for="email" style="color:white "><i class="fa fa-envelope"></i> Email</label>
            <input type="text" id="email" name="email" placeholder="fxxxx@gmail.com">
            <label for="adr" style="color:white "><i class="fa fa-address-card-o"></i> Address</label>
            <input type="text" id="adr" name="address" placeholder="Exampleggh">
            <label for="city" style="color:white "><i class="fa fa-institution"></i> City</label>
            <input type="text" id="city" name="city" placeholder="Jakarta(example)">

            <div class="row">
              <div class="col-50">
                  <table>
                      <tr><td><tr><td><label style="color:white" for="game">Product</label></td></tr>
                      <td><select name="product">
            <option value="opt1">Select The Product</option>
			<optgroup label="Lamborghini">
				<option value="Lamborghini Aventador LP 700-4">Lamborghini Aventador LP 700-4</option>
				<option value="Lamborghini Urus">Lamborghini Urus</option>
				<option value="Lamborghini Egoista">Lamborghini Egoista</option>
				<option value="Lamborghini Huracan LP 610-4">Lamborghini Huracan LP 610-4</option>
			</optgroup>
			<optgroup label="BMW Series">
				<option value="BMW 1 Series">BMW 1 Series</option>
				<option value="The BMW 2 Series Coupe">The BMW 2 Series Coupe</option>
				<option value="The BMW 3 Series">The BMW 3 Series</option>
                                <option value="BMW 4 Series Gran Coupe">BMW 4 Series Gran Coupe</option>
                                <option value="BMW 5 Series Bussiness Athlete">BMW 5 Series Bussiness Athlete</option>
                                <option value="BMW 6 Series Grand Turismo">BMW 6 Series Grand Turismo</option>
                                <option value="BMW 7 Series">BMW 7 Series</option>
			</optgroup>
			<optgroup label="Ferrari">
				<option value="Ferrari 458 Spider">Ferrari 458 Spider</option>
				<option value="Ferrari 458 Speciale">Ferrari 458 Speciale</option>
				<option value="Ferrari 488 GTB">Ferrari 488 GTB</option>
                                <option value="Ferrari 812 Superfast">Ferrari 812 Superfast</option>
                                <option value="Ferrari California T">Ferrari California T</option>
                                <option value="Ferrari Portofino">Ferrari Portofino</option>
			</optgroup>
		</select></td>
                  </table>
              </div>
            </div>
            <div class="row">
              <div class="col-50">
                  <table>
                      <tr><td><label style="color:white">Quantity</tr>
                      <td>
                          <input type="number" name="quantity">
                      </td></tr>
                  </table>
              </div>
            </div>
          </div>
            <div class="col-50">
            <h3 style="color: white">Payment</h3>
            <label for="fname" style="color: white">Accepted Cards</label>
            <div class="icon-container">
              <i class="fa fa-cc-visa" style="color:navy;"></i>
              <i class="fa fa-cc-amex" style="color:blue;"></i>
              <i class="fa fa-cc-mastercard" style="color:red;"></i>
              <i class="fa fa-cc-discover" style="color:orange;"></i>
            </div>
            <label for="cname" style="color: white">Name on Card</label>
            <input type="text" id="cname" name="cardname" placeholder="enter name">
            <label for="ccnum" style="color: white">Credit card number</label>
            <input type="text" id="ccnum" name="nocard" placeholder="example:1111-2222-3333-4444">
            <label for="expmonth" style="color: white">Exp Month</label>
            <input type="text" id="expmonth" name="expmonth" placeholder="example:September">
            <div class="row">
              <div class="col-50">
                <label for="expyear" style="color: white">Exp Year</label>
                <input type="text" id="expyear" name="expyear" placeholder="2018">
              </div>
              </div>
            </div>
      </div>
            
            <button type="submit" class="w3-button w3-black w3-round-xxlarge">Submit</button>
            </a>
        <button class="w3-button w3-black w3-round-xxlarge"><a href="beli.jsp" style="text-decoration: none;">Back To Store</a></button>
        </form>
    </div>
        
</div>
</body>
</html>

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"w3.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("    function sub(){\n");
      out.write("      if ((document.checkout.firstname.value!='') && (document.checkout.email.value!='') && (document.checkout.address.value!='') && (document.checkout.city.value!='') && (document.checkout.state.value!='') && (document.checkout.cardname.value!='')  && (document.checkout.cardnumber.value!='')  && (document.checkout.expmonth.value!='')  && (document.checkout.expyear.value!='')  && (document.checkout.sameadr.value!=''))\n");
      out.write("      {\n");
      out.write("        alert(\"Your order has been entered into us, thank you for ordering\");\n");
      out.write("      }\n");
      out.write("      else{\n");
      out.write("        alert(\"Please fill the blank space for order\");\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("  </script>\n");
      out.write("  <title>CheckOut Form</title>\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("    body{\n");
      out.write("      margin: 0;\n");
      out.write("      padding: 0;\n");
      out.write("      font-family: sans-serif;\n");
      out.write("      background: url(bg.jpg) no-repeat;\n");
      out.write("      background-size: 1900px;\n");
      out.write("    }\n");
      out.write(".login-box{\n");
      out.write("width: 280px;\n");
      out.write("position: absolute;\n");
      out.write("top:50%;\n");
      out.write("left: 50%;\n");
      out.write("transform: translate(-50%,-50%);\n");
      out.write("color: white;\n");
      out.write("}\n");
      out.write(".login-box h3{\n");
      out.write("float: left;\n");
      out.write("font-size: 25px;\n");
      out.write("border-bottom: 6px solid;\n");
      out.write("margin-bottom: 50px;\n");
      out.write("padding: 13px \n");
      out.write("}\n");
      out.write("    \n");
      out.write("\n");
      out.write(".row {\n");
      out.write("display: -ms-flexbox; /* IE10 */\n");
      out.write("display: flex;\n");
      out.write("-ms-flex-wrap: wrap; /* IE10 */\n");
      out.write("flex-wrap: wrap;\n");
      out.write("margin: 0 -16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25 {\n");
      out.write("  -ms-flex: 25%; /* IE10 */\n");
      out.write("  flex: 25%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-50 {\n");
      out.write("  -ms-flex: 50%; /* IE10 */\n");
      out.write("  flex: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-75 {\n");
      out.write("  -ms-flex: 75%; /* IE10 */\n");
      out.write("  flex: 75%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".col-25,\n");
      out.write(".col-50,\n");
      out.write(".col-75 {\n");
      out.write("  padding: 0 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("  background-color: none;\n");
      out.write("  padding: 5px 20px 15px 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text] {\n");
      out.write("  width: 100%;\n");
      out.write("  margin: 8px 0;\n");
      out.write("  padding: 8px 0;\n");
      out.write("  border-bottom: 10px  green;\n");
      out.write("  outline: none;\n");
      out.write("  background: none;\n");
      out.write("  color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".icon-container {\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  padding: 7px 0;\n");
      out.write("  font-size: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn {\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("  color: white;\n");
      out.write("  padding: 12px;\n");
      out.write("  margin: 10px 0;\n");
      out.write("  border: 2px solid black;\n");
      out.write("  width: 100%;\n");
      out.write("  border-radius: 3px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover {\n");
      out.write("  background-color: gold;\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2 align=\"center\" style=\"color: white\">Checkout Form</h2>\n");
      out.write("<p align=\"center\" style=\"color: white\">PLEASE TO FULL FILL THE FIELD</p>\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <form name=\"checkout\" action=\"adduser.jsp\" method=\"post\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("          <div class=\"col-50\">\n");
      out.write("            <h3 style=\"color: white\">Billing Address</h3>\n");
      out.write("            <label for=\"fname\" style=\"color:white \"><i class=\"fa fa-user\" ></i>Full Name</label>\n");
      out.write("            <input type=\"text\" id=\"fname\" name=\"name\" placeholder=\"Enter Your Name\">\n");
      out.write("            <label for=\"email\" style=\"color:white \"><i class=\"fa fa-envelope\"></i> Email</label>\n");
      out.write("            <input type=\"text\" id=\"email\" name=\"email\" placeholder=\"fxxxx@gmail.com\">\n");
      out.write("            <label for=\"adr\" style=\"color:white \"><i class=\"fa fa-address-card-o\"></i> Address</label>\n");
      out.write("            <input type=\"text\" id=\"adr\" name=\"address\" placeholder=\"Exampleggh\">\n");
      out.write("            <label for=\"city\" style=\"color:white \"><i class=\"fa fa-institution\"></i> City</label>\n");
      out.write("            <input type=\"text\" id=\"city\" name=\"city\" placeholder=\"Jakarta(example)\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-50\">\n");
      out.write("                  <table>\n");
      out.write("                      <tr><td><tr><td><label style=\"color:white\" for=\"game\">Product</label></td></tr>\n");
      out.write("                      <td><select name=\"product\">\n");
      out.write("            <option value=\"opt1\">Select The Product</option>\n");
      out.write("\t\t\t<optgroup label=\"Lamborghini\">\n");
      out.write("\t\t\t\t<option value=\"opt1\">Lamborghini Aventador LP 700-4</option>\n");
      out.write("\t\t\t\t<option value=\"opt2\">Lamborghini Urus</option>\n");
      out.write("\t\t\t\t<option value=\"opt3\">Lamborghini Egoista</option>\n");
      out.write("\t\t\t\t<option value=\"opt4\">Lamborghini Huracan LP 610-4</option>\n");
      out.write("\t\t\t</optgroup>\n");
      out.write("\t\t\t<optgroup label=\"BMW Series\">\n");
      out.write("\t\t\t\t<option value=\"opt5\">BMW 1 Series</option>\n");
      out.write("\t\t\t\t<option value=\"opt6\">The BMW 2 Series Coupe</option>\n");
      out.write("\t\t\t\t<option value=\"opt7\">The BMW 3 Series</option>\n");
      out.write("                                <option value=\"opt8\">BMW 4 Series Gran Coupe</option>\n");
      out.write("                                <option value=\"opt9\">BMW 5 Series Bussiness Athlete</option>\n");
      out.write("                                <option value=\"opt10\">BMW 6 Series Grand Turismo</option>\n");
      out.write("                                <option value=\"opt11\">BMW 7 Series</option>\n");
      out.write("\t\t\t</optgroup>\n");
      out.write("\t\t\t<optgroup label=\"Ferrari\">\n");
      out.write("\t\t\t\t<option value=\"opt12\">Ferrari 458 Spider</option>\n");
      out.write("\t\t\t\t<option value=\"opt13\">Ferrari 458 Speciale</option>\n");
      out.write("\t\t\t\t<option value=\"opt14\">Ferrari 488 GTB</option>\n");
      out.write("                                <option value=\"opt15\">Ferrari 812 Superfast</option>\n");
      out.write("                                <option value=\"opt16\">Ferrari California T</option>\n");
      out.write("                                <option value=\"opt17\">Ferrari Portofino</option>\n");
      out.write("\t\t\t</optgroup>\n");
      out.write("\t\t</select></td>\n");
      out.write("                  </table>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-50\">\n");
      out.write("                  <table>\n");
      out.write("                      <tr><td><label style=\"color:white\">Quantity</tr>\n");
      out.write("                      <td>\n");
      out.write("                          <input type=\"number\" name=\"quantity\">\n");
      out.write("                      </td></tr>\n");
      out.write("                  </table>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("            <div class=\"col-50\">\n");
      out.write("            <h3 style=\"color: white\">Payment</h3>\n");
      out.write("            <label for=\"fname\" style=\"color: white\">Accepted Cards</label>\n");
      out.write("            <div class=\"icon-container\">\n");
      out.write("              <i class=\"fa fa-cc-visa\" style=\"color:navy;\"></i>\n");
      out.write("              <i class=\"fa fa-cc-amex\" style=\"color:blue;\"></i>\n");
      out.write("              <i class=\"fa fa-cc-mastercard\" style=\"color:red;\"></i>\n");
      out.write("              <i class=\"fa fa-cc-discover\" style=\"color:orange;\"></i>\n");
      out.write("            </div>\n");
      out.write("            <label for=\"cname\" style=\"color: white\">Name on Card</label>\n");
      out.write("            <input type=\"text\" id=\"cname\" name=\"cardname\" placeholder=\"enter name\">\n");
      out.write("            <label for=\"ccnum\" style=\"color: white\">Credit card number</label>\n");
      out.write("            <input type=\"text\" id=\"ccnum\" name=\"nocard\" placeholder=\"example:1111-2222-3333-4444\">\n");
      out.write("            <label for=\"expmonth\" style=\"color: white\">Exp Month</label>\n");
      out.write("            <input type=\"text\" id=\"expmonth\" name=\"expmonth\" placeholder=\"example:September\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-50\">\n");
      out.write("                <label for=\"expyear\" style=\"color: white\">Exp Year</label>\n");
      out.write("                <input type=\"text\" id=\"expyear\" name=\"expyear\" placeholder=\"2018\">\n");
      out.write("              </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("      </div>\n");
      out.write("            \n");
      out.write("            <button type=\"submit\" class=\"w3-button w3-black w3-round-xxlarge\">Submit</button>\n");
      out.write("            </a>\n");
      out.write("        <button class=\"w3-button w3-black w3-round-xxlarge\"><a href=\"beli.jsp\" style=\"text-decoration: none;\">Back To Store</a></button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

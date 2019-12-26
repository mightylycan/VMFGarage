package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.custDAO;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      Model.cust b = null;
      synchronized (_jspx_page_context) {
        b = (Model.cust) _jspx_page_context.getAttribute("b", PageContext.PAGE_SCOPE);
        if (b == null){
          b = new Model.cust();
          _jspx_page_context.setAttribute("b", b, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("b"), request);
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"w3.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/all.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"body.css\">\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\tfunction myFunction(id) {\n");
      out.write("  var x = document.getElementById(id);\n");
      out.write("  if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("    x.className += \" w3-show\";\n");
      out.write("  } else { \n");
      out.write("    x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\t<title>Homepage</title>\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Faster One' rel='stylesheet'>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Racing Sans One' rel='stylesheet'>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Permanent Marker' rel='stylesheet'>\n");
      out.write("\t<style>\n");
      out.write("\t\t.header{\n");
      out.write("\t\t\tbackground-image: url(header.png);\n");
      out.write("\t\t\tpadding: 10px;\n");
      out.write("\t\t\ttop: 0px;\n");
      out.write("\t\t\tleft: 0px;\n");
      out.write("\t\t\twidth: 1520px;\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tz-index: 999;\n");
      out.write("\t\t}\n");
      out.write("\t\t.header2{\n");
      out.write("\t\t\tz-index: 999;\n");
      out.write("\t\t}\n");
      out.write("\t\t.logo{\n");
      out.write("\t\t\theight: 80px;\n");
      out.write("\t\t\twidth: 120px;\n");
      out.write("\t\t\tmargin-top: 0px;\n");
      out.write("\t\t}\t\n");
      out.write("\t\th1{\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfont-size: 15px;\n");
      out.write("\t\t\ttop: 6px;\n");
      out.write("\t\t\tright: 45px;\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t}\n");
      out.write("\t\t.gmail{\n");
      out.write("\t\t\theight: 30px;\n");
      out.write("\t\t\twidth: 30px;\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\t\t\tborder-radius: 50px;\n");
      out.write("\t\t\ttop: 50px;\n");
      out.write("\t\t\tright: 10px;\n");
      out.write("\t\t\tposition: absolute; \n");
      out.write("\t\t}\n");
      out.write("\t\t.tlp{\n");
      out.write("\t\t\theight: 30px;\n");
      out.write("\t\t\twidth: 30px;\n");
      out.write("\t\t\tbackground-color: black;\n");
      out.write("\t\t\tborder-radius: 50px;\n");
      out.write("\t\t\ttop: 10px;\n");
      out.write("\t\t\tright: 10px;\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t}\n");
      out.write("\t\t.tlp:hover{\n");
      out.write("\t\t\t animation: shake 0.5s;\n");
      out.write("\t\t\t animation-iteration-count: infinite; \n");
      out.write("\t\t}\n");
      out.write("\t\t@keyframes shake {\n");
      out.write("  0% { transform: translate(1px, 1px) rotate(0deg); }\n");
      out.write("  10% { transform: translate(-1px, -2px) rotate(-1deg); }\n");
      out.write("  20% { transform: translate(-3px, 0px) rotate(1deg); }\n");
      out.write("  30% { transform: translate(3px, 2px) rotate(0deg); }\n");
      out.write("  40% { transform: translate(1px, -1px) rotate(1deg); }\n");
      out.write("  50% { transform: translate(-1px, 2px) rotate(-1deg); }\n");
      out.write("  60% { transform: translate(-3px, 1px) rotate(0deg); }\n");
      out.write("  70% { transform: translate(3px, 1px) rotate(-1deg); }\n");
      out.write("  80% { transform: translate(-1px, -1px) rotate(1deg); }\n");
      out.write("  90% { transform: translate(1px, 2px) rotate(0deg); }\n");
      out.write("  100% { transform: translate(1px, -2px) rotate(-1deg); }\n");
      out.write("}\n");
      out.write("\t\th2{\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfont-size: 15px;\n");
      out.write("\t\t\ttop: 42px;\n");
      out.write("\t\t\tright: 45px;\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t}\n");
      out.write("\t\t.vmf{\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tleft: 650px;\n");
      out.write("\t\t\theight: 50px;\n");
      out.write("\t\t\twidth: 200px;\n");
      out.write("\t\t\ttop: 25px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.home{\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tmargin-top: -200px;\n");
      out.write("\t\t\tbackground-color: whitesmoke;\n");
      out.write("\t\t\tpadding: 8px;\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\tmargin-left: 50px;\n");
      out.write("\t\t\tfont-family: 'Racing Sans One'\n");
      out.write("\t\t}\n");
      out.write("                .content{\n");
      out.write("                    color: black;\n");
      out.write("                    position: absolute;\n");
      out.write("                    margin-top: 150px;\n");
      out.write("                    margin-left: 500px;\n");
      out.write("                }\n");
      out.write("                </style>\n");
      out.write("<body background=\"white\">\n");
      out.write("    <div class=\"header\">\n");
      out.write("\t<img class=\"logo\" src=\"logo.png\">\n");
      out.write("\t<img class=\"tlp\" src=\"tlp.png\">\n");
      out.write("\t<img class=\"gmail\" src=\"gmail.jpg\">\n");
      out.write("\t<a href=\"Home.jsp\"><img class=\"vmf\" src=\"vmf.png\"></a>\n");
      out.write("\t<h1>021-322-009-111</h1>\n");
      out.write("\t<h2>vmfgarage@customerservice.com</h2>\n");
      out.write("</div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <h><center><b>Register</b></center></h>\n");
      out.write("<form name=\"OrderFoodOnline\" id=\"Order_Food\" action=\"adduser.jsp\" method=\"post\">\n");
      out.write("\t<table> \n");
      out.write("\t<tr><td>Full Name</td>\n");
      out.write("\t<td>:</td>\n");
      out.write("\t<td><input type=\"text\" name=\"fname\" placeholder=\"Input Your First Name\" required></td></tr>\n");
      out.write("\t<tr><td>Date\n");
      out.write("\t<td>:</td>      \n");
      out.write("        <td><input type=\"text\" name=\"bday\" placeholder=\"yyyy-mm-dd\" required></td></tr>\n");
      out.write("\t<tr><td>Email\n");
      out.write("\t<td>:</td> \n");
      out.write("\t<td><input type=\"email\" name=\"email_id\" placeholder=\"Input Your Email\" required></td></tr><tr>\n");
      out.write("        <td>Username</td>\n");
      out.write("\t<td>:</td>\n");
      out.write("\t<td><input type=\"text\" name=\"uname\" placeholder=\"Input Your Username\" required></td></tr>\n");
      out.write("        <tr><td>Password</td>\n");
      out.write("\t<td>:</td>\n");
      out.write("\t<td><input type=\"password\" name=\"pwuser\" placeholder=\"Input Your Password\" required></td></tr>\n");
      out.write("\t<tr><td>Contact Number\n");
      out.write("\t<td>:</td> \n");
      out.write("\t<td><input type=\"text\" name=\"number\" placeholder=\"Input Your Contact Number\" required></td></tr>\n");
      out.write("\t<tr><td>Address</td>\n");
      out.write("\t<td>:</td>\n");
      out.write("\t<td><textarea name=\"address\" rows=\"5\" cols=\"30\" placeholder=\"Input Your Adress\"></textarea></td></tr>\n");
      out.write("        <td>City</td>\n");
      out.write("\t<td>:</td>\n");
      out.write("        <td><input type=\"text\" name=\"city\" placeholder=\"Input Your City\" required></td></tr>\n");
      out.write("        <td>State</td>\n");
      out.write("\t<td>:</td>\n");
      out.write("\t<td><input type=\"text\" name=\"state\" placeholder=\"Input Your State\" required></td>\n");
      out.write("\t<tr><td><button id=\"submit\" type=\"submit\" name=\"Submit\">Submit</button></td>\n");
      out.write("            <td><button id=\"reset\" type=\"reset\">Reset</button></td></tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("    </div>\n");
      out.write("</body>");
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

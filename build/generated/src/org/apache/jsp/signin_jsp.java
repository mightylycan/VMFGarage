package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
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
      out.write("\t\t\twidth: 1540px;\n");
      out.write("\t\t\tposition: absolute;\n");
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
      out.write("\t\t.home:hover{\n");
      out.write("\t\t\tbackground-color: lightsteelblue;\n");
      out.write("\t\t}\n");
      out.write("                .content{\n");
      out.write("                    position: fixed;\n");
      out.write("                    left: 600px;\n");
      out.write("                    background-color: lightblue;\n");
      out.write("                    padding: 20px;\n");
      out.write("                    top: 300px;\n");
      out.write("                    border-radius: 20px;\n");
      out.write("                }\n");
      out.write("                .judul{\n");
      out.write("                    margin-top: 200px;\n");
      out.write("                }\n");
      out.write("                #submit{\n");
      out.write("                    border-radius: 20px;\n");
      out.write("                    padding: 8px;\n");
      out.write("                }\n");
      out.write("                #submit:hover{\n");
      out.write("                    padding: 10px;\n");
      out.write("                    background-color: lightblue;\n");
      out.write("                }\n");
      out.write("                h{\n");
      out.write("                  background-color: lightblue;\n");
      out.write("                  padding: 20px;\n");
      out.write("                  position: fixed;\n");
      out.write("                  left: 700px;\n");
      out.write("                  top: 250px;\n");
      out.write("                  border-radius: 20px;\n");
      out.write("                }\n");
      out.write("                body{\n");
      out.write("                    background-image: url(\"bglogin.jpg\");\n");
      out.write("                    background-size: cover;\n");
      out.write("                }\n");
      out.write("                </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("\t<img class=\"logo\" src=\"logo.png\">\n");
      out.write("\t<img class=\"tlp\" src=\"tlp.png\">\n");
      out.write("\t<img class=\"gmail\" src=\"gmail.jpg\">\n");
      out.write("\t<a href=\"Home.jsp\"><img class=\"vmf\" src=\"vmf.png\"></a>\n");
      out.write("\t<h1>021-322-009-111</h1>\n");
      out.write("\t<h2>vmfgarage@customerservice.com</h2>\n");
      out.write("</div>\n");
      out.write("        <div class=\"judul\">\n");
      out.write("        <h><center><b>Please Sign-In</b></center></h>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\">        \n");
      out.write("<form name=\"signin\" id=\"signin\" method=\"post\" action=\"login\">\n");
      out.write("\t<table> \n");
      out.write("\t<tr><td>Username</td>\n");
      out.write("\t<td>:</td>\n");
      out.write("\t<td><input type=\"text\" name=\"uname\" placeholder=\"Input Username\"></td></tr>\n");
      out.write("\t<tr><td>Password\n");
      out.write("\t<td>:</td> \n");
      out.write("\t<td><input type=\"password\" name=\"pwuser\" size=\"20\" maxlength=\"20\"></td></tr>\n");
      out.write("        <tr><td><button id=\"submit\" style=\"position: absolute; margin-top: 30px; margin-left: 60px\" type=\"submit\" name=\"Submit\">Enter</button></td></tr>\n");
      out.write("        <tr><td><button id=\"submit\" style=\"position: absolute; margin-top: 30px; margin-left: 150px;\" name=\"Submit\"><a style=\"text-decoration: none\" href=\"Home.jsp\">Back to Home</a></button></td></tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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

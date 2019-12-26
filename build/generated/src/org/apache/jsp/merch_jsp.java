package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.merchDAO;
import Model.merch;
import java.util.*;

public final class merch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    List<merch> list = merchDAO.getAllRecords();
    request.setAttribute("list", list);

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Merchandise Shop</title>\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Faster One' rel='stylesheet'>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Racing Sans One' rel='stylesheet'>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Aclonica' rel='stylesheet'>\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Permanent Marker' rel='stylesheet'>\n");
      out.write("  <script\n");
      out.write("    src=\"https://code.jquery.com/jquery-3.3.1.js\"\n");
      out.write("    integrity=\"sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=\"\n");
      out.write("    crossorigin=\"anonymous\">\n");
      out.write("  </script>\n");
      out.write("\t<style>\n");
      out.write("\t\t.header{\n");
      out.write("      background-image: url(header.png);\n");
      out.write("      padding: 10px;\n");
      out.write("      top: 0px;\n");
      out.write("      left: 0px;\n");
      out.write("      width: 1495px;\n");
      out.write("      position: absolute;\n");
      out.write("      z-index: 999;\n");
      out.write("    }\n");
      out.write("    .header2{\n");
      out.write("      z-index: 999;\n");
      out.write("    }\n");
      out.write("    .logo{\n");
      out.write("      height: 80px;\n");
      out.write("      width: 120px;\n");
      out.write("      margin-top: 0px;\n");
      out.write("    } \n");
      out.write("    h1{\n");
      out.write("      color: white;\n");
      out.write("      font-size: 15px;\n");
      out.write("      top: 6px;\n");
      out.write("      right: 45px;\n");
      out.write("      position: absolute;\n");
      out.write("    }\n");
      out.write("    .gmail{\n");
      out.write("      height: 30px;\n");
      out.write("      width: 30px;\n");
      out.write("      background-color: black;\n");
      out.write("      border-radius: 50px;\n");
      out.write("      top: 50px;\n");
      out.write("      right: 10px;\n");
      out.write("      position: absolute; \n");
      out.write("    }\n");
      out.write("    .tlp{\n");
      out.write("      height: 30px;\n");
      out.write("      width: 30px;\n");
      out.write("      background-color: black;\n");
      out.write("      border-radius: 50px;\n");
      out.write("      top: 10px;\n");
      out.write("      right: 10px;\n");
      out.write("      position: absolute;\n");
      out.write("    }\n");
      out.write("    .tlp:hover{\n");
      out.write("       animation: shake 0.5s;\n");
      out.write("       animation-iteration-count: infinite; \n");
      out.write("    }\n");
      out.write("    @keyframes shake {\n");
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
      out.write("    h2{\n");
      out.write("      color: white;\n");
      out.write("      font-size: 15px;\n");
      out.write("      top: 42px;\n");
      out.write("      right: 45px;\n");
      out.write("      position: absolute;\n");
      out.write("    }\n");
      out.write("    .vmf{\n");
      out.write("      position: absolute;\n");
      out.write("      left: 650px;\n");
      out.write("      height: 50px;\n");
      out.write("      width: 200px;\n");
      out.write("      top: 25px;\n");
      out.write("    }\n");
      out.write("    .home{\n");
      out.write("      text-decoration: none;\n");
      out.write("      color: black;\n");
      out.write("      margin-top: -200px;\n");
      out.write("      background-color: whitesmoke;\n");
      out.write("      padding: 8px;\n");
      out.write("      font-size: 20px;\n");
      out.write("      margin-left: 50px;\n");
      out.write("      font-family: 'Racing Sans One'\n");
      out.write("    }\n");
      out.write("    .header2{\n");
      out.write("      position: absolute;\n");
      out.write("      top: 103px;\n");
      out.write("      background-color: whitesmoke;\n");
      out.write("      padding: 8px;\n");
      out.write("      width: 1520px;\n");
      out.write("      left: 0px;\n");
      out.write("    }\n");
      out.write("    .home:hover{\n");
      out.write("      background-color: lightsteelblue;\n");
      out.write("    } \n");
      out.write("\t\t.dropbtn {\n");
      out.write("  \t\t\tbackground-color: whitesmoke;\n");
      out.write("  \t\t\tcolor: black;\n");
      out.write("  \t\t\tpadding: 8px;\n");
      out.write("  \t\t\tfont-size: 20px;\n");
      out.write("  \t\t\tborder: none;\n");
      out.write("  \t\t\tcursor: pointer;\n");
      out.write("  \t\t\tmargin-top: -90px;\n");
      out.write("  \t\t\tmargin-left: 50px;\n");
      out.write("  \t\t\tfont-family: 'Racing Sans One'\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropbtn:hover, .dropbtn:focus {\n");
      out.write("  \t\t\tbackground-color: lightsteelblue;\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropdown {\n");
      out.write(" \t\t \tposition: relative;\n");
      out.write("  \t\t\tdisplay: inline-block;\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropdown-content {\n");
      out.write("  \t\t\tdisplay: none;\n");
      out.write("  \t\t\tposition: absolute;\n");
      out.write("  \t\t\tbackground-color: #f1f1f1;\n");
      out.write("  \t\t\tmin-width: 160px;\n");
      out.write("  \t\t\tbox-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("  \t\t\tz-index: 4;\n");
      out.write("  \t\t\tmargin-left: 50px;\n");
      out.write("  \t\t\tfont-family: 'Faster One'\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropdown-content a {\n");
      out.write("  \t\t\tcolor: black;\n");
      out.write("  \t\t\tpadding: 12px 16px;\n");
      out.write("  \t\t\ttext-decoration: none;\n");
      out.write("  \t\t\tdisplay: block;\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropdown-content a:hover {background-color: #ddd}\n");
      out.write("\t\t.show {display:block;}\n");
      out.write("\t\t.dropbtns {\n");
      out.write("  \t\t\tbackground-color: whitesmoke;\n");
      out.write("  \t\t\tcolor: black;\n");
      out.write("  \t\t\tpadding: 8px;\n");
      out.write("  \t\t\tfont-size: 20px;\n");
      out.write("  \t\t\tborder: none;\n");
      out.write("  \t\t\tcursor: pointer;\n");
      out.write("  \t\t\tposition: absolute;\n");
      out.write("  \t\t\tmargin-left: 460px;\n");
      out.write("  \t\t\tmargin-top: -40px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropbtns:hover, .dropbtns:focus {\n");
      out.write("  \t\t\tbackground-color: lightsteelblue;\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropdownku {\n");
      out.write(" \t\t \tposition: relative;\n");
      out.write("  \t\t\tdisplay: inline-block;\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropdown-contents {\n");
      out.write("  \t\t\tdisplay: none;\n");
      out.write("  \t\t\tposition: absolute;\n");
      out.write("  \t\t\tbackground-color: #f1f1f1;\n");
      out.write("  \t\t\tmin-width: 160px;\n");
      out.write("  \t\t\tbox-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("  \t\t\tz-index: 1;\n");
      out.write("  \t\t\tmargin-left: 460px;\n");
      out.write("  \t\t\tmargin-top: 2px;\n");
      out.write("  \t\t\twidth: 200px;\n");
      out.write("  \t\t\ttext-align: center;\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropdown-contents a {\n");
      out.write("  \t\t\tcolor: black;\n");
      out.write("  \t\t\tpadding: 12px 16px;\n");
      out.write("  \t\t\ttext-decoration: none;\n");
      out.write("  \t\t\tdisplay: block;\n");
      out.write("  \t\t\tfont-family: 'Permanent Marker'\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropdown-contents a:hover {background-color: #ddd}\n");
      out.write("\t\t.show {display:block;}\n");
      out.write("\t\t.dropbtned {\n");
      out.write("  \t\t\tbackground-color: #f1f1f1;\n");
      out.write("  \t\t\tcolor: black;\n");
      out.write("  \t\t\tpadding: 16px;\n");
      out.write("  \t\t\tfont-size: 16px;\n");
      out.write("  \t\t\tborder: none;\n");
      out.write("  \t\t\twidth: 200px;\n");
      out.write("  \t\t\tfont-family: 'Permanent Marker'\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropdowney {\n");
      out.write("  \t\t\tposition: relative;\n");
      out.write("  \t\t\tdisplay: inline-block;\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropdown-contented {\n");
      out.write("  \t\t\tdisplay: none;\n");
      out.write("  \t\t\tposition: absolute;\n");
      out.write("  \t\t\tbackground-color: #f1f1f1;\n");
      out.write("  \t\t\tmin-width: 160px;\n");
      out.write("  \t\t\tbox-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("  \t\t\tz-index: 1;\n");
      out.write("  \t\t\tmargin-left: 200px;\n");
      out.write("  \t\t\tmargin-top: -54px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropdown-contented a {\n");
      out.write("  \t\t\tcolor: black;\n");
      out.write("  \t\t\tpadding: 12px 16px;\n");
      out.write("  \t\t\ttext-decoration: none;\n");
      out.write("  \t\t\tdisplay: block;\n");
      out.write("\t\t}\n");
      out.write("\t\t.dropdown-contented a:hover {background-color: pink;}\n");
      out.write("\t\t.dropdowney:hover .dropdown-contented {display: block;}\n");
      out.write("\t\t.dropdowney:hover .dropbtned {background-color: #ddd;}\n");
      out.write("\t\t.beli{\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tpadding: 8px;\n");
      out.write("\t\t\tbackground-color: whitesmoke;\n");
      out.write("\t\t\tmargin-left: 50px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.beli:hover{\n");
      out.write("\t\t\tbackground-color: lightsteelblue;\n");
      out.write("\t\t\tpadding: 8px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.addto{\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tfont-weight: bold;\n");
      out.write("\t\t\tbackground-color: lavender;\n");
      out.write("\t\t\tpadding: 8px;\n");
      out.write("\t\t\tborder-radius: 18px;\n");
      out.write("\t\t\tfont-size: 14px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.addto:hover{\n");
      out.write("\t\t\tbackground-color: pink;\n");
      out.write("\t\t\tpadding: 10px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.container {\n");
      out.write("  \t\t\tposition: relative; \n");
      out.write("  \t\t\tmax-width: 800px;\n");
      out.write("  \t\t\tmargin: 0 auto;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.container .content {\n");
      out.write("  \t\t\tposition: absolute;\n");
      out.write("  \t\t\tbottom: 0;\n");
      out.write("  \t\t\tbackground: rgb(0, 0, 0);\n");
      out.write("  \t\t\tbackground: rgba(0, 0, 0, 0.5);\n");
      out.write("  \t\t\tcolor: #f1f1f1;\n");
      out.write("  \t\t\twidth: 200px;\n");
      out.write("  \t\t\tpadding: 0px;\n");
      out.write("  \t\t\tmargin-left: -300px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.containers {\n");
      out.write("  \t\t\tposition: relative; \n");
      out.write("  \t\t\tmax-width: 800px;\n");
      out.write("  \t\t\tmargin: 0 auto;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.containers .contents {\n");
      out.write("  \t\t\tposition: absolute;\n");
      out.write("  \t\t\tbottom: 0;\n");
      out.write("  \t\t\tbackground: rgb(0, 0, 0);\n");
      out.write("  \t\t\tbackground: rgba(0, 0, 0, 0.5);\n");
      out.write("  \t\t\tcolor: #f1f1f1;\n");
      out.write("  \t\t\twidth: 200px;\n");
      out.write("  \t\t\tpadding: 0px;\n");
      out.write("  \t\t\tmargin-left: 100px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.containered {\n");
      out.write("  \t\t\tposition: relative; \n");
      out.write("  \t\t\tmax-width: 800px;\n");
      out.write("  \t\t\tmargin: 0 auto;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.containered .contented {\n");
      out.write("  \t\t\tposition: absolute;\n");
      out.write("  \t\t\tbottom: 0;\n");
      out.write("  \t\t\tbackground: rgb(0, 0, 0);\n");
      out.write("  \t\t\tbackground: rgba(0, 0, 0, 0.5);\n");
      out.write("  \t\t\tcolor: #f1f1f1;\n");
      out.write("  \t\t\twidth: 200px;\n");
      out.write("  \t\t\tpadding: 0px;\n");
      out.write("  \t\t\tmargin-left: 500px;\n");
      out.write("\t\t}\n");
      out.write("\t\t.containerey {\n");
      out.write("  \t\t\tposition: relative; \n");
      out.write("  \t\t\tmax-width: 800px;\n");
      out.write("  \t\t\tmargin: 0 auto;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t.containerey .contentey {\n");
      out.write("  \t\t\tposition: absolute;\n");
      out.write("  \t\t\tbottom: 0;\n");
      out.write("  \t\t\tbackground: rgb(0, 0, 0);\n");
      out.write("  \t\t\tbackground: rgba(0, 0, 0, 0.5);\n");
      out.write("  \t\t\tcolor: #f1f1f1;\n");
      out.write("  \t\t\twidth: 200px;\n");
      out.write("  \t\t\tpadding: 0px;\n");
      out.write("  \t\t\tmargin-left: 900px;\n");
      out.write("\t\t}\n");
      out.write("    .signin{\n");
      out.write("                        text-decoration: none;\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\tcolor: black;\n");
      out.write("\t\t\tpadding: 8px;\n");
      out.write("\t\t\tbackground-color: whitesmoke;\n");
      out.write("                        margin-left: 1300px;\n");
      out.write("                        margin-top: -40px;\n");
      out.write("                        position: absolute;\n");
      out.write("                }\n");
      out.write("                .signin:hover{\n");
      out.write("                    background-color: lightsteelblue;\n");
      out.write("                    padding: 8px; \n");
      out.write("                }\n");
      out.write("                .content{\n");
      out.write("                    margin-top: 200px;\n");
      out.write("                }\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body background=\"black.jpg\">\n");
      out.write("\t<script>\n");
      out.write("\t\tfunction myFunction() {\n");
      out.write("  \t\tdocument.getElementById(\"myDropdown\").classList.toggle(\"show\");\n");
      out.write("\t\t}\n");
      out.write("\t\twindow.onclick = function(event) {\n");
      out.write("  if (!event.target.matches('.dropbtn')) {\n");
      out.write("    var dropdowns = document.getElementsByClassName(\"dropdown-content\");\n");
      out.write("    var i;\n");
      out.write("    for (i = 0; i < dropdowns.length; i++) {\n");
      out.write("      var openDropdown = dropdowns[i];\n");
      out.write("      if (openDropdown.classList.contains('show')) {\n");
      out.write("        openDropdown.classList.remove('show');\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("function myFunctions() {\n");
      out.write("  \t\tdocument.getElementById(\"Dropdownku\").classList.toggle(\"show\");\n");
      out.write("\t\t}\n");
      out.write("\t\twindow.onclick = function(event) {\n");
      out.write("  if (!event.target.matches('.dropbtns')) {\n");
      out.write("    var dropdowns = document.getElementsByClassName(\"dropdown-contents\");\n");
      out.write("    var i;\n");
      out.write("    for (i = 0; i < dropdowns.length; i++) {\n");
      out.write("      var openDropdown = dropdowns[i];\n");
      out.write("      if (openDropdown.classList.contains('show')) {\n");
      out.write("        openDropdown.classList.remove('show');\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\t</script>\n");
      out.write("<div class=\"header\">\n");
      out.write("\t<img class=\"logo\" src=\"logo.png\">\n");
      out.write("\t<img class=\"tlp\" src=\"tlp.png\">\n");
      out.write("\t<img class=\"gmail\" src=\"gmail.jpg\">\n");
      out.write("\t<a href=\"Home.jsp\"><img class=\"vmf\" src=\"vmf.png\"></a>\n");
      out.write("\t<h1>021-322-009-111</h1>\n");
      out.write("\t<h2>vmfgarage@customerservice.com</h2>\n");
      out.write("</div>\n");
      out.write("<div class=\"header2\">\n");
      out.write("\t<a class=\"home\" href=\"Home.jsp\">Home</a>\n");
      out.write("\t<div class=\"dropdown\">\n");
      out.write("  <button onclick=\"myFunction()\" class=\"dropbtn\">Car Menu</button>\n");
      out.write("  <div id=\"myDropdown\" class=\"dropdown-content\">\n");
      out.write("    <a href=\"lamborghini.jsp\">Lamborghini</a>\n");
      out.write("    <a href=\"bmw.jsp\">BMW</a>\n");
      out.write("    <a href=\"ferrari.jsp\">Ferrari</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<a style=\"font-family: 'Racing Sans One'\" class=\"beli\" href=\"beli.jsp\">Store</a>\n");
      out.write("<div class=\"dropdowny\">\n");
      out.write("<button style=\"font-family: 'Racing Sans One'\" onclick=\"myFunctions()\" class=\"dropbtns\">More</button>\n");
      out.write("  <div id=\"Dropdownku\" class=\"dropdown-contents\">\n");
      out.write("  \t<a href=\"merch.jsp\">Our Merchandise</a>\n");
      out.write("    <div class=\"dropdowney\">\n");
      out.write("  <button class=\"dropbtned\">Our Offline Store</button>\n");
      out.write("  <div class=\"dropdown-contented\">\n");
      out.write("    <a href=\"jakarta.jsp\">Jakarta</a>\n");
      out.write("    <a href=\"bandung.jsp\">Bandung</a>\n");
      out.write("    <a href=\"yogya.jsp\">Yogyakarta</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<a href=\"profile.jsp\">Our Profile</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<a style=\"font-family: 'Racing Sans One'\" class=\"signin\" href=\"signin.jsp\">Sign In</a>\n");
      out.write("</div>\n");
      out.write("        <div class=\"content\">\n");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </div>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("c");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("    \n");
          out.write("<div class=\"container\">\n");
          out.write("  <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getMerch_pict()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"bomber\" style=\"width:200px; height: 300px; margin-top: 0px; margin-left: -300px;\">\n");
          out.write("  <div class=\"content\">\n");
          out.write("    <p style=\"font-size: 16px; margin-left: 5px; text-align: center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getMerch_name()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("    <p style=\"font-size: 16px; margin-left: 50px;\">USD $");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.getMerch_price()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("    <a href=\"checkoutmerch.jsp\"><button style=\"margin-left: 40px\" class=\"addto\"><img style=\"height: 20px;width: 20px\" src=\"cartlogo.jpg\">Buy Now</button></a>\n");
          out.write("  </div>\n");
          out.write("</div>\n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}

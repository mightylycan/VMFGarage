package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.transactionDAO;
import Model.transaction;
import java.util.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
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
      out.write("\t\t\twidth: 1536px;\n");
      out.write("\t\t\tposition: absolute;\n");
      out.write("\t\t\tz-index: 999;\n");
      out.write("\t\t}\n");
      out.write("\t\t.logo{\n");
      out.write("\t\t\theight: 80px;\n");
      out.write("\t\t\twidth: 120px;\n");
      out.write("\t\t\tmargin-top: 0px;\n");
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
      out.write("                .signout{\n");
      out.write("                    color: white;\n");
      out.write("                    text-decoration: none;\n");
      out.write("                    margin-left: 1200px;\n");
      out.write("                }\n");
      out.write("                body{\n");
      out.write("                    background-image: url(\"bgadmin.jpg\");\n");
      out.write("                }\n");
      out.write("                .content{\n");
      out.write("                    color: white;\n");
      out.write("                    position: absolute;\n");
      out.write("                    top: 200px;    \n");
      out.write("                }\n");
      out.write("                th{\n");
      out.write("                    background-color: blue;\n");
      out.write("                    border-color: blue;\n");
      out.write("                }\n");
      out.write("                td{\n");
      out.write("                    background-color: green;\n");
      out.write("                }\n");
      out.write("                table{\n");
      out.write("                    border-color: pink;\n");
      out.write("                }\n");
      out.write("                </style>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("\t<img class=\"logo\" src=\"logo.png\">\n");
      out.write("\t<img class=\"vmf\" src=\"vmf.png\">\n");
      out.write("        <a class=\"signout\" href=\"index.jsp\">Sign Out</a>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"content\">\n");
      out.write("        <h1>Order List</h1>\n");
      out.write("        ");

            List<transaction> list = transactionDAO.getAllRecords();
            request.setAttribute("list", list);
        
      out.write("\n");
      out.write("        <table border=\"1\" width=\"100%\">\n");
      out.write("            <tr><th>Id</th><th>Name</th><th>Email</th><th>Address</th><th>City</th><th>Product</th><th>Quantity</th><th>Name on Card</th><th>Credit Card Number</th><th>Exp Month</th><th>Exp Year</th><th>Edit</th><th>Delete</th></tr>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </table>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("t");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <tr><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getCheckout_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getAddress()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getCity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getProduct()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getQuantity()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getCardname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getNocard()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getExpmonth()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getExpyear()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td><a href=\"editform.jsp?Checkout_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getCheckout_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a></td><td><a href=\"deleteorder.jsp?checkout_id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getCheckout_id()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete</a></td></tr>\n");
          out.write("            ");
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

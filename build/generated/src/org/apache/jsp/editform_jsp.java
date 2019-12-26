package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controller.transactionDAO;
import Model.transaction;

public final class editform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Edit Form</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        ");

            String id = request.getParameter("Checkout_id");
            transaction t = transactionDAO.getRecordById(Integer.parseInt(id));
        
      out.write("\n");
      out.write("\n");
      out.write("        <h1>Edit Form</h1>\n");
      out.write("        <form action=\"editorder.jsp\" method=\"post\">\n");
      out.write("            <input type=\"hidden\" name=\"checkout_id\" value=\"");
      out.print(t.getCheckout_id());
      out.write("\"/>\n");
      out.write("            <table>\n");
      out.write("                \n");
      out.write("                <tr><td>Name:</td><td><input type=\"text\" name=\"name\" value=\"");
      out.print( t.getName());
      out.write("\"/></td></tr>\n");
      out.write("                <tr><td>Email:</td><td><input type=\"text\" name=\"email\" value=\"");
      out.print( t.getEmail());
      out.write("\"/></td></tr>\n");
      out.write("                <tr><td>Address:</td><td><input type=\"text\" name=\"address\" value=\"");
      out.print( t.getAddress());
      out.write("\"/></td></tr>\n");
      out.write("                <tr><td>City:</td><td><input type=\"text\" name=\"city\" value=\"");
      out.print( t.getCity());
      out.write("\"/></td></tr>\n");
      out.write("                <tr><td>Product:</td><td><input type=\"text\" name=\"product\" value=\"");
      out.print( t.getProduct());
      out.write("\"/></td></tr>\n");
      out.write("                <tr><td>Quantity:</td><td><input type=\"text\" name=\"quantity\" value=\"");
      out.print( t.getQuantity());
      out.write("\"/></td></tr>\n");
      out.write("                <tr><td colspan=\"2\"><input type=\"submit\" value=\"Edit Order\"/></td></tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("                <h1>Name on Card : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.getCardname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

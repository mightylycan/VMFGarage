<%@page import="Controller.transactionDAO"%>
<jsp:useBean id="t" class="Model.transaction"></jsp:useBean>
<jsp:setProperty property="*" name="t"/>

<%
    transactionDAO.delete(t);
    response.sendRedirect("admin.jsp");
%>
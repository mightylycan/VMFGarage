<%@page import="Controller.transactionDAO"%>
<jsp:useBean id="t" class="Model.transaction"></jsp:useBean>
<jsp:setProperty property="*" name="t"/>

<%
    int i = transactionDAO.update(t);
    response.sendRedirect("admin.jsp");
%>
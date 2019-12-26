<%@page import="Controller.transactionDAO"%>
<jsp:useBean id="t" class="Model.transaction"></jsp:useBean>
<jsp:setProperty property="*" name="t"/>

<%
    int i = transactionDAO.save(t);
    if (i > 0) {
        response.sendRedirect("succes.jsp");
    } else {
        response.sendRedirect("failed.jsp");
    }
%>
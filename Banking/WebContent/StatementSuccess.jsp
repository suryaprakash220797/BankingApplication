<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Susccess Page</title>
</head>
<body>
<%
 session=request.getSession();
 out.println(session.getAttribute("sal"));
 out.println("<br>");
 out.println(session.getAttribute("ral"));
 out.println("<br>");
 out.println(session.getAttribute("al"));
 out.println("<br>");
%>
</body>
</html>
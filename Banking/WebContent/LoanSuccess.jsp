<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan success</title>
</head>
<body>
<%
session=request.getSession();
out.println("Dear, "+session.getAttribute("name")+" thank you for showing your interest on the loans from ABCBank");
out.println("<br>");
out.println("Our executive will contact you soon on your email address mentioned below");
out.println("<br>");
out.println(session.getAttribute("email"));
%>
</body>
</html>
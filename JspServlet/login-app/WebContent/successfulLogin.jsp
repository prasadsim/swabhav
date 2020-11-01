<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successful Login</title>
</head>
<body>
	<h1>Login Successful</h1>
	<br>
	<%
		String username = request.getParameter("username");
		out.print("welcome " + username);
	%>
	<a href="logout.jsp">logout</a>
</body>
</html>
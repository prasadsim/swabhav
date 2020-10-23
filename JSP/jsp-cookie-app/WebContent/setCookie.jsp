<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>setCookie</title>
</head>
<body>
	<h2>Cookie Created</h2>
	<br />
	<%
		Cookie color = new Cookie("color", "green");
		color.setMaxAge(60 * 60);
		response.addCookie(color);
	%><a href="getCookie.jsp">view</a>


</body>


</html>
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
		Cookie cookie = new Cookie("Name", "Prasad");
		cookie.setMaxAge(60 * 60);
		response.addCookie(cookie);

		Cookie[] getCookie = request.getCookies();

		if (getCookie == null) {
			out.print("no Cookie found");
	%><body style='background-color: red;'>
	<%
		} else {
			out.print("Cookie found");
	%>
	<body style='background-color: green;'>
	<%
		}
	%>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session</title>
</head>
<body>
	<%
		session.setAttribute("old", 0);
		session.setAttribute("new", 1);
		
		out.print(session.getAttribute("old"));
		out.print(session.getAttribute("new"));
		out.print(session.getId());
	%>

</body>
</html>
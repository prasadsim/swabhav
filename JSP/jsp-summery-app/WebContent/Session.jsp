<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int oldValue, newValue;
		if (session.getAttribute("counter") == null) {
			oldValue = 0;
		} else {
			oldValue = (int) session.getAttribute("counter");
		}
		newValue = oldValue + 1;
		session.setAttribute("counter", newValue);
		out.print("Old: " + oldValue);
		out.print("<br>New: " + newValue);
		out.print("<br>Session Id : " + session.getId());
	%>
	<br>
	<a href="Summary.jsp">Summary</a>
</body>
</html>
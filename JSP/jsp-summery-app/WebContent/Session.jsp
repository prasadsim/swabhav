<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int value;
		if (session.getAttribute("counter") == null) {
			value = 0;
		} else {
			value = (int) session.getAttribute("counter");
		}
		int oldValue = value;
		value++;
		session.setAttribute("counter", value);
		out.print("Old: " + oldValue);
		out.print("<br>New: " + value);
		out.print("<br>Session Id : "+session.getId());
	%>
	<br>
	<a href="Summary.jsp">Summary</a>
</body>
</html>
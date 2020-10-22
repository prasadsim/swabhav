<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int oldValue, newValue;
		if (application.getAttribute("counter") == null) {
			oldValue = 0;
		} else {
			oldValue = (int) application.getAttribute("counter");
		}
		newValue = oldValue + 1;
		application.setAttribute("counter", newValue);
		out.print("Old: " + oldValue);
		out.print("<br>New: " + newValue);
	%>
	<br>
	<a href="Summary.jsp">Summary</a>
</body>
</html>
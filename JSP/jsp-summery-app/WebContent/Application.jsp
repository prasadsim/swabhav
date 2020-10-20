<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int value;
		if (application.getAttribute("counter") == null) {
			value = 0;
		} else {
			value = (int) application.getAttribute("counter");
		}
		int oldValue = value;
		value++;
		application.setAttribute("counter", value);
		out.print("Old: " + oldValue);
		out.print("<br>New: " + value);
	%><br>
	<a href="Summary.jsp">Summary</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- if condition --%>
	<%
		int number = 3;
		if (number % 2 == 0) {
	%>
	<h1>even</h1>
	<%
		} else {
	%>
	<h1>odd</h1>
	<%
		}
	%>

	<%-- switch condition --%>

	<%
		int choice = 3;
		switch (choice) {
		case 1:
			out.print("Buy Iphone");
			break;
		case 2:
			out.print("Buy OnePlus");
			break;
		case 3:
			out.print("Buy RedMi");
			break;
		}
	%>


</body>
</html>
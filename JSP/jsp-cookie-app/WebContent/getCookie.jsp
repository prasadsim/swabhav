<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String getColor = "white";
		Cookie tempCookie;

		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			out.print("cookie not found");
		} else {
			for (int i = 0; i < cookies.length; i++) {
				tempCookie = cookies[i];
				getColor = tempCookie.getValue();
			}
	%>

<body bgcolor="<%=getColor%>">
	<%
		out.print("cookie found");
		}
	%>

</body>
</html>
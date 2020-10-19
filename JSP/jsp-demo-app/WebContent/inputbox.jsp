<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="GET">
		input: <input type="text" name="input"> <br /> <input
			type="submit" value="Submit" />
	</form>
	
	<h1>hello <%=request.getParameter("input")%></h1>
</body>
</html>
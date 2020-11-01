<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contact</title>
</head>
<body>
<h1>Add Contact</h1>
<form action="ContactController" method="get">
	FirstName:<input type="text" name="fname"><br>
	LastName:<input type="text" name="lname"><br>
	Contact No:<input type="text" name="number"><br>
	Email Id:<input type="email" name="email"><br>
	<input type="submit" value="submit">
</form>
</body>
</html>
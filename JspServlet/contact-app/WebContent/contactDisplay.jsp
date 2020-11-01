<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet;"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact</title>
</head>
<body>
	<h1>Contact Details</h1>
	<table border="1" style="width: 50%" height="50%">
		<thead>
			<tr>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Phone No</th>
				<th>Email Id</th>
			</tr>
		</thead>
		<tbody>
			<%
				ResultSet rs = (ResultSet) request.getAttribute("resultSet");
				while (rs.next()) {
			%>
			<tr>
				<td><%=rs.getString("fname")%></td>
				<td><%=rs.getString("lname")%></td>
				<td><%=rs.getString("number")%></td>
				<td><%=rs.getString("email")%></td>
			</tr>
			<%
				}
			%>

		</tbody>
</body>
</html>
<%@page import="com.techlabs.model.Employee"%>
<%@ page import="java.util.*"%>
<%@ page import="java.lang.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
	<%
		List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	%>
	<table>
		<tr>
			<th>Id</th>
			<th>FirstName</th>
			<th>LastName</th>
		</tr>
		<%
			for (Employee emp : employees) {
		%>
		<tr>
			<td><%=emp.getId()%></td>
			<td><%=emp.getFirstName()%></td>
			<td><%=emp.getLastName()%></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.techlabs.model.Employee"%>
<%@page import="com.techlabs.service.LoginService"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
	<h1>Searched Employees</h1>
	<%
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.html");
		}
		List<Employee> employees = (List<Employee>) request.getAttribute("searchedEmployees");
	%>
	<table border="1" style="width: 50%" height="50%">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Role</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (Employee employee : employees) {
			%>
			<tr>
				<td><%=employee.getId()%></td>
				<td><%=employee.getName()%></td>
				<td><%=employee.getRole()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	<a href="EmployeeController">back</a>
</body>
</html>
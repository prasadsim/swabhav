<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="com.techlabs.model.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student</title>
</head>
<body>
	<%
		List<Student> students = (List<Student>) request.getAttribute("students");
	%>
	<table border="1" style="width: 50%" height="50%">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>RollNo</th>
				<th>Age</th>
			</tr>
		</thead>
		<tbody>
			<%
				for (Student s : students) {
			%>
			<tr>
				<td><%=s.getId()%></td>
				<td><%=s.getName()%></td>
				<td><%=s.getRollno()%></td>
				<td><%=s.getAge()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	<a href="login.html">User Login</a>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.techlabs.model.Student"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit student details</h1>
	<form action="editController" method="POST">
		<%
			Student s = (Student) request.getAttribute("editStudent");
		%>
		<label>Name</label> <input type="text" name="name" id="name"
			value="<%=s.getName()%>"><br> <label>RollNo</label> <input
			type="text" name="rollno" id="roll" value="<%=s.getRollno()%>"><br>
			 <label>Age</label> <input
			type="text" name="age" id="age" value="<%=s.getAge()%>">
		<input type="hidden" name="id" value="<%=s.getId()%>">
		<input type="submit" value="Change">

	</form>
</body>
</html>
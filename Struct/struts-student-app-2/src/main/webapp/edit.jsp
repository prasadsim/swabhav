<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
	<h1>Edit Student</h1>
	<s:form action="doEdit">
		<s:textfield name="name" value="%{editStudentVm.name}"
			label="Name "></s:textfield>
		<s:textfield name="rollno" type="number"
			value="%{editStudentVm.rollno}" label="RollNo "></s:textfield>
		<s:textfield name="age" type="number" value="%{editStudentVm.age}"
			label="Age "></s:textfield>
		<s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>
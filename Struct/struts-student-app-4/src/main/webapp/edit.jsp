<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
<meta charset="ISO-8859-1">
<title>Add Student</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container">
		<h1>Edit Student</h1>
		<s:form action="doEdit">
			<div class="form-group">
				<s:hidden name="id" value="%{editStudentObject.id}" />
				<label for="usr">Name</label>
				<s:textfield class="form-control" id="usr" name="name"
					value="%{editStudentObject.name}"></s:textfield>
				<br> <label for="usr">Rollno</label>
				<s:textfield class="form-control" id="usr" name="rollno"
					type="number" value="%{editStudentObject.rollno}"></s:textfield>
				<br> <label for="usr">Age</label>
				<s:textfield class="form-control" id="usr" name="age" type="number"
					value="%{editStudentObject.age}"></s:textfield>
				<br>
				<s:submit class="btn btn-default" value="submit"></s:submit>
			</div>
		</s:form>
	</div>
</body>
</html>
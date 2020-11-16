<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="java.util.UUID"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.errorMessage {
	color: red;
}
</style>
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
	<div class="jumbotron jumbotron-fluid">
		<div class="container">
			<h1>Add Student</h1>
		</div>
	</div>
	<div class="container">
		<s:form action="doAdd">
			<div class="form-group">
				<label for="usr">Enter Name</label> <input name="name" value=""
					class="form-control"> <br> <label for="usr">Enter
					RollNo</label> <input name="rollno" value="" class="form-control">
				<br> <label for="usr">Enter Age</label> <input name="age"
					value="" class="form-control"> <br>
				<s:submit value="submit" class="btn btn-success"></s:submit>
			</div>
		</s:form>
	</div>
</body>
</html>
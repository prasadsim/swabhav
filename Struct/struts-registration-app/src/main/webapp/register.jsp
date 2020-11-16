<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
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
		<h1>Registration Form</h1>
		<form id="idLoginForm" action="doRegister" method="post">
			<div class="form-group">
				<label for="usr">Name</label> <input type="text" name="name"
					class="form-control" id="usr" value="" /><br> <label
					for="pwd">Phone</label><input type="number" name="phone"
					class="form-control" value="" /><br>

				<button type="submit" class="btn btn-default"
					on-click="this.form.reset()">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>
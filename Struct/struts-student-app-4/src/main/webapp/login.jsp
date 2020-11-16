<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
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
		<h1>Enter Login Details</h1>
		<s:actionmessage />
		<s:actionerror />

		<form id="idLoginForm" action="loginUser" method="post">
			<div class="form-group">
				<label for="usr">Username:</label> <input type="text"
					name="username" class="form-control" id="usr" /><br> <label
					for="pwd">Password:</label><input type="password" name="password"
					class="form-control" id="pwd" /><br>
				<button type="submit" class="btn btn-default">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>
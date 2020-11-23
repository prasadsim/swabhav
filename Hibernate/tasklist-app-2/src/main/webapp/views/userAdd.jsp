<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddUser</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<a href="doLogout" class="btn btn-primary" style="float: right;">logout</a>
		<h1 style="margin-top: 40px">Add User</h1>
		<div class="alert alert-danger">
			<s:property value="msg" />
		</div>
		<form action="doAdd">
			<div class="form-group">
				<label for="text">Enter Firstname</label> <input type="text"
					class="form-control" id="email" placeholder="Enter Firstname"
					name="firstname">
			</div>
			<div class="form-group">
				<label for="text">Enter Lastname</label> <input type="text"
					class="form-control" id="email" placeholder="Enter Lastname"
					name="lastname">
			</div>
			<div class="form-group">
				<label for="text">Enter Email Id</label> <input type="email"
					class="form-control" id="email" placeholder="Enter email id"
					name="email">
			</div>
			<div class="form-group">
				<label for="text">Enter Username:</label> <input type="text"
					class="form-control" id="email" placeholder="Enter Username"
					name="username">
			</div>
			<div class="form-group">
				<label for="text">Enter Password:</label> <input type="text"
					class="form-control" id="email" placeholder="Enter password"
					name="password">
			</div>
			<div class="form-group">
				<label for="pwd">Enter Confirm Password:</label> <input type="text"
					class="form-control" id="pwd" placeholder="Enter confirm password"
					name="confirmPassword">
			</div>
			<button type="submit" class="btn btn-primary">Add</button>
		</form>

	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
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
<body>
	<div class="container">
		<a href="doLogout" class="btn btn-primary" style="float: right;">logout</a>
		<h1>User Details</h1>
		<a href="add" class="btn btn-link" style="margin-left: 5%">add</a>
		<table class="table table-hover" style="width: 60%" height="auto"
			id="myTable">
			<thead>
				<tr>
					<th>Id</th>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Email</th>
					<th>Username</th>
					<th>Password</th>
					<th>Task</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="users">
					<tr>
						<td><s:property value="id" /></td>
						<td><s:property value="firstName" /></td>
						<td><s:property value="lastName" /></td>
						<td><s:property value="email" /></td>
						<td><s:property value="username" /></td>
						<td><s:property value="password" /></td>
						<td><s:form action="task">
								<s:hidden name="id" value="%{id}" />
								<s:submit class="btn btn-success" value="tasks"></s:submit>
							</s:form></td>
						<td><s:form action="edit">
								<s:hidden name="id" value="%{id}" />
								<s:submit class="btn btn-warning" value="edit"></s:submit>
							</s:form></td>
						<td><s:form action="delete">
								<s:hidden name="id" value="%{id}" />
								<s:submit class="btn btn-danger" value="delete"></s:submit>
							</s:form></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</div>


</body>
</body>

</html>
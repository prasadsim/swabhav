<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
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
		<h1>Student Details</h1>
			<table class="table table-hover" style="width: 100%" height="50%"
				id="myTable">
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>RollNo</th>
						<th>Age</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="students">
						<tr>
							<td><s:property value="id" /></td>
							<td><s:property value="name" /></td>
							<td><s:property value="rollno" /></td>
							<td><s:property value="age" /></td>
							<td><s:form action="edit">
									<s:hidden name="editStudent" value="%{id}" />
									<s:submit class="btn btn-warning" value="edit"></s:submit>
								</s:form></td>
							<td><s:form action="delete">
									<s:hidden name="deleteStudent" value="%{id}" />
									<s:submit class="btn btn-danger" value="delete"></s:submit>
								</s:form></td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
	</div>
	<a href="add" class="btn btn-link" style="margin-left: 10%">add</a>
</body>
</html>
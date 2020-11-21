<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SubTask</title>

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
		<h1>SubTask</h1>
		<a href="addSubTask" class="btn btn-link" style="margin-left: 5%">add</a>
		<table class="table table-hover" id="myTable">
			<thead>
				<tr>
					<th>DONE</th>
					<th>ID</th>
					<th>TITLE</th>
					<th>DATE</th>
					<th>EDIT</th>
					<th>DELETE</th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="subTasks">
					<tr>
						<td><s:checkbox name="done" fieldValue="%{done}" /></td>
						<td><s:property value="id" /></td>
						<td><s:property value="title" /></td>
						<td><s:date name="date" format="YYYY/MM/DD" /></td>
						<td><s:form action="editSubTask">
								<s:hidden name="id" value="%{id}" />
								<s:submit class="btn btn-warning" value="edit"></s:submit>
							</s:form></td>
						<td><s:form action="deleteSubTask">
								<s:hidden name="id" value="%{id}" />
								<s:submit class="btn btn-danger" value="delete"></s:submit>
							</s:form></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Task</title>
</head>
<body>
	<a href="doLogout" class="btn btn-primary" style="float: right;">logout</a>
	<h1>Edit Task</h1>
	<p style="color: red">
		<s:property value="msg" />
	</p>
	<s:form action="doEditTask">
		<s:hidden name="id" value="%{task.id}" />
		<s:textfield name="title" value="%{task.title}" label="Enter Title"></s:textfield>
		<s:checkbox name="done" value="%{task.done}" label="isDone?"></s:checkbox>
		<s:submit value="Edit"></s:submit>
	</s:form>
</body>
</html>
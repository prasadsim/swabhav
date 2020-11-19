<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Task</title>
</head>
<body>
	<h1>Add Task</h1>
	<s:form action="doAddTask" method="post">
		<s:textfield name="title" label="Enter Title"></s:textfield>
		<s:date name="date" format="dd/MM/yyyy" />
		<s:hidden name="done" fieldValue="false"></s:hidden>
		<s:submit value="Add"></s:submit>
	</s:form>
</body>
</html>
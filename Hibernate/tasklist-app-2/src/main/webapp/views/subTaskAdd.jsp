<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add SubTask</title>
</head>
<body>
	<h1>Add SubTask</h1>
	<p style="color: red">
		<s:property value="msg" />
	</p>
	<s:form action="doAddSubTask" method="post">
		<s:textfield name="title" label="Enter Title"></s:textfield>
		<s:label>Date</s:label>
		<s:date name="date" format="YYYY-MM-dd" />
		<s:hidden name="done" fieldValue="false"></s:hidden>
		<s:submit value="Add"></s:submit>
	</s:form>
</body>
</html>
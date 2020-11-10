<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.errorMessage {
	color: red;
}
</style>
<meta charset="ISO-8859-1">
<title>RegisterVM</title>
</head>
<body>
<s:form action="registerDo">
		<s:textfield name="name" label="name"></s:textfield>
		<s:textfield name="age" label="age"></s:textfield>
		<s:textfield name="email" label="email"></s:textfield>
		<s:submit value="register"></s:submit>
	</s:form>
</body>
</html>
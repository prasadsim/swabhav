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
<title>Login</title>
</head>
<body>
	<s:form action="login">
		<s:textfield name="username" label="Username"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:submit value="login"></s:submit>
	</s:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<p style="color: red;">
		<s:property value="message" />
	</p>
	<s:form action="doLogin" method="post">
		<s:textfield name="username" label="Enter Username"></s:textfield>
		<s:textfield name="password" label="Enter Password"></s:textfield>
		<s:submit value="login"></s:submit>

	</s:form>


</body>
</html>
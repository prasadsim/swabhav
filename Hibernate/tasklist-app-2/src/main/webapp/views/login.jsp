<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>
	<h1>Login</h1>
	<s:form action="doLogin">
		<p style="color: red">
			<s:property value="msg" />
		</p>
		<s:textfield name="user" label="Enter Username"></s:textfield>
		<s:textfield name="pass" label="Enter Password"></s:textfield>
		<s:submit value="login"></s:submit>
	</s:form>
</body>
</html>
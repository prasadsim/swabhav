<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>Register</h1>
	<s:form action="doRegister">
		<p style="color: red">
			<s:property value="msg" />
		</p>
		<s:textfield name="firstname" label="Enter Firstname"></s:textfield>
		<s:textfield name="lastname" label="Enter Lastname"></s:textfield>
		<s:textfield name="email" label="Enter email"></s:textfield>
		<s:textfield name="username" label="Enter username"></s:textfield>
		<s:textfield name="password" label="Enter password"></s:textfield>
		<s:submit value="register"></s:submit>
	</s:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EditUser</title>
</head>
<body>
	<h1 style="margin-top:40px">Edit User</h1>
	<s:form action="doEdit" method="post">
		<p style="color: red">
			<s:property value="msg" />
		</p>
		<s:hidden name="id" value="%{user.id}" />
		<s:textfield name="firstname" label="Enter Firstname"
			value="%{user.firstname}"></s:textfield>
		<s:textfield name="lastname" label="Enter Lastname"
			value="%{user.lastname}"></s:textfield>
		<s:textfield name="email" label="Enter email" value="%{user.email}"></s:textfield>
		<s:textfield name="username" label="Enter username"
			value="%{user.username}"></s:textfield>
		<s:textfield name="password" label="Enter password"
			value="%{user.password}"></s:textfield>
		<s:submit value="submit"></s:submit>
	</s:form>
</body>
</html>
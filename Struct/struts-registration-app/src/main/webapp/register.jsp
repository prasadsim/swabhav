<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<s:form action="doRegister">
		<s:textfield name="name" value="" label="Enter Name"></s:textfield>
		<s:textfield name="phone" value="" label="Enter Phone Number"
			type="number"></s:textfield>
		<s:submit value="register"></s:submit>
	</s:form>
</body>
</html>
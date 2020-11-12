<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email</title>
</head>
<body>
	<h1>Enter Details</h1>
	<s:form action="sendEmail" method="post">
		<s:textfield name="from" label="from" value=""></s:textfield>
		<s:password name="password" label="password" value=""></s:password>
		<s:textfield name="to" label="to"></s:textfield>
		<s:textfield name="subject" label="subject"></s:textfield>
		<s:textfield name="body" label="body"></s:textfield>
		<s:submit value="send"></s:submit>
	</s:form>
</body>
</html>
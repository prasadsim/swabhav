<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:iterator begin="0" end="4">
		<h1>
			Welcome
			<s:property value="developer" />
		</h1>
	</s:iterator>
</body>
</html>

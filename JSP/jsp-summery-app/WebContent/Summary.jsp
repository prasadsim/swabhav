<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.print("Session[count]="+session.getAttribute("counter"));
out.print("<br>Application[count]="+application.getAttribute("counter"));
%>
<br>
<a href="Session.jsp">Session</a>
<a href="Application.jsp">Application</a>
</body>
</html>
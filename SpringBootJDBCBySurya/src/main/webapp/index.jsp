<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- ${userObj.name}
${userObj.email}
${userObj.pass}
${userObj.mobile} --%>

<%--<%
out.print(session.getAttribute("name"));
%> --%>

${sessionScope.email}
${sessionScope.name}
${sessionScope.pass}
${sessionScope.mobile}
</body>
</html>
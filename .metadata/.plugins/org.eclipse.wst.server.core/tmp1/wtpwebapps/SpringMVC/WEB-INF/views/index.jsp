<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hii Aadi</h1>
	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");
	 List<String> friends  = (List<String>)request.getAttribute("f");
	%>

	<h1>
		Name is
		<%=name%></h1>
	<h1>
		Id is
		<%=id%></h1>
       
        
        Friends Names : <%   
        for(String s : friends ){
        	//out.println(s);
        
        %>
       
           <h1>
          <%=s%>
           </h1>
<%} %>

</body>
</html>
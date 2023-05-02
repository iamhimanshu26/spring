<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is the Home Page</h1>
	<h2>called by the home controller</h2>
	<h3>with url- /home</h3>

	<%
	String name = (String) request.getAttribute("name");
    Integer id = (Integer) request.getAttribute("Id");
 	List<String> friends = (List)request.getAttribute("f"); 
 	%>

	<h4>
		Name is
		<%=name%></h4>
	<h4>
		<h4>
			ID is
			<%=id%></h4>

		<%
	for (String s : friends) {
	%>

		<h4><%=s%></h4>

		<%
	      }
	%>
	
</body>
</html>
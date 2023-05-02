<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	 <%-- <%
	String contact = (String) request.getAttribute("Contact");
	LocalDateTime current = (LocalDateTime) request.getAttribute("DAndT");
	%>  --%>
	<h1>This is the help page section</h1>
	<h2>You can get anything related to the queries</h2>
	 <h3>
		Directly contact to
  <%-- 	<%=contact%> --%>
  		 ${Contact} 
 		<!-- name defined in the controller  -->
	</h3>
 	<h3>
		Current Time is
    <%-- <%=current.toString()%> --%>
		${DAndT}  
	</h3>
	 
	<hr>
	<c:forEach var="item" items= "${marks}" >
	<%-- <h5>${item}</h5> --%>
	<c:out value="${item}"></c:out>
	</c:forEach>
	
	
</body>
</html>
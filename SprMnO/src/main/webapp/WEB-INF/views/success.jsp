<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <h4 class="text-center">${Header}</h4>
	<p class="text-center">${Desc}</p> 
	
	<!--  When using @RequestPara anno, -->
	<%-- <h1>Welcome , ${name}</h1>
	<h1>Your email is ${email}</h1>
	<h1>Your password is ${pw} try to secure it</h1>  --%>

	<%-- When using Entity Class --%>

 	<h1>Welcome , ${user}</h1>
 	<%--  <h1>Your email is ${user.name}</h1>
	<h1>Your password is ${user.pw} try to secure it</h1> --%>  

</body>
</html>
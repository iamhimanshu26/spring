<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${student }</h2>
<h3>Name is ${student.name}</h3>
<h3>Id is ${student.id}</h3>
<h3>Date of birth is ${student.dob}</h3>
<h3>Courses are ${student.courses}</h3>
<h3>Student gender is ${student.gender}</h3>
<h3>Student is ${student.type}</h3>
<h3>And address is ${student.address}</h3>
</body>
</html>
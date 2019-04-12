<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" 
	prefix="s" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>
	User registartion form
</h2>
<!--  "modelAttribute" must be a POJO which follows
	  Java Bean conventions -->
<s:form method="post" modelAttribute="user">
<!-- Internally spring forms will invoke "user.setFirstName" -->
	Enter your name: <s:input path="firstName"/>
	<s:input path="lastName"/>
	<s:errors path="firstName" />
	<s:errors path="lastName" />
	<br/>
	Enter date of birth : <s:input path="dateOfBirth"/>
	<s:errors path="dateOfBirth"/><br/>
	Enter email address: <s:input path="email"/>
	<s:errors path="email"/><br/>
	<input type="submit" value="submit"/>
</s:form>
</body>
</html>
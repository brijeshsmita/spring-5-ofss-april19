<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Spring MVC</title>
</head>
<body>
<h2>${msg}</h2>
<h3>${author }</h3>
Request Scope : ${requestScope.msg }<br/>
Session Scope : ${sessionScope.msg }<br/>
</body>
</html>
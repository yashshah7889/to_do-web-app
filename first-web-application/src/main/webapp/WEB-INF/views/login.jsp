<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>yahoo!!!</title>
</head>
<body>
<p><font color="red">${error_message}</font></p>
<form action="/login" method="POST">

Name: <input type="text" name="name">
Password:<input type="password" name="password">
<input type="submit" value="Login"/>
</form>
</body>
</html>

<!--  valid user-> welcome.jsp -->
<!-- invalid user-> login.jsp -->
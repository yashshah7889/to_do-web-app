<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo!!</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">
</head>
<body>
	<div class="container">
<table class= "table table-striped">
	<caption>Yours Todos are</caption>
	<thead>
		<tr>
			<th>Description</th>
			<th>Target Date</th>
			<th>Is Completed?</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${todos}" var="todo">
		<tr>
			<td>${todo.desc}</td>
			
			<td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.targetDate} "/></td>
			<td>${todo.done }</td>
			<td><a href="/update-todo?id=${todo.id }" class="btn btn-success" >update</a></td>
			<td><a href="/delete-todo?id=${todo.id }" class="btn btn-danger" >delete</a></td>
		</tr>
		</c:forEach>
		
	</tbody>
</table>

<div>
<a class="btn btn-success" href="/add-todo">Add</a>
</div>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
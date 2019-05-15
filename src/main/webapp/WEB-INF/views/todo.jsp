<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
	<style type="text/css">
		.footer {
			position: absolute;
			bottom: 0;
			width: 100%;
			height: 60px;
			background-color: #f5f5f5;
		}
	</style>
</head>
<body>
	<nav class="navbar navbar-default">
		<a href="/" class="navbar-brand">Brand</a>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="/todo.do">Todos</a></li>
			<li><a href="http://www.in28minutes.com">In28Minutes</a><</li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="/common-webapp/logout.do">Logout</a></li>
		</ul>
	</nav>
	<div class="container">
		<h1>Welcome ${name}</h1>
		<p>Your Todos are:<p/>
		<ol>
			<c:forEach items="${todos}" var="todo">
			<li>${todo.name} <a href="/common-webapp/delete-todo.do?todo=${todo.name}">Delete</a></li>
			</c:forEach>
		</ol>
		<p><font color="red">${errorMessage}</font></p>
		<form action="/common-webapp/add-todo.do" method="post">
			<input name="todo" type="text"/>
			<input name="add" type="submit" value="add" />
		</form>
	</div>
	<footer class="footer">
		<div>footer content</div>
	</footer>
	<script src="webjars/jquery/3.4.1/jquery.min.js"></script>
	<script src="webjars/popper.js/1.14.7/dist/umd/popper.min.js"></script>
	<script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
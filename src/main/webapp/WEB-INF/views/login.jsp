<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Yahoo!!!!!!!! JSP</title>
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
			<li><a href="/common-webapp/login.do">Login</a></li>
		</ul>
	</nav>
	<div class="container">
		<form action="/common-webapp/login.do" method="post">
			<p>
				<font color="red">${errorMessage}</font>
			</p>
			<label>Enter your name</label>
			<input type="text" name="name"/>
			<label>Enter password</label>
			<input type="password" name="password"/>
			<input type="submit"/>
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
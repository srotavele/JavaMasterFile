<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/main.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Counter Page</title>
</head>
<body>
	<div>
		<h2>You have visited <a href= "/">http://localhost:8000</a> <c:out value = "${count}"/> times today.</h2>
		<p><a href = "/" class="btn btn-primary">Test Another Visit!</a></p>
		<p><a href= "/reset" class="btn btn-primary">Reset Counter</a></p>
	</div>
	
		
</body>
</html>
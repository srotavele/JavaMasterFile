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
	<title>Index</title>
</head>
<body>
		<p class="error"><c:out value="${error}"/></p>
		<h3>What is the code?</h3>
		<form action="/code" method = "post">
			<input type = "text" name = "code" ></input>
			<button type="submit" class = "btn btn-primary">Try code</button>	
		</form>
		
</body>
</html>
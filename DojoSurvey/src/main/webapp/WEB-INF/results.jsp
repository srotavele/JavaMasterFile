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
	<title>Results</title>
</head>
<body>
		<h3>Submitted Info:</h3>
		<ul>
			<li>Name: <c:out value="${modelName}"/></li>
			<li>Dojo Location: <c:out value="${modelLocation}"/></li>
			<li>Favorite Language: <c:out value="${modelLanguage}"/></li>
			<li>Comment: <c:out value="${modelComment}"/></li>
		</ul>
		
</body>
</html>
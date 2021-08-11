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
	<title>Ninja Gold</title>
</head>
<body class= container>
	<div class = gold>
		<h5>Your Gold: <c:out value ="${gold}"/></h5>
	</div>
	<div class= actions>
		<div class= boxes>
			<form action="/location" method="post">
			<input type="hidden" name="Doug" value="farm">
				<p>Farm</p>
				<p>(earns 10-20 gold)</p>
				<button type="submit" class="btn btn-secondary">Find Gold</button>
			</form>
		</div>
		<div class= boxes>
			<form action="/location" method="post">
			<input type="hidden" name="Doug" value="cave">
				<p>Cave</p>
				<p>(earns 5-10 gold)</p>
				<button type="submit" class="btn btn-secondary">Find Gold</button>
			</form>
		</div>
		<div class= boxes>
			<form action="/location" method="post">
			<input type="hidden" name="Doug" value="house">
				<p>House</p>
				<p>(earns 2-5 gold)</p>
				<button type="submit" class="btn btn-secondary">Find Gold</button>
			</form>
		</div>
		<div class= boxes>
			<form action="/location" method="post">
			<input type="hidden" name="Doug" value="casino">
				<p>Casino</p>
				<p>(+/- 0-50 gold)</p>
				<p></p>
				<button type="submit" class="btn btn-secondary">Find Gold</button>
			</form>
		</div>
			
	</div>
	<div class =activities>
		<div>
			<h5>Activities:</h5>
			<div style="overflow-y:auto; height:200px;">
				<c:forEach items="${actions}" var="acts">
				<p><c:out value="${acts}"></c:out></p>
				<%-- <c:out value="<p style=${acts.contains("LOST")?"color:red;":"color:green"}>${acts}</p>"></c:out> --%>
				</c:forEach>
			</div>
			
		</div>
	</div>
</body>
</html>
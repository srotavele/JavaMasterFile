<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/CSS/main.css"/>
	<script src="/webjars/jquery/jquery.min.js"></script>
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<title>Index</title>
</head>
<body>
	<div class="mainContent">
		<p class="error"><c:out value="${error}"/></p>
		<form action="/form" method = "post" class="d-flex flex-column formContent">
			<p><label>Your Name:<input type="text" name="name"/></label></p>
			
			<label>Dojo Location:</label>
			<select name = "location">
				<option value="Burbank">Burbank</option>
				<option value="San Jose">San Jose</option>
				<option value="Seattle">Seattle</option>
			</select>
			
			<label>Favorite Language:</label>
			<select name = "language">
				<option value="Java">Java</option>
				<option value="Python">Python</option>
				<option value="C#">C#</option>
			</select>
			
			<label>Comment (Optional):</label>
			<textarea name = "comment" rows="5" cols="10"></textarea>
			<button class="btn btn-primary" type="submit">Submit</button>
		</form>
		</div>	
</body>
</html>
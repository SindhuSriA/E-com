<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/login" method="post">
		<input type="text" name="email" placeholder="Enter valid Email">
		<input type="password" name="password">
		<input type="Submit" value="Submit" >
		<a href="/register">Click here to register</a>
	</form>
</body>
</html>

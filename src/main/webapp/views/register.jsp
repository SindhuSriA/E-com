<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<div class="text-center" style="margin: 25px 25px 25px 25px; text-align: center;"><a></a>
		<h1>"${msg}"</h1>
		<h2>Sign Up</h2>
		<form action="/save" method="post">
			<label>Name: </label>
			<input name="name" type="text"><br><br>
			<label>Email: </label>
			<input name="email" type="text"><br><br>
			<label>Password: </label>
			<input name="password" type="text"><br><br>
			<div >
				<input type="Submit" value="Submit">
			</div>
		</form>
	</div>
	
	
</body>
</html>

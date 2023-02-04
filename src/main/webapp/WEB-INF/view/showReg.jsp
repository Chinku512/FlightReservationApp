<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Account</title>
</head>
<body bgcolor="skyblue">
	<h2>Create New Account Here</h2>
	<form action="saveReg" method="post">
	<pre>
		First Name<input type="text" name="firstName"/><br>
		Last Name<input type="text" name="lastName"/><br>
		Email<input type="text" name="email"/><br>
		Password<input type="text" name="password"/><br>
		<input type="submit" value="Save"/>
	</pre>
	</form>
</body>
</html>
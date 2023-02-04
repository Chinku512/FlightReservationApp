<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body bgcolor="skyBlue">
	<h2>Login Here</h2>
	<form action="verifyLogin" method="post">
	<pre>
		EmailId<input type="text" name="emailId"/><br>
		Password<input type="text" name="password"/><br>
		<input type="submit" value="Login"/>
	</pre>
	</form>

</body>
</html>
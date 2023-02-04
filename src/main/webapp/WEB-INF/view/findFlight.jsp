<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight</title>
</head>
<body bgcolor="skyblue">
	<h2>Flight Search</h2>
	<form action="findFlights" method="post">
	<pre>
		Source<input type="text" name="source"/><br>
		Destination<input type="text" name="destination"/><br>
		departDate<input type="text" name="departDate"/><br>
		<input type="submit" value="Search"/>
	</pre>
	</form>
</body>
</html>
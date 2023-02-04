<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body bgcolor="skyblue" style="text-align:center;">
	<h2 style="text-align:center;">Flight Details</h2>
	<strong>Flight Number:</strong> ${flight.flightNumber}<br>
	<strong>Operating AirLines:</strong> ${flight.operatingAirLines}<br>
	<strong>Departure City:</strong> ${flight.departureCity}<br>
	<strong>Arrival City:</strong> ${flight.arrivalCity}<br>
	<strong>Date Of Departure:</strong> ${flight.dateOfDeparture}<br>
	<strong>Estimated Departure Time:</strong> ${flight.estimatedDepartureTime}<br>
	
	<h2 style="text-align:center;">Enter Passenger Details</h2>
	<form action="confirmReservation" method="post">
	<pre style="text-align:center;">
		First Name<input type="text" name="firstName"/><br>
		Last Name<input type="text" name="lastName"/><br>
		Middle Name<input type="text" name="middleName"/><br>
		Email<input type="text" name="email"/><br>
		Phone<input type="number" name="phone"/><br>
		<input type="hidden" name="flightid" value="${flight.id}"/>
		<h1>Enter Your Payment Details</h1>
		Name on the Card<input type="text" name="nameOnTheCard"/><br>
		Card Number<input type="number" name="cardNumber"/><br>
		CVV Code<input type="number" name="cvvCode"><br>
		Expire Date<input type="date" name="expireDate"><br>
		<input type="submit" value="Complete Reservation"/><br>
		</pre>
	</form>
</body>
</html>
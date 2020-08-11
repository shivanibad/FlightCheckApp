<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
<pre>
<h2>Flight Details</h2>
Airline: ${reservation.flight.operatingAirlines}
flightNumber: ${reservation.flight.flightNumber}
arrivalCity: ${reservation.flight.departureCity}
arrivalCity: ${reservation.flight.arrivalCity}
dateOfDeparture: ${reservation.flight.dateOfDeparture}
estimatedDepartureTime: ${reservation.flight.estimatedDepartureTime}


<h2>Passenger Details</h2>
FirstName: ${reservation.passenger.firstName}
lastName: ${reservation.passenger.lastName}
email: ${reservation.passenger.email}
phone: ${reservation.passenger.phone}

<form action="completeCheckIn" method="post">
Enter Bags to CheckIn<input type= "text" name="numberOfBags"/>
<input type= "hidden" value="${reservation.id}" name="reservationId"/>
<input type= "submit" value="Check In"/>
</form>
</pre>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="entity.Flight" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%Flight flight=(Flight)request.getAttribute("flight"); %>
<h2 align="center">Flight Details</h2>
<table align="center" cellspacing=20>
<tr><td>Airline Name</td><td><b><%=flight.getAirline() %></b></td></tr>
<tr><td>Source</td><td><b><%=flight.getSource() %></b></td></tr>
<tr><td>Destination</td><td><b><%=flight.getDestination() %></b></td></tr>
<tr><td>Flight Date</td><td><b><%=flight.getDate() %></b></td></tr>
<tr><td>Departure</td><td><b><%=flight.getDeparture() %></b></td></tr>
<tr><td>Arrival</td><td><b><%=flight.getArrival() %></b></td></tr>
<tr><td>Price</td><td><b><%=flight.getPrice() %></b></td></tr>
</table>


<br>
<form action="Book" method="get">
<h3 align="center">Enter Traveller details</h3>
<table align="center">
<tr><td>First Name</td><td><input type="text" name="firstname"></td></tr>
<tr><td>Last Name</td><td><input type="text" name="lastname"></td></tr>
</table>

<br>
<h3 align="center">Enter Contact Details</h3>

<table align="center">
<tr><td>Mobile Number</td><td><input type="number" name="mobile"></td></tr>
<tr><td>Email</td><td><input type="text" name="email"></td></tr>
</table>


<br>
<h3 align="center"><input type="Submit" value="Continue to Book"></h3>
</form>
</body>
</html>
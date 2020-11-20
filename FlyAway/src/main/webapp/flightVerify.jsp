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
	<jsp:include page="component/header.jsp"></jsp:include>
	<br>
	
<%Flight flight=(Flight)request.getAttribute("flight"); %>
<h2 align="center">Flight Details</h2>
<table align="center" cellspacing=10>
<tr><td>Airline Name</td><td><b><%=flight.getAirline() %></b></td></tr>
<tr><td>Source</td><td><b><%=flight.getSource() %></b></td></tr>
<tr><td>Destination</td><td><b><%=flight.getDestination() %></b></td></tr>
<tr><td>Flight Date</td><td><b><%=flight.getDate() %></b></td></tr>
<tr><td>Departure</td><td><b><%=flight.getDeparture() %></b></td></tr>
<tr><td>Arrival</td><td><b><%=flight.getArrival() %></b></td></tr>
<tr><td>Price</td><td><b><%=flight.getPrice() %></b></td></tr>
</table>
<br>

<h2 align="center">Traveller Details</h2>
<table align="center" cellspacing=10>
<tr><td>First Name</td><td><b><%=request.getParameter("firstname") %></b></td></tr>
<tr><td>Last Name</td><td><b><%=request.getParameter("lastname") %></b></td></tr>
<tr><td>Mobile</td><td><b><%=request.getParameter("mobile") %></b></td></tr>
<tr><td>Email</td><td><b><%=request.getParameter("email") %></b></td></tr>
</table>
<br>

<form action="payment" method="get" align="center">
<input type="submit" value="Proceed for Payment">
</form>


</body>
</html>
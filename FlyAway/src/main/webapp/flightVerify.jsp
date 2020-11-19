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
<table align="center">
<tr><td><b><%=flight.getAirline() %></b></td></tr>
<tr><td><b><%=flight.getSource() %></b></td><td><b>To</b></td><td><b><%=flight.getDestination() %></b></td></tr>
<tr><td><b><%=flight.getDate() %></b></td></tr>
<tr><td><b><%=flight.getPrice() %></b></td></tr>
</table>


<%=request.getParameter("firstname") %>

<form action="payment" method="get">
<input type="submit" value="Proceed for Payment">
</form>


</body>
</html>
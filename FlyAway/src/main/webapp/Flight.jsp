<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" import="entity.Flight" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page = "home.jsp" />

<label >Sort By:</label>
<select >
<option>Cheapest</option>
<option>Fastest</option>
<option>Early Takeoff</option>
<option>Late Takeoff</option>
</select>

<table cellspacing=75 >

<tr >
<td><b>AirLine</b></td>
<td><b>Flight Id</b></td>
<td><b>Source</b></td>
<td><b>Destination</b></td>
<td><b>Departure</b></td>
<td><b>Arrival</b></td>
<td><b>Price</b></td>
<td></td>
</tr>
<% ArrayList<Flight> list=(ArrayList)request.getAttribute("list");
%>
<%for(Flight f: list)
{%>
<tr>
<td><%=f.getAirline() %></td>
<td><%=f.getFlightId() %></td>
<td><%=f.getSource() %></td>
<td><%=f.getDestination() %></td>
<td><%=f.getDeparture() %></td>
<td><%=f.getArrival() %></td>
<td><%=f.getPrice() %></td>
<td><a href="FlightDetails?flightid=<%=f.getFlightId()%>&flightprice=<%=f.getPrice()%>">Book</a></td>
</tr>
	
<% }%>

</table>
<jsp:include page="component/admin-footer.jsp"></jsp:include>


<!--  <a href="FlightDetails.jsp?userId=${user.id}" /> -->
</body>
</html>
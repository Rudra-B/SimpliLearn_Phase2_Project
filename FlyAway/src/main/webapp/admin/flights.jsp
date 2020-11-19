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

<jsp:include page="admin-header.jsp"></jsp:include>
<jsp:include page="admin-topbar.jsp"></jsp:include>


<table cellspacing=25 >

<tr >
<td><b>AirLine</b></td>
<td><b>Flight Id</b></td>
<td><b>Source</b></td>
<td><b>Destination</b></td>
<td><b>Departure</b></td>
<td><b>Arrival</b></td>
<td><b>Price</b></td>
</tr>
<% ArrayList<Flight> list=(ArrayList)request.getAttribute("adminflight");
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
</tr>
	
<% }%>

</table>

<jsp:include page="admin-footer.jsp"></jsp:include>

</body>
</html>
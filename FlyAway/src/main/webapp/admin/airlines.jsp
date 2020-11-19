<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" import="entity.Airline" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="admin-header.jsp"></jsp:include>
<jsp:include page="admin-topbar.jsp"></jsp:include>

<%ArrayList<Airline> list = (ArrayList<Airline>)request.getAttribute("airlinelist"); %>

<table cellspacing=20 >

<tr >
<td><b>Airline id</b></td>
<td><b>Airline Name</b></td>


</tr>


<%for(Airline l: list)
{%>
<tr>
<td><%=l.getA_id() %></td>
<td><%=l.getAirline_name() %></td>



</tr>
	
<% }%>

</table>

<jsp:include page="admin-footer.jsp"></jsp:include>


</body>
</html>
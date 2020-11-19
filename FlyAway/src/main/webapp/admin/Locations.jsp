<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" import="entity.Location" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="admin-header.jsp"></jsp:include>
<jsp:include page="admin-topbar.jsp"></jsp:include>

<%ArrayList<Location> list = (ArrayList<Location>)request.getAttribute("list"); %>

<table cellspacing=20 >

<tr >
<td><b>Location id</b></td>
<td><b>source</b></td>
<td><b>destination</b></td>

</tr>


<%for(Location l: list)
{%>
<tr>
<td><%=l.getLid() %></td>
<td><%=l.getSource1() %></td>
<td><%=l.getDestination() %></td>


</tr>
	
<% }%>

</table>

<jsp:include page="admin-footer.jsp"></jsp:include>


</body>
</html>
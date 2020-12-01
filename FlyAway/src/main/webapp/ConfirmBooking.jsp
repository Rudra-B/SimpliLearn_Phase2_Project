<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="component/header.jsp"></jsp:include>
<br>
<br>
<h3 align="center">Flight Booked Successfully</h3>

<%

  session.invalidate();

  %>

</body>
</html>
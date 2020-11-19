<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align=center>Welcome to FlyAway</h2>

<form action="home" method="get">
	
<table  cellspacing=2 cellpadding=4>

<tr>
 		<td >from : <input type="text" name="from"></td>
 		<td >to : <input type="text" name="to"></td>
 		<td >Departure Date : <input type="date" name="date"></td>
 		<td >Travellers : <input type="number" name="traveller"></td>
 		<td ><input type="submit" value="SEARCH"></td>
 	</tr>

</table>

</form>

</body>
</html>
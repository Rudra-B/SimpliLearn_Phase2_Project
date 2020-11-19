<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="paymentaction" method="post">
<table cellspacing=20 , cellpadding=2>
<caption><b> Debit Card<b></b></caption>
<tr><td>Card number</td><td>Card Expiry Date</td><td>CVV</td><td></td></tr>
<tr><td width="40"><input type="number" name="cardnumber"></td><td><input type="month" name="expirydate"></td><td><input type="number" name="cvv"></td><td><input type="submit" value=<%= session.getAttribute("flightprice")  %>></td></tr>

</table>
</form>
</body>
</html>
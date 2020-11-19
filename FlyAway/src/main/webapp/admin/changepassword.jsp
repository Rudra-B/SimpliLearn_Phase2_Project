<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="admin-header.jsp"></jsp:include>
<jsp:include page="admin-topbar.jsp"></jsp:include>

<form name=frmPwd method=post action="updatepassword">
<table border=1 cellspacing=2 cellpadding=4>
 	<tr>
 		<td width=25%>Enter new password*</td>
 		<td><input name=pwd maxlength=10 type="password"></td>
 	</tr>
 	<tr>
 		<td width=25%>Confirm new Password*</td>
 		<td><input name=pwd2 maxlength=10 type="password"></td>
 	</tr>
 	<tr>
 		<td colspan=2>
 			<button>Login</button>
 		</td>
 	</tr>
 </table>
</form>

<jsp:include page="admin-footer.jsp"></jsp:include>

</body>
</html>
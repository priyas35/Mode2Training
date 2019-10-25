<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function deny() {
	window.location = window.location.host;
}
</script>
</head>
<body>
<div align="center">
<form action="/approveloan" method = "post">
	<table border="2">
		<tr>
			<th>Available Loan Amount For Your Property</th>
			<td><input type = "text" name = "loanamount" readonly="readonly" value = "${loanamount}" /></td>
		</tr>
		<tr>
			<th>Enter Required Amount</th>
			<td><input type = "text" name = "requiredamount" placeholder="Enter Amount"/></td>
		</tr>
		<tr>
			<td><input type = "submit" value = "Confirm" /></td>
			<td><input type = "button" value = "Deny" id = "Deny" onclick="deny()"/></td>
		</tr>
	</table>
</form>
</div>
</body>
</html>
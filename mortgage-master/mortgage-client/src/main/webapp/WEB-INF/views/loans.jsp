<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<table border="2">
		<tr>
			<th>loanid</th>
			<th>loanamount</th>
			<th>areacode</th>
			<th>propertyname</th>
			<th>propertyid</th>
			<th>propertysq</th>
			<th>creditscore</th>
			<th>residence</th>
			<th>status</th>
			<th>userid</th>
			<th>check</th>
		</tr>
	<form:forEach var = "loan" items = "${loans}">
		<tr>
			<td>${loan.loanid}</td>
			<td>${loan.loanamount}</td>
			<td>${loan.areacode}</td>
			<td>${loan.propertyname}</td>
			<td>${loan.propertyid}</td>
			<td>${loan.propertysq}</td>
			<td>${loan.creditscore}</td>
			<td>${loan.residence}</td>
			<td>${loan.status}</td>
			<td>${loan.id}</td>
			<td><a href = "/loanamount/${loan.loanid}" >check loan amount</a></td>
		</tr>
	</form:forEach><br/><br/>
	</table>
</div>
</body>
</html>
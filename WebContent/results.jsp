<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pay Check Calculator</title>
</head>
<body>
	<h1>Results:</h1>
	<table border="1">
		<tr>
			<td>Gross Pay</td>
			<td>Pay Type</td>
			<td>state</td>
			<td>Gross Salary YTD</td>
			<td>Frequency</td>
			<td>Billing Status</td>
		</tr>
		<tr><d:forEach items="${persons}" var="c">
		<td>${c.grossPay}</td>
		<td>${c.payType}</td>
		<td>${c.state}</td>
		<td>${c.grossSalaryYTD}</td>
		<td>${c.frequency}</td>
		<td>${c.bilingStatus}</td>
	</d:forEach>
		</tr>
	</table>
</body>
</html>
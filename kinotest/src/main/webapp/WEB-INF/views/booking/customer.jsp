<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Customer Page</title>
</head>
<body>
	<form:form action="/booking/customer" modelAttribute="ticketForm">
		Last Name : <form:input path="lastName"/>
		<input type="submit"/>
	</form:form>
</body>
</html>
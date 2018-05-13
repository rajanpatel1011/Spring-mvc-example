<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
 <h2>This is Customer Registration Page</h2>
 	<sf:form action="storeCustomer" method="post" commandName="cust">
 	<p>
 	Enter Customer id <sf:input path="id"/>
 	</p>
 		<p>
 	Enter Customer Name <sf:input path="name"/>
 	</p>	<p>
 	Enter Customer password <sf:password path="password"/>
 	</p>	<p>
 	Enter Customer age <sf:input path="age"/>
 	</p>
 	<p>
 	<input type="submit" value="submit"/>
 	</p>
 	</sf:form>
</body>
</html>
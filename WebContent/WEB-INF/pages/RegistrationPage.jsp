<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h2>This is Customer Registration Page</h2>
 	<form action="storeCustomer" method="post">
 	<p>
 	Enter Customer id <input type="text" name="id">
 	</p>
 		<p>
 	Enter Customer Name <input type="text" name="name">
 	</p>	<p>
 	Enter Customer password <input type="password" name="pwd">
 	</p>	<p>
 	Enter Customer age <input type="text" name="age">
 	</p>
 	<p>
 	<input type="submit" value="submit">
 	</p>
 	</form>
</body>
</html>
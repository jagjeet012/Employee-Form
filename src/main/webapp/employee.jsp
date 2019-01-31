<%@page contentType='text/html' pageEncoding='UTF-8'%>
<%@taglib prefix='form' uri='http://www.springframework.org/tags/form'%>
<%@taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html>
<head>
<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
<title>Employee Form</title>
</head>
<body>

	<h1 style="text-align: center">Employee Form</h1>
	<form style="text-align: center" action="employee" method="post">
		<pre>
		<label for="employeeId">Employee Id</label>
		<input type="text" name="employeeId" value='' /><br><br>
		<label for="name">Name</label>
		<input type="text" name="name" value='' /><br><br>
		<label for="phoneNumber">Phone Number</label>
		<input type="text" name="phoneNumber" /><br><br>
		<label for="addressId">Address Id</label>
		<input type="text" name="addressId" value='' /><br><br>
		<label for="country">Country</label>
		<input type="text" name="country" /><br><br>
		<label for="city">City</label>
		<input type="text" name="city" /><br><br>
		<label for="pin">Pin Number</label>
		<input type="text" name="pin" /><br><br>
		
		<input type='submit' value='submit' />
		</pre>
	</form>

</body>
</html>
<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/home" method="post">
	<label for="email">Email: </label>
	<input type="email" id="email" name="userEmail" /><br>
	<label for="pass">Password: </label>
	<input type="password" id="pass" name="userPass" /><br>
	<br>
	<input type="hidden" name="form" value="registerAdmin" />
	<input type="submit" value="Submit" />
</form>
</body>
</html>
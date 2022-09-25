<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>
</head>
<body> 
<a href="https://accounts.google.com/o/oauth2/auth?scope=email&redirect_uri=http://localhost:8082/EdAgency/success&response_type=code&client_id=542478063312-6lr433uksoma433b236td1uqekt0ejm4.apps.googleusercontent.com&approval_prompt=force" >Login With Google</a>
<br>
<form action="${pageContext.request.contextPath}/agency" method="post">
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
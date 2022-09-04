<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${param.title}</title>
</head>
<body>
	<a href="signin.jsp">Sign In</a>
	<c:if test="${param.title != 'Homepage'}">
		<form action="${pageContext.request.contextPath}/home" action="get">
			<input type="hidden" name="page" value="list" /> <input
				type="submit" value="Home" />
		</form>
	</c:if>
	<br>
	<br>
</body>
</html>
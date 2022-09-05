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
	<c:choose>
		<c:when test="${not empty loggedInUser}">
			Logout
		</c:when>
		<c:otherwise>
			<a href="${pageContext.request.contextPath}/agency?page=signin">Sign In</a>
		</c:otherwise>
	</c:choose>

	<c:if test="${param.title != 'Homepage'}">
		<form action="${pageContext.request.contextPath}/agency" action="get">
			<input type="hidden" name="page" value="list" /> <input
				type="submit" value="Home" />
		</form>
	</c:if>
	<br>
	<br>
</body>
</html>
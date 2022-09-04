<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <title>EdAgency Home</title> -->
</head>
<body>
	<c:import url="/include/header.jsp">
		<c:param name="title" value="Homepage" />
	</c:import>
	<br>

	<table>
		<thead>
			<tr>
				<th><b>id</b></th>
				<th><b>Name</b></th>
				<th><b>Email</b></th>
				<th><b>Gender</b></th>
				<th><b>Birth Date</b></th>
				<th><b>Eyes</b></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listAgents}" var="agents">
				<c:url var="profile" value="home">
					<c:param name="page" value="goProfile"></c:param>
					<c:param name="agentId" value="${agents.id}"></c:param>
					<c:param name="agentName" value="${agents.name}"></c:param>
					<c:param name="agentEmail" value="${agents.email}"></c:param>
					<c:param name="agentGender" value="${agents.gender.toString()}"></c:param>
					<c:param name="agentBirthdate" value="${agents.birthdate}"></c:param>
					<c:param name="agentEyes" value="${agents.eyes}"></c:param>
					<c:param name="agentHeight" value="${agents.height}"></c:param>
					<c:param name="agentShirt" value="${agents.shirt}"></c:param>
					<c:param name="agentShoes" value="${agents.shoes}"></c:param>
					<c:param name="agentInstagram" value="${agents.instagram}"></c:param>
				</c:url>
				<tr>
					<td>${agents.id}</td>
					<td><a href="${profile}">${agents.name}</a></td>
					<td>${agents.email}</td>
					<td>${agents.gender.toString()}</td>
					<td><fmt:formatDate type="date" value="${agents.birthdate}" /></td>
					<td>${agents.eyes.toString()}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<form action="${pageContext.request.contextPath}/home" action="get">
		<input type="hidden" name="page" value="goToAdd" />
		<input type="submit" value="Add Agent" />
	</form>
	<br>
	<br>
	<b>Users:</b>
	<br>
	<table>
		<thead>
			<tr>
				<th><b>id</b></th>
				<th><b>Email</b></th>
				<th><b>Password</b></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listUsers}" var="users">
				<tr>
					<td>${users.id}</td>
					<td><a href="${profile}">${users.email}</a></td>
					<td>${users.password}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
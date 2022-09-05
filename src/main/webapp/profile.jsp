<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <title>Profile</title> -->
</head>
<body>
	<c:import url="/include/header.jsp">
		<c:param name="title" value="Profile" />
	</c:import>
	<br>
<%
	String id = request.getParameter("agentId");
	out.write(id);
	out.write("</br>");
	String name = request.getParameter("agentName");
	out.write(name);
	out.write("</br>");
	String email = request.getParameter("agentEmail");
	out.write(email);
	out.write("</br>");
	String gender = request.getParameter("agentGender");
	out.write(gender);
	out.write("</br>");
	String birthday = request.getParameter("agentBirthdate");
	out.write(birthday);
	out.write("</br>");
	String eyes = request.getParameter("agentEyes");
	out.write(eyes);
	out.write("</br>");
	String height = request.getParameter("agentHeight");
	out.write(height);
	out.write("</br>");
	String shirt = request.getParameter("agentShirt");
	out.write(shirt);
	out.write("</br>");
	String shoes = request.getParameter("agentShoes");
	out.write(shoes);
	out.write("</br>");
	String instagram = request.getParameter("agentInstagram");
	out.write(instagram);
	out.write("</br>");
%>

<form action="${pageContext.request.contextPath}/agency" method="get" >
	<input type="hidden" name="page" value="updateAgent" />
	<input type="hidden" name="agentId" value="${param.agentId}" />
	<input type="hidden" name="agentName" value="${param.agentName}" />
	<input type="hidden" name="agentEmail" value="${param.agentEmail}" />
	<input type="hidden" name="agentGender" value="${param.agentGender}" />
	<input type="hidden" name="agentBirthdate" value="${param.agentBirthdate}" />
	<input type="hidden" name="agentEyes" value="${param.agentEyes}" />
	<input type="hidden" name="agentHeight" value="${param.agentHeight}" />
	<input type="hidden" name="agentShirt" value="${param.agentShirt}" />
	<input type="hidden" name="agentShoes" value="${param.agentShoes}" />
	<input type="hidden" name="agentInstagram" value="${param.agentInstagram}" />
	<input type="submit" value="Update Agent" />
</form>
<form action="${pageContext.request.contextPath}/agency" method="post">
	<input type="submit" name="form" value="delete" />
</form>

</body>
</html>
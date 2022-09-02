<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/home" method="post">
		Username: <input type="text" name="agentName" value="${param.agentName}" /></br>
		Gender: <select name="agentGender">
			<option>${param.agentGender}</option>
			<c:forEach items="${genders}" var="gender">
				<c:if test="${gender != param.agentGender}" >
					<option value="${gender}" >
						${gender}
					</option>
				</c:if>
			</c:forEach>
		</select>
		</br>
		Birth Date: <input type="date" name="agentBirthdate" value="${param.agentBirthdate}" ></br>
		Eyes: <input type="text" name="agentEyes" value="${param.agentEyes}" /></br>
		Height: <input type="text" name="agentHeight" value="${param.agentHeight}" /></br>
		Shirt: <select name="agentShirt">
			<option>${param.agentShirt}</option>
			<c:forEach items="${shirts}" var="shirt">
				<c:if test="${shirt != param.agentShirt}" >
					<option value="${shirt}" >
						${shirt}
					</option>
				</c:if>
			</c:forEach>
		</select>
		</br>
		Shoes: <input type="text" name="agentShoes" value="${param.agentShoes}" /></br>
		Instagram: <input type="text" name="agentInstagram" value="${param.agentInstagram}" /></br>
		<input type="hidden" name="agentId" value="${param.agentId}" />
		<input type="hidden" name="form" value="updateAgentOperation" />
		<input type="submit" value="update" />
	</form>
</body>
</html>
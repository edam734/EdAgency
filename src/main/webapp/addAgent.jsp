<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/home" method="post">
<!-- 		Id: <input type="text" name="agentId" /></br> -->
		Name: <input type="text" name="agentName" /></br>
		Gender: <select name="agentGender">
			<c:forEach items="${genders}" var="gender">
				<option value="${gender}" >
					${gender}
				</option>
			</c:forEach>
		</select>
		</br>
		Birth Date: <input type="date" name="agentBirthdate"></br>
		Eyes: <select name="agentEyes">
			<c:forEach items="${eyes}" var="eye">
				<option value="${eye}" >
					${eye}
				</option>
			</c:forEach>
		</select>
		</br>
		Height: <input type="text" name="agentHeight" /></br>
		Shirt: <select name="agentShirt">
			<c:forEach items="${shirts}" var="shirt">
				<option value="${shirt}" >
					${shirt}
				</option>
			</c:forEach>
		</select>
		</br>
		Shoes: <input type="text" name="agentShoes" /></br>
		Instagram: <input type="text" name="agentInstagram" /></br>
		<input type="hidden" name="form" value="add" />
		<input type="submit" value="Add Agent" />
	</form>
</body>
</html>
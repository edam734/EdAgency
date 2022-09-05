<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <title>Update Agent</title> -->
<script type="text/javascript" src="js/jquery-3.6.1.min.js" ></script>
<script type="text/javascript" >

	$(document).ready(function() {
		$('#email').blur(function() {
			var email = $('#email').val();
			$.ajax({
				type : 'POST',
				data : {
					email : email
				},
				url : 'ajax',
				success : function(result) {
					$('#result').html(result);
				}
			});
		});
	});
</script>
</head>
<body>
	<c:import url="/include/header.jsp">
		<c:param name="title" value="Update Agent" />
	</c:import>
	<br>
	<form action="${pageContext.request.contextPath}/agency" method="post">
		Username: <input type="text" name="agentName" value="${param.agentName}" required /><br>
		Email: <input type="email" id="email" name="agentEmail" value="${param.agentEmail}" required /><span id="result"></span><br>
		Birth Date: <input type="date" name="agentBirthdate" value="${param.agentBirthdate}" required ><br>
		Gender: <select name="agentGender" required >
			<option>${param.agentGender}</option>
			<c:forEach items="${genders}" var="gender">
				<c:if test="${gender != param.agentGender}" >
					<option value="${gender}" >
						${gender}
					</option>
				</c:if>
			</c:forEach>
		</select>
		<br>
		Eyes: <input type="text" name="agentEyes" value="${param.agentEyes}" /><br>
		Height: <input type="text" name="agentHeight" value="${param.agentHeight}" /><br>
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
		<br>
		Shoes: <input type="text" name="agentShoes" value="${param.agentShoes}" /><br>
		Instagram: <input type="text" name="agentInstagram" value="${param.agentInstagram}" /><br>
		<input type="hidden" name="agentId" value="${param.agentId}" />
		<input type="hidden" name="form" value="update" />
		<input type="submit" value="Update" />
	</form>
</body>
</html>
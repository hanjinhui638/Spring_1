<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url = "../layout/boostrap.jsp"/>
</head>
<body>
<c:import url="../layout/nav.jsp"/>
	<h1>Member Login Page</h1>
	<div class="container">
		<h2>Login form</h2>
		<form action="./memberLoginResult.jsp" method="post">
			<div class="form-group">
				<label for="id">Id:</label> <input type="text" class="form-control"
					id="id" placeholder="Enter id" name="id" value=<%= %>>
			</div>
			<div class="form-group">
				<label for="pw">Password:</label> <input type="password"
					class="form-control" id="pw" placeholder="Enter password" name="pw">
			</div>
			<div class="checkbox">
				<label><input type="checkbox" checked="checked"
					name="remember" value="check"> Remember me</label>
				<!-- 개발자가 value설정 -->
			</div>
			<button type="submit" class="btn btn-default">Submit</button>
		</form>
	</div>
	

</body>
</html>
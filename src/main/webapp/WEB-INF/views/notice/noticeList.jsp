<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootStrap.jsp"/>
</head>
<body>
<c:import url="../layout/nav.jsp"/>
	<!-- <img alt="" src="../resources/images/au53.jpg"> 프론트 ->resources -->
	
	<h1>Notice List Page</h1>
	<div class="container">
		<h2>Notice List</h2>
		<table class="table">
			<thead>
				<tr>
					<th>NUM</th>
					<th>TITLE</th>
					<th>WRIGHT</th>
					<th>DATE</th>
					<th>HIT</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${requestScope.list}" var = "dto" varStatus="st"> 
					
				<tr>
					<td>${pageScope.dto.num}</td>
					<td><a href = "./noticeSelect?num=${pageScope.dto.num}">${pageScope.dto.title}</a></td>
					<td>${pageScope.dto.writer}</td>
					<td>${pageScope.dto.reg_date}</td>
					<td>${pageScope.dto.hit}: ${st.last}</td>
				</tr>
				</c:forEach>
			
			</tbody>
		</table>
		
			<div>
				<c:forEach begin="1" end = "10" var = "i" varStatus="st">	<!-- 역으로는 안됨 10 9 8 ...  10포함-->
						${pageScope.i} : ${st.begin} 
				</c:forEach>		
			</div>
			<c:if test="${empty sessionScope.member}">
				<a href = "./noticeWrite" >Write</a>
			</c:if>
		
	</div>
	
</body>
</html>
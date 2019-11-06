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
<%-- <h1>${data}</h1> --%>
<div class="container">
  <h2>Notice Select Page</h2>
  <ul class="list-group">
    <li class="list-group-item">Title : ${requestScope.noticeDTO.title} </li>
    <li class="list-group-item">Writer : ${requestScope.noticeDTO.writer} </li>
    <li class="list-group-item">DATE : ${requestScope.noticeDTO.reg_date}</li>
    <li class="list-group-item">HIT : ${requestScope.noticeDTO.hit} </li>
  </ul>
   <p>CONTENTS: ${requestScope.noticeDTO.contents} </p>
	<div id="box">
		<a class = "btn btn-primary" href="./noticeUpdate?num=${requestScope.noticeDTO.num}">Update</a>
		
	
	<%-- <%if(memberDTO !=null && memberDTO.getId().equals(noticeDTO.getWriter())) {%>
 	<a class = "btn btn-danger" href="./noticeDeleteResult.jsp?num=<%= noticeDTO.getNum()%>">삭제</a>
 	<% }%> --%>
 	
	</div>
</div>


</body>
</html>
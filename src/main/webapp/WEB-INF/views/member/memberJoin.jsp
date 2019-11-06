<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootstrap.jsp"/>

</head>
<body>
<c:import url="../layout/nav.jsp"/>

	<h1>Member Join Page</h1>
<div class="container">
	  <h2>Member Join Form</h2>
	  <form action="./memberJoin" method="post">
	  
	    <div class="form-group">
	      <label for="id">ID:</label>
	      <input type="text" required="required" class="form-control" id="id" placeholder="Enter ID" name="id">
	    </div>
	    
	    <div class="form-group">
	      <label for="pw">Password:</label>
	      <input type="password" required="required"  class="form-control" id="pw" placeholder="Enter Password" name="pw">
	    </div>
	   
	   <div class="form-group">
	      <label for="name">Name:</label>
	      <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name" required="required">
	    </div>
	    
	    <div class="form-group">
	      <label for="email">E-mail:</label>
	      <input type="email" class="form-control" id="email" placeholder="Enter Email" name="email" required="required">
	    </div>
	    
	    <div class="form-group">
	      <label for="phone">Phone:</label>
	      <input type="tel" class="form-control" id="phone" placeholder="Enter Phone" name="phone" required="required">
	    </div>
	    
	     <button class="btn btn-info">Submit</button>
	    </form>
	</div>	
	
	
	

</body>
</html>
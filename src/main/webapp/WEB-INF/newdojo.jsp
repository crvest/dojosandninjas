<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>New Dojo</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript" src="js/main.js"></script>
</head>
<body>
	<h1>New Dojo</h1>
	
	<form:form action="/dojo/new" method="POST" modelAttribute="dojo">
		<form:errors path="name"></form:errors>
		<form:input placeholder="Enter a Name" path="name"></form:input>
		<input type="submit" value="Create Dojo"/>
	</form:form>
	
	<a href="/ninja/new">Create a New Ninja</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Admin </title>
<%@ include file = "logout.jsp" %>
</head>
<body bgcolor="CORAL" text="green">
Welcome ${slogin}
	<br>
	<br>
	
	<a href="getParticularVacantApartment">All Vacant Apartment</a><br>
	<a href="allApartment">All Apartment</a><br>	
	<a href="getParticularApartment">Get Particular Apartment</a><br>
	<a href="getAllTenant">All Tenant</a><br>
	<a href="getParticularTenant">Get Particular Tenant</a><br>
	<a href="addNewTenant">Add New Tenant </a><br>
	<a href="getParticularModel">Get Particular Model </a><br>
	<a href="getAllModel">All Models </a><br>

<body>

</body>
</html>
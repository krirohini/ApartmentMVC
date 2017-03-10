<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Our Apartment Web Site</title>

</head>
<body>

	 <c:if test="${loginFailed == 'YES'}">
		<div style="color: red;">Incorrect Login Name or Password. Please try again.</div>	
	</c:if>
	
	
		<form:form method="POST" name="loginForm" commandName="login" onSubmit= "return validateForm()"> 
		<table>
			<tbody>
				<tr>
					<td><form:label path="loginName">Login Name:</form:label></td>
					<td><form:input path="loginName"></form:input>
						<font color="red"><form:errors path="loginName" /></font></td>
				</tr>
				<tr>
					<td><form:label path="password">Password:</form:label></td>
					<td><form:password path="password" />
						<font color="red"> <form:errors path="password" /></font></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Login" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>
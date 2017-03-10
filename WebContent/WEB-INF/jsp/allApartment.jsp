<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> All Apartments </title>
</head>
<body>
		<form method="POST" name="AllApartmentForm">
		<table>
			<tbody>
				<tr>
					<td><input name="apartmentId"></td>
					<td colspan="2"><input type="submit"
						value="Enter Apartment ID" /></td>
				</tr>
			</tbody>
		</table>
	</form>
<br>		
<a href="adminHome">Go to Admin Home Page</a><br><br>
			
Record For All Apartments
<br><br>
<table border="1" bgcolor="orange">  
   	<tr>
   		<td class="heading">Apartment Id</td> 
	    <td class="heading">Building No</td>
	    <td class="heading">No Of Occupants</td>
	    <td class="heading">Current Rent</td>  
	    <td class="heading">Model Id</td>  
	    <td class="heading">Tenant Id</td>  	    
  	</tr>    	
    <c:forEach items="${apartmentList}" var="apartment">
    <tr> 
    	<td><c:out value="${apartment.id}" /></td>  
		<td>${apartment.buildingNo}</td>  
		<td>${apartment.noOfOccupants}</td>  
		<td>${apartment.currentRent}</td>  
		<td>${apartment.modelId}</td>  
		<td>${apartment.tenantId}</td>		
    </tr> 
    </c:forEach>   
</table>
	
</body>
</html>
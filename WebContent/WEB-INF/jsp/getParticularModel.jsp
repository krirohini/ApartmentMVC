<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Information for Model </title>
</head>
<body>
	<form:form method="POST" name="getParticularModelForm" commandName="model" >
		<table>
			<tbody>
				<tr>					
					<td><form:input path="id"></form:input></td>
					<td colspan="2"><input type="submit" value="Enter Model ID" /></td>
				</tr>
			</tbody>
		</table>
		
<br><a href="adminHome">Go to Admin Home Page</a> <br>	
	
<br>Record For ... ${model.id} 
<br><br>
<table border="1" bgcolor="orange">  
   	<tr> 
	    <td class="heading">No Of Bedrooms</td>
	    <td class="heading">No Of Bathrooms</td>
	    <td class="heading">Rent Range</td>  
	    <td class="heading">Area</td>  
	    <td class="heading">Security Deposite</td>  	    
	    <td class="heading">Max Occupancy</td> 
  	</tr>    	
    <tr>   
		<td>${model.noOfBedrooms}</td>  
		<td>${model.noOfBathrooms}</td>  
		<td>${model.rentRange}</td>  
		<td>${model.area}</td>  
		<td>${model.securityDeposite}</td>
		<td>${model.maxOccupancy}</td>		
<%-- 	<td><a href="updateModel?id=${model.id}">Update Information</a></td> --%>
    </tr>    
</table>
	</form:form>
</body>
</html>
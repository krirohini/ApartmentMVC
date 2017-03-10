<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Models</title>
</head>
<body>
<br>
<a href="adminHome">Go to Admin Home Page</a>
<br><br>
All Models in the Apartment
<br><br>
<table border="1" bgcolor="orange" >
	<thead>
    	<tr>
            <th>Model Id</th>
            <th>No Of Bedrooms</th>
            <th>No Of Bathrooms</th>
            <th>Rent Range</th>
            <th>Area</th>
            <th>Security Deposite</th>
            <th>Max Occupancy</th>         
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${modelList}" var="model">
        	<tr>
            	<td><c:out value="${model.id}" /></td>
                <td>${model.noOfBedrooms}</td>  
				<td>${model.noOfBathrooms}</td>  
				<td>${model.rentRange}</td>  
				<td>${model.area}</td>  
				<td>${model.securityDeposite}</td>
				<td>${model.maxOccupancy}</td>		
                
            </tr>
        </c:forEach>
    </tbody>
</table>


</body>
</html>
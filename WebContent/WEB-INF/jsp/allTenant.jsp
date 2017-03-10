<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Tenant</title>
</head>
<body>
<br>
<a href="adminHome">Go to Admin Home Page</a>
<br><br>
All Tenant Records
<br><br>
<table border="1" bgcolor="orange" >
	<thead>
    	<tr>
            <th>Tenant Id</th>
            <th>First Name</th>
            <th>Middle Name</th>
            <th>Last Name</th>
            <th>EmailId</th>
            <th>Phone No.</th>
            <th>ApartmentId</th>
<!--             <th>Rent</th> -->
            <th>Lease Start Date</th>
            <th>Lease End Date</th>            
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${tenantList}" var="user">
        	<tr>
            	<td><c:out value="${user.id}" /></td>
                <td><c:out value="${user.firstName}" /></td>
                <td><c:out value="${user.middleName}" /></td>
                <td><c:out value="${user.lastName}" /></td>
                <td><c:out value="${user.emailId}" /></td>
                <td><c:out value="${user.phone}" /></td>
                <td><c:out value="${user.apartId}" /></td>
                <td><c:out value="${user.leaseStartDate}" /></td>
                <td><c:out value="${user.leaseEndDate}" /></td>
                <td></td>
            </tr>
        </c:forEach>
    </tbody>
</table>


</body>
</html>
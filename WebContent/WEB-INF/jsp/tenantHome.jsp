<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Tenant </title>
</head>
<%@ include file = "logout.jsp" %>
<body>
Record For ... ${slogin}
<table border="1">  
   	<tr> 
	    <td class="heading">First Name</td>
	    <td class="heading">Middle Name</td>
	    <td class="heading">Last Name</td>  
	    <td class="heading">Sex</td>  
	    <td class="heading">Age</td>  
	    <td class="heading">Phone</td>  
	    <td class="heading">Email ID</td> 
	    <td class="heading">Apart ID</td>
	    <td class="heading">Lease Start Date</td>
	    <td class="heading">Lease End Date</td>	    
	    <td class="heading">Description</td>
	    <td class="heading">Action</td> 
  	</tr>    	
    <tr>   
		<td>${tenantInfoPage.firstName}</td>  
		<td>${tenantInfoPage.middleName}</td>  
		<td>${tenantInfoPage.lastName}</td>  
		<td>${tenantInfoPage.sex}</td>  
		<td>${tenantInfoPage.age}</td>
		<td>${tenantInfoPage.phone}</td>
		<td>${tenantInfoPage.emailId}</td>
		<td>${tenantInfoPage.apartId}</td>
		<td>${tenantInfoPage.leaseStartDate}</td>
		<td>${tenantInfoPage.leaseEndDate}</td>
		<td>${tenantInfoPage.description}</td>
		<td><a href="updateTenantMain?id=${tenantInfoPage.id}">Update Information</a></td>
    </tr>    
</table>  
<br></br>
<br></br>
<table border="1">
	<tr>
		<td class="heading">Identification Document Type</td>
	    <td class="heading">Identification Document ID</td>
	    <td class="heading">Identification Document Expire Date</td>
	    <td class="heading">Occupation</td>
	    <td class="heading">Annual Income</td>
	    <td class="heading">Permanent Address</td>
	    <td class="heading">Action</td> 
	</tr>
	<tr>
		<td>${tenantInfoPage.identificationDocumentType}</td>
		<td>${tenantInfoPage.identificationDocumentId}</td>
		<td>${tenantInfoPage.identificationDocumentExpiryDate}</td>
		<td>${tenantInfoPage.occupation}</td>
		<td>${tenantInfoPage.annualIncome}</td>
		<td>${tenantInfoPage.permanentAddress}</td>
<%-- 		<td><a href="updateTenantRest?tenant_id=${profile_1.tenantID}">Update Information</a></td> --%>
	</tr>
</table>

<br></br>
<table border="1">
	<tr>
		<td class="heading"><a href="rent">All Due/Paid Rent</a></td>
	    <td class="heading"><a href="utility">All Due/Paid Utility</a></td>
	    <td class="heading"><a href="notice">Notice/Messages</a></td>
	    <td class="heading"><a href="meetings">Past/Incoming Meetings</a></td>
	</tr>
</table>


</body>
</html>
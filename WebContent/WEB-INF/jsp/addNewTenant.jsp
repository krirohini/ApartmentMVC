<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Tenant Form</title>
</head>
<body>
	
<form:form method="POST" name="addNewTenantForm" commandName="tenantInfoPage" > 
	<table>
		<tbody>
			
			<tr>
				<td> <form:label path="firstName">First Name </form:label> </td>
				<td> <form:input path="firstName"></form:input> </td>
			</tr>
			<tr>
				<td> <form:label path="middleName">Middle Name </form:label> </td>
				<td> <form:input path="middleName"></form:input> </td>
			</tr>
			<tr>
				<td> <form:label path="lastName">Last Name </form:label> </td>
				<td> <form:input path="lastName"></form:input> </td>
			</tr>
			<tr>
				<td> <form:label path="sex">Sex </form:label> </td>
				<td> <form:radiobutton path="sex" value="Male" />Male
					 <form:radiobutton path="sex" value="Female" />Female
					 <form:radiobutton path="sex" value="Between" />Between
				</td>  
			</tr>
			<tr>
				<td> <form:label path="age">Age </form:label> </td>
				<td> <form:input path="age"></form:input> </td>
			</tr>
			<tr>
				<td> <form:label path="phone">Phone </form:label> </td>
				<td> <form:input path="phone"></form:input> </td>
			</tr>
			<tr>
				<td> <form:label path="emailId">Email ID </form:label> </td>
				<td> <form:input path="emailId"></form:input> </td>
			</tr>
			<tr>
				<td><form:label path="apartId">Apartment ID </form:label> </td>
				<td><form:input path="apartId"></form:input>
				</td>
			</tr>
			<tr>
				<td> <form:label path="leaseStartDate">Lease Start Date </form:label> </td>
				<td><form:input path="leaseStartDate"></form:input>
				</td>
			</tr>
			<tr>
				<td> <form:label path="leaseEndDate">Lease End Date </form:label> </td>
				<td> <form:input path="leaseEndDate"></form:input>
			</tr>
			<tr>
				<td> <form:label path="identificationDocumentType">Identification Document Type </form:label> </td>
				<td> <form:input path="identificationDocumentType"></form:input> </td>
			</tr>
			<tr>
				<td> <form:label path="identificationDocumentId">Identification Document Id </form:label> </td>
				<td> <form:input path="identificationDocumentId"></form:input> </td>
			</tr>
			<tr>
				<td> <form:label path="identificationDocumentExpiryDate">Identification Document Expiry Date </form:label> </td>
				<td> <form:input path="identificationDocumentExpiryDate"></form:input> </td>
			</tr>
			<tr>
				<td> <form:label path="occupation">Occupation </form:label> </td>
				<td> <form:input path="occupation"></form:input> </td>
			</tr>
			<tr>
				<td> <form:label path="annualIncome">Annual Income </form:label> </td>
				<td> <form:input path="annualIncome"></form:input> </td>
			</tr>
			<tr>
				<td> <form:label path="permanentAddress">Permanent Address </form:label> </td>
				<td> <form:input path="permanentAddress"></form:input> </td>
			</tr>
			<tr>
				<td> <form:label path="description">Description </form:label> </td>
				<td> <form:input path="description"></form:input> </td>
			</tr>
			
			<tr><td><input type="submit" value="Add Tenant Record" /></td></tr>			
		</tbody>
			
	</table>
				
</form:form>

</body>
</html>
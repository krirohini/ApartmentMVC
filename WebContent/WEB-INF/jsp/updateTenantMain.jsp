<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Tenant Information</title>
</head>
<body>
	<h1>Record for Tenant</h1>${tenantInfoPage.id}
<form:form method="POST" name="updateTenantMainForm" commandName="tenantInfoPage" > 
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
				<td> <form:input path="sex"></form:input> </td>
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
				<td>
					<c:if test="${sessionScope.srole == 'admin' }">
						<form:input path="apartId" />
					</c:if>
					<c:if test="${sessionScope.srole == 'tenant' }">
						<div>${tenantInfoPage.apartId}</div>
						<form:hidden path="apartId"/>
					</c:if>
					
				</td>
			</tr>
			<tr>
				<td> <form:label path="leaseStartDate">Lease Start Date </form:label> </td>
				<td><c:if test="${sessionScope.srole == 'admin' }">
						<form:input path="leaseStartDate" />
					</c:if>
					<c:if test="${sessionScope.srole == 'tenant' }">
						<div>${tenantInfoPage.leaseStartDate}</div>
						<form:hidden path="leaseStartDate"/>
					</c:if>
<%-- 					<div>${tenantInfoPage.leaseStartDate}</div> --%>
<%-- 					<form:hidden path="leaseStartDate"/> --%>
				</td>
			</tr>
			<tr>
				<td> <form:label path="leaseEndDate">Lease End Date </form:label> </td>
				<td> <c:if test="${sessionScope.srole == 'admin' }">
						<form:input path="leaseEndDate" />
					</c:if>
					<c:if test="${sessionScope.srole == 'tenant' }">
						<div>${tenantInfoPage.leaseEndDate}</div>
						<form:hidden path="leaseEndDate"/>
					</c:if>
<%-- 				<form:hidden path="leaseEndDate" /> </td> --%>
			</tr>
			<tr>
				<td> <form:label path="identificationDocumentType">Identification Document Type </form:label> </td>
				<td><c:if test="${sessionScope.srole == 'admin' }">
						<form:input path="identificationDocumentType" />
					</c:if>
					<c:if test="${sessionScope.srole == 'tenant' }">
						<div>${tenantInfoPage.identificationDocumentType}</div>
						<form:hidden path="identificationDocumentType"/>
					</c:if> 
				
<%-- 				<div>${tenantInfoPage.identificationDocumentType}</div>  --%>
<%-- 				<form:hidden path="leaseEndDate" /> </td> --%>
			</tr>
			<tr>
				<td> <form:label path="identificationDocumentId">Identification Document Id </form:label> </td>
				<td><c:if test="${sessionScope.srole == 'admin' }">
						<form:input path="identificationDocumentId" />
					</c:if>
					<c:if test="${sessionScope.srole == 'tenant' }">
						<div>${tenantInfoPage.identificationDocumentId}</div>
						<form:hidden path="identificationDocumentId"/>
					</c:if>  
				
<%-- 				<div>${tenantInfoPage.identificationDocumentId}</div>  --%>
<%-- 				<form:hidden path="leaseEndDate" /> </td> --%>
			</tr>
			<tr>
				<td> <form:label path="identificationDocumentExpiryDate">Identification Document Expiry Date </form:label> </td>
				<td><c:if test="${sessionScope.srole == 'admin' }">
						<form:input path="identificationDocumentExpiryDate" />
					</c:if>
					<c:if test="${sessionScope.srole == 'tenant' }">
						<div>${tenantInfoPage.identificationDocumentExpiryDate}</div>
						<form:hidden path="identificationDocumentExpiryDate"/>
					</c:if> 
					  
<%-- 				<div>${tenantInfoPage.identificationDocumentExpiryDate}</div>  --%>
<%-- 				<form:hidden path="leaseEndDate" /> </td> --%>
			</tr>
			<tr>
				<td> <form:label path="occupation">Occupation </form:label> </td>
				<td> <div>${tenantInfoPage.occupation}</div> 
<%-- 				<form:hidden path="leaseEndDate" /> </td> --%>
			</tr>
			<tr>
				<td> <form:label path="annualIncome">Annual Income </form:label> </td>
				<td> <div>${tenantInfoPage.annualIncome}</div> 
<%-- 				<form:hidden path="leaseEndDate" /> </td> --%>
			</tr>
			<tr>
				<td> <form:label path="permanentAddress">Permanent Address </form:label> </td>
				<td> 
				<div>${tenantInfoPage.permanentAddress}</div> 
<%-- 				<form:hidden path="leaseEndDate" /> </td> --%>
			</tr>
			
			<tr>
				<td> <form:label path="description">Description </form:label> </td>
				<td> <form:input path="description"></form:input> </td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Update" /></td>
			</tr>
		</tbody>
	
	</table>
	

</form:form>

</body>
</html>
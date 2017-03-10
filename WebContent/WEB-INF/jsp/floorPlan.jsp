<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Floor Plan</title>
</head>

<body>
<a href="">Go to Home Page</a>

<table border="1">  
   	<tr>	    
	    <td class="heading">FLOOR ID</td>
	    <td class="heading">BED</td>
	    <td class="heading">BATH</td>  
	    <td class="heading">RENT</td>  
	    <td class="heading">SQ FT</td>  
	    <td class="heading">DEPOSIT</td>  
	    <td class="heading">PHOTO</td> 	    
  	</tr>    	
    <c:forEach items="${floorList}" var="floor">
		<tr> 
			<td><c:out value="${floor.floorId}"/></td>  
			<td><c:out value="${floor.bed}"/></td>  
			<td><c:out value="${floor.bath}"/></td>  
			<td><c:out value="${floor.rent}"/></td>  
			<td><c:out value="${floor.sqft}"/></td>
			<td><c:out value="${floor.deposit}"/></td>		
		</tr>
	</c:forEach>
</table>
<img src="<%=request.getContextPath()%>/WEB-INF/image/floorPlan1A.jpg" style="width:304px;height:228px" />
          
</body>
</html>
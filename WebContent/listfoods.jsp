<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>List of foods</h3>
	<table>
		<thead>
			<tr>
			    <th>Id</th>
				<th>Name</th>
				<th>Price</th>
				</tr>
		</thead>
		<tbody>
			<c:forEach var="food" items="${FOODS}">
				<tr>
	                 <td>${food.id}</td>			
					<td>${food.name}</td>
					<td>${food.price}</td>
									
					
					
					
					
				</tr>
			</c:forEach>


		</tbody>


	</table>
	
<a href="submit.html">Take Orders here</a>
				
			
</body>
</html>
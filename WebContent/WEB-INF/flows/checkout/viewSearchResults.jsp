<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Search Results</title>
</head>
<body>
<table border="1">
<tr bgcolor="#CCCCCC">
<th>Product Name</th><th>Product Description</th><th>Quantity remaining</th>
</tr>
<c:forEach var="item" items="${SearchResults}">
<tr>
	<td>
		<c:out value="${item.itemName}" />
	</td>
	<td>
		<c:out value="${item.itemDescription}" />
	</td>
	<td>
		<c:out value="${item.itemQuantity}" />
	</td>
</tr>
</c:forEach>
</table>
</body>
</html>
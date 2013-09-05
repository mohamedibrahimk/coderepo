<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Search Items</title>
</head>
<body>

<form:form commandName="SearchItemsForm" method="post">

	Enter the item you want to search:
	<form:input type="text" name="searchCriteria" path="searchCriteria" />
	<form:select path="itemCategory" items="${itemCategories}" itemValue="categoryId" itemLabel="category"></form:select>
	<input type="submit" name="_eventId_submit" value="submit" />
</form:form>
</body>
</html>
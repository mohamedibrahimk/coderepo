<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Sign up page</title>
<link rel="stylesheet" type="text/css" href="css/webstore.css" />
</head>
<body>

<table>
<form:form action="signup.do" commandName="UserSignupForm" method="post">
	
	
	<tr>
	<td>
	
	Email Id:
	<form:input type="text" name="emailId" path="emailId" />
	<form:errors path="emailId" cssClass="error" />
	</td>
	</tr>
	
	<tr>
	<td>
	password:
	<form:input type="password" name="password" path="password" />
	</td>
	</tr>
	
	<tr>
	<td>
	First Name:
	<form:input type="text" name="firstName" path="firstName" />
	</td>
	</tr>
	
	<tr><td>
	Middle Name:
	<form:input type="text" name="middleName" path="middleName" />
	</td></tr>
	
	<tr><td>
	Last Name:
	<form:input type="text" name="lastName" path="lastName" />
	</td></tr>
	<tr><td>
	Age:
	<form:input type="text" name="age" path="age" />
	</td></tr>
	<tr><td>
	Occupation:
	<form:input type="text" name="occupation" path="occupation" />
	</td></tr>
	<tr><td>
	<input type="submit" />
	</td></tr>
	
	
</form:form>
</table>
</body>
</html>
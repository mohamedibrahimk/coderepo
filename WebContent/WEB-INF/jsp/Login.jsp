<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<link rel="stylesheet" type="text/css" href="css/webstore.css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login Page</title>
</head>
<body>
<table>
<form:form action="login.do" commandName="LoginForm" method="post">
	<tr>
	<td>
	Email Id:
	<form:input type="text" name="emailId" path="emailId" />
	</td>
	</tr>
	
	<tr>
	<td>
	password:
	<form:input type="password" name="password" path="password" />
	</td>
	</tr>
	
	<tr><td>
	<input type="submit" />
	</td></tr>
	
	<tr><td><p>New User? <a href="viewsignup.do">Sign up</a></p></td></tr>
	<form:errors path="emailId" cssClass="error"/>
	
</form:form>
</table>	
</body>
</html>
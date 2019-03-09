<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Entry</title>
</head>
<body>
Enter Employee Detail:<br><br>
<form:form action="./insertEmployee">
Eid : <form:input path="eid"/><br><br>
Name : <form:input path="name"/><br><br>
Designation : <form:input path="designation"/><br><br>
Dept : <form:input path="dept"/><br><br>
Basic : <form:input path="basic"/><br><br>
<input type="submit" value="Submit" name="operation">
 </form:form>
</body>
</html>
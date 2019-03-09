<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %>
    <%@page import="com.avinash.model.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Showing All Employees</title>
</head>
<body>
<%
   ArrayList<Employee>result=(ArrayList<Employee>)request.getAttribute("empList");
for(Employee emp:result){

%>
<tr>

           <td><% out.println(emp.getEid()); %></td>

           <td><% out.println(emp.getName()); %></td>

           <td><% out.println(emp.getDesignation()); %></td>

           <td><% out.println(emp.getDept()); %></td>

           <td><% out.println(emp.getBasic()); %></td>

     <tr>

 
<br>
<%} %>
</body>
</html>
<%@page import="com.jsp.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Employee> list=(List<Employee>)request.getAttribute("list");
	%>
	<nav>
	<header >
	<div style="background-color: black;">
	<span style="margin-left: 20%"><a style="color: white; text-decoration: none;" href="employeedelete.jsp">Click For Delete Employee-Acc</a> </span>
	<span style="margin-left: 5%"><a style="color: white; text-decoration: none;" href="getemployee.jsp">Click For Update-Acc</a></span>
		<span style="margin-left: 5%"><a style="color: white; text-decoration: none;" href="employeehome.jsp">Click Home Page</a></span>
	</div>
	</header>
	</nav>
	<table border="2px solid">
	<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Phone</th>
	<th>Email</th>
	<th>Password</th>
	</tr>
	<%for(Employee employee:list){
		%>
		<tr>
		<td><%=employee.getId() %></td>
		<td><%=employee.getName() %></td>
		<td><%=employee.getPhone()%></td>
		<td><%=employee.getEmail() %></td>
		<td><%=employee.getPasswor() %></td>
		</tr>
	<% }%>
	</table>
</body>
</html>
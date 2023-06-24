<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
nav ul li{
display: inline-block;
}
nav ul li a{
color: blue;
text-decoration: none;
padding: 20px;
}
h2{
color: red;
}
body {
	  background-image: linear-gradient(black,orange);
	 
}
</style>
</head>
<body>
<header>
<marquee behavior="alternate" scrollamount="25"><h2>Welcome To Servlet_Jsp_CRUD Operartion</h2></marquee>

</header>
<nav style="border: 2px solid; background-color: coral;">
	<ul>
	<li><a href="registeremployee.jsp">Create_Employee_ACC</a></li>
	<li><a href="employeedelete.jsp">Delete_Employee_ACC</a></li>
	<li><a href="getemployee.jsp">Update_Employee_ACC</a></li>
	<li><a href="displayall">Display_Employee_ACC</a></li>
	</ul>
	</nav>
</body>
</html>
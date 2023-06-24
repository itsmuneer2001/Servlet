<%@page import="com.jsp.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%Employee employee=(Employee)request.getAttribute("emp"); %>
	<form action="updateemployee" method="post">
	<input type="text" name="id" value="<%=employee.getId() %>" readonly="readonly"> <br> <br>
	Name :<input type="text" name="name" value="<%=employee.getName() %>"> <br> <br>
	Phone :<input type="text" name="phone" value="<%=employee.getPhone() %>"><br> <br>
	Email :<input type="text" name="email" value="<%=employee.getEmail() %>"><br> <br>
	Password :<input type="text" name="password" value="<%=employee.getPasswor() %>"><br> <br>
	<input type="submit" value="Update" onclick="updateData()"><br> <br>
	</form>
	<script type="text/javascript">
	function updateData() {
		window.alert("You Want To Update The Data")
	}
	</script>
</body>
</html>
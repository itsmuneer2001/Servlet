<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
::placeholder{
color: blue;
}
input[type=text]{
padding: 12px;
border: 1px solid #efc9af;
border-radius: 4px;
// background-color: #1f8ac0;
color: purple;
font-weight: bold;
}
input[type=submit]{
background-color: green;
}
</style>
<body>
<center>
	<form action="saveemployee" method="post">
	<input type="text" name="name" placeholder="Enter Your Name" autofocus="autofocus"> <br> <br>
	<input type="text" name="phone" placeholder="Enter Your Phone Number"><br> <br>
	<input type="text" name="email" placeholder="Enter Your Email"><br> <br>
	<input type="text" name="password" placeholder="Enter Your Password"><br> <br>
	<input type="submit" value="Register" onclick="saveData()"><br> <br>
	</form>
	</center>
	<script type="text/javascript">
	function saveData() {
		window.alert("You Want Register Your Account")
	}
	</script>
</body>
</html>
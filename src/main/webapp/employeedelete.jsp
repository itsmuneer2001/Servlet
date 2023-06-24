<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<form action="deleteemployee" method="post">
	<input type="text" name="id" placeholder="Enter Deleting Id" autofocus="autofocus"> <br> <br>
	<input type="submit" value="Delete" onclick="deleteData()">
	
	</form>
	</center>
	<script type="text/javascript">
function deleteData() {

	window.alert("You Want To deleted Data?");
}
</script>
</body>
</html>
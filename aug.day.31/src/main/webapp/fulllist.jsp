<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Received data from student table</title>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<header style="height: 30px;background-color: yellow;">
    
    </header>
	<div class="container">


           <hr/>

		<table class="table table-hover">
			<thead>
				<tr bgcolor="yellow">
					<th>User Name</th>
					<th>Password</th>
					<th>Name</th>
					<th>Email</th>
					<th>Gender</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${UsersList}" var="temp">
					<tr>
						<td>${temp.username}</td>
						<td>${temp.password}</td>
						<td>${temp.fullname}</td>
						<td>${temp.email}</td>
						<td>${temp.gender}</td>
					</tr>
				</c:forEach>
				</tbody>
		</table>
		</div>
</body>
</html>
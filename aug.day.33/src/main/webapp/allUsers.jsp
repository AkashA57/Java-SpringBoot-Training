<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Received data from profile table</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
${msg }
<div class="container">
<img alt="" src="img/roles.jpg" style="height: 100px; "> 
           <hr/>
  <h4><b>Congratulations....You have successfully Login</b></h4>
 
  <table class="table table-hover">
			<thead>
				<tr bgcolor="yellow">
					<th>User Name</th>
					<th>Password</th>
					<th>Name</th>
					<th>Email</th>
					<th>Gender</th>
					<th colspan=2 > Action(Deletion/Edit)</th>
					<th>Review</th>
					<th>VarUsr</th>
					
			        
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${userslist}" var="usr">
					<tr>
						<td>${usr.username}</td>
						<td>${usr.password}</td>
						<td>${usr.fullname}</td>
						<td>${usr.email}</td>
						<td>${usr.gender}</td>
						<td><a href="deleteServlet?username=${usr.username}">
<button type="button" class="btn btn-danger"><img alt="" src="img/delete.png" style="height: 60px; "></button>
</a></td>

<td><a href="showEditFormServlet?username=${usr.username}">
<button type="button" class="btn btn-primary"><img alt="" src="img/edit.jpg" style="height: 60px; "></button>
</a></td>
<td> mahesh <img alt="" src="img/rose.jpg" style="height: 60px; "></td>
<td>${usr}</td>
						
					</tr>
				</c:forEach>
				</tbody>
		</table>
		</div>
</body>
</html>
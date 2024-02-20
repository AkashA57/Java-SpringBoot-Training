<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Congratulation page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<img alt="" src="img/roles.jpg" style="height: 100px; "> 
           <hr/>
  <h4><b>Congratulations....successfully logged in </b></h4>
  
  <table class="table table-hover">
   
    <thead>
      <tr>
        <th>User Name</th>
        <th>Password</th>
        <th>Name</th>
        <th>Email</th>
        <th>Gender</th>
     
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${username.username}</td>
        <td>${username.password}</td>
        <td>${username.fullname}</td>
        <td>${username.email}</td>
        <td>${username.gender}</td>
      </tr>
      
    </tbody>
  </table>
  <a href="getALLRecords">
<button type="button" class="btn btn-primary"> show all records</button>
</a>
</div>
</body>
</html>
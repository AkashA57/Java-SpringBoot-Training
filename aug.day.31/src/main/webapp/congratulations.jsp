<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<title>Verification</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body style="background-color:yellow">

<h1><b>You are valid User....Welcome.....</b></h1>

<div class="container">          
  <table class="table table-bordered">
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
        <td>${username}</td>
        <td>${password}</td>
        <td>${fullname}</td>
        <td>${email}</td>
        <td>${gender}</td>
      </tr>
    </tbody>
  </table>
</div>
<p style="text-align:center"> <a href="showAllUser">Click here to see full list</a></p>

</body>
</html>
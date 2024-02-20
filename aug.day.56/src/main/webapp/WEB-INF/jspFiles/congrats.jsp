<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Congratulations!!</title>
<style type="text/css">
   body { background: yellow !important; } 
</style>
</head>
<body>



<div class="container">
  <h2>Congratulations ${email}</h2>
   <table class="table">
    <thead>
      <tr>
        <th></th>
        <th></th>
        
      </tr>
    </thead>
    <tbody>
           
      <tr class="success">
       <td>Email</td>
        <td>${email}</td>
      </tr>
      <tr class="danger">
        <td>Password</td>
        <td>${pswd}</td>
      </tr>
      
    </tbody>
  </table>
</div>


</body>
</html>
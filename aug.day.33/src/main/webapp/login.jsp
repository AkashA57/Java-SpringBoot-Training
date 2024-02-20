<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<img alt="" src="img/login.png" style="height: 100px ">
           <hr/>
${user}
  <h2>Login form</h2>
  <form action="loginServlet">
    <div class="form-group">
      <label for="username">User Name:</label>
      
      <input type="text" class="form-control" id="username" name="username">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" name="password">
    </div>
    
    <button type="submit" class="btn btn-primary">Submit</button> 
    <button type="reset" class="btn btn-danger">Reset</button>
    <a href="registration.jsp">
<button type="button" class="btn btn-primary">New Registration</button>
</a>
  </form>
</div>
</body>
</html>
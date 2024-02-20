<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>login Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>


<div class="container">
 <h1> Edit Page </h1>
  <form action="updateStudent"  method="post">
   
   
   <div class="form-group">
      <label >Name:</label>
      <input type="text" class="form-control" name="ssn" value="${studentDTO.ssn}" readonly>
    </div>
    
    <div class="form-group">
      <label >Name:</label>
      <input type="text" class="form-control" name="name" value="${studentDTO.name}" readonly>
    </div>
    
    <div class="form-group">
      <label >Email:</label>
      <input type="email" class="form-control" name="emailID" value="${studentDTO.emailID}">
    </div>
    
   <div class="form-group">
      <label >Age:</label>
      <input type="text" class="form-control"  name="age" value="${studentDTO.age}">
    </div> 
   
    <button type="submit" class="btn btn-primary">Edit Profile</button>
  </form>
</div>

</body>
</html>

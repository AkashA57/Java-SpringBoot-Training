<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
<nav class="navbar navbar-expand-sm bg-light">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="logout">LOGOUT</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="register">Employee Registration</a>
    </li>
  </ul>
</nav>
<br>

</div>

<div class="container">
		<h1> Employee Data.............</h1><br><br>
		
		 <table class="table">
    <thead>
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Salary</th>
        <th>Email</th>
        <th>password</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${listOfEmp}" var="employeeDTO">
      <tr>
        <td>${employeeDTO.employeeID}</td>
        <td>${employeeDTO.name}</td>
        <td>${employeeDTO.salary}</td>
        <td>${employeeDTO.emailID}</td>
        <td>${employeeDTO.password}</td>
        
        <td >
           
            <a href="deleteEmployee?employeeID=${employeeDTO.employeeID}">
           <button type="button" class="btn btn-danger">D</button>
            </a>
            
            <a href="updateEmployee?employeeID=${employeeDTO.employeeID}">
           <button type="button" class="btn btn-danger">U</button>
            </a>
            
        </td>
        
      </tr>
      </c:forEach>
     
    </tbody>
  </table>
 
</div>


</body>
</html>

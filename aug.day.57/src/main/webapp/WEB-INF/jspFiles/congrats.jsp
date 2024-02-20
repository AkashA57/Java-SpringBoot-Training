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
    <!-- <li class="nav-item">
      <a class="nav-link" href="/">LOGOUT</a>
    </li> -->
    <li class="nav-item">
      <a class="nav-link" href="showEmployees">Show All</a>
    </li>
  </ul>
</nav>
<br>

</div>
<div class="container">
 
<h1>  u r a valid employee  </h1>
<h1>  u r a valid employee  </h1>
<h1>  u r a valid employee  </h1>


<table class="table">
    <thead>
      <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Salary</th>
        <th>Email</th>
        <th>password</th>
      </tr>
    </thead>
    <tbody>
    
      <tr>
        <td>${employeeDTO.employeeID}</td>
        <td>${employeeDTO.name}</td>
        <td>${employeeDTO.salary}</td>
        <td>${employeeDTO.emailID}</td>
        <td>${employeeDTO.password}</td>
      </tr>
      
     
    </tbody>
  </table>


</div>
</body>
</html>


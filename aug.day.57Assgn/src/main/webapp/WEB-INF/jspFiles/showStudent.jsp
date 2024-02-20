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
      <a class="nav-link" href="register">Student Registration</a>
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
        <th>SNO</th>
        <th>SSN</th>
        <th>Name</th>
        <th>Email</th>
        <th>age</th>
        <th>Actions</th>
      </tr>
    </thead>
    <tbody>
    <% int i = 1;%>
    <c:forEach items="${listOfStu}" var="studentDTO">
      <tr>
      	<td><%=i++%></td>
        <td>${studentDTO.ssn}</td>
        <td>${studentDTO.name}</td>
        <td>${studentDTO.emailID}</td>
        <td>${studentDTO.age}</td>
        
        <td >
           
            <a href="deleteStudent?studentSSN=${studentDTO.ssn}">
                             delete
            </a>
            
            <a href="updateStudent?studentSSN=${studentDTO.ssn}">
                             update
            </a>
            
        </td>
        
      </tr>
      </c:forEach>
     
    </tbody>
  </table>
 
</div>


</body>
</html>

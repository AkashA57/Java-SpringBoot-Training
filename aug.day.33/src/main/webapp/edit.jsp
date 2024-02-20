<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

<title>Edit Page</title>
</head>
<body>

    <header style="height: 30px;background-color: yellow;">
    
    </header>
    <div class="container">
        <img alt="" src="img/oop.jpg" style="height: 100px;">
        
        <form action="updateServlet" method="post">
<label>User Name</label>
<input type="hidden" name="username" value="${username.username}" class="form-control" style="width: 60%;"><br>

<label>Password</label>
<input type="password" name="password" value="${username.password}" class="form-control" style="width: 60%;">


<label>Full Name</label>
<input type="text" name="fullname"  value="${username.fullname}" class="form-control" style="width: 60%;">

<label>Email</label>
<input type="email" name="email" value="${username.email}" class="form-control" style="width: 60%;">

<label>Gender</label>
<select  name="gender" value="${username.gender}" class="form-control" style="width: 60%;">
    <option>Male</option>
     <option>Female</option>
      <option>Other</option>
</select>

<br/>
<button type="submit" class="btn btn-primary">Edit</button>


</form>
    
    </div>
</body>

</html>
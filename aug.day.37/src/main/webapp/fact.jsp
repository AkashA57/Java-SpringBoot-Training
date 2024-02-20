<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fact 1 JSP</title>
</head>
<body>

${email}
<hr>
<hr>

<form action="factorialServlet" method="post">
Enter the Number:<input type="text" name="num">
<input type="submit" value="calculate factorial">
</form>
The result is =${result}
<p>
<a href ="fact2.jsp"> Click here to get result on fact2.jsp </a>
<p>
<p>
<p>

</body>
</html>
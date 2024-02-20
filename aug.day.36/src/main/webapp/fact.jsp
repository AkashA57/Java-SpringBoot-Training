<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="factorialServlet" method="post">
Enter the Number:<input type="text" name="num">
<input type="submit" value="calculate factorial">
</form>
The result is =${result}
<p>
<a href ="fact2.jsp"> Click here to get result on fact2.jsp </a>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 ${text1} ${num1} ${text2} ${num2} ${text3} ${sums}

<form action="sum" method="post">
Enter the no==<br>
<input type="text" name=num1> 
+
<input type="text" name=num2>
<input type="submit" value="calculateSUM">
</form>

</body>
</html>
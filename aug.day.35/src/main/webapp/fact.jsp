<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fact jsp</title>
</head>
<body>
<p>Enter a number to calculate a factorial</p>
<form action="factorial" method="post">
      <input type="text" name="number">
      <a href="factorial"><br>
      	<button type="submit">Calculate</button>
      </a>
</form>
${answer}

<p><a href="result.jsp">Click here to open result(jsp) page</a></p>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>表达提交</title>
</head>
<body>
	<form action="ELServlet" method="post">
		用户名：<input type="text" name="username"><br>
		年龄：<input type="text" name="age"><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>
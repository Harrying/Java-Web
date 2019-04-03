<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	1、exception对象只能在错误页面页面中使用，page加入一个
		属性isErrorPage="true"
	2、有一个页面出现了异常，在页面中指定一个错误处理的页面，page指令当中，errorpage来指定。
	 -->
	<%= exception.getMessage() %>
</body>
</html>
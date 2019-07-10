<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//forward方法完场请求转发
		pageContext.forward("a.jsp?name=imooc");
		//include方法
		//pageContext.include("header.jsp");
		//pageContext可以获取其他内置对象getRequest，getSession
	%>
</body>
</html>
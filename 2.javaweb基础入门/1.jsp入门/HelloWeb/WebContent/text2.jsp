<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 程序脚本 -->
<% int i =1;%>
<%
 if(i>10){
	 out.println("i>10");
 }else{
	 out.println("i<=10");
 }
%>
<hr>
<%if(i>10){ %>
<span>i >10</span>
<%}else{ %>
<span>i<=10</span>
<%} %>
</body>
</html>
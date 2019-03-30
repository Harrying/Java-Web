<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
   body{
    text-align:center;
   }
</style>
</head>
<body>
<% int x =-5,y=0;%>
<%
 if(x<0){
	 y=-1;
 }else if(x==0){
	 y=0;
 }else{
	 y=1;
 }
%>
当x小于0时，输出;<br>
x=<%=x %><br>
y=<%=y %>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>求1-100数字的和</title>
</head>
<body>
<% int sum=0; %>
<%for(int i=1;i<=100;i++){
	sum=sum+i;
}%>
<%out.println("1-100数字的和为"+sum); %>

</body>
</html>
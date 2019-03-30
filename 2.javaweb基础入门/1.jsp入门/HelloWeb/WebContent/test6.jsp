<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%!
     public String getNow(){
	 SimpleDateFormat formatter=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
	 Date currentTime= new Date();
	 return formatter.format(currentTime);
 }
 %>
 <%=getNow() %>
</body>
</html>
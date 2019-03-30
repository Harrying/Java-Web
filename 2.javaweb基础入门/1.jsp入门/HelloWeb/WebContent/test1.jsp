<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
  String str ="hello world";
  String getStr(){
	  return "helloword";
  }
%>
<hr>
<%out.print(this.str);%>
<hr>
<%=this.getStr() %>
</body>
</html>
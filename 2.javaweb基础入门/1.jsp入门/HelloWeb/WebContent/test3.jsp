<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int totalCount =0;//成员变量 %>
<%
   int localCount=0;//局部变量
   totalCount++;
   localCount++;
%>
<%
    out.println(totalCount);
    out.println("<br>");
    out.println(localCount);
%>

</body>
</html>
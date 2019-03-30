<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<String> one= new ArrayList<String>();
	one.add("java基础入门");
	one.add("Servlet视频详解");
	one.add("El表达式初识");
	one.add("JSTL标签库初识");
%>
<%
  for(int i=0;i<one.size();i++){
	  out.print("第"+i+"条："+one.get(i));
	  out.print("<br/>");
  }
%>
<br/>

</body>
</html>
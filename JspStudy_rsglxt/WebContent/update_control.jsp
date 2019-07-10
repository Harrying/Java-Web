<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.whr.db.*,com.whr.bean.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
	  	Map<String,Emp> map =DBUtil.map;
		Emp emp = map.get(request.getParameter("account"));
		emp.setName(request.getParameter("name"));
		emp.setEmail(request.getParameter("email"));
	%>
	
	<% 
	response.sendRedirect("/JspStudy_rsglxt/control.jsp?account=101&password=123456");
	//request.getRequestDispatcher("control.jsp").forward(request, response);
	%>
	<h3 align="center">修改员工信息成功。</h3>
	
	
</body>
</html>
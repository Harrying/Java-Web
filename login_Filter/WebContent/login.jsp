<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- <html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html> -->
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	session.setAttribute("loginUser", username);
	response.sendRedirect(request.getContextPath()+"/message.jsp");
%>

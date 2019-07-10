<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String basePath = request.getScheme()+":"+"//"+request.getServerName()+":"+request.getServerPort()+"/"
	+request.getServletContext().getContextPath()+"/";
    //协议+ ：+ // + ip地址 + ： + 端口号 + / + 工程名路径 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>
	<center>
		<form action="<%=basePath%>LoginServlet" method="post">
			<p>用户名：<input type="text" name="username"></p>
			<p>密&nbsp;码：<input type="password" name="password"></p>
			<p>
				<input type="submit" value="登录">
				<input type="reset" value="重置">
			</p>
		</form>
	</center>
</body>
</html>
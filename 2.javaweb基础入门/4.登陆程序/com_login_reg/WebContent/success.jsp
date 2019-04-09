<%@page import="com.whr.domain.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录成功</title>
<link rel="stylesheet" href="./css/login.css">
</head>
<body>
	<%
		if(session.getAttribute("user")!=null){
			User user = (User)session.getAttribute("user");
			System.out.println(user.getPath());
			// 获得绝对路径最后一个\的位置
			int idx = user.getPath().lastIndexOf("\\");
			// 获得文件上传的唯一文件名：
			String fileName = user.getPath().substring(idx+1);
	%>
	<div class="login">
		<div class="header">
			<h1>登录成功</h1>
		</div>
		<div class="content">
			<table align="center">
				<tr>
					<td align="center"><img src="/com_login_reg/upload/<%= fileName %>" /></td>
				</tr>
				<tr>
					<td align="center">欢迎<%= user.getNickname() %>，登录成功！</td>
				</tr>
			</table>

		</div>
	</div>	
	<%			
		}else{
	%>
	<div class="login">
		<div class="header">
			<h1>您还没有登录！请先去<a href="/reg_login/login.jsp">登录</a>！</h1>
		</div>
	</div>
	<%		
		}
	%>


</body>
</html>
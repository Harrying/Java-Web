<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>人事管理系统</title>
</head>
<body>
	page的基本信息：<%= this.getServletInfo() %>
	
	<%
		//request.setAttribute("name", "imooc");
		//request.getRequestDispatcher("result.jsp").forward(request, response);
	%>
	<h3 align="center">人事管理系统登陆页面</h3>
	<hr>
	
	<form action="control.jsp" >
		<table align="center">
			<tr>
				<td>账号：</td>
				<td><input type="text" name="account"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="登陆"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
			
		</table>
	</form>
</body>
</html>
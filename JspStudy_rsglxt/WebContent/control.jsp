<%@page import="javax.xml.ws.Response"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" errorPage="error.jsp"
    pageEncoding="UTF-8"%>
<%@page import="com.whr.db.*,com.whr.bean.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>响应的字符编码集<%out.println(response.getCharacterEncoding()); %></h3>
	<!-- 获取账号和密码 -->
	<% 
		String account = request.getParameter("account");
	
		String password = request.getParameter("password");
		
		Emp emp = new Emp(account,null,password,null);
		
		Boolean flag = DBUtil.selectEmpByAccountAngPassword(emp);
		
		Map<String,Emp> map =DBUtil.map;
		if(flag==true){
			Object o = application.getAttribute("count");
			if(o == null){
				application.setAttribute("count", 1);
			}else {
				int count = Integer.parseInt(o.toString());
				application.setAttribute("count", count + 1);
			}
			session.setAttribute("account", account);
	 %>
	  	<h3 align="right">访问量：<%= application.getAttribute("count") %></h3>
	 	<h3 align="right">登陆账户：<%=session.getAttribute("account") %></h3>
	 
		<h3 align="center">欢迎来到人事管理系统的首页</h3>
		<hr>
		<table align="center" border="1" width="500px">
			<tr>
				<td>账号：</td>
				<td>姓名：</td>
				<td>邮箱：</td>
				<td>修改：</td>
			</tr>
			<%
				for(String key:map.keySet()){
					Emp e = map.get(key);
					%>
						<tr>
							<td>
								<%= e.getAccount() %>
							</td>
							<td>
								<%= e.getName() %>
							</td>
							<td>
								<%= e.getEmail() %>
							</td>
							<td>
							<a href="update.jsp?account=<%= e.getAccount() %>
							&name=<%= e.getName() %>&email=<%= e.getEmail() %>">修改</a>
							</td>
						<tr>
					<%
				}
			
			%>
		</table>
	<% 
		 }else{
			 //out.println("用户名密码错误");
			 throw new Exception("用户名密码错误");
		 }
	 %>
</body>
</html>
package cn.java.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取表单的数据 
		//getParameter()获取请求参数信息 返回一个字符串
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(username +"  " + password);
		
		if(username.equals("admin")&&password.equals("123")) {
			//转发实现跳转
			request.getRequestDispatcher("/success.jsp").forward(request, response);;
		}else {
			//request.getRequestDispatcher("/fail.jsp").forward(request, response);;
			//重定向跳转  需要写工程名
			response.sendRedirect("/Imooc_servlet/fail.jsp");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}
}

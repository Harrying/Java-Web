package cn.java.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo4Servlet extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//转发带数据给某个jsp页面
		/*
		 * request.setAttribute("username", "王二麻子");
		 * request.getRequestDispatcher("/demo.jsp").forward(request, response);
		 */
		//重定向带数据
		ServletContext context = request.getServletContext();
		context.setAttribute("goods", "娃娃");
		response.sendRedirect("/Imooc_servlet/demo.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

package cn.java.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ServletContext对象：表示整个javaWeb工程
 * ServletConfig对象：表示某一个servlet中的配置文件
 */
public class Demo1Servlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取代表某一个JavaWeb工程的ServletContext对象
		//Context对象是一个域对象，可以往某一个域对象中存放数据  并且可以取出其存放的数据
		ServletContext context = this.getServletContext();
		//往context对象中存放数据
		context.setAttribute("username", "张三");
		//取出context对象中的数据
		Object result = context.getAttribute("username");
		System.out.println("result" + result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

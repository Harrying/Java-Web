package cn.java.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LifeServlet")
public class LifeServlet extends HttpServlet {
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		//Servlet第一次请求被调用
		System.out.println("Servlet的init（）方法");
	}	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//servlet每次请求都被调用
		System.out.println("Servlet被请求了");
	}

	@Override
	public void destroy() {
		//当Servle被销毁时调用
		System.out.println("Servlet被销毁");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

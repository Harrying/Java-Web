package com.whr.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.whr.bean.User;

/**
 * 用户登录
 */
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接收数据
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		//从ServletContext拿到保存用户信息的集合
		List<User> list = (List<User>) this.getServletContext().getAttribute("list");
		for (User user : list) {
			//判断用户名是否正确
			if(name.equals(user.getName())) {
				//用户名正确
				if(password.equals(user.getPassword())) {
					//密码正确
					//将用户信息保存
					//完场记住用户名的功能
					String remember = request.getParameter("remember");
					if(remember.equals("true")) {
						
						Cookie cookie = new Cookie("username", user.getName());
						//设置有效路径和有效时间
						cookie.setPath("/reg_login_mvc");
						//设置有效时间
						cookie.setMaxAge(60*60*24);//保存24小时
						
						response.addCookie(cookie);
					}
					
					
					request.getSession().setAttribute("user", user);
					response.sendRedirect("/reg_login_mvc/success.jsp");
					return;
				}
			}
		}
		
		//登陆失败
		request.setAttribute("msg", "用户名或密码错误");
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

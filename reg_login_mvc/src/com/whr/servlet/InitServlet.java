package com.whr.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.whr.bean.User;

/**
 * 用户注册初始化的Servlet
 */
public class InitServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		List<User> list = new ArrayList<User>();
		
		this.getServletContext().setAttribute("list", list);
	}
}

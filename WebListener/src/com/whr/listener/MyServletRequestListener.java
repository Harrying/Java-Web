package com.whr.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class MyServletRequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request listener,requrat Destroyed...");
		
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
		
		String path = request.getRequestURI();//请求资源路径
		String par = request.getParameter("par");
		
		System.out.println("requestLintener 请求资源路径:" + path +"   " + "请求参数" + par);
	}	

}

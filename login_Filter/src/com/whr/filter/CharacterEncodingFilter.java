package com.whr.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter{
	private FilterConfig config;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("characterEncodingFilter destory....");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		/*
		 * System.out.println("characterEncodingFilter doFilter....");
		 * 
		 * String systemName = config.getInitParameter("systemName"); 
		 * String version = config.getInitParameter("version");
		 * System.out.println("systemName:"+systemName);
		 * System.out.println("version:"+version);
		 */
		request.setCharacterEncoding(config.getInitParameter("charset"));
		response.setCharacterEncoding(config.getInitParameter("charset"));
		
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("characterEncodingFilter init....");
		
		this.config = config;
	}

	public FilterConfig getConfig() {
		return config;
	}

	public void setConfig(FilterConfig config) {
		this.config = config;
	}

	
	
	
}

package com.whr.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class SessionFilter
 */
@WebFilter("/main.jsp")
public class SessionFilter implements Filter {

    
    public SessionFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest hrequest = (HttpServletRequest) request;
		HttpServletResponse hesponse = (HttpServletResponse) response;
		
		String loginUser = (String)hrequest.getSession().getAttribute("loginUser");
		if(loginUser == null) {
			hesponse.sendRedirect(hrequest.getContextPath()+"/index.jsp?flag=1");
			return;
		}else {
			chain.doFilter(request, response);
			return;
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}

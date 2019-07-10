package com.whr.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.whr.cache.LoginCache;

public class LoginSessionListener implements HttpSessionAttributeListener {
	
	private static final String LOGIN_USER ="loginUser";
	@Override
	public void attributeAdded(HttpSessionBindingEvent hsbe) {
		String attrName = hsbe.getName();//获取session名
		
		if(LOGIN_USER.equals(attrName)) {
			String attVal = (String) hsbe.getValue();//登录名
			HttpSession session = hsbe.getSession();
			String sessionId = session.getId();
			
			String SessionId2 = LoginCache.getInstance().getSessionIdByUsername(attVal);
			if(SessionId2 == null) {
				
			}else {
				HttpSession session2 = LoginCache.getInstance().getSessionBySessionId(SessionId2);
				session2.invalidate();//清除第一次的session信息
			}
			
			LoginCache.getInstance().setSessionIdByUsername(attVal, sessionId);
			LoginCache.getInstance().setSessionBySessionId(sessionId, session);
		}
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent hsbe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent hsbe) {
		// TODO Auto-generated method stub
		
	}

	

}

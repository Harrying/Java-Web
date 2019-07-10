package com.whr.listener;

import java.util.Date;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent hse) {
		String sessionId = hse.getSession().getId();
		Date creatTime = new Date(hse.getSession().getCreationTime());
		
		System.out.println("Created_sessionId:" + sessionId + " " + "creatTime" + creatTime);
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent hse) {
		// TODO Auto-generated method stub
		String sessionId = hse.getSession().getId();
		
		System.out.println("Destroyed_sessionId:" + sessionId);
	}

}

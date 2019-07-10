package com.whr.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListener implements ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent scae) {
		System.out.println("ServletContext#attAdded#name:" + scae.getName() + "  " + "#value" + scae.getValue());

	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent scae) {
		// TODO Auto-generated method stub
		System.out.println("ServletContext#attRemoved#name:" + scae.getName() + "  " + "#value" + scae.getValue());

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent scae) {
		// TODO Auto-generated method stub
		System.out.println("ServletContext#attRemoved#name:" + scae.getName() + "  " + "#value" + scae.getValue());

	}

}

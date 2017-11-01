package org.mysample.utilities;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyappApplicationContext implements ApplicationContextAware{
	
	private static ApplicationContext context;
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		MyappApplicationContext.context = context;
	}
	
	public static ApplicationContext getApplicationContext() {
		return context;
	}

}

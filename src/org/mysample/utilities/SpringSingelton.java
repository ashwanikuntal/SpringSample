package org.mysample.utilities;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSingelton {
	
	private static SpringSingelton instance;
	private static ApplicationContext appContext;
	
	private SpringSingelton() { 
		setAppContext(new ClassPathXmlApplicationContext("SpringContext.xml"));
	}

	public static SpringSingelton getInstance() {
		if(instance == null) {
			synchronized (SpringSingelton.class) {
				if(instance == null)
					instance = new SpringSingelton();
			}
		}
		return instance;
	}

	public ApplicationContext getAppContext() {
		return appContext;
	}

	public static void setAppContext(ApplicationContext appContext) {
		SpringSingelton.appContext = appContext;
	}
	

}

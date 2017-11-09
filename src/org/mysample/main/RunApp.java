package org.mysample.main;

import org.mysample.beans.Vehicle;
import org.mysample.utilities.SpringSingelton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {
	
	static ApplicationContext appContext;
	static {
		appContext = SpringSingelton.getInstance().getAppContext();
	}
	
	public static void main(String[] args) {
		
		SpringSingelton.getInstance();
		Vehicle veh = (Vehicle) appContext.getBean("car");
		veh.drive();
		
		((ClassPathXmlApplicationContext) appContext).close();
	}
}

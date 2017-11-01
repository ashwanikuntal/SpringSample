package org.mysample.main;

import org.mysample.beans.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringContext.xml");
		Vehicle veh = (Vehicle) appContext.getBean("car");
		veh.drive();
		
		((ClassPathXmlApplicationContext) appContext).close();
	}
}

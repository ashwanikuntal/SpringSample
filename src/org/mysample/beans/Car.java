package org.mysample.beans;

import org.mysample.utilities.MyappApplicationContext;
import org.springframework.context.ApplicationContext;

public class Car implements Vehicle {	
	
	@Override
	public void drive() {
		System.out.println("Driving Car");
		ApplicationContext appcontext = MyappApplicationContext.getApplicationContext();
		Vehicle veh = (Vehicle) appcontext.getBean("motorbike");
		veh.drive();
	}
}

package org.mysample.beans;

public class Car implements Vehicle {	
	
	@Override
	public void drive() {
		System.out.println("Driving Car");
		/*ApplicationContext appcontext = MyappApplicationContext.getApplicationContext();
		Vehicle veh = (Vehicle) appcontext.getBean("motorbike");
		veh.drive();*/
	}
}

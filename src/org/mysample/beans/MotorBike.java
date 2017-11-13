package org.mysample.beans;

public class MotorBike implements Vehicle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void drive() {
		System.out.println("Driving " + getName());
	}
}

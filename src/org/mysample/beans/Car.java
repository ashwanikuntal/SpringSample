package org.mysample.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car implements Vehicle {	
	
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
	
	@PostConstruct
	public void init() {
		System.out.println("Previously Driving HONDA");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Will Drive PORCHE");
	}

}

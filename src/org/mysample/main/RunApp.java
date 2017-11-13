package org.mysample.main;

import java.util.List;

import org.mysample.beans.Student;
import org.mysample.beans.Vehicle;
import org.mysample.dao.StudentDAOImpl;
import org.mysample.utilities.SpringSingelton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class RunApp {
	
	static ApplicationContext appContext;
	static {
		appContext = SpringSingelton.getInstance().getAppContext();
	}
	
	public static void main(String[] args) {
		
		SpringSingelton.getInstance();
		Vehicle veh = (Vehicle) appContext.getBean("car");
		veh.drive();
		
		StudentDAOImpl studentDaoImpl = (StudentDAOImpl) appContext.getBean("studentDAO");
		
		System.out.println();
		System.out.println("------Records Creation--------" );
		studentDaoImpl.create("Zara", 11);
		studentDaoImpl.create("Nuha", 2);
		studentDaoImpl.create("Ayan", 15);
		
		System.out.println();
		System.out.println("------Listing Multiple Records--------" );
		List<Student> students = studentDaoImpl.listStudents();
		
		for (Student record : students) {
			System.out.print("ID : " + record.getId() );
			System.out.print(", Name : " + record.getName() );
			System.out.println(", Age : " + record.getAge());
		}
		
		System.out.println();
		System.out.println("------Display Single Record--------" );
		Student student = studentDaoImpl.getStudent(1);
		System.out.println("Row Fetched is : " + student.getName() + " : " + student.getAge());
		
		((AbstractApplicationContext) appContext).registerShutdownHook();
	}
}

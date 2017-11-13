package org.mysample.dao;

import java.util.List;

import org.mysample.beans.Student;

public interface StudentDAO {
	
	public void create(String name, Integer age);
	public Student getStudent(Integer id);
	public List<Student> listStudents();

}

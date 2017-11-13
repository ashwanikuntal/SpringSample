package org.mysample.dao;

import java.util.List;

import org.mysample.beans.Student;
import org.mysample.services.StudentMapper;
import org.mysample.utilities.SpringJDBCTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private SpringJDBCTemplate connection;
	
	public SpringJDBCTemplate getConnection() {
		return connection;
	}

	public void setConnection(SpringJDBCTemplate connection) {
		this.connection = connection;
	}
	
	@Override
	public void create(String name, Integer age) {
		String SQL = "insert into Student (name, age) values (?, ?)";
		connection.getJdbcTemplateObject().update( SQL, name, age);
		System.out.println("Created Record Name = " + name + " Age = " + age);
		return;
	}

	@Override
	public Student getStudent(Integer id) {
		String SQL = "select * from Student where id = " + id;
		Student student = connection.getJdbcTemplateObject().queryForObject(SQL, new StudentMapper());
		return student;
	}

	@Override
	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List <Student> students = connection.getJdbcTemplateObject().query(SQL, new StudentMapper());
	    return students;
	}

}

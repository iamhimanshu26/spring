package com.springJDBC.P1.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springJDBC.P1.Entiry.Student;

// This implementation class will have the implementation of the methods written in the interface StudentDao.
// And this impl class will required to jdbcTemplate object for the operation which means this class has a dependency
// of JdbcTemplate Class which we need to configure in our config file.
@Component("impl")  // Using the autowiring , and naming the object same as before.
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		// Inserting the query- We will required the JdbcTemplate obj to perfrom the insertion.
		String query= "insert into student(Id,name,city) value(?,?,?)";
		int insertedData = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		// This process is same as the passing the values from the main method but here we are using the getter method to pass
		// the values dynamically.
		return insertedData;
	}

	@Override
	public int update(Student student) {
		// Updating the data with query.
		String query="update student set name=?, city=? where id=?";
		int updatedData = this.jdbcTemplate.update(query, student.getName(), student.getCity() , student.getId()); 
		return updatedData;
	}

	@Override
	public int delete(Student student) {
		// Deleting the data with query.
		String query="delete from student where id=?";
		int DeletedData = this.jdbcTemplate.update(query, student.getId()); 
		return DeletedData;
	}
	
	@Override
	public Student getStudent(int studentId) {
		// Selecting single student data
		String query="select * from student where id=?";
		RowMapper<Student>  rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId); 
		return student ;
	}

	@Override
	public List<Student> getAllStudents() {
		// Selecting multiple data/object/rows of table
		String query="select * from student";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> students = this.jdbcTemplate.query(query, rowMapper);
		return students;
	}

}

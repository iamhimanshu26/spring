package com.springJDBC.P1.DAO;

import java.util.List;

import com.springJDBC.P1.Entiry.Student;

// Here in this interface , all the methods required to perform the operation to the db will be note down.
// All the methods present here will be abstract with no body like insertion, update, delete, create methods;
// These methods will take the student parameter and then will perform the operations.
public interface StudentDao {
	
	public int insert(Student student);
	
	// This method will take the newName or newCity to update or even both as the parameter.
	public int update(Student student);
	
	public int delete(Student student);
	
	public Student getStudent(int studentId);
	
	public List<Student> getAllStudents();
	


}

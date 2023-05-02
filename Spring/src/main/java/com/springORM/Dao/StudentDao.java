package com.springORM.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springORM.Entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemp;
	
	@Transactional                              // We are passing some value so we need this
	public int insert(Student student) {
		// Inserting the student columns in database.
		Integer i = (Integer) this.hibernateTemp.save(student);
		return i;
	}
	
	// Fetching the student single detail/object with the help of studentID;
	public Student getStudent(int studentId) {
		Student student= this.hibernateTemp.get(Student.class, studentId);
		return student;
	}
	
	// Get all the students(all rows)
	public List<Student> getAllStudents(){
		List<Student> students= this.hibernateTemp.loadAll(Student.class);
		return students;
	}
	
	// Deleting the data/rows   
	@Transactional                                 // We are passing some value so we need this
	public void deleteStudent(int studentId) {
		Student student= this.hibernateTemp.get(Student.class, studentId);
		this.hibernateTemp.delete(student);
	}
	
	// Update the data
	@Transactional                               // We are passing some value so we need this
	public void updateStudent(Student student) {
		this.hibernateTemp.update(student);
	}

	public HibernateTemplate getHibernateTemp() {
		return hibernateTemp;
	}

	public void setHibernateTemp(HibernateTemplate hibernateTemp) {
		this.hibernateTemp = hibernateTemp;
	}
	
}

package com.springORM.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details") // Can change the name in the db directly from here.
public class Student {
	
	@Id                         // to make this column as primary key.
	@Column(name="student_id")  // similarly can change the column name directly from here for each column with this anno.
	private int id;
	
	@Column(name="student_name") 
	private String name;
	
	@Column(name="student_city") 
	private String City;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", City=" + City + "]";
	}

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		City = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}

package com.springJDBC.P1.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springJDBC.P1.Entiry.Student;

public class RowMapperImpl implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student= new Student();
		student.setId(rs.getInt(1));     // row number of Id is 1 in student table.
		student.setName(rs.getString(2));  // row number of name is 2 in student table.
		student.setCity(rs.getString(3));  // row number of city is 3 in student table.
		return student;
	}

}

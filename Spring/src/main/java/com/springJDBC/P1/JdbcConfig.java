package com.springJDBC.P1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springJDBC.P1.DAO.StudentDaoImpl;

// With the help of this configuration class, we don't need to use xml file anymore.
// Doing the same operations with the help of annotations.
// With this , we need to create a bean methods for DataSource, JdbcTemplate and StduentDaoImpl class which are defined
// in the P1Config.xml file
// After this we will use the AnnotationConfigApplicationContext to get the bean. 

@Configuration
@ComponentScan(basePackages = {"com.springJDBC.P1"})
public class JdbcConfig {
	
	@Bean(name= { "dataSource"})
	public DriverManagerDataSource getDataSoruce() {
		DriverManagerDataSource datasource= new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		datasource.setUsername("root");
		datasource.setPassword("root");
		return datasource;
		
	}
	
	@Bean(name = {"jdbcTemplate"})
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate template= new JdbcTemplate();
		template.setDataSource(getDataSoruce());
		return template;
	}
	
	// Commenting this since we are doing the operation with aurtowiring.
//	@Bean(name={"impl"})
//	public StudentDaoImpl getStudentDaoImpl() {
//		StudentDaoImpl stduentDao= new StudentDaoImpl();
//		stduentDao.setJdbcTemplate(getJdbcTemplate());
//		return stduentDao;
//	}

}

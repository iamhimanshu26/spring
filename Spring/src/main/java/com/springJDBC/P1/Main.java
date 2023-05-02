package com.springJDBC.P1;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springJDBC.P1.DAO.StudentDaoImpl;
import com.springJDBC.P1.Entiry.Student;

// First we need to create the dataSource object and its bean.
// Then we need to have the info of jdbcTemplate class in which we will inject the dataSource object through autowiring.
// Normally how we create and insert data in the mysql table is written below.
public class Main {

	public static void main(String[] args) {
		System.out.println("My program started using jdbc");
		Scanner sc= new Scanner(System.in);
		// section six- Commenting this line since we are not using xml file.
//		ApplicationContext context= new ClassPathXmlApplicationContext("com/springJDBC/P1/P1Config.xml");
//		JdbcTemplate s1= context.getBean("jdbcTemplate",JdbcTemplate.class);
		
		
		// First section-
		// This first comment section is done before using the DAO layer/Package using the above s1 line .
		//------------------------------------------------------------------------------------------
//		// Now we can insert the data into database with the help of jdbcTemplate object s1.
//		// Inserting the query-
//		String query= "insert into student(Id,name,city) value(?,?,?)";
		
//		// Fire the query-
////		int result= s1.update(query,2,"Sujit Kumar","Ghaziabad");
////		int result2= s1.update(query,3,"Ajay Kumar","Ghaziabad");
////		int result3= s1.update(query,4,"Rohan","Ghaziabad");
//		int result4= s1.update(query,5,"Raman","Bameta");

//		// Firing the query means mapping these values with the respected columns of the tables in the database.
		
//		System.out.println("No of record inserted " + result4 );

		
		
		
	// Second section-- Inserting the values using DAO class
		// Now we don't even need JdbcTemplate object to insert, we just need StudentDaoIpml obj which has the dependency
		// of jdbcTemplate and then the jdbcTemplate has the dependency of dataSoruce.
//		StudentDaoImpl s1Enrty = context.getBean("impl",StudentDaoImpl.class);
		Student student= new Student();
//		student.setId(6);
//		student.setName("Kamal Singh");
//		student.setCity("Govindpuram");
		
//		int r = s1Enrty.insert(student);
//		System.out.println("Student entry inserted as "+ r);
		
		
//		mysql> select * from student;
//		+----+-----------------+-------------+
//		| Id | name            | city        |
//		+----+-----------------+-------------+
//		|  1 | Himanshu Sharma | Ghaziabad   |
//		|  2 | Sujit Kumar     | Ghaziabad   |
//		|  3 | Ajay Kumar      | Ghaziabad   |
//		|  4 | Rohan           | Ghaziabad   |
//		|  5 | Raman           | Bameta      |
//		|  6 | Kamal Singh     | Govindpuram |
//		+----+-----------------+-------------+
//		6 rows in set (0.00 sec)
		
		
		
		
	// Third section-- updating the data.
	
//		student.setId(3);
//		student.setName("Rahul Jacker");   // New updated name 
//		student.setCity("Bangalore");      // New updated city
//		
//		int r2= s1Enrty.update(student); 
//		System.out.println("Updated data is "+ r2);
		
//		mysql> select * from student;
//		+----+-----------------+-------------+
//		| Id | name            | city        |
//		+----+-----------------+-------------+
//		|  1 | Himanshu Sharma | Ghaziabad   |
//		|  2 | Sujit Kumar     | Ghaziabad   |
//		|  3 | Rahul Jacker    | Bangalore   |
//		|  4 | Rohan           | Ghaziabad   |
//		|  5 | Raman           | Bameta      |
//		|  6 | Kamal Singh     | Govindpuram |
//		+----+-----------------+-------------+
//		6 rows in set (0.00 sec)
		
		
		
	// fourth section-- Deleting the data.
//		student.setId(6);
//		int r3 = s1Enrty.delete(student);
//		System.out.println("Deleted data is "+ r3); 
		
//		mysql> select * from student;
//		+----+-----------------+-------------+
//		| Id | name            | city        |
//		+----+-----------------+-------------+
//		|  1 | Himanshu Sharma | Ghaziabad   |
//		|  2 | Sujit Kumar     | Ghaziabad   |
//		|  3 | Rahul Jacker    | Bangalore   |
//		|  4 | Rohan           | Ghaziabad   |
//		|  5 | Raman           | Bameta      ||
//		+----+-----------------+-------------+
//		6 rows in set (0.00 sec)
		
//		student.setId(6);
//		student.setName("Markaram");
//		student.setCity("Capetown");
//		
//		int r4 = s1Enrty.insert(student);
//		System.out.println("Data inserted "+ r4  );
		
//		mysql> select * from student;
//		+----+-----------------+-----------+
//		| Id | name            | city      |
//		+----+-----------------+-----------+
//		|  1 | Himanshu Sharma | Ghaziabad |
//		|  2 | Sujit Kumar     | Ghaziabad |
//		|  4 | Rohan           | Ghaziabad |
//		|  5 | Raman           | Bameta    |
//		|  6 | Markaram        | Capetown  |
//		+----+-----------------+-----------+
//		5 rows in set (0.00 sec)
		
		
		
 //     Getting the single object with studentId
//		Student student2 = s1Enrty.getStudent(10);
//		Student student2 = s1Enrty.getStudent(1);
//		System.out.println(student2);
		
		// getting the multiple objects 
//		List<Student> students = s1Enrty.getAllStudents(); 
//		System.out.println(students);
		
		// Without using XML file-
		ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDaoImpl s1Enrty = context.getBean("impl",StudentDaoImpl.class);
		List<Student> students = s1Enrty.getAllStudents(); 
		System.out.println(students);
		

	}

}



 
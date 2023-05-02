package com.springORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springORM.Dao.StudentDao;
import com.springORM.Entities.Student;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("com/springORM/ORMConfig.xml");
		StudentDao bean = context.getBean("studentDao", StudentDao.class);
//		Student student= new Student(1,"Amit","Kerala");
//		int insertVal= bean.insert(student);
//		System.out.println("Inserted row is "+ insertVal);
		
		
		// To get the data from user, we'll be using BufferReader.
//		Scanner sc= new Scanner(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Boolean isValue= true;
		
		while(isValue) {
			System.out.println("Press 1 for adding new student");
			System.out.println("Press 2 for displaying all students");
			System.out.println("Press 3 for getting single student");
			System.out.println("Press 4 for deleting student");
			System.out.println("Press 5 for updating the existing student");
			System.out.println("Press 6 to exit");
			
			try {
//				int input= Integer.parseInt(sc.nextLine());
				int input = Integer.parseInt(br.readLine());
				switch(input) {
				case 1: 
					// Adding the new student detail.
					System.out.println("Enter the id: ");
					int id= Integer.parseInt(br.readLine());
					
					System.out.println("Enter the name: ");
					String name= br.readLine();
					
					System.out.println("Enter the city: ");
					String city= br.readLine();
					
					Student student1= new Student();
					student1.setId(id);
					student1.setName(name);
					student1.setCity(city);
					
					int insertVal = bean.insert(student1);
					System.out.println("Student with Id:"+ insertVal + " is added.");
					System.out.println("***********************************");
					System.out.println(" ");
					break;
				
				case 2: 
					// Showing the all students details.
					System.out.println("***********************************");
					List<Student> allStudents = bean.getAllStudents();
					for (Student student2 : allStudents) {
						System.out.println("Id: "+ student2.getId());
						System.out.println("Name: "+ student2.getName());
						System.out.println("City: "+ student2.getCity());
						System.out.println("------------------------------------");
					}
					System.out.println("***********************************");
					break;
					
				case 3: 
					// Showing a single detail/row of student.
					System.out.println("Enter the Student id: ");
					int stuId=Integer.parseInt(br.readLine());
					Student student = bean.getStudent(stuId);
					System.out.println("Id: "+ student.getId());
					System.out.println("Name: "+ student.getName());
					System.out.println("City: "+ student.getCity());
					System.out.println("------------------------------------");
//					isValue=false;
					break;	
					
				case 4: 
					// Deleting the existing student.
					System.out.println("Enter the Student id: ");
					int delId=Integer.parseInt(br.readLine());
					bean.deleteStudent(delId);
					System.out.println("Student with student Id:"+delId+ " is deleted.");
					break;
					
				case 5: 
					// Updating the existing student. 
					System.out.println("Enter the Student Id: ");
					int updId= Integer.parseInt(br.readLine());
					
					System.out.println("Press 1 for updating the name");
					System.out.println("Press 2 for update the city\n");
					int choice= Integer.parseInt(br.readLine());
					
					Student stud= bean.getStudent(updId);
					String updName= stud.getName();
					String updCity= stud.getCity();
					
					switch(choice) {
					case 1: 
						// updating the name
						System.out.println("Enter the name: ");
						updName= br.readLine();
						stud= new Student(updId, updName, updCity);
						System.out.println("Name updated successfully.");
						break;
					
					case 2:	
						// updating the city
						System.out.println("Enter the city: ");
						updCity= br.readLine();
						stud= new Student(updId, updName, updCity);
						System.out.println("City updated successfully.");
						break;	
					}
					
					bean.updateStudent(stud);
					System.out.println("Details have been updated successfully.");
					break;
				
				case 6: 
					// Exit
					isValue=false;
					break;	
				}
			}
			catch (Exception e) {
				System.out.println("Invalid Input , please try again with some other value");
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("Thank you, See you soon.");
	}

}

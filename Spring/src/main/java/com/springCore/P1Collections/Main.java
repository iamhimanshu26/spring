package com.springCore.P1Collections;

// Spring IOC can do the dependency injection in three ways-
// Injection through Collection values.
// Injection through Reference object.
// Injection through setter and getter & constructor injection with the constructor tag.

//1- Injection through setter & getter methods.

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springCore/P1Collections/collectionConfig.xml");
		Employee employee1= (Employee) context.getBean("Employee1");
		System.out.println(employee1);
		System.out.println(employee1.getName());
		System.out.println(employee1.getPhones());
		System.out.println(employee1.getAddresses());
		System.out.println(employee1.getCourses());


	}

}

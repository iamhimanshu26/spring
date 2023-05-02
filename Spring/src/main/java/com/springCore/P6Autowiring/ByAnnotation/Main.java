package com.springCore.P6Autowiring.ByAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/P6Autowiring/ByAnnotation/AnnoConfig.xml");
        Employee emp1= context.getBean("Emp1", Employee.class);
        System.out.println(emp1);
	}

}

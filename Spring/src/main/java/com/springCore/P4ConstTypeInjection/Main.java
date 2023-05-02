package com.springCore.P4ConstTypeInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 3 - Injection of bean and its value using only constructor with the constructor-arg tag in the config file.
public class Main {

	public static void main(String[] args) {
		 ApplicationContext context= new ClassPathXmlApplicationContext("com/springCore/P4ConstTypeInjection/ConstTypeConfig.xml");
		 Person person= (Person) context.getBean("person");
		 System.out.println(person);
	}

}

package com.springCore.PJavaConfig.Part1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		// Normally here we were using ApplicationContext' implementation class name ClassPathXmlApplicationContext which 
		// is doing class-path based configuration. Means taking the path of the config file to search it.
		// ApplicationContext context= new ClassPathXmlApplicationContext("");
		
		// But now we are not using XML file anymore, so we now need a new implementation of ApplicationContext which can do 
		// annotation based configuration. So the new class will be AnnotationConfigApplicationContext() and here we
		// will simply pass the java config class name.
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Sample s= context.getBean("sample1", Sample.class);
//		System.out.println(s);
//		s.print();
		
		// Commenting out the previous 3 lines after removing the @Component annotation.
		// Now we are not using @Component annotation to create the bean os Sample-Class, so we just need to pass 
		// the method name when calling through context. We do not need a object name anymore.
		Sample s= context.getBean("getSampleObj", Sample.class);
		System.out.println(s);
		s.print();
		

	}

}

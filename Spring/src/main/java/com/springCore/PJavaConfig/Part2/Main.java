package com.springCore.PJavaConfig.Part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Sample s= context.getBean("sample1", Sample.class);
//		System.out.println(s);
//		s.print();
		
		// Commenting out the previous 3 lines after removing the @Component annotation.
		// Now we are not using @Component annotation to create the bean os Sample-Class, so we just need to pass 
		// the method name when calling through context. We do not need a object name anymore.
		//Sample s= context.getBean("getSampleObj", Sample.class);
		
		// calling the bean with object name- sample
		Sample s= context.getBean("sample", Sample.class);
		System.out.println(s);
		s.print();
		

	}

}

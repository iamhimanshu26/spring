package com.springCore.P8BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// There is basically four scope to define our bean.
// 1- SingleTon - Means creating the object once and providing its reference whenever it's called. By default, every object 
// we have created thus so far is singleTon in nature.

// 2- Prototype - Means creating the object everytime whenever it's called. Takes more memory.
// Can be done in two ways using annotation or using in XML .
// A- Using XML config , <bean class=" " name=" " scope=" "/>. Here we can write which kind of bean(SingleTon, Prototype, Request, Session) 
// we want to create.
// B- Using annotation- Simply put @Scope("TypeName") below the @Component annotation.

// 3- Request scope - Means creating the bean through HTTP call per cycle.
// 4- Session - Means creating the bean once and using it throughout the web application session. 
public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springCore/P8BeanScope/SAConfig.xml");
		Student student=context.getBean("student", Student.class);
		
		// Ex of SingleTon bean-
	//	System.out.println(student.hashCode());  // created bean and hascode is 243194708
		
		Student student1=context.getBean("student", Student.class);
		//System.out.println(student1.hashCode());  // // created bean and hascode is 243194708, same as student object.
		// This means it doesn't matter how many we call the object, the container will give the same reference of the 
		// bean created through first call. To get the new bean everytime we call, we use Scope Bean.
		
		// After using the @Scope("prototype") -
//		System.out.println(student.hashCode());  // bean hascode is 1229202732.
//		System.out.println(student1.hashCode());   // bean hascode is 1932274274.
		
		// Just to check the bean created by container for teacher class for multiple calling--
		Teacher t1= context.getBean("teacher", Teacher.class);
		Teacher t2= context.getBean("teacher", Teacher.class);

		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

		

	}

}


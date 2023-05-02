package com.springCore.P7StereotypeAnno.P1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Just by adding @Component annotation to the class which we want the IOC container to create the object.
// We need to define the package name wiht the context-componenet tag to enable to annotations in the config.
// To set the values , we simply need @Value annotation to pass the value.
public class TestMain {

	public static void main(String[] args) {
		ApplicationContext context= 
				new ClassPathXmlApplicationContext("com/springCore/P7StereotypeAnno/P1/SAConfig.xml");
		// Cannot use the same object even within different packages. 
		Student student=context.getBean("ob", Student.class);
		System.out.println(student);
	}

}

// Annotation used here-
//1- @Component - To tell the container that this class object needs to be created. Or simply to create the object.
//2- @Value("paramater value")- To pass the values in the fields.
//3- @Component("ObjectName") - to explicitely tell the container to create the object with the name of object pass here. 


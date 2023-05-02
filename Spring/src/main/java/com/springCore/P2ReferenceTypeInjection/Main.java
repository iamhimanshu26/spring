package com.springCore.P2ReferenceTypeInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//2- Injection the objects and its values thorugh reference of one object/bean class into another bean in the config file
public class Main {

	public static void main(String[] args) {
		// Fully qualified name of the config file present in the package.
		// /SpringCore/src/main/java/com/springCore/P2ReferenceTypeInjection/RefTypeConfig.xml
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springCore/P2ReferenceTypeInjection/RefTypeConfig.xml");
		AClass a= (AClass) context.getBean("Aref");
		System.out.println(a);
		
		System.out.println(a.getX());
		// we can call the method present in the BClass from the AClass as well.
		System.out.println(a.getbObject().getY());
		
	}

}

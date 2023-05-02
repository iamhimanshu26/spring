package com.springCore.P1Collections.StandAloneCollec;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springCore/P1Collections/StandAloneCollec/AloneConfig.xml");
		Person person1= (Person) context.getBean("person1");
		
        System.out.println("------------------Friends--------------------");
		System.out.println(person1.getFriends());
        System.out.println(person1.getFriends().getClass());    // To get the name of the Class 
        
        System.out.println(" ");
        System.out.println("------------------Fee Structure-------------------");
        System.out.println(person1.getFeeStruc());
        System.out.println(person1.getFeeStruc().getClass());
        
        System.out.println(" ");
        System.out.println("------------------Properties--------------------");
        System.out.println(person1.getProps());
        System.out.println(person1.getProps().getClass());
        
        System.out.println(" ");
        System.out.println("------------Final Output--------------");
		System.out.println(person1);



	}

}

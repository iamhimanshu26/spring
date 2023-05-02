package com.springCore.P0FirstProg;

import java.awt.Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
//steps to follow-
//create the Maven project.
//add the dependencies of spring core - spring core & spring context into pom.xml file. 
//creating beans means java-pojo(plain old java object) classes to help the spring in creating their objects. 
//create configuration file => config.xml where we will mention all the bean class and their dependencies manually
//that the we want spring to manage. 
//use the dependency injection by either setter injection or constructor injection or both. 
//Then lastly the main class to pull the object the spring has created and will use it in our program.

public class Main {
    public static void main( String[] args ){
//    	Now to instantiate our IOC container , we can instantiate with three ways--
//    	In Spring , ApplicationContext is worked as IOC Container.
//    	1- ClassPathXmlApplicationContext("configuration file name", " ", .......)
//    	if we want to instantiate with the class path.
    	
//    	2-FileSystemXmlApplicationContext - when we want to instantiate it by putting the config file from our local system.
    	
//    	3-AnnotationXmlApplicationContext - when we use annotation to instantiate it.
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("com/springCore/P0FirstProg/config.xml");
//        To get the data of student1.
        Student student1= (Student) context.getBean("student1");
        System.out.println(student1);
        
//      To get the data of student2.
        Student student2=  (Student) context. getBean("student2");
        System.out.println(student2);
        
//        To get the data of student3.
        Student student3=  (Student) context. getBean("student3");
        System.out.println(student3);
        
    }
}

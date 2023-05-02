package com.springCore.P6Autowiring.ByXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/P6Autowiring/ByXML/XMLConfig.xml");
//      ByName-  
//		Employee emp= context.getBean("Emp", Employee.class);
//      <bean class= "com.springCore.P6Autowiring.ByXML.Address" name="address" p:city="Ghaziabad" p:street="E-Block, Nand Gram"/>
//    	<bean class= "com.springCore.P6Autowiring.ByXML.Employee" name="Emp" autowire="byName" />
//      System.out.println(emp);
        
//		ByType-
//        Employee emp1= context.getBean("Emp1", Employee.class);
//        <bean class= "com.springCore.P6Autowiring.ByXML.Address" name="address1" p:city="Ghaziabad" p:street="C-Block, Nand Gram"/>
//        <bean class= "com.springCore.P6Autowiring.ByXML.Employee" name="Emp1" autowire="byType" />
//        System.out.println(emp1);
//        
//		By Constructor-
        Employee emp2= context.getBean("Emp2", Employee.class);
//        <bean class= "com.springCore.P6Autowiring.ByXML.Address" name="address" p:city="Ghaziabad" p:street="D-Block, Nand Gram"/>
//        <bean class= "com.springCore.P6Autowiring.ByXML.Employee" name="Emp2" autowire="constructor" />  
        System.out.println(emp2);


	}

}

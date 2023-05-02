package com.springCore.P9SpringEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

// Spring Expression Language(SpEL) supports parsing and executing expression with the help of @Value annotations.
// Like in the example we have done in P7 where the pass the standAlone List collection ID = ListYpe declared in config
// within the @Value("#{ListType}") to inject the values in the list field of Student.

// We can pass any type of expression as SpEL with the value annotation , like-
//@Value("#{a+b+c}")   Operator expressions
//@Value("#{methods}")    methods that returning something
//@Value("#{Variables}")  variable that has some expression within it. Expression can be Classess, Variables, Methods, 
// Constructors and even objects.

public class Main {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("com/springCore/P9SpringEL/ELConfig.xml");
		Demo demo= context.getBean("demo", Demo.class);
		System.out.println(demo);
		
	 // Incase if we use API like SpelExpressionParser , we can pass the SpEL directly from the main class.
		SpelExpressionParser temp= new SpelExpressionParser();
		System.out.println(temp.parseExpression("10+22")); // This will store the value with the method.
		System.out.println(temp.parseExpression("10+22").getValue()); // And this will print the stored value of the method

		// But the above way is oftenly used to pass the Spring EL with @Value annotation.
		
		
	}

}

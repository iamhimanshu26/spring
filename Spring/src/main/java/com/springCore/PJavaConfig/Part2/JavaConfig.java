package com.springCore.PJavaConfig.Part2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//@ComponentScan(basePackages = "com.springCore.PJavaConfig")   
// After reading this annotation, container will search inside this and will find the class with @Component annotation and will create the object of it.                                                          //
public class JavaConfig {

	@Bean
	public Exam getExamObj() {
		return new Exam();
	}
	
	
	// We can also get the Sample Bean without @Component annotation , this can be done by with the help of @Bean annotation here in java-configuration.
	@Bean(name= {"sample", "temp"})    // we can manually set the object name returning from this method anything. 
	public Sample getSampleObj() {
		
		// creating the Sample object without using @Component annotation in Sample-Class.
		Sample sample2= new Sample(getExamObj());
		return sample2;
	}
	
	// After using @Bean annotation and removing @Component , we do not even need to define @ComponentScan().
	// We can remove this as well.
	
}

package com.springCore.PJavaConfig.Part1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Till this , we used the config.xml file for the configuration of the bean or declare the package with component-scan.
// But this class will be use instead of XML file for the configuration of the bean , the component-scan package to check 
// the entire package and its sub-packages to find the class with @Component annotation to create the object of it. 

// This can be done with 2 annotations - 
// @Configuration - This annotation will tell the container that this class have all the configuration required for the bean.
                    // Simply configure the bean.

// @ComponentScan(basePackage = " ") - This will tell the container , that this class has the related packages the 
                                    // container required to create the object of the bean class. 
                                    // Here we will pass the base package or packages name if required.

@Configuration
//@ComponentScan(basePackages = "com.springCore.PJavaConfig")   
// After reading this annotation, container will search inside this and will find the class with @Component annotation and will create the object of it.                                                          //
public class JavaConfig {
		
	// We can also get the Sample Bean without @Component annotation , this can be done by with the help of @Bean annotation here in java-configuration.
	@Bean
	public Sample getSampleObj() {
		
		// creating the Sample object without using @Component annotation in Sample-Class.
		Sample sample2= new Sample();
		return sample2;
	}

	
}

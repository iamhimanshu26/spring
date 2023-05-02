package com.springCore.P5LifeCycleMethods.ByAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 2- Implementing methods using Annotations.
//To use init()-  will use @PostConstruct annotation.
//To use destroy() - will use @PreDestroy annotation.

// We do not need to write the init and destroy method here we are not implementing them using xml.
// Since @PostConstruct and @PreDestroy is been deprecated from the Java 11 onwards, we need to add a dependency for them
// in the pom.xml file from the "https://www.baeldung.com/spring-postconstruct-predestroy".
// But by default these two annotations are disabled , so to enable it we need to add another tag in the config.

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/P5LifeCycleMethods/ByAnnotation/Config.xml");
		Example subject= (Example) context.getBean("PCM");
		System.out.println(subject);
		context.registerShutdownHook();
	}

}

package com.springCore.P5LifeCycleMethods.ByInterfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 2- Implementing methods using Interface.
//To use init()-  will implement InitializingBean interface.
//To use destroy() - will implement DisposableBean interface.

// We do not need to write the init and destroy method here we are not implementing them using xml.

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/P5LifeCycleMethods/ByInterfaces/Config.xml");
		Drink pepsi= (Drink) context.getBean("pepsi");
		System.out.println(pepsi);
		context.registerShutdownHook();
	}

}

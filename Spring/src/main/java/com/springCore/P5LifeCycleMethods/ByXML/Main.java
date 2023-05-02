package com.springCore.P5LifeCycleMethods.ByXML;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Ioc container provides two default methods---

// public void init() - to write initialization code, loading code, config connection to db, webservice etc.
// public void destroy()- to write the clean up code.

// we can change the name of these methods but the signature should be same.
// Ioc container will simply call the init() method automatically after configuring it in the config.xml file.
// But to call destroy() method , we need to manually tell the IOc to call it after configuring it the config by using 
// AbstractApplicationContext instead of ApplicationContext interface/class to call the registerShutDownHook() method.
// Which will finally call the destroy() method .

// Procedure of these methods-
// First IOC container will create the object and then it sets the values using setter/getter or constructor and then
// the init() called which will initialize everything written within the code and then we can read and use the bean.
// And before ending the object of the bean class, it will call destroy() method which will ultimately clean up the code/object.

// We can call these method using ---
// 1- Configuring it the XML file.
// 2- Implementing them using interfaces.
// 3- Implementing them using annotations.


public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springCore/P5LifeCycleMethods/ByXML/Config.xml");
		Food samosa= (Food) context.getBean("samosa");
		System.out.println(samosa);
		// to enable the registering shutdown hook.
		context.registerShutdownHook();
	}

}

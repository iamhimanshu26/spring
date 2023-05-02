package com.springCore.P7StereotypeAnno.P1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// By default, the container will take the variable(student) name as a camel case of the class(Student in this cas) name,
// so if we want to change it from our end, we just need to pass it with the Component annotation.
@Component("ob")
//@Component
public class Student {
	@Value("Himanshu Sharma")
	private String name;
	@Value("Ghaziabad")
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
	

}

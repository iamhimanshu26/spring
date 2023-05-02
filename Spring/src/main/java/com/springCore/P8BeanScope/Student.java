package com.springCore.P8BeanScope;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	@Value("Himanshu Sharma")
	private String name;
	@Value("Ghaziabad")
	private String city;
	
	// using collection variable, for this we need the standAlone collection in the config.
	@Value("#{ListType}")  // this is called spring expression language used for collection type variables.
	private List<String> address;
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
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

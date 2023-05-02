package com.springCore.P9SpringEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component     // Will tell the spring container to create the object of this class at runtime.
public class Demo {
	@Value("5")
	private int x;
	
	//@Value("10")
	@Value("#{5+10}")
	private int y;
	
//	Convention to call the static method and static variable--------     
	
	@Value("#{ T(java.lang.Math).sqrt(25) }") // T(Class).method(parameter) 
	private double z;
	
	@Value("#{T(java.lang.Math).E}")  //	T(Class).variable
	private double e;
	
	@Value("#{new java.lang.String('Himanshu Sharma')}")   // passing the object as Spring EL
	private String name;
	
//	@Value("#{'true'}")
	@Value("#{10+5>10+7}")
	private boolean isActive; // passing the boolean value , by default the value is false for boolean expression.

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive + "]";
	}


	
	
}

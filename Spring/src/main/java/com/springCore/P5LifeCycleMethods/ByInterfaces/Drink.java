package com.springCore.P5LifeCycleMethods.ByInterfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Drink implements InitializingBean , DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting the price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Food [price=" + price + "]";
	}

	public Drink(double price) {
		super();
		this.price = price;
	}

	public Drink() {
		super();
		// TODO Auto-generated constructor stub
	}

	// This override method will work as init() for the container.
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Taking Drink: Pepsi");
	}

	// This method will work as destroy() for the container.
	@Override
	public void destroy() throws Exception {
		System.out.println("Putting the bottle to the recycle bin ");
	}

}

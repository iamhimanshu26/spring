package com.springCore.P5LifeCycleMethods.ByXML;

public class Food {
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

	public Food(double price) {
		super();
		this.price = price;
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// we can write the name of this methods to anything and just change it in the config , since we have already defined which method
	// would be init() and which method would be destroy().
	
	public void init() {
		System.out.println("Inside init() method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy() method");
	}

}

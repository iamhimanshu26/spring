package com.springCore.P6Autowiring.ByAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Injecting object through byType only with @Autowired");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	@Autowired
	public Employee(Address address) {
		super();
		System.out.println("Injecting object through constructor only with  @Autowired ");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}

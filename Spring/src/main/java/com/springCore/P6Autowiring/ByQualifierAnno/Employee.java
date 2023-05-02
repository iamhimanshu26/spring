package com.springCore.P6Autowiring.ByQualifierAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

// With the help of @Qualifier annotation , we can inject the dependency of the specific bean by passing its name
// with the annotation.
public class Employee {
	@Autowired
//    @Qualifier("address1") // If we want to inject the dependency of address1 bean. 
//    @Qualifier("address2")  // If we want to inject the dependency of address2 bean.
    @Qualifier("address3")  // If we want to inject the dependency of address3 bean.
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

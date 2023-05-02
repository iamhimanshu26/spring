package com.springCore.P4ConstTypeInjection;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certificate certi;
//	private List<String> listOfAnime;
	
	public Person(String name, int personId, Certificate certi) {
		this.name=name;
		this.personId=personId;
		this.certi=certi;
//		this.listOfAnime=listOfAnime;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.personId+ " { "+ this.certi.name +" } ";
	}
	
	

}

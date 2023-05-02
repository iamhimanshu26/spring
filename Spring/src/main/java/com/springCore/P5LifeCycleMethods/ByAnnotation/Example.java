package com.springCore.P5LifeCycleMethods.ByAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Example(String subject) {
		super();
		this.subject = subject;
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Inside start(): This is the init method.");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Inside end(): This is the destroy method.");
	}
	
	
}

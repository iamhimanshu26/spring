package com.springCore.PJavaConfig.Part2;

import org.springframework.stereotype.Component;

//@Component("sample1") 
public class Sample {
	
	private Exam exam;
	
	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Sample(Exam exam) {
		super();
		this.exam = exam;
	}

	public void print() {
		// to call the method from Exam-Class.
		this.exam.display();
		System.out.println("This is printing from sample class: print() method");
	}

}

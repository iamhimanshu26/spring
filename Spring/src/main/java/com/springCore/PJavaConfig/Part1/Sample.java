package com.springCore.PJavaConfig.Part1;

import org.springframework.stereotype.Component;

//@Component("sample1") 
// With the Bean annotation, we don't need @Component and @ComponentScan() anymore.
public class Sample {
	
	public void print() {

		System.out.println("This is printing from sample class: print() method");
	}

}

package com.springCore.P2ReferenceTypeInjection;

public class BClass {
	private int y;
	
	public BClass(int y) {
		super();
		this.y= y;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getY() {
		return y;
	}

	public BClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BClass [y=" + y + "]";
	}
	
	
}

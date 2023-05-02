package com.springCore.P2ReferenceTypeInjection;


// We are doing a reference type injection from BClass object to AClass.
public class AClass {
	private int x;
	private BClass bObject;
		
	public AClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AClass(int x, BClass bObject) {
		super();
		this.x = x;
		this.bObject = bObject;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public BClass getbObject() {
		return bObject;
	}
	public void setbObject(BClass bObject) {
		this.bObject = bObject;
	}

	@Override
	public String toString() {
		return "AClass [x=" + x + ", bObject=" + bObject + "]";
	}
		

}

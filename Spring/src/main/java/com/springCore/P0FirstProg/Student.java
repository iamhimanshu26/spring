package com.springCore.P0FirstProg;


//we will defined all these fields of student class into config.xml so that the spring can inject these field
// values to them. We can done this with the help of 
//<bean class = "fully qualified name of the class " name ="entry1">
//</bean> 
//in which we will write the fully qualified name
//of the class and the details/fields of the class. To assign the values into data field , we will use 
//<property>
//<value>name = "field name1 "</value>
//<value>name = "field name2 "</value>
//<value>name = "field name3 "</value>
//</property>

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}

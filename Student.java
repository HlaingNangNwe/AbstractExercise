package com.nang;
class Person{
	public String name;
	public String address;
	
	public Person(String n,String add) {
		this.name=n;
		this.address=add;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String add) {
		this.address=add;
	}
	
	public String toString() {
		return "Name:\t"+name+"\nAddress:\t"+address;
	}
}
public class Student extends Person{

	String program;
	int year;
	double fee;
	
	public Student(String name,String address,String p,int y,double f) {
		super(name, address);
		this.program=p;
		this.year=y;
		this.fee=f;
	}
	public String StudentInfo() {
		return "Student Name:\t"+name+"\nAddress:\t"+address+"\nProgram:\t"+program+"\nYear:\t\t"+year+"\nFee:\t\t"+fee;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student("Aung Aung","Yangon","Foudation level",2,400000.0);
		System.out.println(st1.StudentInfo());
	}

}
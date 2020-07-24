package com.nang;

public class Staff extends Person {
	public String school;
	public Double pay;
	
	public Staff(String n, String add,String school,Double pay) {
		super(n, add);
		
		this.school=school;
		this.pay=pay;
		// TODO Auto-generated constructor stub
	}
	public String showStaffInfo() {
		return "Staff name:\t "+name+"\nAddress:\t"+address+"\nSchool:\t"+school+"\nPay\t"+pay;
	}

	public static void main(String[] args) {
		Staff s=new Staff("Thida","Bahan","UCSM",20000.0);
		System.out.println(s.showStaffInfo());
		// TODO Auto-generated method stub

	}

}

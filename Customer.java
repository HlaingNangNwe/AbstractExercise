package com.nang;

public class Customer {
	String customername;
	boolean member=false;
	String memberType;
	
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public boolean isMember() {
		return member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public Customer() {
		
	}
	
	public Customer(String customername, boolean member, String memberType) {
		super();
		this.customername = customername;
		this.member = member;
		this.memberType = memberType;
	}
	@Override
	public String toString() {
		return "Customer:\t" + customername + " \nmember:\t" + member + "\n memberType:\t" + memberType;
	}
	 
}	 

package com.nang;

import java.util.Date;

public class Shop{
	 Customer customer;
	 Date date;
	 DiscountRate rd=new DiscountRate();
	 double serviceExpense;
	 double productExpense;
	 
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}
	public Shop() {}
	
	
	public Shop(Customer customer, Date date, double serviceExpense, double productExpense) {
		super();
		this.customer = customer;
		this.date = date;
		//
		this.serviceExpense = serviceExpense;
		this.productExpense = productExpense;
	}


	public double totalExpense;
	public  double getTotalExpense() {
		if(customer.member) {
		totalExpense=serviceExpense+productExpense-((serviceExpense*(rd.getServiceDiscountRate(customer.memberType)+productExpense*(rd.getProductDiscountRate(customer.memberType)))));
		
		}else {
			totalExpense=serviceExpense+productExpense;
		}
		return totalExpense;
	}
	public void display() {
		System.out.println(customer.toString());
		System.out.println("Service Expense : "+serviceExpense);
		System.out.println("Product Expense : "+productExpense);
		System.out.println("Total Expense : "+getTotalExpense());
		System.out.println("Date : "+date);
		System.out.println();
	}
	public static void main (String args[]) {
		
		Customer c1=new Customer("Nang",true,"Gold");
		Customer c2=new Customer("Mg",true,"Silver");
		Customer c3=new Customer("Yan",true,"Platinum");
		
		Shop s1=new Shop(c1,new Date(2020-7-26), 7600.0, 10000.0);
		s1.display();

	}

}

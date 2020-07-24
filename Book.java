package com.nang;

public class Book extends Author{
	String name;
	double price;
	Integer qty=0;
	String authorname;

	public String getBookname() {
		return name;
	}



	public void setBookname(String bookname) {
		this.name = bookname;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public Integer getQty() {
		return qty;
	}



	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	


	

	public Book (String name, Author author, double price) {
		super(author.name, author.email, author.gender);
		this.name = name;
		this.authorname = author.name;
		this.price = price;
	}
	
	public Book(String name, Author author, double price, int qty) {
		super(author.name, author.email, author.gender);
		this.name = name;
		this.authorname = author.name;
		this.qty = qty;
		this.price = qty * price;
		
	}
	public void display() {
		System.out.println("Book Name : "+name);
		System.out.println("Author : "+ super.name);
		System.out.println("Qty : "+qty);
		System.out.println("Price : "+price);
		System.out.println();
	}


	public static void main(String []args) {
		Author a = new Author("JK Rowling", "jka@gmail.com",'m');
		Book b=new Book("HarryPotter",a,2000.0,1);
		b.display();
	}

}

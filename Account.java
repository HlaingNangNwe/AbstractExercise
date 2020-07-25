package com.nang;

public class Account{
	String id;
	String name;
	Integer balance=0;
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getBalance() {
		return balance;
	}


	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Account() {}
	public Account(String id,String name) {
		super();
		this.id=id;
		this.name=name;
	}
	public Account(String id, String name, Integer balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public Integer credit(Integer amt) {
		
			balance+=amt;
			return balance;
	}
	public Integer debit(Integer amt) {
		if(amt<balance) {
			balance-=amt;
			}else {
				System.out.print("Amount exceed");
			}
		return balance;
	}
	public Integer transferTo(Account acc,Integer amount) {
		if(amount<balance) {
			balance-=amount;
			acc.balance+=amount;
			
		}else {
			System.out.print("Amount Exceed");
		}
			return balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account("1","Nang",0);
		Account a2=new Account("2","Khaing",0);
		
		System.out.println("Nang acocunt balance:\t"+a1.credit(20000));
		System.out.println("Khaing acocunt balance:\t"+a2.credit(100000));
		
		System.out.println("Khaing Transfer to nang \t"+a2.transferTo(a1,20000));
		
		System.out.println("Nang  current acocunt balance:\t"+a1.balance);
		System.out.println("Khaing current acocunt balance:\t"+a2.balance);


	}

}

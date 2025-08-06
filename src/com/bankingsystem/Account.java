package com.bankingsystem;

public class Account {
	
	String name;
	String number;
	int balance;
	
	
	
	public Account(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
		this.number=this.getNumber();
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", number=" + this.getNumber() + ", balance=" + balance + "]";
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		int randomNum = (int)(Math.random() * 1000000);
		this.number=randomNum+"";
		return this.number;
	}
	
	
	

}

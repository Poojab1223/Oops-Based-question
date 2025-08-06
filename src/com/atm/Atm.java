package com.atm;

import com.atm.Account;

public class Atm {
	void checkBalance(Account a) {
		System.out.println(a.balance);
	}
	void withdraw(Account a,int amount) {
		if(amount>a.balance) {
			System.out.println("sorry!!! insufficient balance"+a.balance);
		}
		else {
			a.balance=a.balance-amount;
			System.out.println("amount withdrawed is"+ amount+" and remaining balance is"+a.balance);
		}
	}
	void deposite(Account a,int amount) {
		 System.out.println("amount deposited successfully!!!!!");
		 a.balance=a.balance+amount;
		 System.out.println("remaining balance is"+a.balance);
	 }

}

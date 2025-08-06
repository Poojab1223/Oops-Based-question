package com.bankingsystem;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		     Account[] accounts = new Account[10];

	       Scanner sc=new Scanner(System.in);
	        accounts[0] = new Account("Pooja", 5000);
	        accounts[1] = new Account("Rahul", 8000);
	        accounts[2] = new Account("Sneha",12000);
	        accounts[3] = new Account("Arjun", 2000);
	        accounts[4] = new Account("Meera",7500);
	        accounts[5] = new Account("Vikram", 6000);
	        accounts[6] = new Account("Nisha",10000);
	        accounts[7] = new Account("Amit", 3000);
	        accounts[8] = new Account("Divya", 9500);
	        accounts[9] = new Account("Karan", 4000);
	        
	        Bank b=new Bank();
	        b.deposite(accounts[0], 687);
	        System.out.println(accounts[0]);
	        
	        
	}

}

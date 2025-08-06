package com.atm;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Account a1 = new Account("Pooja", 1234);
		Account a2 = new Account("Rahul", 4321);
		Account a3 = new Account("Sneha", 5678);
		Account a4 = new Account("Amit", 8765);
		Account a5 = new Account("Meera", 1357);

		Account[] user= {a1,a2,a3,a4,a5};
       //pin validation
		int flag=0;
		Account validUser=null;
		System.out.println("enter the pin to login");
		Scanner sc=new Scanner(System.in);
		int pin =sc.nextInt();
		int attempts=3;
		while(attempts!=0) {
			for(int i=0;i<user.length;i++) {
				if(pin==user[i].pin) {
					flag=1;
					validUser=user[i];
					break;
				}
				else {
					System.out.println("pin is invalid,enter once again");
					pin=sc.nextInt();
					attempts--;
					break;
				}
			}
			if(flag==1)break;
		}

		if(flag==1) {
			System.out.println("enter your choice");
			System.out.println("1 check balance \n"+ "2. withdraw\n"+"deposite \n");
			int choice=sc.nextInt();
			Atm a=new Atm();
			switch(choice) {
			case 1:a.checkBalance(validUser);
			break;
			case 2:System.out.println("enter the amount to withdraw");
			int amount=sc.nextInt();
			a.withdraw(validUser, amount);
			break;

			case 3:System.out.println("enter the amount to deposite");
			int  damount=sc.nextInt();
			a.withdraw(validUser, damount);
			break;
			}
		}
		else
			System.out.println("pin number is wrong you can try some time later");
	}

}

package com.library;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Book b1 = new Book(101, "The Alchemist", "Paulo Coelho", ISSUED_STATUS.AVAILABLE);
		Book b2 = new Book(102, "1984", "George Orwell", ISSUED_STATUS.ISSUED);
		Book b3 = new Book(103, "To Kill a Mockingbird", "Harper Lee", ISSUED_STATUS.NOT_AVAILABLE);
		Book b4 = new Book(104, "Sapiens", "Yuval Noah Harari", ISSUED_STATUS.ISSUED);
		Book b5 = new Book(105, "Atomic Habits", "James Clear", ISSUED_STATUS.AVAILABLE);

		Book[] arr= {b1,b2,b3,b4,b5};
		Scanner sc=new Scanner(System.in);
		Library l=new Library(arr);
		while (true) {
		    System.out.println("1. Want to take the book \n2. See available list \n3. Returning the Book \n4. Exit");
		    int choice = sc.nextInt();
		    sc.nextLine(); 
		switch(choice) {
		case 1: {
			System.out.println("enter the name of the book you want");
			String bookName=sc.nextLine();
			l.issuingBook(bookName);
			break;
		}
		case 2:l.listingBook();
		break;
		
		case 3:
			System.out.println("enter the book line that you are returning");
			String returnBook=sc.nextLine();
			l.returningTheBook(returnBook);
		        break;
		
		case 4: System.out.println("Exiting......");
		return;
		
		 default:
	            System.out.println("Invalid choice. Try again.");

		}
		}
	}

}

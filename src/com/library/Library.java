package com.library;

import java.util.Arrays;

public class Library {
	Book[]book;
	public Library(Book[] book) {
		super();
		this.book = book;
	}


	void issuingBook(String name) {
		for(int i=0;i<book.length;i++) {
			if(name.equalsIgnoreCase(book[i].title)&&book[i].status==ISSUED_STATUS.ISSUED.AVAILABLE) {
				System.out.println(name+ " book is available you can take it");
				book[i].status=ISSUED_STATUS.ISSUED;
			}
			if(name.equalsIgnoreCase(book[i].title)&&book[i].status==ISSUED_STATUS.AVAILABLE) {
				System.out.println("sorry "+ name+"book is not available");
			}

		}

	}
	void listingBook() {
		for(int i=0;i<book.length;i++) {
			System.out.println("id: "+book[i].id+", name: "+book[i].title+", author: "+book[i].author+", Available-status: "+book[i].status);
		}
	}


	public void returningTheBook(String name) {
		int flag=0;
		for(int i=0;i<book.length;i++) {
			if(name.equalsIgnoreCase(book[i].title)&&book[i].status==ISSUED_STATUS.ISSUED) {
				flag=1;
				System.out.println("Thank you for returning,,Keep vising the library **Have a nice day**");
				book[i].status=ISSUED_STATUS.AVAILABLE;
			}

		}
		if(flag==0)System.out.println("wrong name!!try again!!!!!!!");

	}
}	

package com.library;

public class Book {
	int id;
	String title;
	String author;
	ISSUED_STATUS status;
	public Book(int id, String title, String author, ISSUED_STATUS status) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", status=" + status + "]";
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public ISSUED_STATUS getStatus() {
		return status;
	}
	

}

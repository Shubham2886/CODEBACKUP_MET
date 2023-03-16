package com.iit.library.metlibrary.model;

public class Library {

	private int bookId;
	
	private String name;
	
	private String author;
	
	private String publisher;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Library [bookId=" + bookId + ", name=" + name + ", author=" + author + ", publisher=" + publisher + "]";
	}
	
	
}

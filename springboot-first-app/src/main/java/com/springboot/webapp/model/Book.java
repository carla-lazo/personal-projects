package com.springboot.webapp.model;

public class Book {
	private int id;
    private String name;
    private String author;
    
	public Book(int id, String fname, String authorName) {
		this.id = id;
		this.name = fname;
		this.author = author;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	   
}
package com.kh.iclass;

public class Book {
	private String name;
	private String genre;
	private	String date;
	
	
	public Book(String name, String genre, String date) {
		this.name=name;
		this.genre=genre;
		this.date=date;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		return;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre=genre;
		return;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date=date;
		return;
	}
	
	public String toString() {
		String str=this.name+" "+this.genre+" "+this.date;
		return str;
	}
	
	
}

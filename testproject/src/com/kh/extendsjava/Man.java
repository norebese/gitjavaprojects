package com.kh.extendsjava;

public class Man {
	String name;
	
	public Man() {
		System.out.println("Man 생성");
	}
	
	public Man(String name) {
		System.out.println("name 넘겨받아 Man 생성");
		this.name=name;
	}
	
	
	public void tellYourName() {
		System.out.println("my name is "+this.name);
	}

}

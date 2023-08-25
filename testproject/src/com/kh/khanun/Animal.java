package com.kh.khanun;

public class Animal {
	String name;
	int age;
	String gender;
	
	public Animal(String name,int age, String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}

	void makeSound() {
		System.out.println(name+"이 소리를 냅니다.");
	}
	
	
	
	
}

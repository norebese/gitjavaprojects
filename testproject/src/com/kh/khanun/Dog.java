package com.kh.khanun;

public class Dog extends Animal {
	
	
	public Dog() {
		super("순이", 1, "수컷");
	}
	
	public Dog(String name,int age, String gender) {
		super(name, age, gender);
	}

	public void welcomeHome() {
		System.out.println("꼬리를 흔듭니다");
	}
	void makeSound() {
		System.out.println("멍멍");
	}
	
	
	
}

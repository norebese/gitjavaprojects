package com.kh.javai;

public class Human {
	String name,gender,address;
	int age,height;
	
	//생성자
	public Human() {
		
	}

	public Human(String tName, int tAge, String Taddress, int tHeight) {
		name = tName;
		age = tAge;
		address = Taddress;
		height = tHeight;
	}
	
	//메서드
	
	public static void info(String TName,int tAge, String Taddress, int tHeight) {
		//안녕하세요.
		//저는 ㅇㅇ에 살고있는 ㅇㅇ세 ㅇㅇㅇ입니다
		//제 키는 ㅇㅇㅇ입니다
		System.out.println("안녕하세요");
		System.out.println("저는"+Taddress+"에 살고있는"+tAge+"세"+TName+"입니다");
	}
	
	
	
	
}

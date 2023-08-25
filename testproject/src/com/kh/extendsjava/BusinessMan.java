package com.kh.extendsjava;

public class BusinessMan extends Man {
	String company;
	String position;
	
	public BusinessMan() {
		System.out.println("BusinessMan 생성");
	}
	
	public BusinessMan(String company,String position,String name){
		super(name);//부모 부를때는 무조건 맨위부터
		this.company=company;
		this.position=position;
		
	
	}
	
	
	
	public void tellYourInfo() {
		System.out.println("my company is "+this.company);
		System.out.println("my position is "+this.position);
		tellYourName();
	}

}

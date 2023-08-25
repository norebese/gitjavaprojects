package com.kh.extendsjava;

public class MainStart {
	public static void main(String[]args) {
		//객체를 생성할때 상속받은 클래스(부모)가 있다면
		//부모클래스의 설계부터 확인하고 자식 클래스의 설계를 따른다
//		Man choi = new Man();
//		BusinessMan kim = new BusinessMan();
//		
//		choi.name="jiwon";
//		choi.tellYourName();
		
		BusinessMan kim=new BusinessMan("KH","강사","최지원");
		kim.tellYourInfo();
		
	}

}

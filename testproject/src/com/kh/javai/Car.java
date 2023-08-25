package com.kh.javai;

public class Car {
	//색상, 제조회사, 타입, 엔진, 제조날짜, 최대속도, 제로백
	String color;
	String company;
	String type; //준준형 중형 대형 스포츠카
	String engine; // 가솔린 디젤 하이브리드 가스
	String date; // ex)2023-08-04
	int maxSpeed;
	int speed=0;
	int zero100;
	int maxFuel;
	int fuel=0;
	
	//색상, 제조회사, 타입, 엔진, 제조날짜, 제로100, 최대주유량 를 초기화하는 생성자를 생성
	// 나머지 값들은 알맞은 방식으로 초기화
	public Car() { //새로운 생성자 만들때 반드시 기본 생성자 만들어 놔야한다!!!
		
	}
	
	public Car(String color,String company,String type,String engine,String date,int maxSpeed,int zero100,int maxFuel) {
		this.color=color;
		this.company=company;
		this.type=type;
		this.engine=engine;
		this.date=date;
		this.maxSpeed=maxSpeed;
		this.zero100=zero100;
		this.maxFuel=maxFuel;
		this.fuel=0;
		this.speed=0;
	}
	
	
	// axel, break, insertFuel, 
	
	//악셀을 매서드를 호출하면 speed+5 하고 속도 리턴/최대 속도일때 소정해서 리턴
	public int onAxel() {
		if(speed+5>=maxSpeed) {
			speed= maxSpeed;
		}else {
			speed +=5;
		}
		return speed;
	}
	
	public int onBreak() {
		if(speed-5<=0) {
			speed= 0;
		}else {
			speed -=5;
		}
		return speed;
	}
	//넣은 기름만큼 추가 남은양 반환
	public int insertFuel(int tFuel) {
		if((fuel+tFuel)>maxFuel) {
			int tmpFuel =(fuel+tFuel-maxFuel);
			fuel=maxFuel;
			return tmpFuel;
		}else {
			fuel+=tFuel;
			return 0;
		}
	}
	
	//statusDisplay 차량 상태 확인
	//this.color=color;
//	this.company=company;
//	this.type=type;
//	this.engine=engine;
//	this.date=date;
//	this.maxSpeed=maxSpeed;
//	this.zero100=zero100;
//	this.maxFuel=maxFuel;
//	this.fuel=0;
//	this.speed=0;
	public void statusDisplay(int type) {
		switch(type) {
		case 1:{
			System.out.println("색상 : "+this.color);
			System.out.println("회사 : "+this.company);
			System.out.println("타입 : "+this.type);
			System.out.println("엔진 : "+this.engine);
			System.out.println("제조년월일 : "+this.date);
			System.out.println("최대속도 : "+this.maxSpeed);
			System.out.println("제로백 : "+this.zero100);
			System.out.println("연료통 : "+this.maxFuel);
			System.out.println("연료 : 0");
			System.out.println("속도 : 0");
			System.out.println("제차는 "+this.company+"에서만든 "+this.type+this.engine+"차 입니다.\n"+this.date+"에 출고되어 최대"+this.maxSpeed+"km로"+this.maxFuel+"까지 달릴 수 있습니다.");
			break;
		}
		case 2:{
			System.out.println("속도 " + this.speed);
			System.out.println(" 잔여 기름 " + this.fuel);

		}
	}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

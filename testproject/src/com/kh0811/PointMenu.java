package com.kh0811;

import java.util.Scanner;

public class PointMenu {
	private Scanner sc=new Scanner(System.in);
	
	private CircleController cc= new CircleController();
	private RectangleController rc= new RectangleController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("====메뉴====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num=sc.nextInt();
			if(num==1) {
				circleMenu();
			}else if(num==2) {
				rectangleMenu();
			}else if(num==9) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시입력하세요.");
			}
		}
	}
	
	public void circleMenu() {
		while(true) {
			System.out.println("====원 메뉴====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num=sc.nextInt();
			if(num==1) {
				calcCircum();
			}else if(num==2) {
				calcCircleArea();
			}else if(num==9) {
				mainMenu();
			}else {
				System.out.println("잘못 입력하셨습니다. 다시입력하세요.");
			}
			
		}
	}
	
	public void rectangleMenu() {
		while(true) {
			System.out.println("====사각형 메뉴====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num=sc.nextInt();
			if(num==1) {
				calcPerimeter();
			}else if(num==2) {
				calcRectArea();
			}else if(num==9) {
				mainMenu();
			}else {
				System.out.println("잘못 입력하셨습니다. 다시입력하세요.");
			}
		}
		
	}
	
	public void calcCircum() {
		System.out.println("x 좌표 : ");
		int x=sc.nextInt();
		System.out.println("y 좌표 : ");
		int y=sc.nextInt();
		System.out.println("반지름 : ");
		int ra=sc.nextInt();
		System.out.println(cc.calcCircum(x,y,ra));
		
	}
	
	public void calcCircleArea() {
		System.out.println("x 좌표 : ");
		int x=sc.nextInt();
		System.out.println("y 좌표 : ");
		int y=sc.nextInt();
		System.out.println("반지름 : ");
		int ra=sc.nextInt();
		System.out.println(cc.calcArea(x, y, ra));
	}
	
	public void calcPerimeter() {
		System.out.println("x 좌표 : ");
		int x=sc.nextInt();
		System.out.println("y 좌표 : ");
		int y=sc.nextInt();
		System.out.println("반지름 : ");
		int ra=sc.nextInt();
		System.out.println(rc.calcPerimeter(x, y, y, ra));
	}
	
	public void calcRectArea() {
		System.out.println("x 좌표 : ");
		int x=sc.nextInt();
		System.out.println("y 좌표 : ");
		int y=sc.nextInt();
		System.out.println("반지름 : ");
		int ra=sc.nextInt();
		System.out.println(rc.calcArea(x, y, y, ra));
	}
	

}

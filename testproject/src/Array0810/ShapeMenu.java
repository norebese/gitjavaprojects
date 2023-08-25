package Array0810;

import java.util.Scanner;

public class ShapeMenu {
	Scanner sc=new Scanner(System.in);
	SquareController scr=new SquareController();
	TriangleController tc=new TriangleController();
	
	
	public void inputMenu() {
		
		boolean tri1=true;            
		while(tri1==true) {
			System.out.println("====도형 프로그램====");
			System.out.println("3.삼각형");
			System.out.println("4.사각형");
			System.out.println("9.프로그램 종료");
			System.out.print("메뉴번호 : ");
			int num=sc.nextInt();
			if(num==3) {
				triangleMenu();
				break;
			}else if(num==4){
				squareMenu();
				break;
			}else if(num==9) {
				System.out.println("프로그램 종료");
				tri1=false;
			}else {
				System.out.println("잘못된 번호입니다. 다시 입력해 주세요");
			}
		}
	}
	
	public void triangleMenu() {
		
		while(true) {
			System.out.println("====삼각형====");
			System.out.println("1.삼각형 면적");
			System.out.println("2.삼각형 색칠");
			System.out.println("3.삼각형 정보");
			System.out.println("9.메인으로");
			int num=sc.nextInt();
			if(num==1) {
				inputSize(3, 1);
				
			}else if(num==2) {
				inputSize(3, 2);
				
			}else if(num==3) {
				printinformation(3);
				
			}else if(num==9) {
				System.out.println("메인으로 돌아갑니다");
				inputMenu();
				break;
			}else {
				System.out.println("잘못된 번호입니다. 다시 입력해 주세요");
			}
		}
	
		
		
		
	}
	
	public void squareMenu() {
		while(true) {
			System.out.println("====사각형====");
			System.out.println("1.사각형 둘레");
			System.out.println("2.사각형 면적");
			System.out.println("3.사각형 색칠");
			System.out.println("4.사각형 정보");
			System.out.println("9.메인으로");
			int num=sc.nextInt();
			if(num==1) {
				inputSize(4, 1);
				
			}else if(num==2) {
				inputSize(4, 2);
				
			}else if(num==3) {
				inputSize(4, 3);
				
			}else if(num==4) {
				printinformation(4);
				
			}else if(num==9) {
				System.out.println("메인으로 돌아갑니다");
				inputMenu();
				break;
			}else {
				System.out.println("잘못된 번호입니다. 다시 입력해 주세요");
			}
		}
	}
	
	public void inputSize(int type, int menuNum) {
		if(type==3&&menuNum==1) {
			System.out.print("높이 : ");
			int h=sc.nextInt();
			System.out.println("너비 : ");
			int w=sc.nextInt();
			System.out.println("삼각형 면적 : "+tc.calcArea(h, w));
		}else if(type==3&&menuNum==2) {
			System.out.print("색깔을 입력하세요 : ");
			String col=sc.next();
			tc.paintColor(col);
			System.out.println("색이 수정되었습니다");
		}else if(type==4&&(menuNum==1||menuNum==2)) {
			System.out.print("높이 : ");
			int h=sc.nextInt();
			System.out.println("너비 : ");
			int w=sc.nextInt();
			if(menuNum==1) {
				System.out.println("사각형 둘레 : "+scr.calcPerimeter(h, w));
			}else if(menuNum==2) {
				System.out.println("사각형 면적 : "+scr.calcArea(h, w));
			}
		}else if(type==4&&menuNum==3) {
			System.out.print("색깔을 입력하세요 : ");
			String col=sc.next();
			scr.paintColor(col);
			System.out.println("색이 수정되었습니다");
		}
	}
	
	public void printinformation(int type) {
		if(type==3) {
			System.out.println( tc.print());
		}else if(type==4) {
			System.out.println(scr.print());
		}
		
	}
	

}

package testproject;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String day =sc.next();
//		
//		switch (day) {
//		case "월":
//		case "화":
//		case "수":
//		case "목":
//		case "금":
//			System.out.print("금일은 정상 영업합니다");
//			break;
//		case "토":
//		case "일":
//			System.out.print("금일은 휴일입니다");
//			
//		default:
//			System.out.print("잘못 입력하셨습니다.");
//	}

		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		a = sc.nextInt();
		if (a==1) {
			System.out.println("입력 메뉴입니다.");
		} else if (a==2) {
			System.out.println("수정 메뉴입니다.");
		} else if (a==3) {
			System.out.println("조회 메뉴입니다.");
		} else if (a==4) {
			System.out.println("삭제 메뉴입니다.");
		} else if (a==7) {
			System.out.println("프로그램이 종료됩니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
// switch 안애는 정수, 문자, 문자열 이 세게만 되어서 if보다는 제한적
		switch (a) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		
		}
		
}


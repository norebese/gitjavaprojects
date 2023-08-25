package testproject;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//				if(num>0) {
//					System.out.println("양수입니다"); // else는 무조건 if랑 같이 씀
//				} else if (num == 0) {
//						System.out.println("0입니다.");
//				}else {
//					System.out.println("음수입니다");
//					}
				
				String season;
				int month = sc.nextInt(), temperature = sc.nextInt();
				
				if(month == 1 || month == 2 || month == 12) {
					season = "겨울"; // 코드가 한 줄 일때만 중괄호 안쓸 수 있음
				if (temperature <= -15) {
					season += " 한파 경고";
					} else if (temperature <= 12) {
					season += " 한파 주의보";
					}
				} else if (month >= 3 && month <= 5) 
					season = "봄";
				 else if (month >= 6 && month <= 8) 
					season = "여름";
				 else if (month >= 9 && month <= 11) 
					season = "가울";
				 else 
					season = "해당하는 계절이 없습니다.";
				
				System.out.println(season);
	}
	}




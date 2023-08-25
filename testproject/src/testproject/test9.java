package testproject;

import java.util.Scanner;

public class test9 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String season;
//		int month = sc.nextInt();
//		
//		if(month == 1|| month == 2|| month == 3) {
//			season = "겨울";
//		} else if (month >= 3&& month <=5) {
//			season = "봄";
//		}else if (month >= 6&& month <=8) {
//			season = "여름";
//		}else if (month >= 9&& month <=11) {
//			season = "가을";
//		}else  {
//			season = "해당되는 계절이 없습니다.";
//		}
//		
//			System.out.println(season);
//	
//
//		switch(month)	{
//	case 1:	
//	case 2:	
//	case 12:
//		season= "겨울";
//		break;
//	case 3:
//	case 4:
//	case 5:
//		season= "봄";
//		break;
//	case 6:
//	case 7:
//	case 8:
//		season= "여름";
//		break;
//	case 9:
//	case 10:
//	case 11:
//		season= "가을";
//		break;
//	default:
//		season = "해당하는 계절이 없습니다.";
//	}
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.print("권한을 확인하고자 하는 회원 등급: ");
//		String who = sc.next();
//			if (who.equals("관리자")) {
//				System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
//			}else if (who.equals("회원")) {
//				System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
//			}else if (who.equals("비회원")) {
//				System.out.println("게시글 조회");
//			}else {
//				System.out.println("잘못 입력했습니다");
//			}
//			
//			switch (who) {
//				case "관리자":
//					System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
//					break;
//				case "회원":
//					System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
//					break;
//				case "비회원":
//					System.out.println("게시글 조회");
//					break;
//				default: 
//					System.out.println("잘못 입력했습니다");
//			}
		
//		Scanner sc = new Scanner(System.in);
//		double m, kg;
//		double bmi;
//		System.out.print("키(m)를 입력해 주세요 : ");
//		m = sc.nextDouble();
//		System.out.print("몸무게(kg)를 입력해 주세요 : ");
//		kg = sc.nextDouble();
//		bmi = kg/(m*m);
//		System.out.println("BMI 지수 : "+ bmi);
//		if (bmi<18.5) {
//			System.out.println("저체중");
//		} else if (bmi>=18.5 && bmi<23) {
//			System.out.println("정상체중");
//		} else if (bmi>=23 && bmi<25) {
//			System.out.println("과체중");
//		} else if (bmi>=25 && bmi<30) {
//			System.out.println("비만");
//		} else if (bmi>=30) {
//			System.out.println("고도비만");
//		}

//		Scanner sc = new Scanner(System.in);	
//		int a, b;
//		String n;
//		System.out.print("피연산자1 입력: ");
//		a = sc.nextInt();
//		System.out.print("피연산자2 입력: ");
//		b = sc.nextInt();
//		System.out.print("연산자를 입력(+,-,*,/,%): ");
//		n = sc.next();
//		
//		if (a<0 || b<0) {
//			System.out.println("잘못 입력했습니다. 프로그램을 종료합니다");
//		}else if (n.equals("-")) {
//			System.out.println(a + " "+ n +" "+ b  +  " =" +" "+((float)a-b));
//		}else if (n.equals("*")) {
//			System.out.println(a +" "+ n +" "+ b +  " =" +" "+((float)a*b));
//		}else if (n.equals("/")) {
////			System.out.printf("%d %c %d = %.6f \n", a,n,b, ((double)a/b));
//			System.out.println(a +" "+ n + " "+b +  " =" +" "+((float)a/b));
//		}else if (n.equals("%")) {
//			System.out.println(a + " "+n +" "+ b + " =" +" "+((float)a%b));
//		}else if (n.equals("+")) {
//			System.out.println(a +" "+ n +" "+ b + " =" +" "+((float)a+b));
//		}else if (n!=("+") || n!=("-") || n!=("*") || n!=("/") || n!=("%")) {
//			System.out.println("잘못 입력했습니다. 프로그램을 종료합니다");
//		}
//		
//		if (a<0 && b<0) {
//			System.out.println("잘못 입력했습니다. 프로그램을 종료합니다");
//		
//		switch (n) {
//		case "+":
//			System.out.println(a +" "+ n +" "+ b + " =" +" "+((float)a+b));
//			break;
//		case "-":
//			System.out.println(a + " "+ n +" "+ b  +  " =" +" "+((float)a-b));
//			break;
//		case "*":
//			System.out.println(a +" "+ n +" "+ b +  " =" +" "+((float)a*b));
//			break;
//		case "/":
//			System.out.println(a +" "+ n + " "+b +  " =" +" "+((float)a/b));
//			break;
//		case "%":
//			System.out.println(a + " "+n +" "+ b + " =" +" "+((float)a%b));
//			break;
//		default:
//			System.out.println("잘못 입력했습니다. 프로그램을 종료합니다");
//			break;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int semi, fin, work, sign;
//		float total;
//		System.out.print("중간 고사 점수: ");
//		semi=sc.nextInt();
//		System.out.print("기말 고사 점수: ");
//		fin=sc.nextInt();
//		System.out.print("과제 점수: ");
//		work=sc.nextInt();
//		System.out.print("출석 회수: ");
//		sign=sc.nextInt();
//		
//		System.out.println("=============== 결과 =================");
//		total= (semi*0.2f)+(fin*0.3f)+(work*0.3f)+(sign);
//		System.out.println("중간 고사 점수(20) : "+ (semi*0.2f));
//		System.out.println("기말 고사 점수(30) : "+ (fin*0.3f));
//		System.out.println("과제 점수		(30) : "+ (work*0.3f));
//		System.out.println("출석 점수		(20) : "+ ((float)sign*1));
//		System.out.println("총점 : "+ total);
//		
//		
//		if (total<70&&sign<=(20*0.7)) {
//			System.out.println("Fail [점수 및 출결 미달]");
//		} else if (sign<(20*0.7)) {
//			System.out.println("Fail [출결 미달]");
//		} else if (total<70) {
//			System.out.println("Fail [점수 미달]");
//		} else {
//			System.out.println("Pass");
//		}
	
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("실행할 기능을 선택하세요.");
//		System.out.println("1. 권한 확인");
//		System.out.println("2. BMI");
//		System.out.println("3. 계산기");
//		System.out.println("4. P/F");
//		System.out.print("선택: ");
//		int a= sc.nextInt();
//				if (a==1) {
//						System.out.print("권한을 확인하고자 하는 회원 등급: ");
//						String who = sc.next();
//							if (who.equals("관리자")) {
//								System.out.println("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
//							}else if (who.equals("회원")) {
//								System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
//							}else if (who.equals("비회원")) {
//								System.out.println("게시글 조회");
//							}else {
//								System.out.println("잘못 입력했습니다");
//							}
//				}
		
//		int i =1;
//		
//		while (i<10) {
//			System.out.println(i);
//			i++;
//		}
//		
//		for (i = 0; i <10; i++); // i 는 지역변수
		
//		do {				// do 안의 내용 먼저 실핼, 조건식 확인 후 true면 문장 수행, false면 종료, while 뒤에; 꼭 필요 
//			수행될 문장;
//			[증감식 or 분기문];
//		} while (조건식);
//		int dan = 2;
//		for (int i = 1; i <= 9.; i++) {
//			System.out.println(dan + "*"+i+"="+(i*dan));
//			
//		}	
//		Scanner sc = new Scanner(System.in);
//		int a, i;
//		a=0;
//		do {
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		a= sc.nextInt();
//			if (a<1) {
//				System.out.println("1이상의 숫자를 입력해주세요");}
//			else {
//				i =1;
//				while (i<=a) {
//					System.out.print(i+" ");
//					i++;
//					}
//				}
//			} while (a<1);
		// ~입력받은 값부터 ~1까지 반복해라
		
		// 숫자하나를 입력받고 입력받은 수부터 ~1까지 순차적으로 출력해라
//		int a;
//		Scanner sc = new Scanner(System.in);
//		
//		for (a=0; a<1;) { //num이 1이상의 숫자가 나올때 까지 반복
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		a= sc.nextInt();
//				if (a<1) {
//					System.out.println("1이상의 숫자를 입력해주세요");
//				} else 
//			for (int i = a; i > 0; i--) {
//					System.out.print(i+" ");
//		}
//		}
		
		// 누적
//		Scanner sc = new Scanner(System.in);
//		int sum;
//		sum= 0;
//		System.out.print("정수를 하나 입력하세요 : ");
//		int a= sc.nextInt();
//		for (int i = 1; i <= a; i++) {
//			sum += i; //<------- sum = sum+i 변수 하나에 계속 누적시키는 방식!!!!
//			if (i==a)
//				System.out.print(i+"=" +sum);
//			else 
//				System.out.print(i+"+");
//		}
//		int a, b, max, min; // 변수 만들어서 활용하기!!!!!
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫 번째 숫자 : ");
//		a=sc.nextInt();
//		System.out.print("두 번째 숫자 : ");
//		b=sc.nextInt();
//		if (a >0 && b > 0) {
//			if (a>b) {
//				max = a;
//				min = b;
//			} else {
//				max =b;
//				min =a;
//			}
//			for (int i=min; i <= max; i++) { // 작은수 부터 큰수 까지
//				System.out.print(i+" ");
//			}
//		}else {
//			System.out.println("1이상의 숫자를 입력하세요");
//		}
//		
		int a, b, max, min; // 변수 만들어서 활용하기!!!!!
		Scanner sc = new Scanner(System.in);
		a=0;
		b=0;
		while (a<1 || b<1) {
			System.out.print("첫 번째 숫자 : "); 
			a=sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			b=sc.nextInt();
			
			if (a >0 && b > 0) {
				if (a>b) {
					max = a;
					min = b;
				} else {
					max =b;
					min =a;
				}
				for (int i=min; i <= max; i++) { // 여기서 a 또는 b의 값이 입력 받은 값으로 바뀐다
												// 따라서 while 실행을 위해 다시 올라 갔을때 조건이 맞지 않아 반복되지 않는다
					System.out.print(i+" ");
				}
			}else {
				System.out.println("1이상의 숫자를 입력하세요");
			}
			
		}
	
		
		
	}
}
		
		
		
			
//		for (i=1; i <= a ; i++) {
//			System.out.println(i);
//		}
//		
	
		
		
		
		
		
		
		
		
	
		
	

package testproject;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
//		String str1, str2, str3, str4, str5, str6;
//		int num, num1;
//		str1 = "이름을 입력하세요 :";
//		str2 = "성별을 입력하세요(남/여) :";
//		str3 = "나이를 입력하세요 :";
//		str4 = "키를 입력하세요(cm) :";
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		System.out.println(str4);
//		
//		Scanner sc = new Scanner(System.in);
//		str5 = sc.next();
//		str6 = sc.next();
//		num = sc.nextInt();
//		num1 = sc.nextInt();
		
		String name, gender;
		int age;
		float height;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요:");
		name = sc.nextLine();
		System.out.print("성별을 입력하세요:");
		gender = sc.nextLine();
		System.out.print("나이을 입력하세요:");
		age = sc.nextInt();
		System.out.print("키를 입력하세요:");
		height = sc.nextFloat();
		System.out.print("키 "+ height +" cm인 "+age+"살 "+gender+"자 "+name+"님"+" 반갑습니다");

		
	}

}
// 1. 변수가 몇개 필요한지 체크해보기 (4개)
// 2. 내가 핳 수 있는 출력 해보고
// 3. 입력받아야할 곳에 입력 넣고
// 4. 입력받은 값을 활용해서 출력

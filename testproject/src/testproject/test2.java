package testproject;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		int one, two;
		Scanner sc = new Scanner(System.in); // sc를 input으로 해도 상관 없음
		
		System.out.print("첫 번째 정수:");
		one = sc.nextInt();
		System.out.print("두 번째 정수:");
		two = sc.nextInt();
		System.out.println("더하기 결과:"+(one+two));
		System.out.println("빼기 결과:"+(one-two));
		System.out.println("곱하기 결과:"+(one*two));
		System.out.println("나누기 결과:"+(one/two));
	}

}

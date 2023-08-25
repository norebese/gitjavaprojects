package testproject;

import java.util.Scanner;

public class IFA {
	public static void main(String[] args) {
		int first;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자: ");
		first = sc.nextInt();
		
		if (first >= 100) 
			System.out.print("3자리 수 이상입니다");
		else 
			System.out.print("3자리 수 이하입니다");
	}
}



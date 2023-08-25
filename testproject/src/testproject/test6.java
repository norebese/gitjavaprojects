package testproject;

import java.util.Scanner;

public class test6 {
	public static void main(String[] args) {
		char st;
		Scanner input = new Scanner(System.in);
		
		System.out.println("문자: ");
		st = input.next().charAt(0);
		System.out.println("a unicode: " + (st + 0)); //캐릭터형(2바이트)이 int(4바이트)쪽으로 형변환

	}


}

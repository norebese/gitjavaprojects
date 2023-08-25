package testproject;

import java.util.Scanner;

public class test5 {
	public static void main(String[] args) {
		float ko, en, math, total;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어:");
		ko = sc.nextFloat();
		System.out.print("영어:");
		en = sc.nextFloat();
		System.out.print("수학:");
		math = sc.nextFloat();
		total = ko+en+math;
		System.out.println("총점: "+(int)(total));
		System.out.println("평균: "+(int)(total)/3);


	}


}

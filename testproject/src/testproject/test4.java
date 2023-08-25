package testproject;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
		int year, month, day, time, minute, second;
		Scanner input = new Scanner(System.in);
		
		System.out.print("년:");
		year = input.nextInt();
		System.out.print("월:");
		month = input.nextInt();
		System.out.print("일:");
		day = input.nextInt();
		System.out.print("시:");
		time = input.nextInt();
		System.out.print("분:");
		minute = input.nextInt();
		System.out.print("초:");
		second = input.nextInt();
		System.out.println("지금은 "+year+"년 "+month+"월 "+day+"일 "+time+"시 "+minute+"분 "+second+"초 입니다.");
	
	}

}

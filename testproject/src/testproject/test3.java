package testproject;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Float width, height;
		Scanner input = new Scanner(System.in);
		
		System.out.print("가로:");
		width = input.nextFloat();
		System.out.print("세로:");
		height = input.nextFloat();
		System.out.println("면적:"+(width*height));
		System.out.println("둘레:"+((width+height)*2));
	}
}

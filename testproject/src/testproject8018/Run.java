package testproject8018;

import java.util.Scanner;

public class Run {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
//		int num=sc.nextInt();
//		sc.nextLine();
//		
//		if(num>10) {
//			System.out.println("10초과");
//		}else if(num<=10) {
//			System.out.println("10이하");
//		}
//		int c=1000;
//		for(int i=1;i<=num;i++) {
//			c=c-i;
//		}
//		System.out.println(c);
//		
//		int arr[]=new int[num];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=num;
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//		Human a=new Student("ㅇㅇㅇ",19);
//		Human b=new Student("ㅁㅁㅁ",20);
//		
//		((Student)a).swim();
//		((Student)a).sleep();
//		a.makesound();
//		
//		((Student)b).swim();
//		((Student)b).sleep();
//		b.makesound();
		
//		Box<Apple> aBox=new Box<Apple>(); //T를 Apple로 결정
//		Box<Orange> oBox=new Box<Orange>();//T를 Orange로 결정
//		
//		aBox.set(new Apple()); //사과를 상자에 담는다.
//		oBox.set(new Orange());//오렌지를 상자에 담는다
//		
//		Apple ap=aBox.get();// 사과를 꺼내는데 형 변환 하지 않는다.
//		Orange og=oBox.get();//오렌지를 꺼내는데 형 변환을 하지 않는다
//		
//		System.out.println(ap);
//		System.out.println(og);
//		
		int rannum=(int)(Math.random()*4);
		System.out.println(rannum);
	}

}

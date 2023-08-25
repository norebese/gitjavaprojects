package testproject8017;

import java.util.Scanner;

public class Run {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num;
		num=sc.nextInt();
		if(num%2==0) {
			System.out.println("짝수 입니다");
		}else {
			System.out.println("홀수 입니다");
		}
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		int[]numarray=new int[num];
		for(int i=0;i<numarray.length;i++) {
			numarray[i]=(i+1);
			System.out.print(numarray[i]);
		}
		System.out.println();
	//업캐스팅
		Animal bird=new Bird("독수리", 1);
		//다운캐스팅, Flyable에서 Bird로 override 되어서 Bird에 있는 fly가 적용됨
		// Flyable 을 Bird로 바꾸어도 상관없음
		((Flyable)bird).fly();
		bird.makeSound();
		
		Fish fish=new Fish("붕어", 1);
		
		fish.swim();
		fish.makeSound();
		
		
	}
	                                    

}

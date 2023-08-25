package testproject;
import java.util.Arrays;
import java.util.Scanner;

public class Study0802 {
	
		//문자형 변수str을 생성하고 "안녕하세요"로 초기화한다
//		String str="안녕하세요";
//		// 만약 str의 값이 hi라면 "hi" 아니라면 str의 값을 출력한다
//		if(str.equals("hi")) {
//			System.out.println("hi");
//		} else {
//			System.out.println(str);
//		}
//		//길이가 8인 정수형 1차원배열 arr을 생성하고 값을 전부 5로 초기화 한다+출력
//		int[] arr=new int[8];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=5;
//			System.out.print(arr[i]);
//		}
//		System.out.println();
//		//3행 2열의 char형 2차원 배열 arr2를 생성하고 a~f를 순차적으로 대입한다+출력
//		char[][] arr2=new char[3][2];
//		char arpha='a';
//		for(int i=0;i<arr2.length;i++) {
//			for(int j=0;j<arr2[i].length;j++) {
//				arr2[i][j]=arpha++;
//				System.out.print(arr2[i][j]);
//			}
//		}
//	public static void main(String[]args){
//		System.out.println("프로그램의 시작");
//		hiEveryone(12); //밑에 함수를 싷앵시킨다, 데이터만 달라질때 쓴다, 
//		hiEveryone(13);
//		System.out.println("프로그램의 끝");
//	}
//	
//	public static void hiEveryone(int age) {  //매게변수
//		System.out.println("쫗은 아침입니다");
//		System.out.println("제 나이는"+age+"세 입니다");
//	}

//	public static void main(String[]args) {
//		double myHeight = 175.9;
//		hiEveryone(12, 12.5);
//		hiEveryone(13, myHeight);
//		byEveryone();//매개변수 꼭 없어도 됨
//	}
//	
//	public static void hiEveryone(int age, double height) {
//		System.out.println("제 나이는 "+age+"세입니다");
//		System.out.println("저의 키는 "+height+"cm입니다");
//	}
//	
//	public static void byEveryone() {
//		System.out.println("다음에 뵙겠습니다");
//	}
	
//	public static void main(String[]args) {
//		int result;
//		result = adder(4,5); // adder 가 반환하는 값을 result에 저장
//		System.out.println("4+5="+result);
//		System.out.println("3.5x3.5="+square(3.5));
//	}
//	
//	public static int adder(int num1, int num2)	{
//		int addResult= num1+ num2;
//		return addResult; //addResult의 값을 반환
//	}
//	//메서드 설정값 리턴형식 메서드이름(매게변수){
//	// 싷앵할 코드
//	//reurn 값
//	public static double square(double num) {
//		return num*num;	
//	}
//	
//	public static void main(String[]args) {
//		
//		System.out.println(factorial(3));
//
//	}
//		public static int factorial(int n) {
//		if(n==1)
//			return 1;
//		else
//			return n * factorial(n-1);
//		}

	
	
	public static void main(String[]args) {
//	BankAccount yoon = new BankAccount();
//	BankAccount park = new BankAccount();
//		
//	System.out.println(yoon.balance);
//	System.out.println(park.balance);
//	
//	yoon.deposit(1000);
//	park.deposit(2000);
//	
//	yoon.checkMyBalance();
//	park = yoon;
//	park.checkMyBalance();
//
//	}
		
		BankAccount kim = new BankAccount();
		System.out.println(kim.balance);
		System.out.println(kim.name);
		
		BankAccount kim2 = new BankAccount(1000, "동인");
		System.out.println(kim2.balance);
		System.out.println(kim2.name);
		
}

}


class BankAccount{
	int balance;
	String name;
	public BankAccount() {
		balance = 0;  //예금잔액
		name = "이름 없음";
	}
	
	public BankAccount(int a, String b) {
		balance = a;  //예금잔액
		name = b;
	}

	public int deposit(int amount) {
		balance+= amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액 : "+ balance);
		return balance;
	}
}

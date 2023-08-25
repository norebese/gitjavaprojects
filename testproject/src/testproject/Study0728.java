package testproject;

import java.util.Scanner;

public class Study0728 {
	public static void main(String[] args) {
		
		// 변수 : 변수는 메모리 골간을 사용하기위해 이름을 붙여 선언하는 것
		// 자료형 변수이름: int num;
		// 변수이름=값: num =5 // 변수이름 num
		
		// 연산자
		// 조건문 : 해당 조건에 맞으면 코드를 수행하라, 성립하지 않으면 넘어가라
		// for(int i =1; 1 <= 20: i++){}
		
		// while (num<) {} 
		// num++;
		
		// while for에서 break 쓸 수 있다(제어문 안에서) 
		// ex)if (i>9)
		// 	break;   -> 반복문을 탈출한다 (보통 if와 같이 쓴다)
		// if (i%2==0){
		// } continue -> 아래 부분은 실행하지 않고 반복문 다시 실행
		
		
//		Scanner sc = new Scanner(System.in);
//		int num=0; // num 입력받기 전에 먼저 첫 실행을 위해 num을 0으로 정의
//		while (num<1) {
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		num= sc.nextInt(); // 여기서 num이 0이하라면 if문이 실행된다
//		if (num<1) {
//			System.out.println("1이상의 숫자를 입력하세요");
//		} // 실행되면 다시 while으로 돌아감, 입력된 값을 기준으로 while 다시 실행
//		
//		}
//		for (int i = 1; i <= num ; i++) {
//			System.out.print(i+ " ");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 하나 입력하세요 : ");
//		int sum=0;
//		int num= sc.nextInt();
//			
//		for(int i=1;i<=num;i++) {
//			sum = sum+i;
//			if (i==num)
//			System.out.print(i+" = "); 	
//			else 
//			System.out.print(i+" + ");
//		}
//		System.out.print(sum);
		
		/* 배열-----------------------------------------------------
		 * 자료형 여러개 한번에 묶어서 생성하는 것, 변수 이름은 묶어서 하나
		 * 묶었을 따로 불러오려면 뮦음의 첫번째~ 두번째~ 이렇게 따로 가져와야함
		 * ex int num(num0,num1,num2...)
		 * 		num2=5, num5=3
		 * 타입이 같은 둘 이상의 제이터를 저장할 수 있음
		 * ex) int[] 벼열이름(ref) = new int[5]; 길이가 5인 int형 1차원 배열의 생성문
		 * 배열이름 = new 자료형[길이];  순서= ref[0], ref[1] ...
		 * 기본 자료형 배열은 모든 요소 0으로 초기화 미리 해놈, String 같은 객체배열은 null로 초기화
		 * 배열 초기화--- ex) int[] arr = new int[] {1,2,3}; 길이 안넣어도 됨
		 * 			   ex) int[] arr = {1,2,3};  더 단축 버전, 바로 위에건 잘 안쓰고 원래 형태와 이걸 많이 씀
		 */
		
//		int[] ar = new int[3];
//		ar[0]=7;
//		ar[1]=8;
//		ar[2]=9;
//		
//		int num=ar[0]+ar[1]+ar[2];
//		System.out.println(num);
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		int i=0;
//		
//		System.out.print("숫자: ");
//		num= sc.nextInt();
//		System.out.println("=====4단===== ");
//		
//		for (i=1;i<10;i++); {
//		System.out.println(num+"*"+i+"="+(num*i));
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		System.out.print("숫자 : ");
//		num=sc.nextInt();
//		if(num>9) {
//			System.out.print("9이하의 숫자만 입력해주세요. ");
//		} else {
//			
//	
//			for (int j=num; j<10;j++) {
//				System.out.println("========="+j+"단 =======");
//				for (int i = 1; i < 10; i++) {
//					System.out.println(j+"*"+i+"="+(j*i));
//					}
//			}
//		Scanner sc = new Scanner(System.in);		
//		int st, gp, num;
//		System.out.print("시작 숫자 : ");
//		st=sc.nextInt();
//		System.out.print("공차 : ");
//		gp=sc.nextInt();
//		num=10;
//		
//		for (int i = 1; i <11; i++) {
//			
//			
//			System.out.print(st+" ");
//			st= st+gp;
//		}
	
//		Scanner sc = new Scanner(System.in);
//		int a, b;
//		String c = "";
//		while (!c.equals("exit")) {
//			System.out.print("연산자(+,-,*,/,%) : ");
//			c=sc.next();
//			
//			if (!c.equals("exit"))
//				continue;
//		
//			System.out.print("정수 : ");
//			a=sc.nextInt();
//			
//			System.out.print("정수2 : ");
//			b=sc.nextInt();
//			
//			if (c.equals("+")) {
//				System.out.println(a+"+"+b+"="+(a+b));
//			} else if (c.equals("-")) {
//				System.out.println(a+"-"+b+"="+(a-b));
//			} else if (c.equals("*")) {
//				System.out.println(a+"*"+b+"="+(a*b));
//			} else if (c.equals("/")) {
//				System.out.println(a+"/"+b+"="+(a/b));
//			} else if (c.equals("%")) {
//				System.out.println(a+"%"+b+"="+(a%b));
//			} 
//
//		}
//		
//		System.out.println("종료");
//		}
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 입력 : ");
//		int num=sc.nextInt();
//		// 몇줄 실행 할 것인가? 세로로
//		for (int i=1;i<=num;i++) {
//			// 몇번 실행하고 싶은가? 가로로
//			// for 중첩일때 안에 있는 for의 초기값은 초기화 되는 것이 아니라 그냥 밖에 있는 for 타고 들어와서 안에있는 for 초기값 부터 읽는 것 뿐
//			// 밖에 있는 for의 초기 갑은 다시 않 읽는 것을 보면 그냥 왼쪽에서 읽는 것 뿐이다. 두개 사이의 관계가 없다!!
//			for (int j=0; j<i; j++) {
//				System.out.print('*');	
//		} 
//		System.out.println();
//		
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		System.out.print("정수 : ");
//		num=sc.nextInt();
//		if (num<1) {
//			System.out.println("양수가 아닙니다.");
//		}
//		for (int i=1;i<=num;i++) {
//			if (i%2==0) {
//				System.out.print("수");
//			} else {
//				System.out.print("박");
//			}
//			
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int num;
//		num=0;
//		while (num<1) {
//		System.out.print("정수 : ");
//		num=sc.nextInt();
//		if (num<1) {
//			System.out.println("양수가 아닙니다.");
//		}
//		
//		for (int i=1;i<=num;i++) {
//			if (i%2==0) {
//				System.out.print("수");
//			} else {
//				System.out.print("박");
//			}	
//		}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int num, an, sum;
//		
//		num=0;
//		sum=0;
//		System.out.print("난수를 입력하세요 : ");
//		an=sc.nextInt();
//		
//		
//		while (num!=an) {
//			sum++;
//			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요. : ");	
//			num=sc.nextInt();
//		if (num<1 || num>100) {
//		System.out.println("1~100 사이의 숫자를 입력해 주세요. : ");	
//		sum--;
//		} else if (num>an) {
//			System.out.println("DOWN !");
//		} else if (num<an){
//			System.out.println("UP !");
//		} else if(num==an) {
//			System.out.println("정답입니다.");
//			System.out.println(sum+"회만에 맞추셨습니다");
//		}
//
//		}

			
		
		Scanner sc = new Scanner(System.in);
		int st,plus,count,num,i;
		st=sc.nextInt();
		plus=sc.nextInt();
		count=sc.nextInt();
		num=0;
		for(i=st;i>0;i=i+plus) {
			num++;
			if(num==count) {
				break;
			}
		}
		
		System.out.print(i);
   
	
	
	
	
	
	
	}
		
		
		
		
		
		
		

		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
//		for (i=1; i<10; i++);{
//		System.out.println(num+"*"+i+"="+(num*i));
//		}
		


		
		



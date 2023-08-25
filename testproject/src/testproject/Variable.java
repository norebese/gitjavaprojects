package testproject;
//변수는 컴퓨터에 메모리 사용하겠다고 하는 것, 메모리 공간의 할당과 접근을 위해 필요한 도구
//자료형 변수의 이름; ex) int num1; <-변수 num1의 선언, 변수의 선언을 통해 결정되는 두가지= 변수의 이름과 용도

public class Variable {
//	public static void main(String[] args) {
		// 정수형 변수 number을 사용하겠다. 변수에 5를 넣겠다
		// number의 값을 풀력해아
		//자료형 변수명 ;(마침), 코딩에서 =는 3을 number에 넣겠다라고 생각하라, 실제로 =은 == 두개 쓰면 된다
//		int number = 5;
//		int number2=10;
//		number=3;
//		System.out.println(number +"+ 7");
//		System.out.println(number + 7);
//		System.out.println(number+number2);
//		System.out.println(number+"+"+number2);
//		short num = 2;
//		short num2 = 3;
//		int sum = num + num2;
//		System.out.println(sum);
//		System.out.println("안녕하세요");
//		
//		char ch1 = '헐';
//		char ch2 = '확';
//		char ch3 = 54736;
//		char ch4 = 54869;
//		char ch5 = 0xD5D0;
//		char ch6 = 0xD655;
//		
//		System.out.println(ch1);
//		System.out.println(ch2);
//		System.out.println(ch1 + " " + ch2);
//		System.out.println(ch3 + " " + ch4);
//		System.out.println(ch5 + " " + ch6);
		
			public static void main(String[] args) {
//				boolean b1 = true;
//				boolean b2 = false;
//				System.out.println(b1); // b1이 지닌 값 출력
//				System.out.println(b2);
//				
//				int num1 = 10;
//				int num2 = 20;
//				System.out.println(num1 < num2);
//				System.out.println(num1 > num2);
//				
//				int num = 1;
//				float num1 = 1; // 
//				System.out.println(num);
//				System.out.println(num1);
				// 자바에서 대문자로 시작하는 것은 객체 밖에 없다
				// 다른 자료형 + "문자열" -> 문자열/ "문자열" + 다른 자료형 -> 문자열
//				String str = "기차";
//				Strign str = 123 + 45 + "기차" + "출발" // 168됨
				// 위아래 결과는 똑같다. String이 객체이기에 가능한 생성 방법이다
//				String str = "\"안녕하세요.\"\n제 이름은 ㅇㅇ입니다."; // \n 은 개 행 문자
//				String str2 = new String("안녕하세요. 제 이름은 ㅇㅇ입니다.");
//				
//				System.out.println(str);
//				System.out.println(str2);
				// final 은 상수 선언 (바뀌지 않는 값), 상수는 보통 대문자로 표시
//				final int NUM = 3;
//				NUM = 2; // 안됨
						
				// 형변환- 연산하려면 두 자료형이 같아야 해서 형 변환이 일어난다
				// 자료형 크기에 상관없이 정수 자료형보다 실수 자료형이 우선한다
//				short num = 2;
//				short num2 = 3;
//				short sum = (short)num + num2;
//				System.out.println("안녕하세요");
				
//				double pi = 3.1415;
//				int wholenumber = (int)pi; // 명시적 형변환
//				System.out.println(wholenumber);
//				
//				long num1 = 3000000007L;
//				int num2 = (int)num1;
//				System.out.println(num2);
				
				short num1 = 1;
				short num2 = 2;
				short num3 = (short)(num1 + num2);
				System.out.println(num3);
				
		}
	}

		// float는 7자리에서 오차 발생, double은 16자리에서 오차 발생, 즉 둘 사이에서의 자료형 선택기준은 정밀도
		// 작은 따옴표로 묶어서 하나의 문자를 표시 ex) '안' , 두글자는 안됨 "" 이거 써야됨
		// long 쓸 때는 끝에 L붙여야 함

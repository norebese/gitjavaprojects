package testproject;
import java.util.*; // 1 가져와야한다

public class input {
	public static void main(String[] args) {
//		int num, num2;
//		float num1;
		String str1, str2, str3;
		Scanner sc = new Scanner(System.in); //2 객체를 선택해줘야한다
//		num = sc.nextInt();
//		num2 = sc.nextInt();
//		num1 = sc.nextFloat();
		str1 = sc.next();
		str2 = sc.nextLine();
		str3 = sc.next();
		
//		System.out.println(num + num2);
//		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}

package testproject;

public class test7 {
	public static void main(String[] args) {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1/iNum2); // 2
		System.out.println(iNum1-(iNum2+iNum2)); // 2

		System.out.println(dNum*iNum2); // 10.0
		System.out.println((float)iNum1); // 10.0

		System.out.println((float)iNum1/iNum2); // 2.5
		System.out.println((float)dNum); // 2.5

		System.out.println((int)fNum); // 3
		System.out.println((int)iNum1/(int)fNum); // 3

		System.out.println(iNum1/fNum); 
		System.out.println((double)iNum1/fNum);

		System.out.println(ch);
		System.out.println((int)ch); // ch+0 해도됨
		System.out.println(ch+iNum1);
		System.out.println((char)(ch+iNum1) );

	}

}

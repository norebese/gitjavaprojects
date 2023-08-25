package testproject;

import java.util.Arrays;
import java.util.Scanner;

public class Study0801 {
	public static void main(String[]args) {
		/*
		 * 1. 배열형식의 참조변수 선언
		 * 2. 배열객체 할당
		 * 3. 배열 데이터 초기화
		 * 4. 배열 데이터 활용
		 */
		
//		int[]ref={1,2,3,4,5,6};
//		ref= new int[6];
//		ref=new int[] {1,2,3,4,5,6};
//		ref[0]=1;
//		ref[1]=2;
//		ref[2]=3;
//		ref[3]=4;
//		// 반복문을 이용해서 배열 초기화
//		for(int i=0;i<ref.length;i++) {
//			ref[i]=i+1;
//		}
//		// 반복문을 이용해서 배열 출력
//		for(int i=0;i<ref.length;i++) {
//			System.out.println(ref[i]);
//		}
		
		// int형 변수 num울 생성하고 값을 10으로 초기화
//		int num=10;
//		// String형 변수 str을 생성하고 값을 "hi"로 초기화
//		String str="hi";
//		//num 과 str을 출력
//		System.out.println(num+str);
//		//만약 num이 5보다 크다면 "num은 5보다 큰 수입니다" 출력
//		if(num>5) {
//			System.out.println("num은 5보다 큰 수입니다");
//		}
//		//더 작다면 "num은 5보다 작은 수 입니다" 출력
//		else if (num<5) {
//			System.out.println("num은 5보다 작은 수입니다");
//		}
//		//5라면 "num은 5입니다" 출력
//		else if(num==5) {
//			System.out.println("num은 5입니다");
//		}
//		//반복문을 활용하여 1~num까지 숫자를 순차적으로 출력
//		//ex) num=3일때 1 2 3 출력
//		//for while 각각 작성
//		for(int i=1;i<=num;i++) {
//			System.out.print(i+" ");
//		}
//		System.out.println();
//		int i=1;
//		while(num>=i) {
//			System.out.print(i+" ");
//			i++;
//		}
//		System.out.println();
//		//길이가 20인 int형 배열 생성후 반복문을 이용하여 값을 1~20까지 순차적으로 초기화
//		int arr[]=new int[20];
//		for(i=0;i<arr.length;i++) {
//			arr[i]=i+1;
//		}
//		//반복문을 이용하여 arr요소 전체 출력
//		for(i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//			if(i==arr.length-1) {
//				System.out.println();
//			}
//		}
//		//String형 길이가 5인 배열을 생성하고 생성과 동시에{"사과", "포도", "귤", "파인애플","바나나"}로 초기화
//		String[] arr2= {"사과","포도","귤","파인애플"	,"바나나"};
//		//반복문을 이용하여 arr2요소 전체 출력
//		for(i=0;i<arr2.length;i++) {
//			System.out.println(arr2[i]);
			
		
		// Arrays.sort(배열);: 오름차순 정렬
		//Arrays.sort(배열,Collections.reverseOrder()); : 내림차순 정렬
		
//		int num[]=new int[6];
//		int i=0;
//		while(i<num.length) {
//			int nan=(int)(Math.random()*45+1);
//			
//			for(int j=0;j<num.length;j++) {
//				if(num[i] == nan) {
//					nan = 0;
//					break;
//				}
//			}
//			if(nan==0)
//				continue;
//				else {
//					num[i]=nan;
//					i++;
//				}
//			
//			
//		}
//		Arrays.sort(num);
//		for(i=0;i<num.length;i++) {
//			System.out.print(num[i]+" ");
//	
//		}
//		// for문으로 중복검사!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		for(i=0;i<num.length;i++) {
//			num[i]=(int)(Math.random()*45+1);
//			for(int j=0;i<i;j++) {
//				if (num[i]==num[j]) {
//					i--;
//					break;
//				}
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		String num;
//		char[] numArray;
//		int count=0;
//		System.out.println("문자열 : ");
//		num=sc.next();
//		
//		numArray=new char[num.length()];
//		System.out.print("문자열에 들어있는 문자 : ");
//		
//		int i=0, j=0,sum=0;
//		while(i<num.length()) {
//			numArray[j] =num.charAt(i);
//			//중복검사
//			for(int k=0;k<j;k++) {
//				if(numArray[j]==numArray[k]) {
//					j--;
//					sum++;
//					break;
//				}
//			}
//			
//			i++;
//			j++;
//			
//		}
//		
//		for( int h=0;h<numArray.length;h++) {
//			
//			if(h==(numArray.length-1)) {
//				System.out.print(numArray[i]);
//			}else {
//				System.out.print(numArray[i]+",");
//			}
//		}
		
		
		
//		for(int i=0;i<num.length();i++) {
//			
//			numArray[i]=num.charAt(i);
//			for(int j=0;j<i;j++) {
//				if(numArray[j]==numArray[i]) {
//					
//				}
//			}
//			
//			count++;
//			
//			if(num.charAt[i]==num.charAt[i+1]) {
//				continue;
//			} else {
//				System.out.print(numArray[i]+" ");
//			}
//			
//		}
//		System.out.println("\n문자 개수 : "+count);
		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		
//		System.out.print("배열의 크기를 입력하세요 :");
//		int num=sc.nextInt();
//		String [] numArray=new String[num];
//	
//		for(int i=0;i<numArray.length;i++) {
//			System.out.print(i+1+"번째 문자열 :");
//			numArray[i]=sc.next();
//			if(i==(numArray.length-1)) {
//				System.out.print("더 값을 입력하시겠습니까? :");
//				String a=sc.next();
//				if(a.equals("y")) {
//					System.out.print("더 입력하고 싶은 개수:");
//					int b=sc.nextInt();
//					
//					 String[] numArray2=new String[numArray.length+b];
//					 
//					 for(i=0;i<numArray.length;i++) {
//						 numArray[i]=numArray2[i];
//					 }
//					 numArray=numArray2;
//					 i--;
//					continue;
//				}else {
//					
//					for(int j=0;j<numArray.length;j++) {
//						System.out.print("[");
//						System.out.print(numArray2[j]+",");
//						System.out.print("]");
//				}
//				}
//				
//					
//					
//				
//			}
//		}
		
		//크기가4인 배열 3개를 담고있는 2차원배열을 만들어라 (자료형:in)
//		int [][]arr=new int[3][4];
//		arr[0][0]=1;
//		arr[0][1]=2;
//		arr[0][2]=3;
//		arr[0][3]=4;
//		arr[1][0]=3;
//		arr[1][1]=3;
//		arr[1][2]=3;
//		arr[1][3]=3;
//		arr[2][0]=5;
//		arr[2][1]=5;
//		arr[2][2]=5;
//		arr[2][3]=5;
		
		//크기가 각각 4,3,5,2,인 1차원 배열들로 생성된 2차원 배열을 만들고 값을 전부 10으로 초기화
//		int[][]arr = {
//				{10,10,10,10},
//				{10,10,10},
//				{10,10,10,10,10},
//				{10,10}
//		};
		// or
//		int[][]arr=new int[3][];
//		arr[0] =new int[3];
//		arr[1] =new int[2];
//		arr[2] =new int[5];
		
		
		
		
		//2차원배열 전체 출력
//		for(int i=0;i<arr.length;i++) {
//			arr[i][0]=5;
//			System.out.println();
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=5;
//				System.out.print(arr[i][j]);
//				
//			}

//		}
		
		
//		for(int i=0;i<arr[1].length;i++) {
//			arr[1][i]=5;
//			System.out.println(arr[1][i]);
//		}
		
//		char[][]arr=new char[3][3];
		
//		arr[0][0]='a';
//		arr[0][1]='b';
//		arr[0][2]='c';
//		arr[1][0]='d';
//		arr[1][1]='e';
//		arr[1][2]='f';
//		arr[2][0]='g';
//		arr[2][1]='h';
//		arr[2][2]='i';
//		char ch ='a';
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]=ch++;
//			}
//			
//		}
//		
//		int j=0;
//		while(j<arr.length) {
//			for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[j][i]+" ");
//			}
//		j++;
//		System.out.println();
//		}
		
		
//		for(int i=0;i<arr.length;i++) {
//			arr[i][0]="("+i+",";
//			for(int j=0;j<arr[i].length;j++) {
//				arr[i][j]="("+i+","+j+")";
//				System.out.print(arr[i][j]);
//				if(j<arr[i].length) {
//					System.out.println();
//				}
//
//			}
//		}
			
//		int[][]num=new int[4][4];
//		int sum=1;
//		
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				num[i][j]=sum++;
//				System.out.print(num[i][j]+" ");
//				
//			}
//			System.out.println();
//		}
		
//		int[][]num=new int[4][4];
//		int sum=16;
//		for(int i=0;i<num.length;i++) {
//			for(int j=0;j<num[i].length;j++) {
//				num[i][j]=sum--;
//				System.out.print(num[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		//4행 4열 2차원 배열을 생성하여 0행 0열부터 2행2열까지는 1~10 난수 값 저장 후 아래의 내용처럼 처리하세요
		
		int[][]arr=new int[4][4];
		int num=1, sum=0;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				if(j==arr[i].length-1) {
					arr[i][j]=arr[i][0]+arr[i][1]+arr[i][2];
					sum=arr[i][0]+arr[i][1]+arr[i][2];
				}else {
					arr[i][j]=(int)(Math.random()*10+1);
				}
				if(i==arr.length-1) {
					arr[i][j]=arr[0][j]+arr[1][j]+arr[2][j];
					
				}
				if (i==arr.length-1 && j==arr[i].length-1){
					arr[i][j]=arr[0][j]+arr[1][j]+arr[2][j]
							+sum;
				}
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
			
}
}



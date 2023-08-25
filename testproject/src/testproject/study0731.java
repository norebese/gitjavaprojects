package testproject;

import java.util.Arrays;
import java.util.Scanner;
// 배열
public class study0731 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		// ex) int[] ref=new int[5];
		// 길이가 5인 int형 1차원 배열 생성
//		int[] ar1=new int[5];
//		
//		double[]ar2=new double[7];
//		
//		float[] ar3;
//		ar3=new float [9];
//		
//		System.out.println("ar1의 길이: "+ar1.length);
//		System.out.println("ar1의 길이: "+ar2.length);
//		System.out.println("ar1의 길이: "+ar3.length);
//		
//		String str="dong in";
//		System.out.println("str의 rlfdl: "+str.length());
		
//		String str[]= new String[5];
//		str[0]="jiwon";
//		str[1]=new String("cafe"); // 객체는 이렇게 써야하는데 String은 워낙 많이 써서 컴퓨터가 허용해줌
//		str[2]= "tree";
//		str[3]= "choi";
//		str[4]="hi";
//		int count=0;
//		
//		for(int i=0;i<str.length; i++) //배열 길이는[] 안써도 됨
//			count += str[i].length(); //[] 안에는 배열 안의 몇번째 변수인가
//		
//		System.out.println("총 문자의 수는: "+ count);
//		int[]arr=new int[]{1,2,3);
//		
//		int[]arr= {1,2,3};
		
		//얕은 복사
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2=arr1;
//		arr2[2]=0;
//		System.out.println(arr1[2]);
//	
		//깊은 복사, 완전한 복사
		
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2= new int[5];
//		for(int i=0;i<arr1.length;i++) {
//			arr2[i]=arr1[i];
//		}
//		//반복문을 통해서 arr1, arr2에있는 모든 요소 출력
//		
//		for(int i=0;i<arr1.length;i++) {
//			System.out.println("arr1["+i+"]:"+arr1[i]);
//		}
//		for(int i=0;i<arr2.length;i++) {
//			System.out.println("arr1["+i+"]:"+arr1[i]);
//		}

		// 보편적인 배열 복사 방법
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2= new int[5];
//		arr2=arr1.clone();
		
		//배열 arr1을 전부 7로 초기화
//		Arrays.fill(arr1, 7); // 위에 import java.util.Arrays; 만들어 줘야함
//		int i;
//		int[]arr= new int[10];
//		for(i=1;i<=arr.length;i++){
//			arr[i-1]=i;
//			System.out.print(arr[i]+" ");
//		}
		
//		int[]arr= new int[10];
//		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=(arr.length-i);
//			System.out.println(arr[i]);
//		}
		
//		int num;
//		
//		System.out.println("양의 정수 :");
//		num=sc.nextInt();
//		int[]arr= new int[num];
//		int i;
//		for(i=0;i=num;i++) {
//			arr[i]=i+1;
//			System.out.print(arr[i]+" ");
//		}
		
//		String[]str= new String[5];
//		str[0]= "사과";
//		str[1]= "귤";
//		str[2]= "포도";
//		str[3]= "복숭아";
//		str[4]= "참외";
//		System.out.println(str[1]);
//		
//		String[]str= {"사과","귤","포도","복숭아","참외"};
//		System.out.println(str[1]);

//		String str; //검색할 문자열
//		char b; //찾을 문자 하나
//		int count=0;
//		
//		System.out.println("문자열: ");
//		str=sc.next();
//		
//		System.out.println("문자: ");
//		b=sc.next().charAt(0);
//		// 
//		for(int i=0; i<str.length();i++) {
//			if(str.charAt(i)==b) {
//				System.out.println(i+" ");
//				count++;
//			}
//		}
			//-----------------------------------------------------
		
//			String str; //검색할 문자열
//			char ch; //찾을 문자 하나
//			int count=0;
//			
//			System.out.println("문자열: ");
//			str=sc.next();
//			
//			System.out.println("문자: ");
//			ch=sc.next().charAt(0);
//			// 
//			for(int i=0; i<str.length();i++) {
//				if(str.charAt(i)==ch) {
//					System.out.println(i+" ");
//					count++;
//				}
//			}
//				
//				System.out.println(ch+"개수:"+count);
			
//			String[]str= {"월","화","수","목","금","토","일"};
//			
//			System.out.print("0~6 사이 숫자 입력: ");
//			int num=sc.nextInt();
//			
//			switch(num) {
//			case 0:
//			case 1:
//			case 2:
//			case 3:
//			case 4:
//			case 5:
//			case 6:
//				System.out.println(str[num]+"요일");
//				break;
//			default:
//				System.out.println("잘못입력하셨습니다");
//			
//			}
//			
//			if(num<6) {
//				System.out.println(str[num]+"요일");
//			}else {
//				System.out.println("잘못입력하셨습니다");
//			}
		
//			System.out.print("정수: ");
//			int num=sc.nextInt();
//			int[]len= new int[num];
//			for(int i=0;i<num;i++) {
//				System.out.println("배열"+i+"번째 인텍스에 넣을 값:");
//				len[i]=sc.nextInt();
//				
//			}
//			int sum=0;
//			for(int j=0;j<num;j++) {
//				System.out.print(len[j]+" ");
//				
//				sum=sum+len[j];
//			}
//			System.out.println("\n종합: "+sum);
//			
//			int num, count=0;
//	
//				System.out.print("정수 :");
//				num=sc.nextInt();
//				while(true) {
//					if(num%2==0||num<3) {
//						System.out.println("다시 입력하세요.");
//						System.out.print("정수 :");
//						num=sc.nextInt();
//					} else {
//						break;
//					}
//				}
//				
//				int[]arr=new int[num];
//				//0~n까지 반복 중간값 까지는 1부터 1씩 늘려서 저장 중간 이후는 1씩 빼서 저장
//				for(int i=0;i<arr.length;i++) {
//					if(arr.length/2<i) {
//						count--;
//					}else {
//						count++;
//					}
//					arr[i]=count;
//				}
//				for(int i=0;i<arr.length;i++) {
//					System.out.print(arr[i]+", ");
//				}
			
//				String[]menu= {"양념","후라이드","간장"};
//				String name,str=null;
//				System.out.print("치킨 이름을 입력하세요 : ");
//				name=sc.next();
//				//만약 str 안쓰고 if문 안에서 system.out.print 하면 불필요하게 반복되는 경우가 생김
//				// 따라서 바로 출력하지 않고 따로 변수를 만들어 그곳에 값만 변하면서 쌓아두면 그 밑에 까로 만든 변수만을 출력하면 된다.
//				for(int i=0;i<menu.length;i++) {
//					if(name.equals(menu[i])) {
//						str=name+"치킨 배달 가능";
//						break;
//					}else {
//						str=name+"치킨은 없는메뉴 입니다";
//					}
//				}
//				System.out.println(str);
				
//				char[]num=new char[14];
//				System.out.print("주민들록번호(-포함) : ");
//				num=sc.next().toCharArray(); //String 을 배열로 바꿔주는 기능, ex)"주민등록번호".toCharArray
//				
//				for(int i=0;i<num.length;i++) {
//					if(i>7) {
//						System.out.print("*");
//					}else {
//						System.out.print(num[i]);
//					}
//				}
//				
//			System.out.println((int)(Math.random()*10));// 0보다 크고 1보다 작은 난수 발생 ex)*50하면 1~49, *100하면 1~99
			
//			int[]num=new int[10];
//			
//			for(int i=0;i<num.length;i++) {
//				num[i]=(int)(Math.random()*10+1);
//			}
//			for(int i=0;i<num.length;i++) {
//				System.out.print(num[i]+" ");
//			}
			
//			int[]arr=new int[10];
//			int max=0,min=11;
//			for(int i=0;i<arr.length;i++) {
//				arr[i]=(int)(Math.random()*10+1);
//			}
//			for(int i=0;i<arr.length;i++) {
//				System.out.print(arr[i]+" ");
//				if(max<arr[i]) {
//					max=arr[i];
//				}
//				if(min>arr[i]) {
//					min=arr[i];
//				}
//			}
//			
//			System.out.print("\n최대값: ");
//				System.out.print(max);
//			System.out.print("\n최소값: ");
//				System.out.print(min);
			
			int[]arr=new int[10];
			int i=0;
			while(i<arr.length) {
				//배열검사
				int nan=(int)(Math.random()*10+1);
				
				//난수 검사
				for(int j=0;j<arr.length;j++){
					if(arr[j] == nan) {
						nan = 0;
						break;
					}
				}
				
				if(nan==0)
				continue;
				else {
					arr[i]=nan;
					i++;
				}
				
	
			}
			for(i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
		
			}

		
	}

}

//package com.kh.javai;
//
//import java.util.Scanner;
//
////main 매서드를 실행해주기위한 class
//public class MainStart {
//	public static void main(String[]args) {
//	//인스턴스 객체생성 방법
//	//클래스 객체이름=new 생성자;(클래스와 이름이 동일한 매서드);
////		Student choi = new Student("최지원", 20);
////	//앞에 문자열 뒤에 숫자형 있는 곳에 찾아 들어감, 순서도 맞아야함
////		Student kim = new Student("김지원");
////	//tName으로 들어갈 수 있어서
////		Student kim1 = new Student("김지원",48,"여자");
////	//생성자가 이름 나이 성별 새팅해주고 
////		kim1.info(); // 매서드 실행
////		Student kim2 = new Student("김동인",28,"남자");
////		kim2.info();
//	// kim 1이랑 2의 결과값이 다르고 가리키는 매모리가 다름, 덮어져서 사라지지 않음
//
//		
//	//영어점수 수힉점수 국어점수를 입력받아
//	//각 과목이 40점 이상이고 평균이 60점 이상일 때 합격
//	// 조건을 충족하지 못하면 불합격을 나타내주는 프로그램 작성
//	// ex) 영어점수:40, 국어:70, 수학:70
//		
//		Scanner sc = new Scanner(System.in);
////		Student kim2 = new Student("김동인",28,"남자");
////		kim2.info();
//////		Student kim3 = new Student(40,70,70);
//////		kim3.score();
////		
////		System.out.print("영어점수 : ");
////		kim2.setEnscore(sc.nextInt());
////		
////		System.out.print("국어점수 : ");
////		kim2.setKoscore(sc.nextInt());
////		
////		System.out.print("수학점수 : ");
////		kim2.setMathscore(sc.nextInt());
////
//////		System.out.println("영어점수 : "+kim2.getEnscore());
//////		System.out.println("국어점수 : "+kim2.getKoscore());
//////		System.out.println("수학점수 : "+kim2.getMathscore());
//////		System.out.println("총 합 : "+kim2.getTotal());
//////		System.out.println("평 균 : "+kim2.getAverage());
//////		kim2.checkPass();
////		
////		kim2.displayMyInfo();
//		
////		Car dongin = new Car("횐색","bmw","중형","가솔린","2023-08-04",150,5,100);
////		
////		dongin.statusDisplay(1);
//		
//		// 행동을 입력받고 진행하는 프로그램을 작성하세요
//		//1. 달린다
//		//2. 멈춘다
//		//3. 기름을 충전한다
//		//4. 속도와 잔여기름양을 확인 한다
//		// 다른 버튼을 누르면 종료
////		boolean isFinish=false; //플래그 이용해서 반복문 빠져나오기!!
////		while(!isFinish) {
////			int num;
////			System.out.println("원하는 행동의 버틍을 클릭 하세요");
////			System.out.println("----------------------------");
////			System.out.println("1. 달린다");
////			System.out.println("2. 멈춘다");
////			System.out.println("3. 기름을 충전한다");
////			System.out.println("4. 속도와 잔여기름양을 확인 한다");
////			System.out.println("다른 버튼을 누르면 종료");
////			System.out.println("----------------------------");
////			num=sc.nextInt();
////			switch(num) {
////				case 1:
////					dongin.onAxel();
////					dongin.statusDisplay(2);
////					break;
////				case 2:
////					dongin.onBreak();
////					dongin.statusDisplay(2);
////					break;
////				case 3:
////					System.out.println("얼마나 충전하시겠습니까?");
////					int cc =sc.nextInt();
////					dongin.insertFuel(cc);
////					break;
////				case 4:
////					dongin.statusDisplay(2);
////				default:
////					isFinish=true;
////			
////			}
////		}
////		
//		
////		Student dongin = new Student("동인",2,"남자");
//////		dongin.gender="여자";
////		
////		dongin.getGender();
////		System.out.println(Student.count); //static은 class로 접근해야 함, 객체에서 접근해도 되긴 하지만 비추천
////		Student a = new Student("소망",25,"남자");
////		System.out.println(a.count);
////		Student b = new Student("사랑",23,"여자");
////		System.out.println(a.count);
////		Student c = new Student("희망",26,"남자");
////		Student.showCount();
////		System.out.println(a.count);
//		  
//		
//		//객체이름이 각각 yoon, choi, kim이라는 Student 객체를 생성하라
//		
////		Student yoon=new Student("윤지원", 15, "남자");
////		Student choi=new Student("최소연",25,"여자");
////		Student kim=new Student("김기범",42,"남자");
////		
////		Student[] ban=new Student[3];
////		iban[0]=new Student("윤지원", 15, "남자");
////		iban[1]=new Student("최소연",25,"여자");
////		iban[2]=new Student("김기범",42,"남자");
//		
//		char classRoom;
//		int choice;
//		//최대 학생 수는 30인 클래스(i,h,j)를 3개 만들어라
//		Student[] iban=new Student[30];
//		Student[] hban=new Student[30];
//		Student[] jban=new Student[30];
//		//선택한 반의 주소값을 가지고있는 참조변수
//		Student[] selectBan;
//		// 관리할 클래스를 선택해 주세요. (i j k) :
//		
//		while(true) {
//			System.out.println("관리할 클래스를 선택해 주세요. (i j h반 중 선택 다른 키워드 입력시 종료) :");
//			
//			switch(sc.next().charAt(0)) {
//				case 'i':
//					selectBan=iban;
//					break;
//				case 'j':
//					selectBan=jban;
//					break;
//				case 'h':
//					selectBan=hban;
//					break;
//				default:
//					selectBan=null;	
//			}
//			if (selectBan==null)
//				break;
//			
//			boolean isTrue = true;
//			while(isTrue) {
//				System.out.println("1. 학생추가");
//				System.out.println("2. 학생제거");
//				System.out.println("3. 학생목록 확인");
//				System.out.println("4. 학생조회");
//				System.out.println("기타입력시 뒤로");
//				
//				choice= sc.nextInt();
//				
//				switch(choice) {
//				case 1:{
//					//selectBan의 마지막 빈자리를 찾는다.
//					int index=0;
//					while(index<selectBan.length &&selectBan[index]!=null) {
//						index++;
//					}
//					
//					// selectBan에 자리가 있을 시 학생을 추가해 준다
//					if(index==selectBan.length) {
//						System.out.println("더이상 해당 반에는 학생을 추가할 수 없습니다");
//					}else {
//						System.out.println("추가할 학생의 이름,나이,성별을 입력해 주세요");
//						selectBan[index]=new Student(sc.next(),sc.nextInt(),sc.next());
//					}
//				}break;
//				case 2:{
//					int index=0;
//					while(index<selectBan.length &&selectBan[index]!=null) {
//						index++;
//					}
//					if(index==0) {
//						System.out.println("삭제할 학생이 없습니다");
//					}else {
//						selectBan[index-1]=null;
//					}
//				}break;
//				case 3:{
//					System.out.println("--------------");
//					System.out.println("이름\t나이\t성별");
//					for(int i=0;i<selectBan.length;i++) {
//						if(selectBan[i]==null)
//							break;
//						selectBan[i].info();
//					}
//					System.out.println("--------------");
//				}break;
//				case 4:{
//					
//					System.out.println("조회할 학생의 정보를 입력하세요(이름,나이,성별): ");
//					String name=sc.next();
//					int age=sc.nextInt();
//					String gender=sc.next();
//					Student tmp=null;
//					for(int i=0;i<selectBan.length;i++) {
//						if(selectBan[i]==null) {
//							break;
//						}else if (selectBan[i].equals(name,age,gender)){
//							tmp = selectBan[i];
//							break;
//						}
//					}
//					if(tmp != null) {
//						System.out.println("해당 학생은 이미 등록되었습니다");
//					}else {
//						System.out.println("해당학생을 찾을 수 없습니다");
//					}
//				}break;
//				
//				
//				
//				default:
//					isTrue=false;
//				}
//			}
//		}
//		
//		
//		System.out.println("총 학생의 수 : "+Student.count+"명을 등록 완료하였습니다");
//		
//		
//	}
//}
////static을 생성자에서 초기화해서 몬스터 나올때마다 static 리셋 시킬 수 도 있을지도....
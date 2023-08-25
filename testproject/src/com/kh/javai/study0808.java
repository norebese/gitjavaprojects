package com.kh.javai;

import java.util.Scanner;

public class study0808 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		//길이가 10인 Customer 객체배열을 생성하고
		//0번째 인덱스 값에 myId, myPassword12으로 객체생성
		
//		Customer[] a=new Customer[10]; //이제 pos안에 있는 customerList 쓸거임
//		a[0]=new Customer("동인","myId","myPassword12","ehddls1029");
		
		
		POSSystem pos = POSSystem.getPosInstance();//스태틱 매소드는 클래스 이름으로 바로 접근
		pos.saveCustomer(new Customer("동인","myId","myPassword12","ehddls1029"));
		
		Customer choi = pos.insertCustomer();
		
		
//		int choice= pos.printMenu();
		boolean isLoop= true;
		while(true){
			switch(pos.printMenu()) {
				case 1:{//회원등록
					Customer newuser = pos.insertCustomer();
					pos.saveCustomer(newuser);
				}break;
				case 2:{//회원삭제
					pos.deleteLastCustomer();
				}break;
				case 3:{//회원목록 출력
					pos.viewCustomerList();
				}break;
				case 4:{//로그인
					pos.login();
				}break;
					default:
						isLoop=false;
				}
		}
		
		
		
		//++--------------------------회원삭제-----------------------------++
		//마지막으로 등록된 회원을 삭제한다
		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==null&&i!=0) { //아니면 최초i를 1로 설정할 수도 있음
//				a[i-1]=null;
//				break;
//			}else if(i==a.length-1) {
//				a[i]=null;
//			}
//		}
		
		//++--------------------------모든회원 출력-----------------------------++
		// 이름 아이디 비밀번호 이메일
//		System.out.println("이름\t아이디\t비밀번호\t이메일");
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==null) {
//				break;
//			}
//			System.out.println(a[i]);
//		}
		
		
		
		//++--------------------------회원가입-----------------------------++
//		String name, id, psw, email;
//		System.out.print("아이디를 입력하세요 : ");
//		id=sc.next();
//		System.out.print("비밀번호를 입력하세요 : ");
//		psw=sc.next();
//		System.out.print("이름을 입력하세요 : ");
//		name=sc.next();
//		System.out.print("이메일을 입력하세요 : ");
//		email=sc.next();
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==null) {
//				a[i]=new Customer(name,id,psw,email);
//				System.out.println(a[i].toString());
//				System.out.println("회원정보가 정상적으로 등록되었습니다");
//				break;
//			}else if(i==a.length-1) {
//				System.out.println("더이상 회원을 등록할 수 없습니다");
//			}
//		}
		
		
		//아이디, 비밀번호, 이름, 이메일을 입력받아 Customer 객체를 추가해보자
		/*
		 * 아이디를 입력하세요:
		 * 비밀번호를 입력하세요:
		 * 이름를 입력하세요:
		 * 이메일를 입력하세요:
		 * 
		 * 이름: ㅇㅇㅇ
		 * 이메일: ㅇㅇㅇ
		 * ID: ㅇㅇㅇ
		 * password: ㅇㅇㅇ
		 * 회원정보가 정상적으로 등록되었습니다
		 */
		

		//++---------------------------------로그인-----------------------------++
//		Customer loginCustomer;
//		
//		
//		System.out.print("아이디 : ");
//		String inputid=sc.next();
//		System.out.print("비밀번호 : ");
//		String inputpass=sc.next();
//		
//		String str="아이디를 찾을 수 없습니다";
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==null) {
//				str="등록된 회원정보를 찾을 수 없습니다";
//				break;
//			}else if(a[i].equals(inputid,inputpass)) {
//				loginCustomer=a[i];
//				str="로그인 성공";
//				break;
//			}else if(a[i].idCheck(inputid)) {
//				str="비밀번호가 다릅니다";
//				break;
//			}else if(i==a.length-1) {
//				str="등록된 회원정보를 찾을 수 없습니다";
//			}
//		}
//		
//		System.out.println(str);
		//---------------------------------로그인---------------------------------

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

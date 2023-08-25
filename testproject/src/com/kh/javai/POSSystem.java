package com.kh.javai;

import java.util.Scanner;

//pos의 전체적인 관리를 위한 class
public class POSSystem {
	//외부에서 점근이 불가능한 pos 객체 생성
	private final static Customer[] CUSTOMER_LIST = new Customer[10];
	private static POSSystem PosInstance = new POSSystem();
	Scanner sc = new Scanner(System.in);
	//외부에서 생성할 수 없도록 기본생성자의 접근을 private으로 설정
	private POSSystem() {
		
	}
	
	
	public static POSSystem getPosInstance() {
		//POSSystem내부에 있는 매서드 영역이므로 private한 PosInstance에
		//접근이 가능하다.
		return PosInstance;
	}

	//POS 메뉴를 나타내 주는 매소드
	public int printMenu() {
		System.out.print("------------------------");
		System.out.print("1. 회원등록");
		System.out.print("2. 회원삭제");
		System.out.print("3.회원목록출력");
		System.out.print("4.로그인");
		System.out.print("------------------------");
		System.out.print("원하시는 번호를 입력해 주세요.(이외번호를 입력하시면 프로그램을 종료합니다");
		
		return sc.nextInt();
	}
	//회원정보를 입력받아 배열에 저장하는 매소드
	public void joinCustomer() {
		for(int i=0;i<this.CUSTOMER_LIST.length;i++) {
			if(this.CUSTOMER_LIST[this.CUSTOMER_LIST.length-1]==null) {
				System.out.println("더이상 회원을 등록할 수 업습니다");
				return;
			}
		}
		Customer newUser = insertCustomer();
		saveCustomer(newUser);
		
	}
	
	
	//회원가입 정보입력을 위한 매서드
	public Customer insertCustomer() {
		String name, id, psw, email;
		System.out.print("아이디를 입력하세요 : ");
		id=sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		psw=sc.next();
		System.out.print("이름을 입력하세요 : ");
		name=sc.next();
		System.out.print("이메일을 입력하세요 : ");
		email=sc.next();
		Customer tmp = new Customer(name,id,psw,email);
		return tmp;
	}
	
	
	
	
	//회원을 실재로 배열에 저장하는 매서드
	public void saveCustomer(Customer user) {
		
		for(int i=0;i<this.CUSTOMER_LIST.length;i++) {
			if (this.CUSTOMER_LIST[i]==null) {
				this.CUSTOMER_LIST[i]=user;
				
				System.out.println(this.CUSTOMER_LIST[i].toString());
				System.out.println("회원정보가 정상적으로 등록되었습니다");
				break;
			}else if(i==this.CUSTOMER_LIST.length-1) {
				System.out.println("더이상 회원을 등록할 수 없습니다");
			}
		}
	}
	
	//맨 마지막으로 추가된 회원을 삭제한다
	public void deleteLastCustomer() {
		for(int i=0;i<CUSTOMER_LIST.length;i++) {
			if(CUSTOMER_LIST[i]==null&&i!=0) { //아니면 최초i를 1로 설정할 수도 있음
				CUSTOMER_LIST[i-1]=null;
				System.out.println(CUSTOMER_LIST[i].getName()+"회원을 삭제하였습니다");
				break;
			}else if(i==CUSTOMER_LIST.length-1) {
				CUSTOMER_LIST[i]=null;
			}
		}
	}
	//회원목록을 출력해주는 매소드
	public void viewCustomerList() {
		for(int i=0;i<this.CUSTOMER_LIST.length;i++) {
			if(this.CUSTOMER_LIST[i]==null) {
				break;
			}
			System.out.println(this.CUSTOMER_LIST[i].toString());
		}
	}
	
	public void login() {
		System.out.print("아이디 : ");
		String inputid=sc.next();
		System.out.print("비밀번호 : ");
		String inputpass=sc.next();
		
		String str="아이디를 찾을 수 없습니다";
		for(int i=0;i<this.CUSTOMER_LIST.length;i++) {
			if(this.CUSTOMER_LIST[i]==null) {
				str="등록된 회원정보를 찾을 수 없습니다";
				break;
			}else if(this.CUSTOMER_LIST[i].equals(inputid,inputpass)) {
				
				str="로그인 성공";
				break;
			}else if(this.CUSTOMER_LIST[i].idCheck(inputid)) {
				str="비밀번호가 다릅니다";
				break;
			}else if(i==this.CUSTOMER_LIST.length-1) {
				str="등록된 회원정보를 찾을 수 없습니다";
			}
		}
		
		System.out.println(str);
	}
	
	
	
	
}

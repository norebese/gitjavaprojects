package com.kh.iclass;

import java.util.Scanner;

public class CafePos {
	private static CafePos instance;
	private final int MAX_COUNT=10;
	private final Product[] DRINK_ARR=new Product[MAX_COUNT];
	Scanner sc=new Scanner(System.in);
	private boolean isRun=true;
	
	//외부에서 객체를 생성하지 못하도록 생성자의 접근제한자를 private으로 설정
	private CafePos() {
		
	}

	public static CafePos getInstance () {
		if(instance == null)
		return instance=new CafePos();
		return instance;
	}
	
	public boolean getIsRun	() {
		return this.isRun;
	}
	public void setIsRun(boolean isRun) {
		this.isRun=isRun;
	}
	
	
	public int printMenu() {
		
		System.out.println("------------------------------");
		System.out.println("1. 메뉴 생성");
		System.out.println("2. 메뉴 수정");
		System.out.println("3. 메뉴 조회");
		System.out.println("4. 메뉴 삭제");
		System.out.println("5. 전체 메뉴 확인");
		System.out.println("------------------------------");
		System.out.println("원하시는 메뉴를 선택해 주세요");
		return sc.nextInt();
		
	}
	
	public void insertMenu() {
		System.out.print("음료명을 입력하세요 : ");
		String name=sc.nextLine();
		System.out.print("금액을 입력하세요 : ");
		int price=sc.nextInt();
		     
		sc.nextLine();//위의 엔터친거를 흡수해줌
		System.out.print("설명을 입력하세요 : ");
		String descrip=sc.nextLine();
		
		
		for(int i=0;i<DRINK_ARR.length;i++) {
			if(DRINK_ARR[i]!=null&&name.equals(DRINK_ARR[i].getName())) {
				System.out.println(name+"은 이미 등록되었습니다");
				break;
			}else if(DRINK_ARR[i]==null) {
				DRINK_ARR[i]=new Product(name,price,descrip);
				System.out.println(name+"가 메뉴에 추가되었습니다");
				break;
			}else if (i==DRINK_ARR.length-1) {
				System.out.println("더이상 메뉴를 추가할 수 없습니다");
			}
		}
	}
	
	public void printDrinkArr() {
		for(int i=0;i<DRINK_ARR.length;i++) {
			System.out.println("번호\t메뉴명\t가격\t설명");
				if(DRINK_ARR[i]==null) {
					System.out.println(i+"\t-\t-\t-");
				}else {
					System.out.println(i+"\t"+DRINK_ARR[i].toString());
				}
		}

	}
	
	public void updateDrinkUnit() {
		printDrinkArr();
		
		Product selectMenu=null;
		
		System.out.println("수정할 메뉴의 번호를 입력하세요: ");
		int num=sc.nextInt();
		
		
		
		DRINK_ARR[num]=selectMenu;
		if(selectMenu==DRINK_ARR[num]) {
			System.out.println("해당 번호의 메뉴가 존재하지 않습니다");
		}else {
			System.out.println("수정할 정보를 입력하세요: ");
			switch(sc.next()) {
				case "이름":
					System.out.println("새로운 이름을 입력하세요: ");
					selectMenu.setName(sc.nextLine());
					System.out.println(num+"\t"+selectMenu.toString());
					break;
				case "가격":
					System.out.println("새로운 가격을 입력하세요: ");
					selectMenu.setPrice(sc.nextInt());
					System.out.println(num+"\t"+selectMenu.toString());
					break;
				case "설명":
					System.out.println("새로운 설명을 입력하세요: ");
					selectMenu.setDescription(sc.nextLine());
					System.out.println(num+"\t"+selectMenu.toString());
					break;
				default:
						System.out.println("잘못 입력하였습니다");
					
			}
			
		}
	}
	
	public void deleteDrinkUnit() {
		for(int i=DRINK_ARR.length-1;i>=0;i--) {
		if(DRINK_ARR[i]!=null) {
			System.out.println(DRINK_ARR[i].getName()+"메뉴가 삭제되었습니다");
			DRINK_ARR[i]=null;
			break;
		}else if(i==0) {
			System.out.println("삭제할 메뉴가 존재하지 않습니다");
		}
	}
	}
	
	public void searchDrinkUnit() {
		System.out.print("조회할 메뉴의 이름을 입력하세요");
	String menu=sc.next();
	
	for(int i=0;i<DRINK_ARR.length;i++) {
		if(DRINK_ARR[i]!=null&&menu.equals(DRINK_ARR[i].getName())) {
			System.out.println(i+ "\t"+ DRINK_ARR[i].toString());
			
			break;
		}else if(i==DRINK_ARR.length-1) {
			System.out.println("해당 메뉴가 존재하지 않습니다");
		}
	}
	}
	
	
	
	
}

//package com.kh.iclass;
//
//import java.util.Scanner;
//
//public class Mainstart0809 {
//	public static void main(String[]args) {
//		Scanner sc= new Scanner(System.in);
//		
//		CafePos pos = CafePos.getInstance();
//		//메뉴생성, 삭제, 수정, 조회, 전체출력
//		
//		
//	while(pos.getIsRun()) {
//		int number = pos.printMenu();
//		switch(number) {
//		case 1:{
//			pos.insertMenu();
//		}
//			break;
//		case 2:{
//			pos.updateDrinkUnit();
//		}
//			break;
//		case 3:{
//			pos.searchDrinkUnit();
//		}
//			break;
//		case 4:{
//			pos.deleteDrinkUnit();
//		}
//			
//		case 5:{
//			pos.printDrinkArr();
//		}
//			break;
//			default:
//				pos.setIsRun(false);
//		}
//	}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
////		final int Max = 20;
////		
////		//아이스 아메리카노1, 카페라때, 핫초코
////		Product[] drink=new Product[Max];
//////		drink[0]=new Product("a",100,"aa");
//////		drink[1]=new Product("b",200,"bb");
//////		drink[2]=new Product("c",300,"cc");
//////		drink[3]=new Product("d",400,"dd");
//////		drink[4]=new Product("e",500,"ee");
////		
//////		음료명, 금액, 설명을 입력받아 drink에 추가해보아라
////		System.out.print("음료명을 입력하세요 : ");
////		String name=sc.next();
////		System.out.print("금액을 입력하세요 : ");
////		int price=sc.nextInt();
////		System.out.print("설명을 입력하세요 : ");
////		String descrip=sc.next();
////		
////		
////	
////		for(int i=0;i<drink.length;i++) {
////			if(drink[i]!=null&&name.equals(drink[i].getName())) {
////				System.out.println(name+"은 이미 등록되었습니다");
////				break;
////			}else if(drink[i]==null) {
////				drink[i]=new Product(name,price,descrip);
////				System.out.println(name+"가 메뉴에 추가되었습니다");
////				break;
////			}else if (i==drink.length-1) {
////				System.out.println("더이상 메뉴를 추가할 수 없습니다");
////			}
////		}
////		
////		for(int i=0;i<drink.length;i++) {
////			
////				if(drink[i]==null) {
////					System.out.println(i+"\t-\t-\t-");
////				}else {
////					System.out.println(i+"\t"+drink[i].toString());
////				}
////			
////	
////		}
////		
////		//가장 최신으로 저장된 목록 한개 삭제
//////		for(int i=drink.length-1;i>=0;i--) {
//////			if(drink[i]!=null) {
//////				System.out.println(drink[i].getName()+"메뉴가 삭제되었습니다");
//////				drink[i]=null;
//////				break;
//////			}else if(i==0) {
//////				System.out.println("삭제할 메뉴가 존재하지 않습니다");
//////			}
//////		}
////		
////		//조회
////		//조회할 메뉴의 이름을 입력하세요
//////		System.out.print("조회할 메뉴의 이름을 입력하세요");
//////		String menu=sc.next();
//////		
//////		for(int i=0;i<drink.length;i++) {
//////			if(drink[i]!=null&&menu.equals(drink[i].getName())) {
//////				System.out.println(i+ "\t"+ drink[i].toString());
//////				
//////				break;
//////			}else if(i==drink.length-1) {
//////				System.out.println("해당 메뉴가 존재하지 않습니다");
//////			}
//////		}
////		
////		//수정할 메뉴의 번호를 입력하세요:(번호)
////		//수정할 정보를 입력하세요: (이름, 가격, 설명)
////		//이름-> 새로운 이름을 입력하세요:
////		//가격-> 새로운 가격을 입력하세요:
////		// 다시 정보 출력
////		Product selectMenu=null;
////		
////		System.out.println("수정할 메뉴의 번호를 입력하세요: ");
////		int num=sc.nextInt();
////		
////		
////		
////		drink[num]=selectMenu;
////		if(selectMenu==drink[num]) {
////			System.out.println("해당 번호의 메뉴가 존재하지 않습니다");
////		}else {
////			System.out.println("수정할 정보를 입력하세요: ");
////			switch(sc.next()) {
////				case "이름":
////					System.out.println("새로운 이름을 입력하세요: ");
////					selectMenu.setName(sc.nextLine());
////					System.out.println(num+"\t"+selectMenu.toString());
////					break;
////				case "가격":
////					System.out.println("새로운 가격을 입력하세요: ");
////					selectMenu.setPrice(sc.nextInt());
////					System.out.println(num+"\t"+selectMenu.toString());
////					break;
////				case "설명":
////					System.out.println("새로운 설명을 입력하세요: ");
////					selectMenu.setDescription(sc.nextLine());
////					System.out.println(num+"\t"+selectMenu.toString());
////					break;
////				default:
////						System.out.println("잘못 입력하였습니다");
////					
////			}
////			
////		}
////		
//		
//		
//		
//		
//	}
//
//}

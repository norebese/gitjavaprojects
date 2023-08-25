//package com.kh.iclass;
//
//import java.util.Scanner;
//
//public class MainStart {
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		Book[] library = new Book[5];
//		boolean trigger=true;
//		while(trigger) {
//			System.out.println("1:도서 등록");
//			System.out.println("2:도서 삭제");
//			System.out.println("3:도서 목록 조회");
//			System.out.println("4:도서 검색");
//			System.out.println("5:종료");
//			int num=sc.nextInt();
//			switch(num) {
//				case 1:{
//					for(int i=0;i<library.length;i++) {
//						if(library[i]==null) {
//							System.out.println("이름 장르 출판년도 순으로 입력");
//							library[i]=new Book(sc.next(),sc.next(),sc.next());
//							break;
//						}else if(library[library.length-1]!=null) {
//							System.out.println("자리 없음");
//							break;
//						}
//					}
//				}break;
//				case 2:{
//					System.out.println("책 목록");
//					for(int i=0;i<library.length;i++) {
//						if(library[i]!=null) {
//							System.out.println("-----------");
//							System.out.println(library[i].getName()+"("+library[i].getGenre()+","+library[i].getDate()+")");
//							System.out.println("-----------");
//						}
//					}
//					System.out.println("삭제하실 책 이름을 입력하시오");
//					String dname=sc.next();
//					for(int i=0;i<library.length;i++) {
//						if(library[i].getName().equals(dname)) {
//							library[i]=null;
//							for(int j=i+1;j<library.length;j++) {
//								library[i]=library[j];
//								i++;
//							}
//							break;
//						}
//					}
//				}break;
//				case 3:{
//					boolean tri1=true;
//					for(int i=0;i<library.length;i++) {
//						if(library[i]!=null) {
//							System.out.println(library[i].getName()+"("+library[i].getGenre()+","+library[i].getDate()+") |");
//							tri1=false;
//						}else {
//							System.out.println("--------------");
//						}
//					}
//					if(tri1==true) {
//						System.out.println("존재하는 책이 없습니다");
//					}
//				}break;
//				case 4:{
//					System.out.println("검색하고자하는 책 이름을 입력하시오");
//					String bookName=sc.next();
//					boolean tri2=true;
//					for(int i=0;i<library.length;i++) {
//						if(library[i]!=null&&library[i].getName().equals(bookName)) {
//							System.out.println(library[i].getName()+"("+library[i].getGenre()+","+library[i].getDate()+") 이 존재합니다");
//							tri2=false;
//							break;
//						}
//					}
//					if(tri2==true) {
//						System.out.println("존재하는 책이 없습니다");
//					}
//				}break;
//				
//				case 5:{
//					trigger=false;
//				}
//				
//				
//			}
//		}
//		
//		
//	}
//}

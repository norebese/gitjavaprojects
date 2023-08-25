package com.kh.iclass;

import java.util.Scanner;

public class BookPos {
	private static BookPos instance=new BookPos();
	private final int MAX_BOOK=10;
	private final Book[]  BOOK_ARR=new Book[MAX_BOOK];
	Scanner sc=new Scanner(System.in);
	private boolean isRun=true;
	
	private BookPos() {
		
	}
	
	public static BookPos getInstance() {
		return instance;
	}
	
	public boolean getIsRun	() {
		return this.isRun;
	}
	public void setIsRun(boolean isRun) {
		this.isRun=isRun;
	}
	
	public int selction() {
		System.out.println("1:도서 등록");
		System.out.println("2:도서 삭제");
		System.out.println("3:도서 목록 조회");
		System.out.println("4:도서 검색");
		System.out.println("5:종료");
		return sc.nextInt();
	}
	
	public void addBook() {
		
			for(int i=0;i<BOOK_ARR.length;i++) {
				if(BOOK_ARR[i]==null) {
					System.out.println("이름 장르 출판년도 순으로 입력");
					BOOK_ARR[i]=new Book(sc.next(),sc.next(),sc.next());
					
					for(int j=0;j<i;j++) {
						if(BOOK_ARR[i].getName().equals(BOOK_ARR[j].getName())) {
							System.out.println("이미 같은 이름의 책이 존재합니다");
							BOOK_ARR[i]=null;
							break;
						}
					}
					break;
				}else if(BOOK_ARR[BOOK_ARR.length-1]!=null) {
					System.out.println("자리 없음");
					break;
				}
				
			}
		
		
	}
	
	public void deleteBook() {
		System.out.println("책 목록");
		for(int i=0;i<BOOK_ARR.length;i++) {
			if(BOOK_ARR[i]!=null) {
				
				System.out.println(BOOK_ARR[i].getName()+"("+BOOK_ARR[i].getGenre()+","+BOOK_ARR[i].getDate()+")");
				System.out.println("-----------");
			}
		}
		System.out.println("삭제하실 책 이름을 입력하시오");
		String dname=sc.next();
		for(int i=0;i<BOOK_ARR.length;i++) {
			if(BOOK_ARR[i].getName().equals(dname)) {
				BOOK_ARR[i]=null;
				for(int j=i+1;j<BOOK_ARR.length;j++) {
					BOOK_ARR[i]=BOOK_ARR[j];
					i++;
				}
				break;
			}
		}
	}
	
	public void showBook() {
		boolean tri1=true;
		for(int i=0;i<BOOK_ARR.length;i++) {
			if(BOOK_ARR[i]!=null) {
				System.out.println(BOOK_ARR[i].getName()+"("+BOOK_ARR[i].getGenre()+","+BOOK_ARR[i].getDate()+") |");
				tri1=false;
			}else {
				System.out.println("--------------");
			}
		}
		if(tri1==true) {
			System.out.println("존재하는 책이 없습니다");
		}
	}
	
	public void searchBook() {
		System.out.println("검색하고자하는 책 이름을 입력하시오");
		String bookName=sc.next();
		boolean tri2=true;
		for(int i=0;i<BOOK_ARR.length;i++) {
			if(BOOK_ARR[i]!=null&&BOOK_ARR[i].getName().equals(bookName)) {
				System.out.println(BOOK_ARR[i].getName()+"("+BOOK_ARR[i].getGenre()+","+BOOK_ARR[i].getDate()+") 이 존재합니다");
				tri2=false;
				break;
			}
		}
		if(tri2==true) {
			System.out.println("존재하는 책이 없습니다");
		}
	}
	
	public void endPro() {
		
	}
	
	
	
}

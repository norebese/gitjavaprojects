package com.kh.iclass;

import java.util.Scanner;

public class MainstartBOOK {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		BookPos pos= BookPos.getInstance();
		
		while(pos.getIsRun()) {
			int num = pos.selction();
			switch(num) {
				case 1:	{
					pos.addBook();
				}
				break;
				case 2:{
					pos.deleteBook();
				}
				break;
				case 3:{
					pos.showBook();
				}
				break;
				case 4:{
					pos.searchBook();
				}
				break;
				case 5:{
					pos.setIsRun(false);
				}
				break;
			}
		}
		
		
		
		
		
	}

}

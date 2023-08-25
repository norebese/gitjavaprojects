package com.kh.iclass;

public class Product {
	
	private String name;
	private int price;
	private int count; //재고
	private String description;
	
	private final int MAX_COUNT = 50;
	
	
	public Product(String name, int price,String description) {
		this.name=name==null ? "이름없음":name;
		this.price=price<0 ? 0: price;
		this.description=description==null ? "이름없음":description;
		this.count= this.MAX_COUNT;
	}
	
	//기본 기능 3가지 
	//getter(필드에 있는 데이터 반환), 
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public String getDescription() {
		return this.description;
	}
	//setter(필드에 있는 데이터에 값 대입), 
	public void setName(String name) {
		this.name=name==null? "이름없음":name;
	}
	public void setPrice(int price) {
		this.price=price<0 ? 0:price;
	}
	public void setDescription(String description) {
		this.description=description==null ? "이름없음":description;
	}
	
	// toString(모든 데이터 정보 String으로 반환)
	
	public String toString() {
		String str= this.name+"\t"+this.price+"\t"+this.description;
		return str;
	}

}

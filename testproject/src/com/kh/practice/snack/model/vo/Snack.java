package com.kh.practice.snack.model.vo;

public class Snack {
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	public Snack() {
		
	}

	public Snack(String kind,String name,String flavor,int numOf,int price) {
		this.kind=kind;
		this.name=name;
		this.flavor=flavor;
		this.price=price;
		this.numOf=numOf;
	}
	
	public String information() {
		return kind + "("+name+"-"+flavor+")"+numOf+
	}
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind=kind;
		return;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		return;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor=flavor;
		return;
	}
	public int getNumOf() {
		return numOf;
	}
	public int setgetNumOf(int numOf) {
		return this.numOf=numOf;
	}
	public int getPrice() {
		return price;
	}
	public int setPrice(int price) {
		return this.price=price;
		
	}
	
}

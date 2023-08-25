package com.kh0811;

public class Rectangle extends Point {
	private int width;
	private int height;
	
	public Rectangle() {
		super();
		this.width=0;
		this.height=0;
	}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width=width;
		this.height=height;
	}
	
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	@Override
	public String toString() {
		
		return super.toString()	+" "+height+", "+width;
	}
	

}

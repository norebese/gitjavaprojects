package com.kh0811;

public class CircleController {
	
	private  Circle c= new Circle();
	

	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double area=Math.PI*radius*radius;
		return "면적 : "+c.toString()+" / "+area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		double circum=2*Math.PI*radius;
		return "둘레 : "+c.toString()+" / "+circum;
	}
	

}

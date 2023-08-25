package Array0810;

public class SquareController {
	private Shape a;
	
	public double calcPerimeter(double height,double width) {
		a=new Shape(4,height,width);
		double sum= (width*2)+(height*2);
		return sum;
	}
	
	public double calcArea(double height,double width) {
		a=new Shape(4,height,width);
		double sum= width*height;
		return sum;
	}
	
	public void paintColor(String color) {
		a.setColor(color);
	}
	
	public String print() {
		return "사각형 "+a.information();
	}
	

}

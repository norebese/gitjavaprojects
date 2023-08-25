package Array0810;

public class TriangleController {
	Shape s =new Shape();
	
	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		
		double sum=height*width/2;
		return sum;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
			return "삼각형 "+s.information();
	}
	

}

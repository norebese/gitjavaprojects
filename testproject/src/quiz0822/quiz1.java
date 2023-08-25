package quiz0822;

public class quiz1 {
	public static final double PI =3.14;
	public double radius;
	
	public quiz1(double radius) {
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}

	public void draw() {
		System.out.println("반지름"+radius+"cm인 원을 그립니다");
	}

}

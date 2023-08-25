package testproject8018;

public class Student extends Human implements Swimmable, Sleepable {
	
	public Student(String name, int age){
		super(name, age);
	}

	public void swim() {
		System.out.println(this.name+"님은 수영을 잘합니다");
	}
	
	public void sleep() {
		System.out.println(this.name+"님은 잠을 잡니다");
	}
	
	public void makesound() {
		System.out.println("저는 "+this.name+"이고 "+this.age+"살 입니다");
	}
	
	
}

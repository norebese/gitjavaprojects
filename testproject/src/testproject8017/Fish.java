package testproject8017;

public class Fish extends Animal implements Swimmable {
	
	public Fish(String name, int age) {
		super(name, age);
	}
	
	
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"는 물을 헤엄친다");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		
		System.out.println(this.name+"이 물에서 울고있습니다");
	}
}

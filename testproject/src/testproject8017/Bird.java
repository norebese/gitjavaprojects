package testproject8017;

public class Bird extends Animal implements Flyable {
	
	//부모생성자 먼저 불러옴
//	public Bird() {
//		super("ㅇㅇ", 1);
//	}
	
	public Bird(String name, int age) {
		super(name,age);
	}
	
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"는 하늘을 날아다닌다");
	}
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"이 하늘에서 울고있습니다");
	}
	
	
	

}

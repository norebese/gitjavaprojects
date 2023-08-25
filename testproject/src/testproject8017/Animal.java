package testproject8017;

//추상 메서드를 포함할 수 있어 객체생성이 되지 않는다.
// 상속받아 추상메서드를 모두 구현해서 사용할 수 있다
public abstract class Animal {
	protected String name;
	protected int age;
	
	public Animal(String name, int age){
		this.name=name;
		this.age=age;
	}

	public abstract void makeSound();
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
}

package testproject;

public class BankAccountPO {
	int balance;
	String name;
	
	
	
	public BankAccountPO() {//생성자를 생성하면 최초 비어있는것도 만들어 줘야함
		balance = 0;  //예금잔액
	}
	
	public BankAccountPO(int money) {//생성자
		balance = money;
	}
	public BankAccountPO(int money, String n) { //생성자
		balance = money;
		name = n;
	}
	
	public int deposit(int amount) {
		balance+= amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액 : "+ balance);
		return balance;
	}

}

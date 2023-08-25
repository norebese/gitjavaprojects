package testproject;

public class MainStart {
	public static void main(String[]args) {
		BankAccountPO cho1 = new BankAccountPO();
		BankAccountPO cho2 = new BankAccountPO(1000);
		BankAccountPO cho3 = new BankAccountPO(1000,"지원");
		
		cho1.deposit(1000);
		
		
		cho1.checkMyBalance();
	}

}

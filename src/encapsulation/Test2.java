package encapsulation;

public class Test2 {
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1, "Miller", 20000);
		account.details();
		
		account.deposit(1000);
		account.details();
		
		account.withdraw(500);
		account.details();
		
		account.withdraw(-1000);
		
	}

}

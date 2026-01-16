package encapsulation;

public class BankAccount {
	
	int acno;
	String name;
	double balance;
	
//	
	BankAccount(){
		
	}
//	
	
	BankAccount(int acno, String name, double balance){
		this.acno = acno;
		this.name = name;
		this.balance= balance;
	}
	
	public void deposit(double amnt) {
		
		if(amnt >= 0) {
		  balance += amnt;
		  System.out.println("Amount of "+amnt+" credited to your account "+acno);
		  System.out.println("Current Balance:"+balance);
		} else {
			System.out.println("invalid amount transaction cannot complete");
		}
	}
	
	public void withdraw(double amnt) {
		if(amnt <= balance && amnt > 0) {
			balance -= amnt;
			System.out.println("Amount of "+amnt+" Debited from your Account "+acno);
			System.out.println("Current Balance: "+balance);
		} else {
			System.out.println("invalid amount transaction cannot complete");
		}
	}
	
	public void details() {
		System.out.println("Account no:"+acno);
		System.out.println("Account holder name:"+name);
		System.out.println("Account balance:"+balance);
	}

}

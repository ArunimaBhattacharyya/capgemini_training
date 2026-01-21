package abstraction;

public class CreditCard extends Payment{
	
	String creditComp;
	
	public CreditCard(double amount, String creditComp) {
		super(amount);
		this.creditComp = creditComp;
	}
	
	@Override
	public void paymentInfo() {
		super.paymentInfo();
		System.out.println("Company: "+ creditComp);
	}
	
	public void makePayment() {
		System.out.println("payment is done using credit card");
	}

}

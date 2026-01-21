package abstraction;

public class Test {
	
	public static void main(String[] args) {
		Payment payment = new CreditCard(5000, "SBI");
		
		Payment payment1 = new UPI(4000, "G-Pay");
		
		payment.paymentInfo();
		payment.makePayment();
		
		payment1.paymentInfo();
		payment1.makePayment();
	}

}

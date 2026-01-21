package abstraction;

public class UPI extends Payment{
	
	String UPIApp;
	public UPI(double amount, String UPIApp) {
		super(amount);
		this.UPIApp = UPIApp;
	}
	
	@Override
	public void paymentInfo() {
		super.paymentInfo();
		System.out.println("App: "+UPIApp);
	}
	
	public void makePayment() {
		System.out.println("Payment is done using UPI");
	}

}

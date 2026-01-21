package exception;

public class Exception1 {
	
	public static void main(String[] args) {
		System.out.println("Program started");
		
		try {
			System.out.println(10/0);
		}
		
//		catch(ArithmeticException e) {
//			System.out.println("Can not divide by zero");
//		}
//		catch(RuntimeException r) {
//			System.out.println(r.getMessage());
//		}
//		
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program ended");
	}
	
	

}

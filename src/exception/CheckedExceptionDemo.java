package exception;

public class CheckedExceptionDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		System.out.println("Program started");
//		try {
			Class.forName("");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("Program ended");
	}

}

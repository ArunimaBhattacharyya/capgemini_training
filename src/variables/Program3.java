package variables;

public class Program3 {
	// global variable
	// class block is only for declaration purpose and not for usage purpose
	
	static int i = 100;
	
	public static void main(String[] args) {
		// local variable(we must assign values)
		
		int a = 20;
//		int i = 50;
		System.out.println(a);
		a = 30;
		System.out.println(a);
		System.out.println(i);
	}

}

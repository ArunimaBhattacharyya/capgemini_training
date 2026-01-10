package method;

public class Program3 {
	
	public static void main(String[] args) {
		System.out.println(test());
	}
	
	public static int test() {
		if(true) {
			System.out.println("Test");
			return 10;
		}
		System.out.println("Hi");
		return 100; // return statement will always be in the last line
	}

}

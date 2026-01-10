package method;

public class Program2 {
	public static void main(String[] args) {
		System.out.println("Main Start");
		test(); //calling method
		System.out.println("Main End");
	}
	
	public static void test() {
		System.out.println("Test start");
//		test(); infinite times will call the test() method calling itself - recursion
		System.out.println("Test end");
	}

}

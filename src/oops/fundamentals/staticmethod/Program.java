package oops.fundamentals.staticmethod;

public class Program {
	
	static int i;
	
	public static void main(String[] args) {
		System.out.println("Program1 main start");
		System.out.println("Program2 main end");
	}
	public static void test1() {
		System.out.println(i);
		System.out.println("test1() from Program1");
	}

}

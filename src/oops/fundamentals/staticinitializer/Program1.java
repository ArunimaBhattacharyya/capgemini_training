package oops.fundamentals.staticinitializer;

public class Program1 {
	
	static int i = test(); //single-line initializer 
	
	//Application ---> opening 
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println(i);
		System.out.println("main end");
	}
	
	public static int test() {
		System.out.println("test");
		System.out.println(i);
		return 10;
	}

}

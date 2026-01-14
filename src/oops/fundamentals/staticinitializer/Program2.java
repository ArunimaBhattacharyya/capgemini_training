package oops.fundamentals.staticinitializer;

public class Program2 {
	
	static int i=20; //single-line initializer
	
	static {
		i=30;  //multi-line initializer
		System.out.println(i);
		System.out.println("static initializer block 1");
		i = test1();
	}
	
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println(i);
		System.out.println("main end");
		
	}
	
	public static int test1() {
		System.out.println("test1");
		System.out.println(i);
		return 10;
	}
	
	static {
		System.out.println("Static Initializer Block 2");
	}

}

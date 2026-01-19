package inheritance;

public class Demo {
	
	static int a = 100;
	public static void demo() {
		System.out.println("a()");
	}
	
	static {
		System.out.println("Demo static init");
	}
	
	public static void main(String[] args) {
		System.out.println("Demo main()");
	}

}

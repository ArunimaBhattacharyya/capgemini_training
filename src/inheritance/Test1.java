package inheritance;

public class Test1 {
	
	static String a1 = "a1 var";
	public static void a1() {
		System.out.println("a1()");
	}
	
	static {
		System.out.println("static test1 initializer");
	}
	
	String a2 = "a2 var";
	
	public void a2() {
		System.out.println("a2()");
	}
	
	{
		System.out.println("Non static test1 initializer");
	}
	
	public Test1() {
		super();
		System.out.println("Test1 constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Test1 main()");
	}

}

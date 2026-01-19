package inheritance;

public class Test2 extends Test1{
	static String b1 = "b1 var";
	public static void b1() {
		System.out.println("b1()");
	}
	
	static {
		System.out.println("static test2 initializer");
	}
	
	String b2 = "b2 var";
	
	public void b2() {
		System.out.println("b2()");
	}
	
	{
		System.out.println("Non static test2 initializer");
	}
	
	public Test2() {
		super();
		System.out.println("Test2 constructor");
	}
	
	public static void main(String[] args) {
		Test2 obj = new Test2();
		System.out.println("Test2 main()");
		System.out.println(a1);
		System.out.println(obj.a2);
	}


}

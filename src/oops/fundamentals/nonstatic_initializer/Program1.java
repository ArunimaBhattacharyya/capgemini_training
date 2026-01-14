package oops.fundamentals.nonstatic_initializer;

public class Program1 {
	
	static {
		System.out.println("Static block 1");
	}
	
	//non-static initializer(multi-line)
	{
		System.out.println("Non-static block1");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		new Program1();
		new Program1();
		new Program1();
		new Program1();
	}
	
	static {
		System.out.println("Static block 2");
	}

}

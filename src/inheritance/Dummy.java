package inheritance;

public class Dummy extends Demo{
	
	static int b = 500;
	public static void dummy() {
		System.out.println("Dummy()");
	}
	
	static {
		System.out.println("Dummy static init");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
	}

}

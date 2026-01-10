package method;

public class Program1 {
	
	public static void main(String[] args) {
		
		demo(); //method signature
		//no argument method
		test(5);//actual argument
		//formal argument -> declaring a variable
		//actual argument -> when passing the value 
	}
	
	public static void demo() {
		System.out.println("Demo");
	}
	
	public static void test(int a) { //formal argument
		System.out.println("test");
	}

}

package method;

public class Program3 {
	
	public static void main(String[] args) {
		System.out.println(test());
	}
	
	public static int test() {
		if(true) {
			System.out.println("Test");
			return 10; // return data -> value return by method, return type -> datatype of the value return by method
		}
		System.out.println("Hi");
		return 100; // return statement will always be in the last line
	}

}

//return data can be ignored but a method should always have a return type
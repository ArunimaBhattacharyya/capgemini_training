package string;

public class Program2 {
	public static void main(String[] args) {
		
		//4 objects are being created as 1 and 3 are having the same references
		String s1 = "Hello";
		String s2 = "Hello ";
		String s3 = "Hello";
		String s4 = " Hello";
		String s5 = " Hello ";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}

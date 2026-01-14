package method;

public class Program4 {
	
	public static void main(String[] args) {
		System.out.println(num(10,20));
		System.out.println(num(10,20,30));
	}
	
//	//method overloading - formal arguments are different
//	//method overloading rules - 
//	1. method should have similar name but change in formal arguments w.r.t
//	     * length
//	     * type
//	     * order of declaration
	
	public static int num(int a, int b) {
	   return a+b;
	}
	
	public static int num(int a, int b, int c) {
		return a+b+c;
	}

}

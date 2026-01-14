package method;

public class Program5 {
	
	//compile time polymorphism
	
	public static void main(String[] args) {
		num(1,2);
//		num('A','B');
//		num('A',10);
		num('A',200); //compiler is deciding this that which method will be executed whenever we call a method
//      compiler ---> Actual Argument
//		process of binding between call stmt and 
//		implementation of the method during compilation by 
//		the compiler based on actual argument.
	}
	
	public static void num(int a, int b) {
		
		//implementation
		System.out.println("int,int");
	}
	
	public static void num(char a, char b) {
		System.out.println("double,double");
	}
	
//	public static void num(char a, char b) {
//		System.out.println("char,char");
//	}
//	
//  public static void num(int a, char b) {
//		System.out.println("int,char");
//	}
//	
//	public static void num(char a, int b) {
//		System.out.println("char,int");
//	}

}

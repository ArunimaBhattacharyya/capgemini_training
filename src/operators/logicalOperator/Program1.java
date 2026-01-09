package operators.logicalOperator;

public class Program1 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// logical AND, OR, NOT
		
		System.out.println(true && false && true);
		
		int a = 5;
		System.out.println(a>10 && ++a > a); // if a particular condition is false the compiler will not check other conditions 
		System.out.println(a);
	}

}

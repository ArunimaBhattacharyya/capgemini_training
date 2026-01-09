package operators.logicalOperator;

public class Program3 {
	public static void main(String[] args) {
		//logical not ! -> unary
		// negate the value
		int a = 6;
		System.out.println(!(a<10) || (++a > 10));
		System.out.println(a);
		
	}

}

package operators.logicalOperator;

public class Program2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//logical OR
		
		// if any condition is true it will return true and will not check further conditions.
		
		
		System.out.println(true || true || false);
		
		int a = 6;
		System.out.println(a<10 || ++a > 10);
		System.out.println(a);
	}

}

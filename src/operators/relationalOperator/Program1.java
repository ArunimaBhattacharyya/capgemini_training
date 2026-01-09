package operators.relationalOperator;

public class Program1 {
	
	// relational operator -> only returns boolean value, do not work on string as "A" -> hash-code -> not supported by RO
	
	public static void main(String[] args) {
		boolean res = 'A' < 'B'; // comparing ASCII
		res = "A" != "B"; // only '==' and '!=' works on string and boolean
		System.out.println(10 > 20);
		System.out.println(res);
		
		
	}

}

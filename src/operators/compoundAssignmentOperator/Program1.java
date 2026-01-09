package operators.compoundAssignmentOperator;

public class Program1 {
	public static void main(String[] args) {
		//a += 10
		
		int a = 10;
		a += 10.5; //compound assignment operator has implicit type-casting
		a += 10.5;
		System.out.println(a);
	}

}

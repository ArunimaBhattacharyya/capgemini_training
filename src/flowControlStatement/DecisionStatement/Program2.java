package flowControlStatement.DecisionStatement;

public class Program2 {
	public static void main(String[] args) {
		//special 2 digit number
		int num = 29;
		int n = num;
		int last = num % 10;
		int first = num /10;
		int sum = last + first;
		int product = last * first;
		int res = sum + product;
		if ( res == n) {
			System.out.println("Special number");
		} else {
			System.out.println("Not a special number");
		}
	}

}

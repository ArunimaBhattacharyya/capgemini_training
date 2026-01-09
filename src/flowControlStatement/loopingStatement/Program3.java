package flowControlStatement.loopingStatement;

public class Program3 {
	public static void main(String[] args) {
		// spy number : if sum of digits and product of digits is same
		
		int num = 123;
		int sum = 0;
		int product = 1;
		while(num != 0) {
			sum += num % 10; 
			product *= num % 10;
			num = num/10;
		}
		if(sum == product) {
			System.out.println("Spy number");
		} else {
			System.out.println("Not spy number");
		}
	}

}

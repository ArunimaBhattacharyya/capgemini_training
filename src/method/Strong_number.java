package method;

public class Strong_number {
	
	public static void main(String[] args) {
		int n = 145;
		if(factorial_sum(n) == n) {
			System.out.println("Strong number");
		} else {
			System.out.println("Not a Strong number");
		}
		
	}
	
	public static int factorial_sum(int n) {
		int sum = 0;
		while(n!=0) {
			int dig = n%10;
			sum += factorial(dig);
			n = n/10;
		}
		
		return sum;
	}
	
	public static int factorial(int n) {
		int res = 1;
		for(int i=1; i<=n; i++) {
			res *= i;
		}
		return res;
	}

}

package flowControlStatement.loopingStatement;

public class perfectNumber {
	public static void main(String[] args) {
		int n = 6;
		int num = n;
		int i = 1;
		int sum = 0;
		while(i <= n/2) {
			if(n%i == 0) {
				sum += i;
			}
			i++;
		}
		if(sum == num) {
			System.out.println("perfect");
		} else {
			System.out.println("Not perfect");
		}
	}

}

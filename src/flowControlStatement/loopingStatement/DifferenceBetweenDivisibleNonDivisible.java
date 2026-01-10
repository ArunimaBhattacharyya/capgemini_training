package flowControlStatement.loopingStatement;

public class DifferenceBetweenDivisibleNonDivisible {
	
	public static void main(String[] args) {
		int n = 4;
		int m = 20;
		int sumOfDivisible = 0;
		int sumOfNonDivisible = 0;
		for(int i=0; i<=m; i++) {
			if(i%n == 0) {
				sumOfDivisible += i;
			} else {
				sumOfNonDivisible +=i;
			}
		}
		
		System.out.println(sumOfNonDivisible - sumOfDivisible);
	}

}

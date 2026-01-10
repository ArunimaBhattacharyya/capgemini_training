package flowControlStatement.loopingStatement;

public class TechNumber {
	
	public static void main(String[] args) {
		int num = 2025;
		int n = num;
		int count = 0;
		while(num != 0) {
			int dig = num % 10;
			count++;
			num = num/10;
		}
		
		int half = count/2;
		int a = (int) (n % Math.pow(10, half));
		int b = (int) (n / Math.pow(10, half));
		int sum = a+b;
		int sq = sum*sum;
		if(sq == n) {
			System.out.println("Tech number");
		} else {
			System.out.println("not tech number");
		}
	}

}

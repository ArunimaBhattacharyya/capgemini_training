package flowControlStatement.loopingStatement;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int num = 371;
		int n = num;
		int count = String.valueOf(num).length();
		int sum = 0;
		while(num!=0) {
			int dig = num%10;
			sum += (int) Math.pow(dig, count);
			num = num/10;
		}
		
		if(sum == n) {
			System.out.println("Armstrong");
		} else {
			System.out.println("not Armstrong");
		}
//		System.out.println(count);
	
	}

}

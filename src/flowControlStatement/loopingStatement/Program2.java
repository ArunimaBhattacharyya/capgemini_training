package flowControlStatement.loopingStatement;

public class Program2 {
	public static void main(String[] args) {
		int i = 1836;
		int rev = 0;
		while(i != 0) {
			int digit = i%10;
			rev = digit + rev*10;
			i = i/10;
		}
		System.out.println(rev);
	}

}

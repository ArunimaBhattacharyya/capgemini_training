package flowControlStatement.loopingStatement;

public class Program4 {
	public static void main(String[] args) {
		//neon number
		
		int n = 9;
		int num = n;
		int sq = n*n;
		int sum = 0;
		while(sq != 0) {
			int dig = sq % 10;
			sum += dig;
			sq = sq/10;
		}
		if(sum == num) {
			System.out.println("neon");
		} else {
			System.out.println("Not neon");
		}
	}

}

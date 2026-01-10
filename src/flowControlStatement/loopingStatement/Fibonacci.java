package flowControlStatement.loopingStatement;

public class Fibonacci {
	
	public static void main(String[] args) {
		int num = 5;
		int a =0 , b = 1;
		for(int i=0; i<num; i++) {
			System.out.println(a+"");
			int sum = a+b;
			a = b;
			b = sum;	
		}
	}

}

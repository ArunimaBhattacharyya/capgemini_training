package flowControlStatement.loopingStatement;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		//decimal to binary
		
		int d = 10;
		String binary = "";
		while(d > 0) {
			int dig = d % 2;
			binary = dig + binary;
			d = d/2;
		}
		System.out.println(binary);
	}

}

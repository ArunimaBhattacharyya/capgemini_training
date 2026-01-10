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
		
		int count = 0;
		for(int i=0; i<binary.length(); i++) {
			if(binary.charAt(i) == '1') {
				count++;
			}
		}
		
		if(count % 2 == 0) {
			System.out.println("It is evil");
		} else {
			System.out.println("It is not");
		}
//		System.out.println(binary);
//		System.out.println(count);
	}

}

package pattern;

public class Pattern7 {
	
	public static void main(String[] args) {
		
		//  *
		// ***
		//*****
		
		int n = 5;
		for(int row = 1; row<= n; row++) {
			for(int col = n-1; col>=row; col--) {
				System.out.print(" ");
			}
			for(int col1 = 1; col1<=2*row-1; col1++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

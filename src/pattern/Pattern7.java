package pattern;

public class Pattern7 {
	
//	public static void main(String[] args) {
//		
//		//  *
//		// ***
//		//*****
//		
//		int n = 5;
//		for(int row = 1; row<= n; row++) {
//			for(int col = n-1; col>=row; col--) {
//				System.out.print(" ");
//			}
//			for(int col1 = 1; col1<=2*row-1; col1++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
	
	public static void main(String[] args) {
		//*****
		// ***
		//  *
		
//		int n = 3;
//		for(int row=1; row<=n; row++) {
//			for(int spc = 0; spc<row-1; spc++) {
//				System.out.print(" ");
//			}
//			
//			for(int col=2*(n-row)-1; col>=1; col--) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
		
		int n=3;
		for(int row=1; row<=n; row++) {
			for(int col=1; col<=2*n; col++) {
				if(row<=col && row+col<=2*n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}

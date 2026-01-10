package flowControlStatement.loopingStatement;

public class SquareRoot {
	
	public static void main(String[] args) {
		int n = 9;
		boolean found = false;
		for(int i=2; i<n/2; i++) {
			if(i*i == n) {
				System.out.println("Square root exists");
				System.out.println(i);
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Square root does not exist");
		}
	}

}

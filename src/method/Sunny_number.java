package method;

public class Sunny_number {
	
	public static void main(String[] args) {
		
		int n = 4;
		
		if(sunny(n)) {
			System.out.println("It is a sunny number.");
		} else {
			System.out.println("It is not");
		}
		
	}
	
	public static boolean sunny(int n) {
		for(int i=1; i<=n+1; i++) {
			if(i*i == n+1) {
				return true;
			}
		}
		return false;
	}

}

package string;

public class Program10 {
	
	public static void main(String[] args) {
		String s = "@!#%^& ";
		System.out.println(s.matches("[^a-zA-Z0-9]+\\s"));	
	}

}

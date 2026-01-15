package string;

public class Palindrome {
	
	public static void main(String[] args) {
		String s = "racecar";
		String r = rev(s);
		if(r.equals(s)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}
	
	static String rev(String s) {
		String newStr = "";
		for(int i=s.length()-1; i>=0; i--) {
			newStr += s.charAt(i);
		}
		
		return newStr;
	}

}

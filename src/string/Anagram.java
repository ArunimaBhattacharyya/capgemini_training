package string;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "Silent";
		String s2 = "Listen";
		s1.toLowerCase();
		s2.toLowerCase();
		boolean find = false;
		
		if(s1.length() != s2.length()) {
			System.out.println("Not an anagram");
		} else {
			for(int i=0; i<s1.length(); i++) {
				if(s1.charAt(i) == s2.charAt(i)) {
					find = true;
				}
			}
		}
		
		if(find) {
			System.out.println("Valid anagram");
		} else {
			System.out.println("Not valid");
		}
	}

}

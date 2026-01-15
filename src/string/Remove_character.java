package string;

public class Remove_character {
	
	public static void main(String[] args) {
		String s = "Hello";
		char c = 'l';
		String newStr = "";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != c) {
				newStr+=s.charAt(i);
			}
		}
		
		System.out.println(newStr);
	}

}

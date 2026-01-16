package string;

public class Move_hyphens_to_front {
//	public static void main(String[] args) {
//		String s = "move-hyphens-to-front";
//		char[] s1 = s.toCharArray();
//		int first = 0;
//		for(int i=0; i<s1.length-1; i++) {
//			if(s1[i] == '-') {
//				char temp = s1[i];
//				s1[i] = s1[first];
//				s1[first] = temp;
//				first++;
//			}
//		}
//		
//		System.out.println(s1);
//		
//		
//	}
	
	
	public static void main(String[] args) {
		String s = "move-hyphens-to-front";
		String newStr = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '-') {
				newStr += s.charAt(i);
			} 
		}
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != '-') {
				newStr += s.charAt(i);
			} 
		}
		
		System.out.println(newStr);
	}

}

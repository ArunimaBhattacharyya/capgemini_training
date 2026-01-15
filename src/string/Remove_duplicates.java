package string;
import java.util.*;

public class Remove_duplicates {
	
	public static void main(String[] args) {
		String s = "aabaabbbcccd";
		HashSet<Character> hs = new HashSet<>();
		
		for(char c : s.toCharArray()) {
			hs.add(c);
		}
		
		System.out.println(hs);
	}

}

package string;
import java.util.*;

public class Frequency_of_character {
	public static void main(String[] args) {
		String s = "hello";
		s.toLowerCase();
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for(char c : s.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}

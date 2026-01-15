package Array;
import java.util.*;

import java.util.HashMap;

public class Frequency_count {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,1,2,3,4,5,1,2,3,4,5,5};
		frequency(arr);
		
	}
	
	static void frequency(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i : arr) {
			hm.put(i,  hm.getOrDefault(i, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer>entry:hm.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
	}

}

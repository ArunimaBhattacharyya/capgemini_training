package Array;
import java.util.*;

public class Pogram7 {
	
	public static void main(String[] args) {
		int[] arr = {1,3,6,5};
		Arrays.sort(arr);
		int diff = arr[arr.length-1] - arr[0];
		System.out.println(diff);
		
	}

}

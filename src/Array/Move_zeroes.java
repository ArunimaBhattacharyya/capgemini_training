package Array;

import java.util.Arrays;

public class Move_zeroes {
	
	public static void main(String[] args) {
		int[] a = {1,0,1,0,0,0,1,1};
		
		System.out.println(Arrays.toString(reorder((a))));
		
	}
	
	static int[] reorder(int[] a) {
		int n = a.length;
		int first = 0;
		for(int i=0; i<n; i++) {
			if(a[i] != 0) {
				int temp = a[i];
				a[i] = a[first];
				a[first] = temp;
				first++;
			}
		}
		
		return a;
	}

}

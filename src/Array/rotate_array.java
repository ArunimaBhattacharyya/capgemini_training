package Array;

import java.util.Arrays;

public class rotate_array {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int pos = 3;
		int[] rotated = rotate(a,pos);
		System.out.println(Arrays.toString(rotated));
	}
	
	static int[] rotate(int[] a, int pos) {
		int n = a.length;
		int i, index = 0;
		int[] result = new int[n];
		for(i = pos; i<n; i++) {
			result[index++] = a[i];
		}
		
		for(i=0; i<pos; i++) {
			result[index++] = a[i];
		}
		
		return result;
	}

}

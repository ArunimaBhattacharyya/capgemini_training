package Array;
import java.util.*;

public class increment_integer {
	
	public static void main(String[] args) {
		 int[] a = {1,2,3};
		 System.out.println(Arrays.toString(increment(a)));
	}
	
	static int[] increment(int[] a) {
		int n = a.length;
		for(int i=n-1; i>=0; i--) {
			if(a[i] < 9) {
				a[i]++;
				return a;
			} 
			a[i] = 0;
		}
		
		int[] res = new int[n+1];
		res[0] = 1;
		return res;
	}

}

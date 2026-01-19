package Array;

public class Sum_of_all_subarrays {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++) {
				for(int k=i; k<=j; k++) {
					sum+=a[k];
				}
			}
		}
		System.out.println(sum);
	}

}

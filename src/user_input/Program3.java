package user_input;

import java.util.*;

public class Program3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//jagged array - arrays will have different column size
//		int[][] a = new int[3][];
//		a[0] = new int[3];
//		a[1] = new int[2];
//		a[2] = new int[5];
//		
//		for(int i=0; i<a.length; i++) {
//			for(int j=0; j<a[i].length; j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			
//			System.out.println();
//		}
		
		
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}

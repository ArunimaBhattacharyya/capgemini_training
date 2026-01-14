package Array.twoD_array;

public class Program1 {
	
	public static void main(String[] args) {
		int[][] a = {{1,4},{3,5}};
		
		for(int i=0; i<a.length; i++) { //outer loop is to iterate the array
			for(int j=0; j<a[i].length; j++) { //inner loop is to iterate the elements of the array
				System.out.println(a[i][j]);
			}
		}
		
//		System.out.println(a[0][0]);
//		System.out.println(a[0][1]);
		
	}

}

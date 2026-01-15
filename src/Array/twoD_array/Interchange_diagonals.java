package Array.twoD_array;

public class Interchange_diagonals {
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<mat.length; i++) {
			int temp = mat[i][i];
			mat[i][i] = mat[i][mat.length-i-1];
			mat[i][mat.length-i-1] = temp;
	    }
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}

}

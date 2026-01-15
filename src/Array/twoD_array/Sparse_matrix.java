package Array.twoD_array;

public class Sparse_matrix {
	public static void main(String[] args) {
		int[][] mat = {{1,0,2},{0,0,0},{0,3,0}};
		int zero_count = 0;
		int nonZero_count = 0;
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == 0) {
					zero_count++;
				} else {
					nonZero_count++;
				}
			}
		}
		
		if(zero_count > nonZero_count) {
			System.out.println("Sparse matrix");
		} else {
			System.out.println("Non Sparse matrix");
		}
	}

}

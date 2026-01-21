package exception;

public class Exception2 {
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {
			System.out.println(arr[6]);
		}
		
		catch(Exception e) {
			System.out.println("Array is out of index");
		}
	}

}

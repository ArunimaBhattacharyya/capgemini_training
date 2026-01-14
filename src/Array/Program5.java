package Array;
import java.util.*;

public class Program5 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = 5;
//		String[] student = new String[n];
//		for(int i=0; i<student.length; i++) {
//			student[i] = sc.next();
//		}
//		
//		for(int i=0; i<student.length; i++) {
//			System.out.println(student[i]);
//		}
//		
		
		System.out.println(student(5));
		
	}
	
	public static String student(int n) {
		String[] arr = new String[n];
		arr[0] = "Arunima";
		arr[1] = "Diya";
		arr[2] = "Debashrita";
		arr[3] = "Sneha";
		arr[4] = "Srija";
		
		for(int i=0; i<n; i++) {
			return arr[i];
		}
		
		return "";
	}

}

package string;

public class Program8 {
	
	public static void main(String[] args) {
		
		System.out.println("823456".matches("\\d+"));
		System.out.println("8234568859".matches("[6-9]\\d+"));
		System.out.println("8234568859".matches("[6-9]\\d{9}"));
		System.out.println("8234568859".matches("[6-9]\\d{9,}"));
		System.out.println("8234568859".matches("[6-9]\\d{9,12}")); //{}=> length of the number
	}

}

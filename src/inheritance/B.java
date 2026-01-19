package inheritance;

public class B extends A{
	
	static int j = 20;
	
	public static void main(String[] args) {
		System.out.println(A.i);
		System.out.println(B.i);
		B.print();
		System.out.println(B.j);
//		System.out.println(A.j);
		
	}
	
	//i--> A ---> B (generalized member)[can be used from parent class as well as from child class
	//j --> B (specialized member) [ can be used in one class only]

}

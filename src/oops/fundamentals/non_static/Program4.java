package oops.fundamentals.non_static;

public class Program4 {
	
	int i=3; // will be loaded in object as non-static
	static String s = "Hello"; // will be loaded in class static area as static 
	
	public static void main(String[] args) {
		Program4 obj1 = new Program4();
		Program4 obj2 = new Program4();
		System.out.println(obj1 == obj2); //comparing the references
	    //different references
		
		System.out.println(obj1.i);
		System.out.println(Program4.s);
		System.out.println(obj1.s);
	}

}

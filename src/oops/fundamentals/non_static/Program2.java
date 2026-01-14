package oops.fundamentals.non_static;

public class Program2 {
	
	int a;
	double d;
	byte b;
	String s;
	
	public static void main(String[] args) {
		
		//inside obj reference of the object is present
//		//instance variable or object variable
		
//		int i=20;//primitive
//		i=30;
//		i='A';
//		
		Program2 obj = new Program2();
//		obj = null;
		System.out.println(obj.d);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.s);
	}

}

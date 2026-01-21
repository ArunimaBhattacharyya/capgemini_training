package variable_method_shadowing.multilevel;

public class B3 extends B2{
	
	int b = 30;
	
	public void message() {
		System.out.println("B3 message");
	}
	
	public void display() {
		System.out.println(b);
		System.out.println(super.b);
		System.out.println(((B1)this).b);
		
		message();
		super.message();
//		((B1)this).message(); // can not access because of method overriding
		
		((B1)this).method();
	}
	
	public static void main(String[] args) {
		B3 b3 = new B3();
		B1 b1 = new B1();
		
		b3.display();
		b1.message();
	}

}

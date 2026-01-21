package variable_method_shadowing;

public class A2 extends A1{
	
	int a = 20;
	public void message() {
		System.out.println("A2 message");
	}
	
	public void display() {
		System.out.println(a); //child
		System.out.println(super.a); //parent
		
		message(); //child
		super.message(); //parent
	}
	
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.display();
	}

}

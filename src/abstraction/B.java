package abstraction;

public class B extends A{
	
	public void test() {
		System.out.println("B implementation");
	}
	
	public void testB() {
		System.out.println("testB method");
	}
	
	public static void main(String[] args) {
//		A a = new A(); // CTE
		
		A a = new B(); //up-casting
		
		a.testA();
		a.test();
		
//		a.testB(); //CTE as it cannot access the child compartment
		
		B b = (B)a; // down-casting
		b.testB();
		b.testA();
		b.test();
		
	}

}

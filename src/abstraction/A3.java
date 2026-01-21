package abstraction;

public class A3 extends A2{
	
	@Override
	public void A() {
		System.out.println("A");
	}
	
	public void A3() {
		System.out.println("A3 implementation");
	}
	
	public static void main(String[] args) {
		A1 a1 = new A3(); // up-casting
		
		a1.A();
		a1.A1();
		
		A3 a3 = (A3)a1; // down-casting to access all
		
		a3.A();
		a3.A1();
		a3.A2();
		a3.A3();
		
	}

}

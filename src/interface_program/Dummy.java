package interface_program;

public class Dummy implements I3{
	
	public void testA() {
		System.out.println("Demo testA");
	}
	
	public void testB() {
		System.out.println("Demo testB");
	}
	
	public void testC() {
		System.out.println("Demo testC");
	}
	
	public static void main(String[] args) {
		I3 i3 = new Dummy();
		
//		Dummy dm = new Dummy();
//		
//		dm.testC();
		
		i3.testA();
		i3.testB();
		
//		i3.testC(); //not allowed as this method is not present in interface
	}

}

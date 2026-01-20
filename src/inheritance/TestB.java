package inheritance;

public class TestB extends TestA{

	public TestB() {
		super(10);
		System.out.println("TestB");
	}
	
	public static void main(String[] args) {
		TestB obj = new TestB();
	}

}

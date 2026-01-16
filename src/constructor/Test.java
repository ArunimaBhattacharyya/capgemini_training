package constructor;

public class Test {
	
	public static void demo(Test obj) { //pass by reference
		System.out.println("demo()");
		System.out.println(obj);
		obj.test();//null.test()
	}
	
	public static void main(String[] args) {
//		demo(null);
		demo(new Test());
	}
	
	public void test() {
		System.out.println("test()");
//		demo();
	}

}

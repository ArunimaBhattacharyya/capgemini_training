package objectClass;

public class Demo {
	
	public String toString() {
		return "Hello";
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo); // it will return the address of the object
	}

}

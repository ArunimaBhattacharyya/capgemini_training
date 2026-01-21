package objectClass;

public class Dummy {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		System.out.println(a == b);
		
		Dummy d1 = new Dummy();
		Dummy d2 = new Dummy();
		
		System.out.println(d1 == d2);
		System.out.println(d1.equals(d2));
	}

}

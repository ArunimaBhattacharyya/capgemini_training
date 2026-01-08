package variables;

public class CharConversion {
	
	public static void main(String[] args) {
		char c = 'S';
		
		byte b = (byte)c;
		System.out.println(b);
		
		short s = (short)c;
		System.out.println(s);
		
		int i = c;
		System.out.println(i);
		
		long l = c;
		System.out.println(l);
		
		double d = c;
		System.out.println(d);
		
		float f = c;
		System.out.println(f);
	}

}

package variables;

public class FloatConversion {
	public static void main(String[] args) {
		float f = 75.50f;
		
		byte b = (byte)f;
		System.out.println(b);
		
		short s = (short)f;
		System.out.println(s);
		
		int i = (int)f;
		System.out.println(i);
		
		long l = (long)f;
		System.out.println(l);
		
		double d = f;
		System.out.println(d);
		
		char c = (char)f;
		System.out.println(c);
	}

}

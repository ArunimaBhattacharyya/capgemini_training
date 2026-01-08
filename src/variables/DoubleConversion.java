package variables;

public class DoubleConversion {
	public static void main(String[] args) {
		double d = 68;
		
		byte b = (byte)d;
		System.out.println(b);
		
		short s = (short)d;
		System.out.println(s);
		
		int i = (int)d;
		System.out.println(i);
		
		long l = (long) d;
		System.out.println(l);
		
		float f = (float)d;
		System.out.println(f);
		
		char c = (char)d;
		System.out.println(c);
	}

}

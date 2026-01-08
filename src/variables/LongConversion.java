package variables;

public class LongConversion {
	public static void main(String[] args) {
		long l = 92;
		
		byte b = (byte)l;
		System.out.println(b);
		
		short s = (short)l;
		System.out.println(s);
		
		int i = (int)l;
		System.out.println(i);
		
		double d = l;
		System.out.println(d);
		
		float f = l;
		System.out.println(f);
		
		char c = (char)l;
		System.out.println(c);
	}

}

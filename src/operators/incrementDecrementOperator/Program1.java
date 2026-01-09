package operators.incrementDecrementOperator;

public class Program1 {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(++a); //pre-increment
		System.out.println(a++); //post-increment
		System.out.println(a);
		
		int b = 2;
		int c = b++ + 30;
		int d = c++ + b++;
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int e = 3;
		int f = ++e + e++;
		int g = f++ + ++e + f++ + e++;
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		int h = 5;
		System.out.println(--h); // pre-decrement
		System.out.println(h);
		
		System.out.println(h--); // post-decrement
		System.out.println(h);
	}

}

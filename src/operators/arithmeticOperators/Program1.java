package operators.arithmeticOperators;

public class Program1 {
	// Arithmetic operators
	
	public static void main(String[] args) {
		//addition -> normal addition, concatenation
		int a = 5;//operands
		int b = 10;//operands
		int c = a + b;
		System.out.println(c);
		
		System.out.println(10 + 20 + "A" + 10 + 10);
		System.out.println(10+30*2);
		System.out.println('A'+'B');
		
		char ch = 'A';
		System.out.println((char)(ch+32));
		
		//modulus -> find remainder
		int i = 5;
		System.out.println(i % 2);
		
		System.out.println(10+"hello"+20+true);	}

}

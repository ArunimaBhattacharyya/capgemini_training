package variables;

public class Program5 {
	public static void main(String[] args) {
		// type-casting(converting a data to another type of data)
		// primitive type-casting, non-primitive type-casting
		// primitive -> implicit type-casting(widening), explicit type-casting(narrowing)
		
		char a = 'A'; // 2 byte
		int i = a; // 4 byte
		System.out.println(i); // (implicit type-casting / widening (smaller type of data -> larger type of data)
		
		short j = 65; // 4 byte
		int ch = j; // 2 byte
		System.out.println(ch); // 
		
		char b = 'a';
		float f = b;
		System.out.println(f);
	
		
		
	}

}

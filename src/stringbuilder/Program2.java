package stringbuilder;

public class Program2 {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("Hello");
//		System.out.println(sb.length());
//		sb.append("12345612345579533");
//		System.out.println(sb.capacity());
		
		
		StringBuilder sb1 = new StringBuilder(1000);
		System.out.println(sb1.capacity()); //-->1000
	}

}

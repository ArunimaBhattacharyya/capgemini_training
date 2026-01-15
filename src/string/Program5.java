package string;

public class Program5 {
	public static void main(String[] args) {
		String s = "hello";
		System.out.println(s.equals("Hello"));
		System.out.println("hello".equals(s));
		
		int l = s.length();
		System.out.println(l);
		
		char[] arr = s.toCharArray();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<l; i++) {
			System.out.print(s.charAt(i)+" ");
		}
		
//		System.out.println(s.charAt(100));
		
		byte[] b = s.getBytes();
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
		if(s.startsWith("h")) {
			System.out.println(true);
		}
		
		System.out.println(s.endsWith("a"));
//		System.out.println(s.replaceAll(s, "arunima"));
		
		System.out.println(s.contains("l"));
		
		
		
	}

}

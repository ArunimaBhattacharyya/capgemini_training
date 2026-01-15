package string;

public class Program7 {
	public static void main(String[] args) {
		String s = "helloABWX";
		System.out.println(s.matches("\\w+")); //w = word or letter
		
		String s1 = " ";
		System.out.println(s1.matches("\\s+"));//s = space
	}

}

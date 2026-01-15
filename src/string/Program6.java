package string;

public class Program6 {
	public static void main(String[] args) {
		String s = "Java is a programming language";
		String[] s1 = s.split(" ");
		for(int i=0; i<s1.length; i++) {
			System.out.println(s1[i]);
		}
	}

}

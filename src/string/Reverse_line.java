package string;

public class Reverse_line {
	
	public static void main(String[] args) {
		String s = "java is a oop lang";
		String[] arr = s.split(" ");
		String s1 = "";
		for(int i=0; i<arr.length; i++) {
			for(int j=arr[i].length()-1; j>=0; j--) {
				s1 += arr[i].charAt(j);
			}
			s1+=" ";
		}
		
		System.out.println(s1+" ");
	}
}

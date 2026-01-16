package user_input;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //inputStream class helps to read the data
		System.out.println("Enter the data");
		int n = sc.nextInt();
		System.out.println("Enter the second data");
		byte b = sc.nextByte();
		System.out.println(b+n);
		
		
	}

}

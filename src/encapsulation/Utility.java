package encapsulation;

import java.util.Random;

public class Utility {
	public static void main(String[] args) {
		System.out.println(Math.max(12,13));
		System.out.println(Math.floor(12.13));
		System.out.println(Math.ceil(12.13));
		System.out.println(Math.TAU);
		System.out.println(Math.PI);
		System.out.println(Math.log(10));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.exp(2));
		System.out.println(Math.cbrt(27));
		System.out.println(Math.random());
		Random random = new Random();
		System.out.println(random.nextInt(100));
	}

}

package interface_program;

public class Demp implements I1, I2{
	
	public static void main(String[] args) {
//		I1.m();
//		System.out.println(I1.n);
		
		System.out.println(I2.n); // can access the variable directly if there is only one interface but when there is more than 1 interfaces and there are multiple variable with same name it cannot access it directly
//		m(); // cannot access the method directly
	}

}

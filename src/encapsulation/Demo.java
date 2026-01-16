package encapsulation;

public class Demo {
	//private can be - global variable, method, constructor. Cannot use it for class or initializer
	//create a class , create a no argument constructor make it private and create a solution how to make it accessible
	private Demo() {
		
	}
	
	private static Demo object;
	
	//factory method
	public static Demo getA() {
//		return new Demo();
		
		if(object == null) {
			object = new Demo();
		} 
		return object;
	}
	
	
	
	private int a; //write the value, read the value
	
	//write the value - design a method - setter method
	//read the value - design a method - getter method
	
	public int getValueA() {
		return a;
	}
	
	public void setValueA(int a) {
		this.a = a;
	}
	
}
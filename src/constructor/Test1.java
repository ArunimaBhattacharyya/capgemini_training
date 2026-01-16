package constructor;

public class Test1 {
	
	static int count = 0;
	
	{
		count++;  //as non-static initializer everytime will be created once a object is created
	}
	
	//factory methods - if you call a method and every time a object is created
	
	public static Test1 m1() {
		System.out.println("m1()");
		return new Test1();
	}
	
	public static void main(String[] args) {
		Test1 obj = m1();
		obj.m2().m3().m2().m3();
		System.out.println(count);
		
		String s = "programming";
		System.out.println(s.substring(2).toUpperCase().replaceAll("[A-Z]+", "1"));
	}
	
	public Test1 m2() { //not a factory method
		System.out.println("m2()");
		return this; //do not create a new object but return the current object
	}
	
	public Test1 m3() { //factory method
		System.out.println("m3()");
		return new Test1(); // creates new object
	}

}

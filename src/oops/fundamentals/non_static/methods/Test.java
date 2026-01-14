package oops.fundamentals.non_static.methods;

public class Test {
	
	//constructor --> non-static method which does not have any return type
	//student --> id, name, percentage, display , parameterized constructor
	public static void main(String[] args) {
		Person p1 = new Person("A", 20, "Male");
//		p1.initialize("A", 20, "Male");
//		
		Person p2 = new Person("B", 21, "Female");
//		System.out.println("person2"+p2);
//		p2.initialize("B", 21, "Female");
//		
        p1.display();
        p2.display();
		
//		System.out.println(new Person());
//		System.out.println(new Person(10));// if you do not add constructor then  compiler will add a default constructor
		
		
	}

}

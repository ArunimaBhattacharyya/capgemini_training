package instance_of;

public class Child extends Parent{
	
	public void childMethod() {
		System.out.println("Child method");
	}
	
	public static void main(String[] args) {
		
		//up-casting
		Parent p = new Child();
		
		p.parentMethod();
		
		
		//down-casting
		
		Child c = (Child) p;
		c.parentMethod();
		c.childMethod();
		
		Parent p2 = new Parent();
		System.out.println(p2 instanceof Parent); //true
		System.out.println(p2 instanceof Child); //false
		
		if(p2 instanceof Child) {
			Child c3 = (Child)p2;
		} else {
			System.out.println("upcasting is not done");
		}
		
		Child c2 = new Child();
		System.out.println(c2 instanceof Parent);
		System.out.println(c2 instanceof Child);
		
		
		Parent p4 = c2;
		if(p4 instanceof Child) {
			Child c5 = (Child)p4;
			System.out.println("downcasting done");
		}
	}

}

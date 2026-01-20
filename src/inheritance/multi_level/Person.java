package inheritance.multi_level;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void displayPer() {
		System.out.println(this.name);
		System.out.println(this.age);
	}

}

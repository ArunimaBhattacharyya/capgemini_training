package oops.fundamentals.non_static.methods;

public class Person {
	
	String name;//null
	int age;//0
	String gender;//null
	
	Person(){
		System.out.println("No argument");
	}
	
	Person(int a){
		System.out.println("Parameterized constructor");
	}
	
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Gender:"+gender);
	}
	
	Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender; //this keyword will have the current object reference
	}

}

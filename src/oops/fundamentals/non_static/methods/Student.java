package oops.fundamentals.non_static.methods;

public class Student {
	
	String name;
	int id;
	int percentage;
	
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Id:"+id);
		System.out.println("Percetage:"+percentage);
	}
	
	Student(String name, int id, int percentage) {
		this.name = name;
		this.id = id;
		this.percentage = percentage; 
	}
	
	Student(int id, String name, int percentage) {
		this.name = name;
		this.id = id;
		this.percentage = percentage; 
	}


}

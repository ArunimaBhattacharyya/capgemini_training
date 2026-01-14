package Array;

public class Employee {
	
	static int id;
	static String name;
	static double salary;
	
	Employee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	static void display() {
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("salary:"+salary);
	}

}

package inheritance.multi_level;

public class Employee extends Person{
	
	int id;
	double salary;
	
	public Employee(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}
	
	public void displayEmp() {
		displayPer();
		System.out.println(this.id);
		System.out.println(this.salary);
	}

}

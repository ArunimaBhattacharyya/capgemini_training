package inheritance;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	public Employee() {
		
	}
	
	public Employee(int id) {
		this.id = id;
	}
	
	public Employee(int id, String name) {
		this(id);
		this.name = name;
	}
	
	public Employee(int id, String name, double salary) {
		this(id, name);
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(101);
		Employee e3 = new Employee(102, "Ravi");
		Employee e4 = new Employee(103, "Rohan", 50000.0);
		
		System.out.println(e1);
		System.out.println(e2.id);
		System.out.println(e3.id+" "+e3.name);
		System.out.println(e4.id+" "+e4.name+" "+e4.salary);
	}

}

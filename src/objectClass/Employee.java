package objectClass;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "id: "+ id +" , name: "+ name +" , salary: "+ salary;
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(101, "Arunima", 50000.0);
		System.out.println(emp);
	}

}

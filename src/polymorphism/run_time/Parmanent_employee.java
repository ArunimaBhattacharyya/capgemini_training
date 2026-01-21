package polymorphism.run_time;

public class Parmanent_employee extends Employee{
	
	double basicSalary;
	
	public Parmanent_employee(int id, String name, double basicSalary) {
		super(id, name);
		this.basicSalary = basicSalary;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("basic salary" + basicSalary);
	}
	
	public double calculateSalary() {
		return basicSalary + (basicSalary * 0.20) + (basicSalary * 0.10);
	}

}

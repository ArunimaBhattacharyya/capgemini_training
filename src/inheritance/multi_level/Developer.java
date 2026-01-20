package inheritance.multi_level;

public class Developer extends Employee{
	
	String technology;
	
	public Developer(String name, int age, int id, double salary, String technology) {
		super(name, age, id, salary);
		this.technology = technology;
	}
	
	public void displayDev() {
		displayEmp();
		System.out.println(this.technology);
	}
	
	public static void main(String[] args) {
		Developer d = new Developer("Arunima", 21, 101, 50000.0, "SpringBoot");
		d.displayDev();
	}

}

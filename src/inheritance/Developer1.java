package inheritance;

public class Developer1 extends Employee1{
	
	String technology;
	
	public Developer1(int id, String name, double salary, String technology) {
		super(id, name, salary);
		this.technology = technology;
	}
	
	public void displayDev() {
		displayEmp();
		System.out.println(this.technology);
	}
	
	public static void main(String[] args) {
		Developer1 d = new Developer1(101, "Jatin", 50000.0, "SpringBoot");
		d.displayDev();
	}

}

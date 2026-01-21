package interface_program.multiple_inheritance;

public class TechLead extends Employee implements Coder, Manage{
	
	public void work() {
		System.out.println("Sneha is working");
	}
	
	public void writeCode() {
		System.out.println("code");
	}	
	
	

}

package interface_program.multiple_inheritance;

public class Developer extends Employee implements Coder{
	
	public void work() {
		System.out.println("Arunima is working");
	}
	
	public void writeCode() {
		System.out.println("Developer writes code");
	}

}

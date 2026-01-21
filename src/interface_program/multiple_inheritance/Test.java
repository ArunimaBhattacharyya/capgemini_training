package interface_program.multiple_inheritance;

public class Test {
	
	public static void main(String[] args) {
		Employee emp = new TechLead();
		emp.work();
		emp.writeCode();
		emp.manage();
	}

}

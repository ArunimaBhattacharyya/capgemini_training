package interface_program.multiple_inheritance;

public abstract class Employee {
	
	int id;
	String name;
	
	public void employeeinfo() {
		System.out.println(id);
		System.out.println(name);
	}
	
	public abstract void work();
	
	public abstract void writeCode();
	
	public abstract void manage();
	
	

}

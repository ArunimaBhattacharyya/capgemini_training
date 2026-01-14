package Array;

public class Program6 {
	
	public static void main(String[] args) {
		Employee[] emp = new Employee[3];
		emp[0] = new Employee(1, "Adam", 20000);
		emp[1] = new Employee(2, "Bob", 30000);
		emp[2] = new Employee(3, "Ross", 40000);
		
		for(int i=0; i<emp.length; i++) {
			emp[i].display();
		}
		
		
	}

}

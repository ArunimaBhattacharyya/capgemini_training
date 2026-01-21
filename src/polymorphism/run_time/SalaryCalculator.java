package polymorphism.run_time;

import java.util.*;

public class SalaryCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many employee to add");
		int n = sc.nextInt();
		sc.nextLine();
		
		Employee[] employee = new Employee[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter the employee id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the employee name: ");
			String name = sc.nextLine();
			
			System.out.println("1. Parmanent Employee");
			System.out.println("2. Payroll Employee");
			System.out.println("Choose the option");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the basic salary");
				double salary = sc.nextDouble();
				Parmanent_employee pe = new Parmanent_employee(id, name, salary);
				employee[i] = pe;
				break;
			case 2:
				System.out.println("Enter the hours");
				int hours = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the rate");
				double rate = sc.nextDouble();
				sc.nextLine();
				
				PayRollEmployee payemp = new PayRollEmployee(id, name, hours, rate);
				employee[i] = payemp;
				break;
			default:
				System.out.println("Not Applicable");
			}
		}
		
		for(Employee emp : employee) {
			emp.displayDetails();
			System.out.println(emp.calculateSalary());
		}
		
	}

}

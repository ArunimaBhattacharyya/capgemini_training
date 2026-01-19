package association.aggregation;

public class User {
	
	public static void main(String[] args) {
		Person person = new Person();
		
		person.setName("Arunima");
		person.setAge("21");
		person.setGender("Female");
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		
		System.out.println("passport: "+person.getPassport());
		
		person.applyPassport("1","04/07/2004", "01/01/2030");
		
		System.out.println("passport: "+person.getPassport());
		System.out.println("passportId: "+person.getPassport().getId());
		System.out.println("passport_expdate: "+person.getPassport().getExpdate());
		System.out.println("Dob: "+person.getPassport().getDob());
		
	}

}

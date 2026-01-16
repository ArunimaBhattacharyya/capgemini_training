package string;

public class ValiedEmail {
	public static void main(String[] args) {
		String email = "arunima@gmail.com";
		System.out.println(email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+"));	
	}

}

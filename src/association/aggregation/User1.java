package association.aggregation;

public class User1 {
	public static void main(String[] args) {
		Library library = new Library();
		
		library.setName("Abc library.");
		library.setLocation("ABC");
		library.setAddress("kolkata");
		library.setPincode("12345");
		
		Book[] book = library.addBook(5);	
		
		book[0] = new Book("1","It Ends With Us","Collen Hoover", "450");
		book[1] = new Book("2","It Starts With Us","Collen Hoover", "400");
		book[2] = new Book("3","Harry Potter and chamber of Secrets","JK rowlings", "400");
		book[3] = new Book("4","Sherlock homes","Arthur Canon", "600");
		book[4] = new Book("5","Perfect Murder","Ruskin Bond", "500");
		
		System.out.println(library.getLibraryDetails());
		
		System.out.println("------------------------------------------------------------------");
		
		for(int i=0; i<book.length; i++) {
			System.out.println(book[i].getDetails());
		}
	}

}

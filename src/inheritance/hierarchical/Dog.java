package inheritance.hierarchical;

public class Dog extends Animal{
	
	String breed;
	
	public Dog(String name, String sound, String breed) {
		super(name, sound);
		this.breed = breed;
	}
	
	public void displayDog() {
		displayAnimal();
		System.out.println(this.breed);
	}
	
	public static void main(String[] args) {
		Dog d = new Dog("Sheru", "bhow", "Golden Retriever");
		d.displayDog();
	}
	
	

}

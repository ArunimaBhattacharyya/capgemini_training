package inheritance.hierarchical;

public class Cat extends Animal{
	
	String colour;
	public Cat(String name, String sound, String colour) {
		super(name, sound);
		this.colour = colour;
	}
	
	public void displayCat() {
		displayAnimal();
		System.out.println(this.colour);
	}
	
	public static void main(String[] args) {
		Cat c = new Cat("Mini", "Meow", "Orange");
		c.displayCat();
	}

}

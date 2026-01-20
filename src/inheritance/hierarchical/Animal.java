package inheritance.hierarchical;

public class Animal {
	
	String sound;
	String name;
	
	public Animal(String sound, String name) {
		this.sound = sound;
		this.name = name;
	}
	
	public void displayAnimal() {
		System.out.println(this.sound);
		System.out.println(this.name);
	}

}

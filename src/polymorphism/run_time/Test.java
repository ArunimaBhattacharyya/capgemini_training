package polymorphism.run_time;

public class Test {
	
	public static void main(String[] args) {
		Lion l = new Lion();
		l.sound();
		
		Dog d = new Dog();
		d.sound();
		
		Animal ani = new Animal();
		ani.sound();
		
		//up-casting method overriding
		Animal animal = new Dog();
		animal.sound();
	}

}

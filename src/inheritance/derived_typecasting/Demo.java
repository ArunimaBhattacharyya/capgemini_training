package inheritance.derived_typecasting;

public class Demo {
	
	//up-casting
	
	public static void main(String[] args) {
		WhiteTiger wh = new WhiteTiger();
		wh.whiteColour();
		wh.roar();
		wh.walk();
		
		Tiger tiger = wh;
		tiger.roar();
		tiger.walk();
		
		Animal an = tiger;
		an.walk();
	}

}

package inheritance.derived_typecasting;

public class Demo1 {
	
	//down-casting
	
	public static void main(String[] args) {
		WhiteTiger wh = new WhiteTiger();
		
		Animal an = wh;
		an.walk();
		
		Tiger tiger = (Tiger) an;
		tiger.walk();
		tiger.roar();
		
		WhiteTiger wt = (WhiteTiger)tiger;
		wt.walk();
		wt.roar();
		wt.whiteColour();
	}

}

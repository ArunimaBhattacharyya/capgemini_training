package association.composition;

public class Car {
	//composition

	//new Car()
	private String brand;//null
	private double price;//0.0
	
	private Engine engine;//null
	
	private Tire[] tires;
	
	Car() {
		engine = new Engine();
		tires = new Tire[4];
		
		for(int i=0; i<4; i++) {
			tires[i] = new Tire();
		}
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void getTire() {
		for(int i=0; i<tires.length; i++) {
			System.out.println(tires[i]);
		}
	}
	

}

package abstraction;

public abstract class Course {
	
	String name;
	
	public Course(String name) {
		this.name = name;
	}
	
	public void courseInfo() {
		System.out.println("The name of the course is:"+name);
	}
	
	public abstract void coursePrice();

}

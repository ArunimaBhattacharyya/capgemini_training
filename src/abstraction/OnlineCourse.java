package abstraction;

public class OnlineCourse extends Course{
	
	int platformCharge;
	
	public OnlineCourse(String name, int platformCharge) {
		super(name);
		this.platformCharge = platformCharge;
	}
	
	@Override
	public void courseInfo() {
		super.courseInfo();
	}
	
	public void coursePrice() {
		System.out.println("The course price is :"+ platformCharge);
	}

}

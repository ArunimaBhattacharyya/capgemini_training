package abstraction;

public class OnlinePaidCourse extends OnlineCourse{
	
	int courseFee;
	
	public OnlinePaidCourse(String name, int platformCharge, int courseFee) {
		super(name, platformCharge);
		this.courseFee = courseFee;
	}
	
	@Override
	public void courseInfo() {
		System.out.println("The name of the course is:"+name);
	}
	
	public void coursePrice() {
		System.out.println("The price of the course is:"+(platformCharge+courseFee));
	}

}

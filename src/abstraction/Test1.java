package abstraction;

public class Test1 {
	
	public static void main(String[] args) {
		Course c1 = new OnlineCourse("Java Fundamentals", 500);
		
		Course c2 = new OnlinePaidCourse("Data Structure and Algorithm", 500, 1000);
		
		c1.courseInfo();
		c1.coursePrice();
		
		c2.courseInfo();
		c2.coursePrice();
	}

}

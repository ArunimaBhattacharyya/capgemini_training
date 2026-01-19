package association.aggregation;

public class Passport {
	
	private String id;
	private String dob;
	private String expdate;
	
	Passport(){
		
	}
	
	Passport(String id, String dob, String expdate) {
		this.id = id;
		this.dob = dob;
		this.expdate = expdate;
	}
	
	public String getId() {
		return id;
	}
	
	public String getDob() {
		return dob;
	}
	
	public String getExpdate() {
		return expdate;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

}

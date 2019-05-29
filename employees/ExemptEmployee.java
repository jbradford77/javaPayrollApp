package employees;

public class ExemptEmployee extends Employee {
	
	public ExemptEmployee() {
	}
	public ExemptEmployee(String firstName, String lastName) {
		super(firstName, lastName);
	}
	public ExemptEmployee(String firstName,String lastName, int dept) {
		super(firstName, lastName, dept);
	}
	public ExemptEmployee(String firstName,
				String lastName, double payRate) {
		super(firstName, lastName, payRate);
	}
	public ExemptEmployee(String firstName, String lastName, int dept, 
				double payRate) {
		super(firstName, lastName, dept, payRate);
	}	
	public String getPayInfo() {
		return "Exempt Employee " + getId() + " dept " + getDept() + 
					 " " + getFirstName() + " " + getLastName() + 
					 " paid " + getPayRate();
	}
}
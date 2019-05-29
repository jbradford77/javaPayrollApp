package employees;

public class Employee extends Person {
	private static int nextId = 1;
	private int id = nextId++;
	private int dept;
	private double payRate;
	
	public Employee() {
	}
	public Employee(String firstName, String lastName) {
		super(firstName, lastName);
	}
	public Employee(String firstName,String lastName, int dept) {
		super(firstName, lastName);
		setDept(dept);
	}
	public Employee(String firstName, String lastName, double payRate) {
		super(firstName, lastName);
		setPayRate(payRate);
	}
	public Employee(String firstName, String lastName, int dept, 
				double payRate) {
		this(firstName, lastName, dept);
		setPayRate(payRate);
	}

  public static int getNextId() {
    return nextId;
  }
  
  public static void setNextId(int nextId) {
    Employee.nextId = nextId;
  }
  
	public int getId() {  return id;  }

	public int getDept() { return dept; }

	public void setDept(int dept) {
		this.dept = dept;
	}

	public double getPayRate() { return payRate; }

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}

	public String getPayInfo() {
		return "Employee " + id + " dept " + dept + " " +
					 getFullName() + " paid " + payRate;
	}

}

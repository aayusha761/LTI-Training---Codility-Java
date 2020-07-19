import java.time.LocalDate;

public class Employee {
	
	private final int psno;
	private String name;
//	private double salary;
	private double salary;
	private LocalDate dateOfJoining;
	
//	private static double totalRevenue=20000000;
	
	public static final String COMPANY_NAME="LTI";
	
	//constructors
	
	public Employee(int psno, String name, double salary, LocalDate dateOfJoining) {
		super();
		this.psno = psno;
		this.name = name;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
	}
	
	//default constructor doesn't make sense in case if we have
	//final variables which needs to be intialized dynamically
	public Employee() {
		psno = -1;
		System.out.print("Hello ");
	}
	
	public Employee(int psno) {
		this.psno = psno;
		System.out.print("Hello ");
	}

	public int getPsno() {
		return psno;
	}

//	public void setPsno(int psno) {
//		this.psno = psno;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public static void main(String[] args) {
		
	}
}

import java.time.LocalDate;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1111,"Aayush",1000, LocalDate.of(2002, 12, 6));
		Employee e2 = new Employee(2222);
//		e2.setPsno(1234);
		e2.setName("Sagar");
		e2.setSalary(2000);
		e2.setDateOfJoining(LocalDate.of(2001, 5, 6));
		
		System.out.println(e2.getName());
//		Employee e4 = new Employee(e1);

		
		System.out.println(e1.getSalary());
		System.out.println(e2.getSalary());
		System.out.println(Employee.COMPANY_NAME);

	}
}
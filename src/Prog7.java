class Emp {
	int empno;
}
public class Prog7 {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.empno = 1001;
		change(e);
		System.out.println(e.empno);
		change1(e);
		System.out.println(e.empno);
		change2(e);
		System.out.println(e.empno);
	}

	private static void change(Emp e) {		//pass by reference
		e.empno = 2001;
	}
	
	private static void change1(Emp e) {		//pass by reference
		e.empno = 2001;
		e = null;
	}
	@SuppressWarnings("null")
	private static void change2(Emp e) {		//pass by reference
		e = null;
		e.empno = 2001;
	}
}

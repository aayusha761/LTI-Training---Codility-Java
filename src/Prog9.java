class First {
	First() {
		System.out.println("default first");
	}
	First(int x) {
//		this();
		System.out.println("para first");
	}
}

class Second extends First {
	Second() {
//		super();
		System.out.println("default second");
	}
	Second(int x) {
//		super();
		System.out.println("para second");
	}
}
public class Prog9 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Second s1 = new Second();
		Second s2 = new Second(2);
	}
}
class C {
	void saySomething() {
		System.out.println("Hello");
	}
}

class D extends C{
	void saySomething() {
		System.out.println("Hi");
	}
}
public class Prog11 {
	public static void main(String[] args) {
		C a = new D();
		a.saySomething();
	}
}
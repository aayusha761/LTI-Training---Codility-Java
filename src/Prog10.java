class A {
	int x=10;
}
class B extends A {
	int x = 20;
	void hello() {
		System.out.println(x);		//nearest value
		System.out.println(super.x);	//parent value
		System.out.println(this.x);		//reference to the object
	}
}
public class Prog10 {
	public static void main(String[] args) {
		B b = new B();
		b.hello();
	}
	
}

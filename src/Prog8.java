public class Prog8 {
	static {
		System.out.println("static");
	}
	
	{
		System.out.println("Non Static");
	}
	
	Prog8() {
		System.out.println("constructor");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Prog8 s1 = new Prog8();
		Prog8 s2 = new Prog8();		
	}
}

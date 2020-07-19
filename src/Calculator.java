public class Calculator {
	
	public static int add(int x, int y) {
		return x+y;
	}
	
	public static int sub(int x, int y) {
		return x-y;
	}
	
	public static int mul(int x, int y) {
		return x*y;
	}
	public static int div(int x, int y) {
		return x/y;
	}
	public static int rem(int x, int y) {
		return x%y;
	}
	
	public static void main(String[] args) {
//		Calculator calc = new Calculator();
//		System.out.println(calc.add(3, 5));
//		System.out.println(calc.sub(3, 5));
//		System.out.println(calc.add(3, 5));

		System.out.println(Calculator.add(3, 5));
		System.out.println(add(3, 5));

	}
}
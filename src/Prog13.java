interface Math1 {
	public int calculate(int x, int y);
	
	static Add getDefaultImplementation() {
		return new Add();
	}
	
	class Add implements Math1 {
		public int calculate(int x, int y) {
			// TODO Auto-generated method stub
			return x + y;
		}
	}
}
public class Prog13 {
	public static void main(String[] args) {
		
		//anonymous inner class
		Math1 m = new Math1() {
			
			@Override
			public int calculate(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}
		};
		m.calculate(3,4);
		
		
		Math1 math = Math1.getDefaultImplementation();
		System.out.println(math.calculate(2, 3));
		
		
		//lambda expressions
		Math1 m1 = (x, y) ->  x+y;
		System.out.println(m1.calculate(3, 4));
	}
}